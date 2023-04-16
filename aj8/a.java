package aj8.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.IndexOutOfBoundsException;

public class a	// class@0000a6
{
    public static final char[] a;
    public static final char[] b;

    static {
       a.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       a.b = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    }
    public void a(){
       super();
    }
    public static String a(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 >= 0 && (p1 + p2) <= p0.length) {
          int i = p2 * 2;
          char[] uocharArray = new char[i];
          int i2 = 0;
          for (int i1 = 0; i1 < p2; i1 = i1 + 1) {
             int i3 = i1 + p1;
             i3 = p0[i3] & 0x00ff;
             int i4 = i2 + 1;
             char[] b = a.b;
             int i5 = i3 >> 4;
             uocharArray[i2] = b[i5];
             i2 = i4 + 1;
             i3 = i3 & 0x0f;
             uocharArray[i4] = b[i3];
          }
          return new String(uocharArray, 0, i);
       }else {
          throw new IndexOutOfBoundsException();
       }
    }
}
