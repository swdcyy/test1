package com.yxcorp.gifshow.share.m;
import vo5.n;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.k;
import mhc.o;
import com.yxcorp.gifshow.share.j;
import com.yxcorp.gifshow.share.i;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.KwaiOperator;
import mhc.o2;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.VideoFeed;
import com.yxcorp.gifshow.share.h;
import com.yxcorp.gifshow.util.o;
import gic.f;
import lnc.y1;
import gic.j;
import mhc.g2;
import mhc.g2$a;
import mhc.n1;
import mhc.h0;
import java.util.Map;
import gic.l;
import zic.e;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import uo7.l;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import kic.a;
import uo7.q;
import uo7.b0;
import uo7.d;
import uo7.k;
import ohc.l;
import com.kwai.sharelib.a;
import uo7.u;
import vhc.q;
import fp7.c;
import uo7.g0;
import uo7.f0;
import fp7.k;
import vhc.o;
import cp7.d;
import cp7.j;
import uo7.h;
import mhc.c0;
import rhc.m;
import kotlin.jvm.internal.a;
import rhc.l;
import java.lang.Enum;
import kotlin.Pair;
import qrd.r0;
import vhc.m;
import gic.j$a;

public class m implements n	// class@001bc9
{

    public void m(){
       super();
    }
    public void hq(GifshowActivity p0,QPhoto p1,KwaiOp p2){
       String str2;
       Pair pair;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, k.class, "1")) {
          o oo = new o(p0, p1, p2);
          oo.e = new j();
          i oi = i.class;
          String str = "1";
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, oo, oi, str)) {
             OperationModel operationMod = OperationModelFactory.b(oo.b.mEntity, 0, objArray);
             KwaiOperator kwaiOperator = o2.g(oo.a, operationMod);
             if (!PatchProxy.applyVoidTwoRefs(operationMod, kwaiOperator, oo, oi, "2")) {
                boolean b = (oo.b.isVideoType() && oo.b.mEntity.isPayCourse())? true: false;
                h oh = new h(oo);
                String str1 = o.l(oo.b);
                if (oo.b.isVideoType()) {
                   str2 = "VIDEO";
                }else if(oo.b.isImageType()){
                   str2 = "IMAGE";
                }else {
                   str2 = "UNKNOWN";
                }
                String str3 = str2;
                i b1 = oo.b;
                f uof = (b)? o.f(b1): new y1(b1);
                g2$a x = g2.X;
                l ol = o.a(oo.b, oh, b);
                e uoe = new e(kwaiOperator, oo.b);
                Map map = oo.b(oo.b, new j(uof, oh, x.k().b())).a();
                String a objArray1 = str3;
                KsShareBuilder ksShareBuild = new KsShareBuilder(oo.a, str1, oo.b.getPhotoId(), o2.e(oo.b.mEntity, oo.a), 0);
                String str4 = (oo.b.isMine())? "PHOTO_SELF": "PHOTO_OTHER";
                JsonObject jsonObject = o.g(oo.b);
                jsonObject.H("shareAlertAfterPublish", Boolean.valueOf(oo.d));
                KsShareBuilder ksShareBuild1 = kwaiOperator.o(str4).e(jsonObject);
                objArray1 = new a(new l(oo.b, ksShareBuild1.n(new a(oo.b.mEntity, str1)).g(o.e(oo.b, oo.a)).f(uoe).p(objArray1).a()), oh);
                i b2 = oo.b;
                a uoa = PatchProxy.applyTwoRefs(objArray1, b2, null, oi, "3");
                if (uoa != PatchProxyResult.class) {
                }else {
                   uoa = objArray1.f("wechat", new q(b2, true, new c())).f("wechatMoments", new q(b2, false, new k())).f("qq", new o(b2, false, new d())).f("qzone", new o(b2, false, new j()));
                }
                uoa = uoa.j(ol).f("h5", new c0()).g(map);
                i objArray11 = oo.c;
                i b3 = oo.b;
                str = PatchProxy.applyTwoRefs(objArray11, b3, null, m.class, str);
                if (str != PatchProxyResult.class) {
                }else {
                   a.p(objArray11, "kwaiOp");
                   a.p(b3, "photo");
                   switch (l.a[objArray11.ordinal()]){
                       case 1:
                         str = j.g.a();
                         break;
                       case 2:
                         pair = r0.a(Boolean.FALSE, m.b(b3, x.w(), x.x()).getFirst());
                      label_024d :
                         str = o2.a(pair.getFirst().booleanValue(), pair.getSecond());
                         break;
                       case 3:
                         pair = r0.a(Boolean.TRUE, "wechat");
                         goto label_024d ;
                         break;
                       case 4:
                         pair = r0.a(Boolean.TRUE, "wechatMoments");
                         goto label_024d ;
                         break;
                       case 5:
                         pair = r0.a(Boolean.TRUE, "qq");
                         goto label_024d ;
                         break;
                       case 6:
                         pair = r0.a(Boolean.TRUE, "qzone");
                         goto label_024d ;
                         break;
                       case 7:
                         pair = r0.a(Boolean.TRUE, "weibo");
                         goto label_024d ;
                         break;
                       case 8:
                         pair = r0.a(Boolean.TRUE, x.c().a());
                         goto label_024d ;
                         break;
                       case 9:
                         pair = r0.a(Boolean.FALSE, x.p().a());
                         goto label_024d ;
                         break;
                       default:
                         pair = r0.a(Boolean.FALSE, "");
                         goto label_024d ;
                   }
                }
                uoa.c(str);
             }
          }
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
