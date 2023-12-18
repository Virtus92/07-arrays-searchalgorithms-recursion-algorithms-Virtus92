# Arrays und Collections

## Grundsätzliches

Mit den bisherigen Datentypen, die wir kennen, können wir lediglich einzelne Werte in Variablen speichern: Sei es ein Geburtstdatum oder ein Name...

Oft ist es aber notwendig, sich mehrere Werte zu merken: zB eine Bestenliste bei einem Rennen. 

Will man also mehrere Datensätze eines bestimmten Datentyps speichern, braucht man eine sogennante Collection. Eine Collection ist ein Behälter für eine Ansammlung von Daten desselben Datentyps.

Es gibt mehrere Arten von Collections. In diesem Kapitel stellen wir Arrays vor.

## Die wichtigsten Eigenschaften eines Arrays

* **fixe Länge**, die bei der Initialisierung definiert wird
* der Zugriff auf Elemente erfolgt anhand eines Index (Position im Array), so ist die **Reihenfolge der Elemente wichtig**
* das **erste Element** befindet sich immer an der **Position 0** (Index == 0)

![Array und Indices](img/07-01-Array-Indices.png)

## Arrays Java / C#

In höheren Programmierprachen kann ein Array auf folgende Art und Weisen erstellt werden:

### Ein Array aus int mit Länge 8

#### Java

```Java
int[] intArray = new int[8];
```

#### C#

```c#

```

### Ein Array aus Strings mit 3 Elementen: "Hello", "World" und "!"

#### Java

```Java
String[] stringArray = {"Hello", "World", "!"};
```

#### C#

```c#

```

### Zugriff auf ein Element

Um nun auf ein Element des Arrays zuzugreifen wird der Index gebraucht. Das Element mit dem Index 3 erhalte ich mit folgender Zeile:

#### Java

```Java
System.out.println(intArray[3]);
```

#### C#

```c#

```

ACHTUNG! Wenn man einen Zugriff mit einem Index größer oder gleich der Größe des Arrays versucht wird ein Fehler, eine sogenannte Exception, ausgeworfen, da man versucht, auf ein Element zuzugreifen, das nicht im Array zu finden ist.

![Array Out of Bound](img/07-02-Array-OutOfBound.png)

### Wert eines Elements ändern

Verändern kann man den Wert auf dieselbe Weise:

#### Java

```Java
int[] intArray = new int[8];

intArray[0] = 4; // Der Index des ersten Elements ist immer 0!
```

#### C#

```c#

```

## 2-Dimensionale Arrays

Ein ***String[]*** ist auch ein Datentyp genauso wie String und int. Da man aus einem String ein Array aus Strings machen kann, kann man auch aus einem String[] ein Array
aus String[] machen.

#### Java

```Java
String[][] twoDimensionalArray = new String[3][5];
```

#### C#

```c#

```

Ein 2-Dimensionales Array kann zur Speicherung eines Spielfeldes eingesetzt werden. z.B.: Speichere ein 3x3 Feld aus Zahlen und gib dies auf der Konsole aus.

#### Java

```Java
int[][] field = new int[3][3]; // init 3x3 field
for (int i = 0; i < field.length;i++){ // iterate through lines
for (int j = 0; j < field[i].length; j++){ // iterate through columns of current line
System.out.print(" " + field[i][j] + " "); // print current column of current line
}
System.out.println(); // line break
}
```

#### C#

```c#

```