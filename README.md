# exceptions
Les Exceptions
Une exception est un évènement exceptionelle qui arrive pendant l'exécution d'un programme qui n'empêche par le programme de s'exécuter mais peut entrainer un disfonctionnement s'il n'est pas gérée correctement.

Il existe deux types d'execption.
	- les checkedExecption
	- les runtimeException

les Exceptions de type checked sont vérifiées au moment de la compilation (IOException, SQLException) alors que les runtimeException
sont vérifiées au moment de l'execution (arithmeticException).

Pour gérer les exceptions il existe deux manière de faire:
	- propager l'exeption: utiliser la clause throws qui permet de propager et envoyer l'exception à la classe "appelante"
	- gérer l'exeption: utiliser le bloc try / catch qui permet de gérer l'exception



Exception unchecked
Test:
Création d'un projet avec une division par 0 direction dans la classe "main"
constat: constat d'un stack(arithmeticException)

Test 2:
Création d'un projet en couche avec une division par 0 (propagation de l'exception)
constat: propagation de l'exception dans le stack

Test3:
Création d'un projet en couche avec deux classe services et une division par 0 dans la classe service2 (propagation de l'exception)
constat: propagation de l'exception dans le stack

Exception checked
Test4: 
Création d'un projet avec la création d'un nouveau fichier (IOException)
constat: refus de compiler car méthode qui impose d'utiliser un throws ou un try / catch

Test5:
création d'un projet en couche avec la création d'un nouveau fichier dans la classe service2 (propagation de l'exception) jusqu'à la couche présentation
gestion du problème de compilaton à travers une clause throws
constat: stack car l'exception n'est pas résolut

Test6:
création d'un projet en couche avec la création d'un nouveau fichier dans la classe service2 et gestion de l'exception avec try / catch dans la classe service2
gestion du problème de compilaton à travers un bloc try / catch
constat: stack avec le message de l'exception du "catch"
