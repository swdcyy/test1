package c09.b$b;
import zv5.b;
import c09.b;
import com.kwai.framework.model.feed.BaseFeed;
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
import java.util.ArrayList;
import java.util.Collection;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import mxb.c;
import wkd.b;
import u49.c;
import tl8.d;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import java.util.List;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import c09.b$b$a;
import crd.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import java.lang.Throwable;
import brd.a0;
import com.kwai.robust.PatchProxyResult;

public final class b$b implements b	// class@0004b5
{
    public final b b;
    public final BaseFeed c;

    public void b$b(b p0,BaseFeed p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(IMShareRequest p0,KwaiMsg p1,int p2,String p3){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, b$b.class, "5")) {
          return;
       }
       a.p(p0, "request");
       Object[] objArray = new Object[0];
       j0.f("ClickToShareBridge", "onShareFailed ", objArray);
       return;
    }
    public void b(IMShareRequest p0,KwaiMsg p1){
       a.b(this, p0, p1);
    }
    public void c(IMShareRequest p0){
       SplashBaseInfo mEndTime;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "6")) {
          return;
       }
       a.p(p0, "request");
       Object[] objArray = new Object[0];
       j0.f("ClickToShareBridge", "onTransactionEnd ", objArray);
       if ((this.b.i().isEmpty() ^ 0x01) || (this.b.j().isEmpty() ^ 0x01)) {
          this.b.k();
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10475c));
          if (c.Y(this.c)) {
             Object obj = b.a(0x3a268c29);
             b$b uob = null;
             ArrayList uArrayList = (this.b.i().isEmpty() ^ 0x01)? this.b.i(): uob;
             if (this.b.j().isEmpty() ^ 0x01) {
                uob = this.b.j();
             }
             b$b uob1 = uob;
             SplashInfo obj1 = this.c.get("AD");
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kuaishou.android.model.ads.PhotoAdvertisement");
             PhotoAdvertisement mCreativeId = obj1.mCreativeId;
             obj1 = l.e(this.c);
             if (obj1 != null) {
                obj1 = obj1.mSplashBaseInfo;
                if (obj1 != null) {
                   mEndTime = obj1.mEndTime;
                label_00a8 :
                   obj.E(uArrayList, uob1, mCreativeId, mEndTime).subscribe(Functions.d(), b$b$a.b);
                }
             }
             mEndTime = 0;
             goto label_00a8 ;
          }
       }
       return;
    }
    public void d(IMShareRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "request");
       Object[] objArray = new Object[0];
       j0.f("ClickToShareBridge", "onTransactionCancel ", objArray);
       return;
    }
    public void e(IMShareRequest p0,KwaiMsg p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "4")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "msg");
       Object[] objArray = new Object[0];
       j0.f("ClickToShareBridge", "onShareSuccess ", objArray);
       p0 = p0.targets;
       a.o(p0, "request.targets");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          IMShareTarget iMShareTarge = iterator.next();
          IMShareTarget type = iMShareTarge.type;
          if (type == null) {
             if (!this.b.i().contains(iMShareTarge.id)) {
                this.b.i().add(iMShareTarge.id);
             }
          }else if(type == 4 && !this.b.j().contains(iMShareTarge.id)){
             this.b.j().add(iMShareTarge.id);
          }
       }
       return;
    }
    public void f(IMShareRequest p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "2")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "cause");
       Object[] objArray = new Object[0];
       j0.f("ClickToShareBridge", "onTransactionError ", objArray);
       return;
    }
    public a0 g(IMShareRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "originRequest");
       this.b.j().clear();
       this.b.i().clear();
       a0 uoa0 = a.e(this, p0);
       a.o(uoa0, "super.onTransactionBegin\(originRequest\)");
       return uoa0;
    }
    public void h(IMShareRequest p0,KwaiMsg p1){
       a.d(this, p0, p1);
    }
}
