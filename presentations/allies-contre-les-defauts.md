# Alliés contre les défauts – pourquoi et comment nous relisons ensemble le code que nous produisons

## Speaker(s)

* Julien Jakubowski
* Antoine Blancke (Web Center Axa, Lille)

## Les transparents de la présentation

* http://fr.slideshare.net/jak78/agile-tour-2015-allies-contre-les-defauts

## Notes

### Contexte

* Mesure de l’excellence de la qualité : KPI (Key Performance Indicator)
  - Le KPI suivi ici est nombre de défauts générés en production
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

### Cas pratique au web center Axa

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
