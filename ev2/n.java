package ev2.n;
import qu2.a;
import co2.f2;
import ev2.k;
import dp1.d;
import androidx.fragment.app.c;
import ev2.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.f;
import java.lang.Boolean;
import lnc.a1;
import tkd.b;
import tkd.d;
import h02.b;
import ev2.n$a;
import h02.d;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import ev2.n$b;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import zx2.c;
import java.util.Objects;
import zx2.c$a;
import java.lang.Integer;
import yx2.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;

public final class n	// class@002806
{
    public LiveDialogContainerFragment a;
    public final a b;
    public final f2 c;
    public final k d;
    public final d e;
    public final c f;
    public final l g;

    public void n(a p0,f2 p1,k p2,d p3,c p4,l p5){
       a.p(p0, "liveBasicContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "cameraSwitcher");
       a.p(p4, "fragmentManager");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       f.a(this.a);
       this.a = null;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.a();
       return;
    }
    public final void c(boolean p0,boolean p1){
       c$a a;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, on, "1")) {
          return;
       }
       this.a();
       String str = a1.p(R.string.arg_RES_7f1007e2);
       int i = (p0)? 1: 2;
       LiveDialogContainerFragment liveDialogCo = d.a(-204054297).hE(new n$a(this, p0), str, p1, this.e);
       this.a = liveDialogCo;
       a.m(liveDialogCo);
       liveDialogCo.k0(new n$b(this));
       n ta = this.a;
       a.m(ta);
       ta.Cb(this.f, "LivePrettifyPreviewFragment");
       a = c.a;
       ta = this.b;
       n tc = this.c;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(c$a.class) || !PatchProxy.applyVoidThreeRefs(ta, tc, Integer.valueOf(i), a, c$a.class, "1")) {
          a.p(ta, "liveBasicContext");
          a.p(tc, "voicePartyContext");
          d uod = new d("LIVE_VOICE_PARTY_BEAUTIFY_PREVIEW_PANEL", tc, ta);
          i3 oi3 = i3.f();
          oi3.c("type", Integer.valueOf(i));
          ta.params = oi3.e();
          uod.g();
       }
       return;
    }
}
