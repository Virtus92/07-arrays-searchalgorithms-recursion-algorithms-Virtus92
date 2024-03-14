# Sortieralgorithmen

Wie im vorigen Kapitel gesehen, spielt die Reihenfolge der Elemente in einem Array eine Rolle. Da die Werte aber manchmal sortiert werden müssen, damit man sie besser verwenden kann, ist es wichtig, zu lernen, wie man Arrays sortiert.

Uns stehen mehrere bekannte Algorithmen zur Verfügung. Die einen sind von der Funktionslogik her leicht zu verstehen, benötigen aber meist hohen Speicherbedarf, oder die Arbeitsdauer steigt exponentiell mit der größe des Array an. Andere sind von der Logik her nicht trivial, sind aber bei größeren Arrays sehr schnell und/oder benötigen wenig Speicher. 

Folgende sind die bekanntesten:
- Selection Sort
- Insertion Sort
- Bubble Sort
- Merge Sort
- Quick Sort

## Selection Sort

Ein Array wird immer in den bereits sortierten Teil S und den unsortierten Teil U geteilt.
Der kleinste Wert im unsortierten Array U wird mit dem ersten Wert im unsortierten Array U vertauscht. Dadurch gehört dieses vorgeschobene Element nun zum sortierten Teil.
Zu Beginn ist das gesamte Array unsortiert.

![Selection Sort - Beispiel 1](img/07-03-Selection%20Sort%201.png)

![Selection Sort - Beispiel 2](img/07-04-Selection%20Sort%202.png)

## Insertion Sort

Ein Array wird immer in den bereits relativ(intern) sortierten Teil S und den unsortierten Teil U geteilt .
Schritt für Schritt wird das erste Element des unsortierten Teils gewählt und an die richtige Stelle im sortierten Array geschoben.
Zu Beginn ist das gesamte Array unsortiert.

![Insertion Sort - Beispiel 1](img/07-05-Insertion%20Sort%201.png)

![Insertion Sort - Beispiel 2](img/07-06-Insertion%20Sort%202.png)

## Bubble Sort

Von links beginnend werden immer zwei aufeinander folgende Elemente im Array verglichen und vertauscht, falls deren Reihenfolge nicht stimmt. 
Dadurch ist nach der ersten Iteration das größte Element ganz rechts, nach der zweiten Iteration sind die beiden größten Elemente rechts.

![Bubble Sort - Beispiel 1](img/07-07-Bubble%20Sort%201.png)

![Bubble Sort - Beispiel 2](img/07-08-Bubble%20Sort%202.png)

![Bubble Sort - Beispiel 3](img/07-09-Bubble%20Sort%203.png)

![Bubble Sort - Beispiel 4](img/07-10-Bubble%20Sort%204.png)

![Bubble Sort - Beispiel 5](img/07-11-Bubble%20Sort%205.png)

## Merge Sort

Ein Array wird in kleinere Arrays zerlegt, diese werden in sich sortiert und in sortierter Reihenfolge zusammengeführt (beim Merge).

![Merge Sort - Beispiel 1](img/07-12-Merge%20Sort%201.png)

![Merge Sort - Beispiel 2](img/07-13-Merge%20Sort%202.png)

## Quick Sort

Wie beim Merge Sort wird beim Quick Sort das Array geteilt und die Sublisten werden sortiert. Beim Teilen wird dabei ein Pivotelement gewählt und alle Elemente, die kleiner als das Pivotelement sind, in die linke Hälfte und jene, die größer sind, in die rechte Hälfte getauscht. 
Diese Sortierung wird auf alle Sublisten wieder angewandt bis die vollständige Liste sortiert ist.

## animierte Visualisierung von Sortieralgorithmen 

[animierter Vergleich von Sortieralgorithmen](https://www.toptal.com/developers/sorting-algorithms)

Zurück zur [Startseite](README.md)
