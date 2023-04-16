package awb.a$b;
import erd.g;
import awb.a;
import java.lang.Object;
import xvb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.res.ColorStateList;
import android.widget.Button;

public final class a$b implements g	// class@00033e
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int[] ointArray1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
       }else {
          c a = p0.a;
          p0 = p0.b;
          a s = this.b.s;
          if (s == null) {
             a.S("mButton");
          }
          int[][] ointArray = new int[][2]{ointArray1,ointArray1};
          ointArray1 = new int[]{-16842913};
          ointArray1 = new int[]{0x10100a1};
          int[] ointArray2 = new int[]{a,p0};
          s.setTextColor(new ColorStateList(ointArray, ointArray2));
          PatchProxy.onMethodExit(a$b.class, "1");
       }
       return;
    }
}
