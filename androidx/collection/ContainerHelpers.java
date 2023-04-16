package androidx.collection.ContainerHelpers;
import java.lang.Object;

public class ContainerHelpers	// class@000659
{
    public static final int[] EMPTY_INTS;
    public static final long[] EMPTY_LONGS;
    public static final Object[] EMPTY_OBJECTS;

    static {
       int[] ointArray = new int[0];
       ContainerHelpers.EMPTY_INTS = ointArray;
       long[] olongArray = new long[0];
       ContainerHelpers.EMPTY_LONGS = olongArray;
       Object[] objArray = new Object[0];
       ContainerHelpers.EMPTY_OBJECTS = objArray;
    }
    public void ContainerHelpers(){
       super();
    }
    public static int binarySearch(int[] p0,int p1,int p2){
       int i1;
       p1--;
       int i = 0;
       while (true) {
          if (i > p1) {
             return (~ i);
          }
          i1 = i + p1;
          i1 = i1 >> 1;
          int i2 = p0[i1];
          if (i2 < p2) {
             i1 = i1 + 1;
             i = i1;
          }else if(i2 > p2){
             i1 = i1 - 1;
             p1 = i1;
          }else {
             break ;
          }
       }
       return i1;
    }
    public static int binarySearch(long[] p0,int p1,long p2){
       int i1;
       p1--;
       int i = 0;
       while (true) {
          if (i > p1) {
             return (~ i);
          }
          i1 = i + p1;
          i1 = i1 >> 1;
          if ((v4 = p0[i1] - p2) < 0) {
             i1 = i1 + 1;
             i = i1;
          }else if(v4 > 0){
             i1 = i1 - 1;
             p1 = i1;
          }else {
             break ;
          }
       }
       return i1;
    }
    public static boolean equal(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static int idealByteArraySize(int p0){
       int i1;
       int i = 4;
       while (true) {
          if (i >= 32) {
             return p0;
          }
          i1 = 1 << i;
          i1 = i1 - 12;
          if (p0 <= i1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i1;
    }
    public static int idealIntArraySize(int p0){
       return (ContainerHelpers.idealByteArraySize((p0 * 4)) / 4);
    }
    public static int idealLongArraySize(int p0){
       return (ContainerHelpers.idealByteArraySize((p0 * 8)) / 8);
    }
}
