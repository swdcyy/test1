package a7c.c;
import android.util.SparseIntArray;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c	// class@000090
{
    public static final SparseIntArray a;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       c.a = sparseIntArr;
       sparseIntArr.put(76, 1);
       sparseIntArr.put(2, 20);
       sparseIntArr.put(9, 1);
       sparseIntArr.put(4, 18);
       sparseIntArr.put(18, 58);
       sparseIntArr.put(44, 126);
       sparseIntArr.put(50, 145);
       sparseIntArr.put(1, 2);
       sparseIntArr.put(27, 85);
       sparseIntArr.put(54, 20);
       sparseIntArr.put(47, 20);
       sparseIntArr.put(29, 18);
       sparseIntArr.put(3, 22);
       sparseIntArr.put(52, 2);
       sparseIntArr.put(63, 145);
       sparseIntArr.put(46, 124);
       sparseIntArr.put(10, 2);
       sparseIntArr.put(28, 4);
       sparseIntArr.put(31, 18);
       sparseIntArr.put(40, 4);
       sparseIntArr.put(52, 2);
       sparseIntArr.put(74, 187);
       sparseIntArr.put(77, 49);
       sparseIntArr.put(69, 176);
       sparseIntArr.put(63, 145);
       sparseIntArr.put(71, 4);
    }
    public void c(){
       super();
    }
    public static int a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return c.a.get(p0, -1);
    }
}
