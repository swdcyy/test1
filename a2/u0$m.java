package a2.u0$m;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class u0$m	// class@0000b7
{

    public static int a(int p0){
       int i = 1;
       if (p0 == i) {
          return 0;
       }
       int i1 = 2;
       if (p0 == i1) {
          return i;
       }
       i = 4;
       if (p0 == i) {
          return i1;
       }
       i1 = 8;
       if (p0 == i1) {
          return 3;
       }
       if (p0 == 16) {
          return i;
       }
       if (p0 == 32) {
          return 5;
       }
       if (p0 == 64) {
          return 6;
       }
       if (p0 == 128) {
          return 7;
       }
       if (p0 == 256) {
          return i1;
       }
       throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type="+p0);
    }
}
