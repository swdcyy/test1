package jca.a$b;
import android.view.View$OnTouchListener;
import jca.a;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class a$b implements View$OnTouchListener	// class@002a48
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       int i = p1.getAction() & 0x00ff;
       int i1 = 0;
       if (i) {
          if (i != 1) {
             if (i == 3) {
                this.b.m.q0(i1);
             }
          }else {
             this.b.m.q0(i1);
          }
       }else {
          this.b.m.q0(true);
       }
       Object[] objArray = new Object[i1];
       a.D().w("FineTuningPanelViewBinder", "mOriginButton event:"+p1, objArray);
       return true;
    }
}
