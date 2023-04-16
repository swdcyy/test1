package m9a.f0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;

public final class f0 implements View$OnClickListener	// class@002f7c
{
    public static final f0 b;

    static {
       f0.b = new f0();
    }
    public void f0(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("ViewAbortClickUtils", "已经被屏蔽点击了，TAG：ViewAbortClickUtils", objArray);
       return;
    }
}
