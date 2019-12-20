# MLoutre
*by Marie Rouvière*

Cette application mobile a été réalisée dans le cadre d'un projet en 4ème année à l'ESIEA Ivry, via **Android Studio**.
Ainsi, elle imlpémente plusieurs fonctionnalités comme GoogleMaps ou encore la météo, grâce aux API **Google Developpers** et **Open Weather Map**


Le **GitFlow** contient deux branches : master (pour la version finale) et develop (versions intermédiaires/ de développement)

## Présentation

Il est possible de naviguer dans l'application grâce à plusieurs fragments, reliés entre eux via le MainActivity :

    - ProfileFragment : écran par défaut au lancement de l'aplication, affiche le texte d'acceuil
    - MapsFragment : Affiche la carte récupérée via l'API Google Maps
    - WeatherFragment : Affiche la météo de la ville passée en paramètre de la classe, ici Paris
  
    - Le design du bandeau et l'icône de lancement de l'aplication ont également étés modifiés, dans des soucis esthétiques.

## Apprentissages

Ce projet m'a permis d'**approfondir mes connaissances** sur l'utilisation d'Android Studio.

En effet, j'ai pu découvrir l'utilisation des **fragments**, me permettant de gagner en fluidité, facilité d'implémentation et de proposer des designs plus travaillés et plus esthétiques à l'utilisateur (notemment via le Navigation Drawer). 

J'ai également perfectionné mes connaissances sur les **API** et leurs appels puisque j'ai tout d'abord essayé d'implémenter celle proposée par Instagram avec une authentification par clé. Même si cette première idée n'a pas fonctionée (API trop complexe à mettre en place avec plusieurs clés à générer successivement), c'était intéressant à mettre en oeuvre (ou du moins, essayer ?).

Ensuite, j'ai pu pleinement modifier le **design** de mon application (logo, barres....) mais aussi respecter l'**architecture** demandée : **MVC** dans l'arborescence de mes fichiers.
J'ai aussi utilisé **Github** afin de partager les différentes version de mon application, lors du développement (branche *develop* ou de la phase finale (branche *master*)

Enfin, je dirais que j'ai surtout appris à **corriger les beugs** générés tout au long du projet : de l'implémentation des bibliothèques aux différentes versions d'Android (utilisation d'**Android X**) en passant par les fonctions propres (ou non) aux activités (FindViewByIdea non utilisable dans un fragment)

## Captures d'écran

Ci-dessous, l'**icône** de l'application vue du menu du téléphone :
<p align="center">
<img src="https://zupimages.net/up/19/51/dsvg.png">
</p>

Ci-dessous, l'écran d'**accueil au lancement** :
<p align="center">
<img src="https://zupimages.net/up/19/51/s66q.png">
</p>

Ci dessous, le **menu déroulant** "Navigation Drawer" :
<p align="center">
<img src="https://zupimages.net/up/19/51/s4po.png">
</p>

Ci-dessous, l'écran **Maps** :
<p align="center">
<img src="https://zupimages.net/up/19/51/327b.png">
</p>

Ci-dessous, l'écran **Weather** :
<p align="center">
<img src="https://zupimages.net/up/19/51/zzwf.png">
</p>


