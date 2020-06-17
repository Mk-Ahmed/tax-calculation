Ce module doit permettre de calculer la taxe annuelle d'une entreprise. Il existe plusieurs types d'entreprises, à ce jour le besoin est pour les SARL et pour les auto-entrepreneurs. À l'avenir, l'api devra prendre en compte tous les types d'entreprises. Une entreprise quel que soit son type possède :

un SIRET (14 chiffres: les 9 premiers sont le numéro SIREN, les 5 chiffres suivants sont le code NIC)
une raison sociale ( le nom des sociétés civiles)
un profit annuel (ex: 42 000.00 €)
un pourcentage de taxe par l'État: Pour les entreprises "dites" SARL, la taxe est de 30% Pour les entreprises "dites" Auto-entreprenneur est de 15%
une SARL possedent une adresse (ex: 31 Avenue du Maréchal - de - Lattre - de - Tassigny, 94120 Fontenay-sous-Bois )
Votre but dans cet exercice est de developper les class Java nécéssaires aux calcul de la taxe pour chaques types d'entreprises. Ces classes devront pouvoir etre utilisées via nimporte quel adapter (API REST, Jframe, Console, etc.) Ne vous occupez pas de l'exposition, seulement de produire les classes qui repondent à ce besoin.

Pour calculer la taxe la formule mathématique est la suivante : (benefice * taxe ) / 100

Outil à votre disposition :

IntelliJ
Junit 5 & Assert-j
Lombok
A vous de jouer vous avez 30 minutes, BON COURAGE !!!