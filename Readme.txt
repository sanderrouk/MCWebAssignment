Lahendus koosneb kahest raamistikust, Spring ja AngularJS. 

K�ivitamiseks on vaja JDK8 olemasolu. Seej�rel tuleks projekt avada m�ne IDEga kasutades selleks Gradle projekti importimist. 

Et programm k�ivituks tuleb lihtsalt k�ivtada main class, milleks on /src/main/java/com.timer/TimerApplication.class

Kasutajaliidesele p��seb juurde http://localhost aadressilt. Kui port 80 on kasutuses siis saab rakenduse porti muuta failis /src/main/resources/application.properties

Kasutajaliides on jaotatud kaheks, vasakul on tabel mis on �lessande lahenduse kasutajaliidese osa mis uuendab ennast iga 5 sekundi tagant kui kasutajal on brauseri aken aktiivne.
Paremal on nii�elda testimise paneel koos stopperiga. 

Kuidas testida:
1.K�ivita stopper
2.Vali soovitud jooksja (alguses laetud jooksjaid saab muuta failis: /src/main/resources/import.sql)
3.Vajuta kas stardikoridori alguse v�i finishi nupule.

Test saadab andmed reaalajas backendile, ja frontend v�tab iga 5 sekundi tagant andmed backendist. Test ei suhtle otse frontendiga.

Stopper j�eb k�ima fookuse kaotades taotuslikult. K�ll aga l�petatakse andmete uuendamine.