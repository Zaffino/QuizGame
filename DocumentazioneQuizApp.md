# DOCUMENTO DI SPECIFICA DEI REQUISITI SOFTWARE
## Tabella contenuti

1. **Introduzione**
1.1 Propositi
1.2 Obiettivi

2. **Descrizione generale**
2.1 Prospettive del prodotto
2.2 Funzionalità del prodotto
2.3 Caratteristche utente
2.4 Vincoli generali

3. **Requisiti specifici**
3.1 Interfaccia utente

1 **Introduzione**

1.1 **Propositi**

Il proposito di questo documento è quello di specificare i requisiti del progetto
"QuizApp" per facilitarne la realizzazione.
Questo documento è stato scritto seguendo le indicazioni contenute nel documento "IEEE Recommended Practice for Software Requirements Specifications" avente riferimento IEEE Std 830-1993 (Revision of IEEE Std 830-1984).

1.2 **Obiettivi**

Si desidera che il cliente possa avere ore di divertimento grazie ai vari quesiti posti dalla nostra applicazione.

2. **Descrizione generale**

Questa applicazione darà in pasto al giocatore quesiti di diverse tipologie per un massimo di dieci a partita.

2.1 **Prospettive del prodotto**

Il prodotto può essere utilizzato in totale autonomia, dotato però di connessione a internet.
L'applicazione risulta inoltre leggera per il cellulare il quale non ne risulterà affaticato, per questo è accessibile ad ogni dispositivo mobile moderno.

2.2 **Funzionalità del prodotto**

Il prodotto permette, una volta in partita, di leggere la domanda posta e scegliere una tra le quattro risposte possibili, se la risposta è sbagliata sarà segnata con un colore rosso, se giusta invece verrà colorata di verde.

2.3 **Caratteristche utente**

Il sistema è rivolto a chiunque voglia divertirsi e anche magari imparare nello stesso momento grazie a un sistema a quiz che copre diversi argomenti, tramite un' interfaccia user friendly.

2.4 **Vincoli generali**

Connessione a internet obbligatoria, dato che i quesiti vengono presi dalle API di:

https://opentdb.com/api_config.php

3. **Requisiti specifici**

3.1 **Interfaccia utente**

L'applicazione quando avviata presenterà un home page uno per avviare la partita e un altro invece che permetterà la scelta della categoria(che verrà effettuata su un'altra pagina).
Quando il gioco avrà inizio ci sarannò dieci quesiti ai quali rispondere, con la domanda in alto e in basso invece 4 bottoni con le risposte possibili.
Una volta finito il gioco si verrà trasportati su una nuova pagina che segnerà il punteggio e grazie ad un bottone permetterà di ricominciare il gioco.
