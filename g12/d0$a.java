package g12.d0$a;
import tw6.c;
import g12.d0;
import com.kuaishou.live.core.basic.liveslide.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import b51.d;
import h51.e;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.b$a;
import c51.d;
import c51.i;
import f51.d;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;

public class d0$a implements c	// class@002a23
{
    public final a a;
    public final d0 b;

    public void d0$a(d0 p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0$a.class, "2")) {
          return;
       }
       b$b uob = a.n(this.b.getActivity()).h();
       Objects.requireNonNull(uob);
       Object obj = PatchProxy.apply(objArray, uob, b$b.class, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          d uod = uob.a.e();
          Objects.requireNonNull(uod);
          Object obj1 = PatchProxy.apply(objArray, uod, d.class, "6");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             uod = uod.m;
             b = (uod == null)? false: uod.d;
          }
       }
       if (b == null && this.b.q.mIsSoloLiveStream == null) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001ce));
       }
       return;
    }
    public void b(){
       d0 p;
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0$a.class, "1")) {
          return;
       }
       if (this.a.h().a() == (this.a.j().b() - 1)) {
          if (this.b.p.p().j0()) {
             p = this.b.p;
             Objects.requireNonNull(p);
             Object obj = PatchProxy.apply(objArray, p, uod, "7");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                d n = p.n;
                b = (n == null)? false: n.e;
             }
             if (b != null) {
             label_0104 :
                return;
             }
          }
          d0$a tb = this.b;
          if (tb.q.mIsSoloLiveStream == null) {
             int i = 0x7f11066a;
             p = tb.p;
             Objects.requireNonNull(p);
             String str = PatchProxy.apply(objArray, p, uod, "11");
             if (str != patchProxyRe) {
             }else {
                uod = p.n;
                b = 0x7f1001cd;
                if (uod == null) {
                   str = a1.p(b);
                }else {
                   Object obj1 = PatchProxy.apply(objArray, uod, d.class, "3");
                   if (obj1 != patchProxyRe) {
                      str = obj1;
                   }else if(TextUtils.x(uod.f)){
                      uod.f = a1.p(b);
                   }
                   str = uod.f;
                }
             }
             i.d(i, str);
             int i1 = this.a.h().a();
             QPhoto qPhoto = this.a.j().h(i1);
             tb = this.b;
             Objects.requireNonNull(tb);
             d0 uod0 = d0.class;
             if (PatchProxy.isSupport(uod0) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), qPhoto, tb, uod0, "3") && (qPhoto == null || !qPhoto.mEntity instanceof LiveStreamFeed))) {
                goto label_0104 ;
             }else {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "NO_MORE_PHOTO";
                i3 oi3 = i3.f();
                oi3.c("last_photo_index", Integer.valueOf(i1));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = x.e(qPhoto.mEntity, 0);
                u1.u0(3, uElementPack, uContentPack);
                goto label_0104 ;
             }
          }else {
             goto label_0104 ;
          }
       }else {
          goto label_0104 ;
       }
    }
}
