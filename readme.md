# Contexte

Vous êtes en charge du développement d'un module qui doit permettre de calculer la taxe annuelle d'une entreprise.
Le pourcentage de taxe varie selon le type de l'entreprise, celui-ci est fixé par l'état
Il existe plusieurs types d'entreprises. Le premier besoin concerne les SARL et pour les auto-entrepreneurs.
Dans une v2, le module devra prendre en compte tous les types d'entreprises.

# Exercice

La v1 du module doit apporter les class Java nécessaires aux calcul de la taxe pour les SARL et les auto-entreprises.
Ces classes devront pouvoir être utilisées via n’importe quel adapter (API REST, Jframe, Console, etc.)
Ne vous occupez pas de l'exposition, seulement de produire les classes qui répondent à ce besoin.

#### Auto-entreprise

- un SIRET
- une raison sociale
- La taxe fixée par l'état est de 15%

#### SARL

 - un SIRET
 - une raison sociale
 - La taxe fixée par l'état est de 30%
 - une adresse (ex: 31 Avenue du Maréchal - de - Lattre - de - Tassigny, 94120 Fontenay-sous-Bois )

# Outil à votre disposition

- IntelliJ
- Junit 5 & Assert-j
- Lombok

# Qualités évaluées

- Proposition de solution solide et évolutive

# Aide

- SIRET : 14 chiffres: les 9 premiers sont le numéro SIREN, les 5 chiffres suivants sont le code NIC
- Raison social: le nom des sociétés civiles
- Pour connaître le montant taxé, la formule est la suivante : (bénéfice * taxe ) / 100
