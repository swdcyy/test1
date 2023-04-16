package ah5.c$b;
import android.graphics.drawable.ColorDrawable;
import ah5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class c$b extends ColorDrawable	// class@0000a1
{
    public final c a;

    public void c$b(c p0,int p1){
       this.a = p0;
       super(p1);
    }
    public int getIntrinsicHeight(){
       return 1;
    }
    public int getIntrinsicWidth(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(23.00f);
    }
}
