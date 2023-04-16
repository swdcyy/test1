package com.yxcorp.gifshow.share.l$a;
import ekd.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import uo7.k;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a8c.h;
import u7c.a;
import java.util.Objects;
import u7c.a$a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.TagDetailItem;
import com.yxcorp.gifshow.qrcode.model.QrDataWrapper;
import kzc.d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.qrcode.widget.a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Integer;
import a8c.f;
import a8c.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class l$a extends d	// class@001bc7
{
    public final GifshowActivity c;
    public final OperationModel d;
    public final k e;

    public void l$a(GifshowActivity p0,GifshowActivity p1,OperationModel p2,k p3){
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super(p0);
    }
    public void a(){
       boolean b2;
       f uof;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l$a.class, "1")) {
          return;
       }
       l$a tc = this.c;
       l$a td = this.d;
       l$a te = this.e;
       if (!PatchProxy.applyVoidThreeRefsWithListener(tc, td, te, null, h.class, "1")) {
          a$a f = a.f;
          Objects.requireNonNull(f);
          QrDataWrapper obj = PatchProxy.applyTwoRefs(td, te, f, a$a.class, "1");
          boolean b = true;
          boolean b1 = false;
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else {
             a.p(td, "model");
             b2 = (td.s() == null && (td.i() != null || (te != null && td.p() != null)))? true: false;
          }
          if (!b2) {
             PatchProxy.onMethodExit(h.class, "1");
          }else if(td.i() != null){
             obj = new QrDataWrapper(td.i());
          }else {
             obj = new QrDataWrapper(td.s());
          }
          d uod = new d(tc);
          uod.z(b);
          uod.A(b1);
          uod.L(new h(obj, tc, td, te));
          uod.F(a.a);
          if (PatchProxy.isSupport(h.class)) {
             uof = PatchProxy.applyOneRefs(Integer.valueOf(200), objArray, h.class, "7");
             if (uof != PatchProxyResult.class) {
             label_00ac :
                uod.N(uof);
                uod.Y(new g(td, tc));
                PatchProxy.onMethodExit(h.class, "1");
             }
          }
          uof = new f(200);
          goto label_00ac ;
       }
       return;
    }
}
