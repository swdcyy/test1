package bhd.a;
import u07.u;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ou5.b;
import ihc.a;
import android.content.Context;

public final class a implements u	// class@000261
{
    public final BindPhoneItem b;

    public void a(BindPhoneItem p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       d.a(-1712118428).OH(this.b.c);
       return;
    }
}
