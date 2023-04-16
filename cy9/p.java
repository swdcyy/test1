package cy9.p;
import y8c.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy9.q;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import lnc.a1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.a;
import tkd.b;
import tkd.d;
import nl9.k;
import ml8.c;

public final class p extends g	// class@001e42
{
    public final QPhoto w;

    public void p(QPhoto p0){
       a.p(p0, "mPhoto");
       super();
       this.w = p0;
    }
    public f$b d1(f$b p0){
       p0 = PatchProxy.applyOneRefs(p0, this, p.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new q(this.w);
    }
    public f h1(ViewGroup p0,int p1){
       View obj;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, op, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.m(p0);
       obj = a.a(p0.getContext(), R.layout.arg_RES_7f0d0666);
       a.o(obj, "KwaiLayoutInflater.infla¡­ut.item_co_creator_panel\)");
       obj.setLayoutParams(new ViewGroup$LayoutParams(n.z(p0.getContext()), a1.d(R.dimen.arg_RES_7f070337)));
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new a());
       presenterV2.U7(d.a(0x61c18dc4).ET());
       return new f(obj, presenterV2);
    }
}
