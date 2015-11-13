# Notes AgileTour 2015 à Lille

Notes prises lors de l'AgileTour 2015 à Lille (Euratechnologies). Les contributeurs à ces notes sont (par ordre alphabétiques des prénoms) : Charles, Christophe, Jean-Pierre, Julien et Sophie.

L'Agile Tour Lille 2015 avait lieu le 15/10/2015 à Euratechnologies. Le site est disponible à cet URL : http://agiletour-lille.org/ .

Nous n'avons pu (même collectivement) participer à toutes les présentations.

## Présentations

### Des lean startups dans l'administration !?

#### Speaker(s)

* Pierre Pezziardi
  - Twitter : @ppezziardi

#### Les slides

#### ce que nous avons retenu

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
      - il y a un marché cahcé des offres d'emploi : 75% des embauches ne se font pas via des annonces (candidatures spontanées, entretien, etc.)
      - Pouvoir aiguiller les personnes en recherche d'emploi en se basant sur ces informations.

De manière générale à part pour "Le Taxi", pas de cahier des charges, pas de commandes. Ce sont des applications
qui n'ont pas été pensées par la structire elle-même... ce qui explique en partie la pertinence de ces applications.

### Collaboration : un problème récurrent dans les projets

#### Speaker(s)

* Cédric Pourbaix

#### Les slides

#### ce que nous avons retenu

### Si le TDD est mort, alors pratiquons une autopsie

#### Speaker(s)

* Bruno Boucard
  - Twitter : https://twitter.com/brunoboucard
* Thomas Pierrain
  - Blog : http://tpierrain.blogspot.fr/
  - Twitter : https://twitter.com/tpierrain

#### Les slides

#### ce que nous avons retenu

La pratique du TDD a pu freiner ou décevoir certains mais il ne faut pas abandonner et réessayer.
Reassuring Efficient Encouraging C'est rassurant - C'est efficace et c'est encourageant

- code Kata : principe se mettre une difficulté au travers d'un TDD
- coding dojo : code kata à plusieurs -> TDD à plusieurs

-> Le design émergent ressort du TDD

1/ la préparation, c'est le SHOULD. C'est ce que le traitement DOIT faire.
La base du test est le SCENARIO, le COMPORTEMENT

2/Le ralentissement 
<br/> Lire Thinking fast and fload 

Retour d'expérience d'un des speaker avant de penser au test SHOULD de SCENARIO : 
sur de 2,3 ans les tests ont bien marché puis il y a eu un gros blocage sur un gros projet.
Trop de tests, trop de retouche de tests ...donc les tests étaient mal écrits.
Les TU étaient liés à l'implémentation.

Il faut donc tester le comportement, c'est le contrat d'intéraction.
Exemple : tester des méthodes privées (quand c'est possible où quand tu y arrives) , c'est du détail de l'implémentation.

Donc il s'agit de tester les méthodes publiques, les points d'entrée


### Ice Breaker : prenons un temps pour en gagner

#### Speaker(s)

* Perrine Baudimont
* Marine Fromentin

#### Les slides

#### ce que nous avons retenu

### Dis Papa, c'est quoi l'agilité ?

#### Speaker(s)

* Charles-Louis de Maere

#### ce que nous avons retenu

### Ratez vos revues de codes en 5 leçons

#### Speaker(s)

* Michel Domenjoud

#### Les slides

http://fr.slideshare.net/mdomenjoud/agile-tour-lille-2015-ratez-vos-revues-de-code

#### ce que nous avons retenu

### Monoïdes : le secret de la composabilité infinie

#### Speaker(s)

* Cyrille Martraire
  - Blog/Site : http://cyrille.martraire.com/
  - Twitter : https://twitter.com/cyriux
  - Github : https://github.com/cyriux

#### Les slides

#### ce que nous avons retenu

### Le mythe de l'Agile à l'échelle

#### Speaker(s)

* Elalami Lafkih

#### Les slides

http://fr.slideshare.net/CyrilleDeruel/agile-tour-lille-octo-le-kanban-expliqu-par-bison-fut

#### ce que nous avons retenu

### Le Kanban expliqué par Bison Futé

#### Speaker(s)

* Cyrille Deruel

#### Les slides

http://fr.slideshare.net/CyrilleDeruel/agile-tour-lille-octo-le-kanban-expliqu-par-bison-fut

#### ce que nous avons retenu

### Alliés contre les défauts – pourquoi et comment nous relisons ensemble le code que nous produisons

#### Speaker(s)

* Julien Jakubowski
* Antoine Blancke (Web Center Axa, Lille)

#### Les slides

#### ce que nous avons retenu

* Mesure de l’excellence de la qualité : KPI (Key Performance Indicator)
  - Le KPI suivi ici est nombre de défaut générés en production
* Afin d'y arriver la démarche proposée est de mettre en place les actions suivantes :
  - Revue de code
  - TDD
  - Code legacy
  - BDD
  - Communiquer

*revue de code "avant" :*
- revue par un tech leader
- pb volume à relire
- les équipes n’apprennent pas

*revue de code après :*
- Par équipe
- Cout 5% budget total des devs

*Attention aux idées reçues :*
- Revue de code c’est trop cher
- Or c’est une PRATIQUE qui permet de détecter les défauts


*Exemple*
- 25 unités pour détecter à la revue -> apport ROI
- Si c’est en qualif c’est 100 unités
- En prod 1000 donc 4 fois plus cher de découvrir l’erreur en production.
- Les études montre un rapport de 4 pour 1.
- Investir 1, récupération de 4 sur le défaut.
- Raythéon est passé de 43% de défaut à 5%
- Qui : google, AXaa, MS, Cisco

*Objectif :*
- Communiquer ensemble à propos du code augmente la qualité intrinsèque et réduit le nombre de surprises
- Propriété collective
- Facilité l’apprentissage d’un nouveau membre de l’équipe.

* Attention :*
- A la mise en place

*Exemple*
- Au web center Axa : réunion rapide

*Pour la revue :*
- Faire une checklist des standards
- Inviter l’équipe au moin s1 jour avant
- Gérer le logistique (salle)
- Indiquer les stories qui vont passer en revue
- Préparer les codes à présenter

*Rôles :*

- DEV : le développeur
- READER : les relecteurs
- MODO : modérateur de la reunion qui anime  dans le but de trouver des erreurs, quel est le standard.
- TIMEKEEPER : 1 minute pour statuer sur le défaut
- SRIBE : consigne les défauts, maj standards, prévoir correction avec un peer review

*Limites :*
- Ne pas critiquer la personne -> dur avec le code doux avec les gens
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

*Conclusion*
- 20 revues : 126 défauts -> 5 ano sévères
- 66 défauts/revue
- Trouver des bugs au plus tôt (hors typo)
- Standard évoluent
- Temps 5%
- 3 users stories = 3 * 1h par semaine
- % de code couvert : tout le code produit à 100%

Blog.octo.com/revue_code 
Blog.octo.com/comment_rater_revue_code



### Intégration continue, DevOps et après ?

#### Speaker(s)

* Laurent Tardif

#### Les slides

#### ce que nous avons retenu

### La bataille du kata diamant

#### Speakers

* Bruno Boucard
    - Twitter : https://twitter.com/brunoboucard
* Thomas Pierrain
    - Blog : http://tpierrain.blogspot.fr/
    - Twitter : https://twitter.com/tpierrain

#### slides

http://fr.slideshare.net/brunoboucard/diamond-kata-agile-tour-lille

## Quelques références supplémentaires hors conférence

### DDD

* https://domainlanguage.com/
  - https://domainlanguage.com/ddd/patterns/DDD_Reference_2011-01-31.pdf
* http://blog.infosaurus.fr/public/docs/DDDViteFait.pdf

### Kanban

* http://fr.slideshare.net/CyrilleDeruel/comment-jai-amlior-mon-kanban-grce-bison-fut-kanbanday-fr-2015

### Monoïdes

### Agilité

* http://fr.slideshare.net/CyrilleDeruel/projet-agile-arretez-les-derives-atlille2014
* http://fr.slideshare.net/AgiletourGeneve/la-face-cache-de-la-mesure-une-opportunit-pour-votre-amlioration-continue
* http://fr.slideshare.net/isabelmonville/la-communication-au-service-du-projet

### Code, Craftsmanship & qualité

* http://fr.slideshare.net/mdomenjoud/human-talks-ratez-vos-revues-de-code-en-5-leons
* http://fr.slideshare.net/brunoboucard/fruit-shop-techdays-2015
* http://fr.slideshare.net/brunoboucard/si-le-tdd-est-mort-alors-mix-it
