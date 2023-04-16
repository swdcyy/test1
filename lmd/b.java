package lmd.b;
import nmd.q;
import smd.d;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ooc.k0;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import mod.a;
import nsd.u;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b extends q	// class@001c55
{
    public a C;
    public final d D;

    public void b(d p0,Fragment p1,View p2){
       a.p(p0, "viewModelV2");
       a.p(p1, "fragment");
       a.p(p2, "rootView");
       super(p1, p2, new k0());
       this.D = p0;
       a uoa = new a(false, false, false, 0, null, false, null, null, 255, null);
       this.C = p0;
    }
    public a I(){
       return this.C;
    }
    public EditReduxViewModel P(){
       return this.h0();
    }
    public boolean V(){
       return false;
    }
    public d h0(){
       return this.D;
    }
    public final a m0(){
       return this.C;
    }
    public final void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.C = p0;
       return;
    }
}
