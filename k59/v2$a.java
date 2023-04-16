package k59.v2$a;
import zv5.b;
import k59.v2;
import java.lang.Object;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import yx.j0;
import zv5.a;
import k59.u2;
import java.util.Collection;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import wkd.b;
import u49.c;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.util.Objects;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import java.util.List;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import k59.v2$a$a;
import crd.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import java.util.ArrayList;
import java.lang.Throwable;
import brd.a0;
import com.kwai.robust.PatchProxyResult;

public final class v2$a implements b	// class@002b2a
{
    public final v2 b;

    public void v2$a(v2 p0){
       this.b = p0;
       super();
    }
    public void a(IMShareRequest p0,KwaiMsg p1,int p2,String p3){
       if (PatchProxy.isSupport(v2$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, v2$a.class, "5")) {
          return;
       }
       a.p(p0, "request");
       Object[] objArray = new Object[0];
       j0.f("WebViewShareHeadPresenter", "onShareFailed ", objArray);
       return;
    }
    public void b(IMShareRequest p0,KwaiMsg p1){
       a.b(this, p0, p1);
    }
    public void c(IMShareRequest p0){
       SplashBaseInfo mEndTime;
       if (PatchProxy.applyVoidOneRefs(p0, this, v2$a.class, "6")) {
          return;
       }
       a.p(p0, "request");
       Object[] objArray = new Object[0];
       j0.f("WebViewShareHeadPresenter", "onTransactionEnd ", objArray);
       if ((this.b.c.w.isEmpty() ^ 0x01) || (this.b.c.x.isEmpty() ^ 0x01)) {
          this.b.c.R8();
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10475c));
          if (c.Y(this.b.c.p)) {
             Object obj = b.a(0x3a268c29);
             String str = null;
             u2 w = (this.b.c.w.isEmpty() ^ 0x01)? this.b.c.w: str;
             u2 x = (this.b.c.x.isEmpty() ^ 0x01)? this.b.c.x: str;
             u2 p = this.b.c.p;
             if (p != null) {
                str = p.get("AD");
             }
             Objects.requireNonNull(str, "null cannot be cast to non-null type com.kuaishou.android.model.ads.PhotoAdvertisement");
             PhotoAdvertisement mCreativeId = str.mCreativeId;
             SplashInfo splashInfo = l.e(this.b.c.p);
             if (splashInfo != null) {
                splashInfo = splashInfo.mSplashBaseInfo;
                if (splashInfo != null) {
                   mEndTime = splashInfo.mEndTime;
                label_00b9 :
                   obj.E(w, x, mCreativeId, mEndTime).subscribe(Functions.d(), v2$a$a.b);
                }
             }
             mEndTime = 0;
             goto label_00b9 ;
          }
       }
       return;
    }
    public void d(IMShareRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v2$a.class, "1")) {
          return;
       }
       a.p(p0, "request");
       Object[] objArray = new Object[0];
       j0.f("WebViewShareHeadPresenter", "onTransactionCancel ", objArray);
       return;
    }
    public void e(IMShareRequest p0,KwaiMsg p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v2$a.class, "4")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "msg");
       Object[] objArray = new Object[0];
       j0.f("WebViewShareHeadPresenter", "onShareSuccess ", objArray);
       p0 = p0.targets;
       a.o(p0, "request.targets");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          IMShareTarget iMShareTarge = iterator.next();
          IMShareTarget type = iMShareTarge.type;
          if (type == null) {
             if (!this.b.c.w.contains(iMShareTarge.id)) {
                this.b.c.w.add(iMShareTarge.id);
             }
          }else if(type == 4 && !this.b.c.x.contains(iMShareTarge.id)){
             this.b.c.x.add(iMShareTarge.id);
          }
       }
       return;
    }
    public void f(IMShareRequest p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v2$a.class, "3")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "cause");
       Object[] objArray = new Object[0];
       j0.f("WebViewShareHeadPresenter", "onTransactionError ", objArray);
       return;
    }
    public a0 g(IMShareRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v2$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "originRequest");
       this.b.c.x.clear();
       this.b.c.w.clear();
       a0 uoa0 = a.e(this, p0);
       a.o(uoa0, "super.onTransactionBegin\(originRequest\)");
       return uoa0;
    }
    public void h(IMShareRequest p0,KwaiMsg p1){
       a.d(this, p0, p1);
    }
}
