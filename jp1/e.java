package jp1.e;
import yp1.f;
import msd.a;
import sz1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fe3.g;
import fe3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lh3.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Float;
import usd.q;
import qsd.d;

public final class e extends f	// class@002bee
{

    public void e(a p0,a p1,a p2,a p3,e p4){
       a.p(p0, "getBottomBarYPosition");
       a.p(p1, "isRecruitPanelMode");
       a.p(p2, "getRecruitPanelTopPosition");
       a.p(p3, "getAnchorUserId");
       a.p(p4, "multiInteractManager");
       super(p0, p1, p2, p3, p4);
    }
    public g c(g p0,a p1,a p2){
       g og;
       f uof = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(obj, "origin");
       a.p(p1, "originCanvasSize");
       a.p(p2, "newCanvasSize");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (uof.e.gc().a(qCurrentUser.getId())) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = this.d(p0, p1, p2);
             b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout transformGuestRect", "rect", obj1);
          }
       }else {
          Object obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "3");
          if (obj2 != patchProxyRe) {
             og = obj2;
          }else if(p0.b() <= 0 || p0.a() <= 0){
             b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout transformAudienceRect rect invalid", "originRect", obj);
             og = obj;
          }else {
             float f = 0x3f800000;
             float f1 = ((float)p2.d() * f) / (float)p2.c();
             float f2 = ((float)p1.d() * f) / (float)p1.c();
             if (f2 - f1 >= 0) {
                og = this.d(p0, p1, p2);
                b.e0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout transformAudienceRect", "rect", og, "canvasRatio", Float.valueOf(f2), "screenSizeRatio", Float.valueOf(f1));
             }else {
                float f3 = ((float)p0.b() * f) / (float)p1.d();
                float f4 = (float)p2.d() * f3;
                float f5 = q.t((- ((((float)p2.d() * f) / f2) - (float)p2.c())), 0);
                og = new g(d.H0(((((float)p2.d() * f) - ((float)p2.d() * ((f - (((float)p0.c() * f) / (float)p1.d())) - f3))) - f4)), d.H0((((((float)p2.d() * f) / f2) * (((float)p0.d() * f) / (float)p1.c())) + f5)), uof.b(f4), uof.b(((((float)p2.d() * f) / f2) * (((float)p0.a() * f) / (float)p1.c()))));
                b.f0(LiveCommonLogTag.NEW_MULTI_CHAT, "interceptRenderLayout transformAudienceRect", "rect", og, "diffY", Float.valueOf(f5), "canvasRatio", Float.valueOf(f2), "screenSizeRatio", Float.valueOf(f1));
             }
          }
          obj1 = og;
       }
       return obj1;
    }
}
