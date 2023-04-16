package bca.a$b;
import java.lang.Runnable;
import java.lang.String;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.ArrayList;
import bca.a;
import eca.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutFocusNotifyAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class a$b implements Runnable	// class@00044b
{
    public final String b;
    public final boolean c;
    public final Ref$IntRef d;
    public final ArrayList e;
    public final a f;
    public final g g;

    public void a$b(String p0,boolean p1,Ref$IntRef p2,ArrayList p3,a p4,g p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, a$b.class, "1")) {
          return;
       }
       a d = this.f.d;
       if (d != null) {
          d.t0(new AICutFocusNotifyAction(true));
       }
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
