# Notes AgileTour 2015 à Lille

Notes prises lors de l'AgileTour 2015 à Lille (Euratechnologies). Les contributeurs à ces notes sont (par ordre alphabétiques des prénoms) : Charles, Christophe, Jean-Pierre, Julien et Sophie.

L'Agile Tour Lille 2015 avait lieu le 15/10/2015 à Euratechnologies. Le site est disponible à cet URL : http://agiletour-lille.org/ .

Nous n'avons pu (même collectivement) participer à toutes les présentations.

## Présentations

### Des lean startups dans l'administration !?

#### Speaker(s)

* Pierre Pezziardi
  - Twitter : @ppezziardi
  - SlideShare : http://fr.slideshare.net/ppezziardi

#### Notes

##### Introduction
La présentation est le retour d'expérience du travail de Pierre Pezziardi et
de Henri Verdier sur leur travail au sein de l'administration sur un mode "lean startup".

Les sites & applications développées sont :

* le site "data.gouv.fr" pour l'open data en France où grâce aux outils mis en place et à la démarche on est passé
du site web au réseau social sur l'OpenData.
* MPS (Marché Public Simplifié)
    - Projet sortie en moins de 6 mois
* le site "Le Taxi"
* le site "mes-aides.gouv.fr"
* le site "adresse.data.gouv.fr"
* "La Bonne Boite"
      - Pour Pôle Emploi
      - Utilisation de Big Data et d'analyse
      - il y a un marché caché des offres d'emploi : 75% des embauches ne se font pas via des annonces (candidatures spontanées, entretien, etc.)
      - Pouvoir aiguiller les personnes en recherche d'emploi en se basant sur ces informations.

De manière générale à part pour "Le Taxi", pas de cahier des charges, pas de commandes. Ce sont des applications
qui n'ont pas été pensées par la structure elle-même... ce qui explique en partie la pertinence de ces applications.

##### Approche

* Quel problème resout-on ?
  - partager, améliorer, et réutiliser les données publiques (dat.gouv).
  - un clic, un taxi
* Chercher un innovateur plus qu'une innovation
  - C'est difficile de mettre en production une innovation : résistance de l'organisation
  - un _irritant_
  - Il faut un volontaire, une volonté
* Le chef c'est l'usager
  - Parfois il faut aller contre le chef : si l'on enfreint pas une règle, on ne créé pas de valeur (Goldratt)
  - Posture humble
* Nécessité de la disruption
  - la notion de _reproduction_ de Bourdieu
* Le temps n'est pas négociable
  - Combien de temps il vous faut ? ** 6 mois, 4 personnes **
  - Combien cela va coûter ? ** 6 mois, 4 personnes **
  - En 6 mois on arrive toujours à quelque chose même si c'est humble
  - _On peut tout faire en 6 mois avec 4 personnes_
* Evitons toute attente en dehors de notre équipe autonome
  - Quand on court 10 fois plus vite, les dépendances sont juste des risques.
* Comment être agile quand on est dans un structure qui ne l'est pas ?
  - Times there are a-changin'
  - Après _Agility First_ viendra _Security First_
  - _Security First_ entraîne une absence d'innovation
  - 2 légitimités qui s'affrontent
  - il faut trouver un équilibre, un continum entre les 2
  - _Suckcess_ (Bob Dylan)
  - _penseur/faiseur_
  - Les grosses organisations ne changent pas leur _ADN_
  - notion d'actif
  - _Mieux-disant_
* La valeur peut se lire en creux
  - Attention aux métriques

### Collaboration : un problème récurrent dans les projets

#### Speaker(s)

* Cédric Pourbaix
  - Twitter : @CedricPourbaix
  - Le site de EFIDEV : http://www.efidev.com/

#### Notes

### Si le TDD est mort, alors pratiquons une autopsie

#### Speaker(s)

* Bruno Boucard
  - Twitter : https://twitter.com/brunoboucard
  - SlideShare : http://fr.slideshare.net/brunoboucard
* Thomas Pierrain
  - Blog : http://tpierrain.blogspot.fr/
  - Twitter : https://twitter.com/tpierrain
  - SlideShare : http://fr.slideshare.net/ThomasPierrain

#### Notes

##### Another shot

La pratique du TDD a pu décevoir certains ou peut sembler en perte de vitesse. Néanmoins
elle mérite qu'on si (ré-)intéresse et qu'on la ré-essaie le cas échéant. En effet le TDD est :
* _Reassuring_ (Rassurant)
  - pas de paralysie de l'analyse
* _Efficient_ (efficace)
  - YAGNI (You Ain't Gonna Need It)
* _Encouraging_ (encourageant)
  - Une journée de développement est souvent truffé de _feedbacks_ négatifs.
  - Un peu de _feedbacks_ positifs cela fait du bien.
* code Kata
  - principe se mettre une difficulté au travers d'un TDD
* coding Dojo
  - code kata à plusieurs -> TDD à plusieurs

Pour rappel, le schéma ci-après rappelle le cycle de fonctionnement de la TDD.

![The TDD Cycle](/the-tdd-cycle.png)

##### Thinking out of the box

* Florence à l'aude de la Renaissance
  - artisans, _craftsmen_
  - Michel-Ange/Michelangelo
    - _Design_ émergent
    - _feels his nascent character through the stone_
      - Michelangelo a été mis dans une famille nourricière de _stonemasons_
      - Il apprend à tailler la pierre avant de savoir lire et écrire
      - Laurent de Médicis le prend sous son aile.
      - _a crazy workaholic_
  - Le lien avec le TDD ? L'approche TDD permet d'avoir un _design_ émergent.
* Règle des 10KHrs (_The 10KHrs-rule_)
  - Il faut passer 10Khrs dans un sujet pour en devenir un expert
  - _workouts impact our brain_
    - Développement _d'autoroute_ dans le cerveau
    - Un peu comme une _hotspot optimization_ ou la compilation du code interprété!
  - mais pourtant la répétition c'est aliénant !
    - Penser au film **Les Temps Modernes** de Charlie Chaplin
    - Distinguer la répétition stupide (un gest répété vide de sens) de l'entraînement.
    - Faire le lien avec le principe _Shu-Ha-Ri_

1. la préparation, c'est le SHOULD.
  - C'est ce que le traitement DOIT faire.
  - La base du test est le SCENARIO, le COMPORTEMENT
2. Le ralentissement
  - Lire _Thinking fast and fload_

##### Retour d'expérience d'un des speaker

* avant de penser au test SHOULD de SCENARIO :
  - sur de 2,3 ans les tests ont bien marché puis il y a eu un gros blocage sur un gros projet.
  - Trop de tests, trop de retouches de tests...
    - donc les tests étaient mal écrits.
    - Les TU étaient liés à l'implémentation.
* Il faut donc tester le comportement, c'est le contrat d'interaction.
  - par exemple, tester des méthodes privées (quand c'est possible ou quand on y arrive), c'est du détail de l'implémentation.
  - Il s'agit donc de tester les méthodes publiques, les points d'entrée.

### Ice Breaker : prenons un temps pour en gagner

#### Speaker(s)

* Perrine Baudimont
* Marine Fromentin

#### Les transparents de la présentation

#### Notes

### Dis Papa, c'est quoi l'agilité ?

#### Speaker(s)

* Charles-Louis de Maere

#### Notes

### Ratez vos revues de codes en 5 leçons

#### Speaker(s)

* Michel Domenjoud

#### Les transparents de la présentation

http://fr.slideshare.net/mdomenjoud/agile-tour-lille-2015-ratez-vos-revues-de-code

#### Notes

### Monoïdes : le secret de la composabilité infinie

#### Speaker(s)

* Cyrille Martraire
  - Blog/Site : http://cyrille.martraire.com/
  - Twitter : https://twitter.com/cyriux
  - Github : https://github.com/cyriux

#### Notes

#### Définitions formelles liées aux monoïdes

Les définitions ci-après viennent du document _Compléments d'algèbre et de géométrie pour l'agrégation_ de __Bernard Le Stum__ de l'Université de Rennes.

##### Loi de composition

Une loi de composition est une application E × F --> G(x, y) |--> xy (ou plus
généralement, x * y).

Si E = F = G, on dit que c’est une loi de composition interne dans, ou sur E.

La loi F × E --> G, (y, x) |--> xy est la loi opposée.

##### Loi de composition interne associative

Une loi de composition interne sur un ensemble G est associative si pour tout x, y, z appartenant à G, on a (xy)z == x(yz) == xyz.

On dit que **1** appartient à G est une unité (ou plus généralement un élément neutre) si pour tout
x appartenant à G, on a 1x == x1 == x.
On parle d’élément nul noté 0, au lieu l’unité lorsque la loi est not"´e"e additivement.

##### Monoïde

Un monoïde est un ensemble muni d’une loi de composition interne associative et
unitaire.

### Le mythe de l'Agile à l'échelle

#### Speaker(s)

* Elalami Lafkih

#### Les transparents de la présentation

* http://fr.slideshare.net/CyrilleDeruel/agile-tour-lille-octo-le-kanban-expliqu-par-bison-fut

#### Notes

### Le Kanban expliqué par Bison Futé

#### Speaker(s)

* Cyrille Deruel

#### Les transparents de la présentation

* http://fr.slideshare.net/CyrilleDeruel/agile-tour-lille-octo-le-kanban-expliqu-par-bison-fut

#### Notes

### Alliés contre les défauts – pourquoi et comment nous relisons ensemble le code que nous produisons

#### Speaker(s)

* Julien Jakubowski
* Antoine Blancke (Web Center Axa, Lille)

#### Les transparents de la présentation

* http://fr.slideshare.net/jak78/agile-tour-2015-allies-contre-les-defauts

#### Notes

##### Contexte

* Mesure de l’excellence de la qualité : KPI (Key Performance Indicator)
  - Le KPI suivi ici est nombre de défaut générés en production
* Afin d'y arriver la démarche proposée est de mettre en place les actions suivantes :
  - Revue de code
  - TDD
  - Code legacy
  - BDD
  - Communiquer
* revue de code _avant_ :
  - revue par un tech leader
  - pb volume à relire
  - les équipes n’apprennent pas
* revue de code après
  - Par équipe
  - Cout 5% budget total des devs
* Attention aux idées reçues
  - Revue de code c’est trop cher
  - Or c’est une PRATIQUE qui permet de détecter les défauts
* Exemples
  - 25 unités pour détecter à la revue -> apport ROI
  - Si c’est en qualif c’est 100 unités
  - En prod 1000 donc 4 fois plus cher de découvrir l’erreur en production.
  - Les études montrent un rapport de 4 pour 1.
  - Investir 1, récupération de 4 sur le défaut.
  - Raythéon est passé de 43% de défaut à 5%
  - Qui : google, AXaa, MS, Cisco
* Objectifs
  - Communiquer ensemble à propos du code augmente la qualité intrinsèque et réduit le nombre de surprises
  - Propriété collective
  - Facilité l’apprentissage d’un nouveau membre de l’équipe.
* Attention :
  - A la mise en place

##### Cas pratique au web center Axa

* Réunion rapide
* Pour la revue
  - Faire une checklist des standards
  - Inviter l’équipe au moin s1 jour avant
  - Gérer le logistique (salle)
  - Indiquer les stories qui vont passer en revue
  - Préparer les codes à présenter
* Rôles
  - DEV : le développeur
  - READER : les relecteurs
  - MODO : modérateur de la reunion qui anime  dans le but de trouver des erreurs, quel est le standard.
  - TIMEKEEPER : 1 minute pour statuer sur le défaut
  - SCRIBE : consigne les défauts, maj standards, prévoir correction avec un peer review
* Limites et écueils à éviter
  - Ne pas critiquer la personne mais le code : dur avec le code, doux avec les gens
  - Modo perd le contrôle
  - Pas de time keeper opérationnel
  - Avoir peur d’être jugé
  - Pas oser le feedback sur son code
  - Faire des remarques pertinentes
  - Abandonner la pratique (pression projet)
  - Ne pas mettre les managers (CP ?) dans la revue.
  - Critiquer le code et pas la personne
  - Fixer le rôle du modo
  - Ne pas hésiter à échanger sur le code même avant les revues
  - Leaders pour la pratique (tech leader)
* Conclusion
  - 20 revues : 126 défauts -> 5 ano sévères
  - 66 défauts/revue
  - Trouver des bugs au plus tôt (hors typo)
  - Standard évoluent
  - Temps 5%
  - 3 users stories = 3 * 1h par semaine
  - % de code couvert : tout le code produit à 100%
* Quelques liens complémentaires sur le sujet
  - Blog.octo.com/revue_code
  - Blog.octo.com/comment_rater_revue_code


### Intégration continue, DevOps et après ?

#### Speaker(s)

* Laurent Tardif

#### Les transparents de la présentation

#### Notes

### La bataille du kata diamant

#### Speakers

* Bruno Boucard
    - Twitter : https://twitter.com/brunoboucard
* Thomas Pierrain
    - Blog : http://tpierrain.blogspot.fr/
    - Twitter : https://twitter.com/tpierrain

#### Les transparents de la présentation

http://fr.slideshare.net/brunoboucard/diamond-kata-agile-tour-lille

## Quelques références supplémentaires hors conférence

### DDD

* https://domainlanguage.com/
  - https://domainlanguage.com/ddd/patterns/DDD_Reference_2011-01-31.pdf
* http://blog.infosaurus.fr/public/docs/DDDViteFait.pdf

### Kanban

* http://fr.slideshare.net/CyrilleDeruel/comment-jai-amlior-mon-kanban-grce-bison-fut-kanbanday-fr-2015

### Monoïdes

* http://fr.slideshare.net/XebiaFrance/devoxx-france-2014-la-puissance-de-mon-monode-est-suprieure-9000-34280399
* http://fr.slideshare.net/fsarradin/programmationfonctionnelle

### Agilité

* http://fr.slideshare.net/CyrilleDeruel/projet-agile-arretez-les-derives-atlille2014
* http://fr.slideshare.net/AgiletourGeneve/la-face-cache-de-la-mesure-une-opportunit-pour-votre-amlioration-continue
* http://fr.slideshare.net/isabelmonville/la-communication-au-service-du-projet

### Code, Craftsmanship & qualité

* http://fr.slideshare.net/mdomenjoud/human-talks-ratez-vos-revues-de-code-en-5-leons
* http://fr.slideshare.net/brunoboucard/fruit-shop-techdays-2015
* http://fr.slideshare.net/brunoboucard/si-le-tdd-est-mort-alors-mix-it

### TDD

* http://fr.slideshare.net/brunoboucard/how-to-test-untestable-code
* http://fr.slideshare.net/atnantes/agile-tour-nantes-2014-tdd-le-meilleur-moyen-dcrire-du-code-testable
* http://fr.slideshare.net/yannick.ameur/tdd-avec-ou-sans-mock
* http://fr.slideshare.net/GTechene/atelier-tdd-v14
* http://fr.slideshare.net/fxMaq/et-si-on-jouait-au-tdd-20131017-27342768
