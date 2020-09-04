import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Board <T extends Shape> implements Iterable{
private Shape [][] arrayList;
private int boardSize;

  public Board(Shape[][] arrayList, int boardSize) {
    this.arrayList = arrayList;
    this.boardSize = boardSize;
  }

  public boolean add(Shape shape, int a, int b){
  if (a >= 0 && b >= 0 && a<= boardSize-1 && b<= boardSize -1){
    for (int i = 0; i<arrayList.length; i++){
      for (int j = 0; j < arrayList[i].length; j++){
        arrayList[i][j] = shape;
      }
    }
    return true;
  }
  return false;
  }

  public Shape remove(int a, int b){
if (a <= boardSize && b <= boardSize){
  Object o = arrayList[a][b];
  if (o instanceof Rectangle){
    return (Rectangle)o;
  }else if (o instanceof Circle){
    return (Circle)o;
  }else {
    return null;
  }
}
return null;
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  public Shape[][] getGrid() {
return arrayList;
  }

}
