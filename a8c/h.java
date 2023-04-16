package a8c.h;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import com.yxcorp.gifshow.qrcode.model.QrDataWrapper;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import uo7.k;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.n5;
import u7c.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.util.Objects;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import v7c.q;
import v7c.m;
import rkd.b;
import v7c.a;
import a8c.h$b;
import s7c.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import kotlin.jvm.internal.a;
import kp.r1;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import a8c.h$a;
import android.view.View$OnTouchListener;
import a8c.p;
import java.util.Map;
import java.util.HashMap;

public class h implements PopupInterface$f, g	// class@0000a2
{
    public final QrDataWrapper b;
    public final GifshowActivity c;
    public c d;
    public final OperationModel e;
    public final n5 f;
    public final a g;
    public PresenterV2 h;

    public void h(QrDataWrapper p0,GifshowActivity p1,OperationModel p2,k p3){
       super();
       this.h = new PresenterV2();
       this.b = p0;
       this.c = p1;
       this.e = p2;
       this.f = new n5(p3);
       this.g = new a(p2, p1, p3);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       h th;
       String str2;
       Object this;
       float f;
       a uoa = a.class;
       h oh = h.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h.class, "3");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       this.d = p0;
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d1129, p2, b);
       String str = "2";
       if (!PatchProxy.applyVoidOneRefs(view, this, oh, "6")) {
          View view1 = view.findViewById(R.id.iv_picture);
          ConstraintLayout$LayoutParams layoutParams = view1.getLayoutParams();
          h tg = this.g;
          Objects.requireNonNull(tg);
          this = PatchProxy.apply(null, tg, uoa, str);
          if (this != PatchProxyResult.class) {
             f = this.floatValue();
          }else if(tg.c.i() != null){
             f = tg.b;
          }else {
             f = tg.a;
          }
          layoutParams.O = f;
          view1.setLayoutParams(layoutParams);
       }
       if (!PatchProxy.applyVoid(null, this, oh, str)) {
          th = this.h;
          th.U7(new q());
          th.U7(new m());
          if (b.g()) {
             this.h.U7(new a());
          }
       }
       this.h.f(view);
       th = this.h;
       Object[] objArray = new Object[2];
       objArray[0] = this;
       if (this.e.i() != null) {
          b = true;
       }
       objArray[1] = new h$b(b);
       th.i(objArray);
       th = this.g;
       if (!PatchProxy.applyVoidOneRefs(th, null, c.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "KWAI_QR_CODE_PIC";
          i3 oi3 = i3.f();
          Objects.requireNonNull(th);
          String str1 = PatchProxy.apply(null, th, uoa, "7");
          if (str1 != PatchProxyResult.class) {
          }else if(th.c.i() != null){
             BaseFeed uBaseFeed = th.c.i();
             a.m(uBaseFeed);
             str2 = (r1.S2(uBaseFeed))? "LIVE_STREAM": "PHOTO";
          }else if(th.c.s() != null){
             str2 = "PROFILE";
          }else {
             str2 = "TAG";
          }
          str1 = str2;
          oi3.d("kwai_qr_code_content", str1);
          uElementPack.params = oi3.e();
          u1.u0(4, uElementPack, null);
       }
       view.setOnTouchListener(new h$a(this, view.findViewById(R.id.iv_picture)));
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       this.h.destroy();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new p());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
}
