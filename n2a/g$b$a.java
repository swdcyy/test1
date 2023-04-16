package n2a.g$b$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import n2a.g$b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n2a.g;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import n2a.h;
import android.view.View$OnClickListener;
import java.lang.Integer;
import lnc.a1;
import o07.o;

public class g$b$a implements PopupInterface$h	// class@0030cf
{
    public final g$b b;

    public void g$b$a(g$b p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b$a.class, "1")) {
          return;
       }
       g$b a = this.b.a;
       boolean b = true;
       a.p = b;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, g.class, "7")) {
          g q = a.q;
          if (q == null || (q.getCurrentPhoto() != null && a.q.getCurrentPhoto().mEntity != null)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOCAL_PERMISSION_POPUP";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(a.q.getCurrentPhoto().mEntity);
             u1.D0(null, null, 3, uElementPack, uContentPack, null);
          }
       }
       p0.z().findViewById(R.id.title).getPaint().setFakeBoldText(b);
       p0.z().findViewById(R.id.close).setOnClickListener(new h(this, p0));
       return;
    }
    public void H(c p0,int p1){
       g$b$a uob$a = g$b$a.class;
       if (PatchProxy.isSupport(uob$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob$a, "2")) {
          return;
       }
       if (p1 == 2) {
          this.b.a.P8(p0.z(), a1.p(R.string.arg_RES_7f1003f0));
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
