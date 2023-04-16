package e0b.e$j;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar$a;
import e0b.e;
import java.lang.Object;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import cgc.a;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;
import e0b.e$a;

public final class e$j implements ScaleAnimSeekBar$a	// class@0025be
{
    public final e a;

    public void e$j(e p0){
       this.a = p0;
       super();
    }
    public void a(ScaleAnimSeekBar p0){
       e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$j.class, "1")) {
          return;
       }
       a uoa = this.a.y.j();
       boolean b = this.a.y.d() instanceof a;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoa, uoa1, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PROJECTION_SCREEN_DRAG_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("is_ks_tv", uoa.j(b));
          oi3.d("reason", uoa.i);
          uElementPack.params = oi3.e();
          u1.M("", null, 1, uElementPack, null, null);
       }
       KLogLelink kLogLelink = KLogLelink.e.a();
       a = this.a.a;
       StringBuilder str = "onProgressChanged by touch: ";
       Integer integer = (p0 != null)? Integer.valueOf(p0.getProgress()): null;
       int i = 0;
       Object[] objArray = new Object[i];
       kLogLelink.w(a, str+integer, objArray);
       e$a uoa2 = this.a.b();
       if (p0 != null) {
          i = p0.getProgress();
       }
       uoa2.e(i);
       return;
    }
    public void b(ScaleAnimSeekBar p0){
    }
    public void c(ScaleAnimSeekBar p0,int p1,boolean p2){
    }
}
