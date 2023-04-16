package cic.c$a;
import java.lang.Object;
import nsd.u;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import rhc.k;
import yic.q0;
import mhc.p1;
import java.util.List;
import mhc.v1;
import java.util.Iterator;
import java.lang.Iterable;
import cic.c;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.KwaiOperator;
import cic.b;
import xxb.b;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import zic.e;
import ohc.k;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import uo7.d;
import yic.b;
import yic.l;
import uo7.l;
import cic.a;
import uo7.b0;
import com.kwai.sharelib.a;
import cic.c$a$a;
import uo7.u;
import vhc.q;
import fp7.k;
import uo7.g0;
import uo7.f0;

public final class c$a	// class@0005a6
{

    public void c$a(){
       super();
    }
    public void c$a(u p0){
       super();
    }
    public final void a(k p0,QPhoto p1){
       String obj3;
       Object obj = p0;
       Object obj1 = p1;
       c$a uoa = c$a.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, uoa, "1")) {
          return;
       }
       a.p(obj, "conf");
       a.p(obj1, "photo");
       QPhoto mEntity = obj1.mEntity;
       String str = "photo.mEntity";
       a.o(mEntity, str);
       OperationModel operationMod = OperationModelFactory.e(mEntity, 2, null, true, false, "weixin", false, 64, null);
       KwaiOp fORWARD_WECH = KwaiOp.FORWARD_WECHAT_MOMENT;
       k ok = new k(obj1);
       LoginParams obj2 = PatchProxy.applyThreeRefs(operationMod, fORWARD_WECH, ok, null, q0.class, "1");
       b uob = null;
       if (obj2 != PatchProxyResult.class) {
       }else {
          a.p(operationMod, "model");
          a.p(fORWARD_WECH, "op");
          a.p(ok, "factory");
          Iterator iterator = ok.a(operationMod).iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj2 = iterator.next();
                String str1 = (obj2.M() == fORWARD_WECH)? 1: null;
                if (!str1) {
                   continue ;
                }
             }else {
                obj2 = uob;
             }
          }
       }
       if (obj2 != null) {
          c$a d = c.d;
          Activity uActivity = p0.k();
          Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          Objects.requireNonNull(d);
          obj3 = PatchProxy.applyThreeRefsWithListener(uActivity, operationMod, obj2, d, c$a.class, "3");
          if (obj3 != PatchProxyResult.class) {
             uob = obj3;
          }else {
             PatchProxy.onMethodExit(uoa, "3");
             uob = KwaiOperator.q.a(uActivity, operationMod, obj2, new b());
          }
       }
       QPhoto mEntity1 = obj1.mEntity;
       a.o(mEntity1, str);
       e uoe = new e(uob, obj1);
       k ok1 = PatchProxy.applyFourRefs(mEntity1, uoe, p0, p1, this, c$a.class, "2");
       if (ok1 != PatchProxyResult.class) {
       }else {
          Activity uActivity1 = p0.k();
          Objects.requireNonNull(uActivity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          Activity uActivity2 = uActivity1;
          obj3 = p1.getPhotoId();
          a.o(obj3, "photo.getPhotoId\(\)");
          uActivity1 = p0.k();
          Objects.requireNonNull(uActivity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          obj2 = o2.e(mEntity1, uActivity1);
          KsShareBuilder ksShareBuild = new KsShareBuilder(uActivity2, p0.w(), obj3, obj2, null);
          ok1 = ok1.f(l.b(uoe, "wechatMoments", "PICTURE", null, 4, null)).o("userChoosePicture").p("IMAGE").a();
          ok1.D(new a());
          ok1 = new k(obj1, false, ok1);
       }
       new a(ok1, super()).f("wechatMoments", new q(obj1, false, new k())).c(o2.a(true, "wechatMoments"));
       return;
    }
}
