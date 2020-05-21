# DOCUMENTO DI SPECIFICA DEI REQUISITI SOFTWARE
## Tabella contenuti

1. **Introduzione**
1.1 Propositi
1.2 Obiettivi

2. **Descrizione generale**
2.1 Prospettive del prodotto
2.2 Funzionalit� del prodotto
2.3 Caratteristche utente
2.4 Vincoli generali

3. **Requisiti specifici**
3.1 Interfaccia utente

1 **Introduzione**

1.1 **Propositi**

Il proposito di questo documento � quello di specificare i requisiti del progetto
"QuizApp" per facilitarne la realizzazione.
Questo documento � stato scritto seguendo le indicazioni contenute nel documento "IEEE Recommended Practice for Software Requirements Specifications" avente riferimento IEEE Std 830-1993 (Revision of IEEE Std 830-1984).

1.2 **Obiettivi**

Si desidera che il cliente possa avere ore di divertimento grazie ai vari quesiti posti dalla nostra applicazione.

2. **Descrizione generale**

Questa applicazione dar� in pasto al giocatore quesiti di diverse tipologie per un massimo di dieci a partita.

2.1 **Prospettive del prodotto**

Il prodotto pu� essere utilizzato in totale autonomia, dotato per� di connessione a internet.
L'applicazione risulta inoltre leggera per il cellulare il quale non ne risulter� affaticato, per questo � accessibile ad ogni dispositivo mobile moderno.

2.2 **Funzionalit� del prodotto**

Il prodotto permette, una volta in partita, di leggere la domanda posta e scegliere una tra le quattro risposte possibili.

2.3 **Caratteristche utente**

Il sistema � rivolto a chiunque voglia divertirsi e anche magari imparare nello stesso momento grazie a un sistema a quiz che copre diversi argomenti, tramite un' interfaccia user friendly.

2.4 **Vincoli generali**

Connessione a internet obbligatoria, dato che i quesiti vengono presi dalle API di:

https://opentdb.com/api_config.php

3. **Requisiti specifici**

3.1 **Interfaccia utente**

L'applicazione quando avviata presenter� un home page uno per avviare la partita e un altro invece che permetter� la scelta della categoria(che verr� effettuata su un'altra pagina).
Quando il gioco avr� inizio ci sarann� dieci quesiti ai quali rispondere, con la domanda in alto e in basso invece 4 bottoni con le risposte possibili.
Una volta finito il gioco si verr� trasportati su una nuova pagina che segner� il punteggio e grazie ad un bottone permetter� di ricominciare il gioco.