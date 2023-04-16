package bnd.a;
import and.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bnd.a$d;
import bnd.a$b;
import bnd.a$c;
import bnd.a$a;
import ynd.c;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hnd.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import java.lang.Boolean;
import xld.a;
import gnd.b;

public final class a extends KeyBoardPanelBaseViewBinder implements a	// class@00028b
{
    public final a$a A;
    public final a$d x;
    public final a$b y;
    public final a$c z;

    public void a(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "delegate");
       super(p1, p0, true, false, p2);
       this.x = new a$d(this);
       this.y = new a$b(this);
       this.z = new a$c(this);
       this.A = new a$a(this);
    }
    public c F(){
       return this.z;
    }
    public DecorationContainerView$d G(){
       return this.A;
    }
    public a I(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g0().o0().C();
    }
    public c K(){
       return this.y;
    }
    public void O7(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       this.U(p0.C(), p1.C());
       return;
    }
    public EditReduxViewModel P(){
       return this.g0();
    }
    public c T(){
       return this.x;
    }
    public boolean V(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g0().o0().E() || this.g0().o0().s())? true: false;
       return b;
    }
    public f g0(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(this.L());
    }
}
