package bnd.b;
import and.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bnd.b$e;
import bnd.b$d;
import bnd.b$c;
import bnd.b$b;
import bnd.b$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hnd.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import rod.b;
import java.lang.Boolean;
import xld.a;
import gnd.b;

public final class b extends TextMainBaseViewBinderV3 implements a	// class@000291
{
    public final b$b A;
    public final b$a B;
    public final b$e x;
    public final b$d y;
    public final b$c z;

    public void b(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "delegate");
       super(p1, p0, true, p2);
       this.x = new b$e(this);
       this.y = new b$d(this);
       this.z = new b$c(this);
       this.A = new b$b(this);
       this.B = new b$a(this);
    }
    public DecorationContainerView$d G(){
       return this.B;
    }
    public a I(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a0().o0().C();
    }
    public b J(){
       return this.y;
    }
    public EditReduxViewModel M(){
       return this.a0();
    }
    public void O7(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       this.S(p0.C(), p1.C());
       return;
    }
    public b P(){
       return this.A;
    }
    public b Q(){
       return this.z;
    }
    public b R(){
       return this.x;
    }
    public boolean T(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.a0().o0().E() || this.a0().o0().s())? true: false;
       return b;
    }
    public f a0(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(this.K());
    }
}
