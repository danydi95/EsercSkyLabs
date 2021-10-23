#READ ME


####ITA Version:
- È stato utilizzato Spring boot e il linguaggio java per la realizzazione di tale web service seguendo la tecnologia REST.
- Nel package Entity ci sono i record del database salvate come classi a cui è possibile accedere tramite costruttori, getter e setter.
- Inoltre sono presenti anche i RowMapper delle entità che bisogna mappare dal database e utilizzate per gli endpoint richiesti.
- Nel package DBManager ci sono i metodi predefiniti per accedere al database di tipo SQLite.
- Tutti gli endpoint sono inseriti nel file publicEndPoint all'interno del package Controller.

Tali endpoint realizzano rispettivamente i punti citati nell'esercizio:

1- Lista dei record denormalizzati:
    
    Per fare questo è stata scritta la query passata al databse con i parametri offset e count ed è stata eseguita ritornando il risultato in formato JSON
    Chiamata all'endpoint di nome GetDenormalizedRecords:

    http://localhost:8080/rest/denorm/offset=x&count=y

    dove x e y sono i parametri da passare

    Esempio:
    http://localhost:8080/rest/denorm/offset=20&count=100

2- Statistiche:

    In maniera analoga all'endpoint precedente è stato realizzato anche quello sulle statistiche
    Chiamata all'endpoint di nome Stats:

    http://localhost:8080/rest/stats/type=x&value=y

    dove x e y sono i parametri da passare

    Esempio:
    http://localhost:8080/rest/stats/type=age&value=30

3- Download dei record denormalizzati in formato CSV:
    
    Per l'ultimo endpoint si è ricorso all'utility CSVUtils contenuto nel package CSVUtils, che permette di costruire appositamente
    il file CSV dalla lista dei record denormalizzati. Quindi è stato possibile il download con formato "Salva come" facendo uso dell'header HTTP
    e impostandolo in tale modalità

    Chiamata all'endpoint di nome CSV_denorm_download:

    http://localhost:8080/rest/denorm/download

    Verrà effettuato il download di un file denominato denorm_records_DATA_E_ORA_ATTUALI.csv da salvare tramite finestra di dialogo

    
####ENG Version:
- It was used Spring boot and java language for the realization of this web service following REST technology.
- In the package Entity there are the database records saved as classes to which it's possible access trough constructors, getter and setter.
- In addition there are also the RowMappers of the entity that it's needed to map into database e used for the required endpoints.
- Into the package DBManager there are default methods for access SQLite type databases.
- All the endpoints are inserted into the publicEndPoint file inside the Controller package.

These endpoint respectively realize the points mentioned in the exercise:

1- Denormalized records list:

    For doing this, it has been written the query and then passed to the database with the offset and count parameters and it has been executed returning the result in JSON format
    Endpoint Call of GetDenormalizedRecords :

    http://localhost:8080/rest/denorm/offset=x&count=y

    where x and y are the required parameters

    Example:
    http://localhost:8080/rest/denorm/offset=20&count=100

2- Statistics:

    In a similar way to the preceding endpoint, the one on statistics has also been realized.
    Endpoint Call of Stats: 

    http://localhost:8080/rest/stats/type=x&value=y

    where x and y are the required parameters

    Example:
    http://localhost:8080/rest/stats/type=age&value=30

3- CSV Download of denormalized records:

    For last endpoint it has been used the CSVUtils utility contained inside the CSVUtils package, which allows to build on purpose
    the CSV file from the denormalized records list. So it was possible the download in "Save as" format using the HTTP header 
    and setting the header in that mode

    Endpoint Call of CSV_denorm_download:

    http://localhost:8080/rest/denorm/download

    A file called denorm_records_ACTUAL_DATE_TIME.csv will be downloaded and saved via the dialog box.

