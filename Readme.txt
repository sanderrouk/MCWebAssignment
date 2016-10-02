Lahendus koosneb kahest raamistikust, Spring ja AngularJS. 

Käivitamiseks on vaja JDK8 olemasolu. Seejärel tuleks projekt avada mõne IDEga kasutades selleks Gradle projekti importimist. 

Et programm käivituks tuleb lihtsalt käivtada main class, milleks on /src/main/java/com.timer/TimerApplication.class

Kasutajaliidesele pääseb juurde http://localhost aadressilt. Kui port 80 on kasutuses siis saab rakenduse porti muuta failis /src/main/resources/application.properties

Kasutajaliides on jaotatud kaheks, vasakul on tabel mis on ülessande lahenduse kasutajaliidese osa mis uuendab ennast iga 5 sekundi tagant kui kasutajal on brauseri aken aktiivne.
Paremal on niiöelda testimise paneel koos stopperiga. 

Kuidas testida:
1.Käivita stopper
2.Vali soovitud jooksja (alguses laetud jooksjaid saab muuta failis: /src/main/resources/import.sql)
3.Vajuta kas stardikoridori alguse või finishi nupule.

Test saadab andmed reaalajas backendile, ja frontend võtab iga 5 sekundi tagant andmed backendist. Test ei suhtle otse frontendiga.

Stopper jäeb käima fookuse kaotades taotuslikult. Küll aga lõpetatakse andmete uuendamine.