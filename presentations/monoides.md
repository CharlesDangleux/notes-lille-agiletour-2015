# Monoïdes : le secret de la composabilité infinie

## Le présentateur

* Cyrille Martraire
  - Blog/Site : http://cyrille.martraire.com/
  - Twitter : https://twitter.com/cyriux
  - Github : https://github.com/cyriux

## Notes

### Contexte

Un monoïde est un ensemble muni d’une loi de composition interne associative et
unitaire.
Différent du monoïde du docteur Who :)

* Notion de code _Gourmet_ :
  - __TDD : Test Driven Develoment__
  - __BDD : Behaviour-Driven Development__
  - __DDD : Driven domain Design__

* Structure mathématique :
  - Propriété de clôture sur l'ensemble : 1 verre de bière combiné à un verre de bière égale 1 verre de bière.
  - Associativité : 1 verre dans l'autre ou inversement.
  - Elément neutre : verre zéro.

* TROIS NOMBRES EN INFORMATIQUE :
  - _0 : Null Object_
  - _1 : implémentation_
  - _MANY : opération_

* Composabilité = clé de la scalabilité
  - référence Hadoop
  - référence Storm

Le monoïde est typique des langages fonctionnels.

Value Object est un pattern de la DDD
C'est _Immutable_ => _equals by Value_

### Exemples

#### Exemple préparatoire

18 M + 16 M = 34 M
Cela implique une méthode *add()* pure : 25$ + 60 Euros = Exception

#### Objets arithmétiques
- [1,3]  UNION [2,4] EGALE [1,4]<br/>
- Prédicat : Filtre F ET/OU Filtre F donne FILTRE F <br/>

#### Règle des droits sur UNIX

#### Exemple détaillé 1

On peut très bien voir les dépenses pour quelqu'un :

_10/01/2015 - 24/10/2015_<br/>
_30e        - 15e_<br/>

Et additionner cela aux dépenses d'une autre personne :

_10/01/2015 - 24/10/2015 - 26/10/2015_<br/>
_5e         - 15e        - 1e_<br/>

 Cela donne :

_10/01/2015- 24/10/2015 - 26/10/2015_<br/>
_35e       - 30e        - 1e_<br/>

#### Exemple détaillé 2

On peut aussi voir cela pour les options du téléphones mobile :

* Personne Lambda Monoïde -> ligne option téléphone
  - Option 4G : 3E, Option TV 5e, Option BETA : 5E
* Personne Lambda 2 :
  - Option 4G : 3E, Option TV 5e, Option BETA : 5E

ici pour l'objet totalLignesOptionFamilleLambda de type ligneOption

```java
totalLignesOptionFamilleLambda = ligneOptionsLambda.add(ligneOptionsLambda2);
```

On fait la somme des monoïdes "Option" de même types à l'intérieur des monoïdes de type ligne option téléphone.

Donc dans la méthode add de ligneOption:

```java
void add(ligneOption lo){
  this.option4g.add(lo.getOption4g());
  this.optionTv.add(lo.getOptionTv());
  this.optionBeta.add(lo.getOptionBeta());
}
```

On pourrait voir aussi le total de la ligne Option en additionnant les options si elles sont toutes en euro.

```java
double getTotal(){
  try {
  return this.option4g.add(optiontv).add(this.optionBeta);
  }
  catch (MonoideException me){
    //TODO
  }
}
```

#### Exemple détaillé 3 (A compléter ...)

Temperature avec dans le constructeur l'opération qui est à effectuer :

```java
new T (x+4, Celcius, "x+4"); //on va pouvoir logguer l'opération
```

#### Exemple détaillé  4

On gère des monoïdes de type *Paiement*

```java
monPaiement.add(paiement2).add(paiementRetard).add(Avoir);
```

### Limites

La modélisation avec les monoïdes n'est pas adapté à tout ce qui n'est pas linéaire.

La JVM _impose/gère_ la durée de vie des objets : c'est bien pour les objets de vie courte.

## Compléments : définitions formelles liées aux monoïdes

Les définitions ci-après viennent du document _Compléments d'algèbre et de géométrie pour l'agrégation_ de __Bernard Le Stum__ de l'Université de Rennes.

Voir également la définition qui est proposée par Wikipedia : https://fr.wikipedia.org/wiki/Mono%C3%AFde

### Loi de composition

Une loi de composition est une application E × F --> G(x, y) |--> xy (ou plus
généralement, x * y).

Si E = F = G, on dit que c’est une loi de composition interne dans, ou sur E.

La loi F × E --> G, (y, x) |--> xy est la loi opposée.

### Loi de composition interne associative

Une loi de composition interne sur un ensemble G est associative si pour tout x, y, z appartenant à G, on a (xy)z == x(yz) == xyz.

On dit que **1** appartient à G est une unité (ou plus généralement un élément neutre) si pour tout
x appartenant à G, on a 1x == x1 == x.
On parle d’élément nul noté 0, au lieu l’unité lorsque la loi est not"´e"e additivement.
