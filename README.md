# Namedays
Implement code that reads a list of namedays from a JSON file and then searches for a list of namedays for a given day.

1. The `MainProgram` class is already implemented. After correctly implementing the other classes, the program will print out who has a holiday today.
2. The `namedays.json` file already contains prepared data in a suitable format.
3. You will be editing the `NamedayService` class. The `Nameday` and `NamedayList` classes are already implemented.
5. In the `NamedayList` class, an `ObjectMapper` and the path to the JSON file with the data are already prepared in the `pathToDate` field.
6. In the constructor of `NamedayList`, implement loading into the `namedayList` field using the `objectMapper`.
7. In the `findNamedayForDay()` method, implement searching for namedays for the given day and return a list of names.
8. In the `NamedayServiceTest` implement appropriate tests for the `findNamedayForDay()` method. Don't forget about different scenarios - days when there is one name for a nameday, multiple names, or nobody. If it suits you better, divide the tests into multiple separate methods.






# Svátky

Implementujte kód, který načte seznam svátků z JSON souboru a následně vyhledá seznam svátků pro daný den.

1. Třída `HlavniProgram` už je implementovaná. Po správné implementaci ostatních tříd program po spuštění vypíše, kdo má dnes svátek.
2. V souboru `svatky.json` už jsou připravená data ve vhodném formátu.
3. Upravovat budete třídu `SvatkySluzba`. Třídy `Svatek` a `SeznamSvatku` už jsou implementované.
5. Ve třídě `SeznamSvatku` už je připravený `ObjectMapper` a cesta k JSON souboru s daty ve fieldu `cestaKDatum`.
6. V konstruktoru `SeznamSvatku` implementujte načtení pomocí `objectMapper`u do fieldu `seznamSvatku`.
7. V metodě `vyhledatSvatkyKeDni()` implementujte vyhledání svátků k zadanému dni a vrácení seznamu jmen.
8. V testu `SvatkySluzbaTest` implementujte vhodné testy metody `vyhledatSvatkyKeDni()`. Nezapomeňte na různé případy – dny, kdy má svátek jedno jména, více jmen nebo nikdo. Pokud vám to bude lépe vyhovovat, rozdělte testy do více samostatných metod. 

