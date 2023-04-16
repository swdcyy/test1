package com.kuaishou.merchant.live.d;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.merchant.live.a;
import erd.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.c;
import w04.b;
import com.kuaishou.merchant.live.b;
import w04.c;

public class d	// class@001a09
{

    public void d(){
       super();
    }
    public static boolean a(LiveStreamFeedWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.mEntity != null && p0.isAd()))? true: false;
       return b;
    }
    public static void b(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "2")) {
          return;
       }
       if (!d.a(p0)) {
          return;
       }
       i0.a().e(307, p0.mEntity).d(a.b).a();
       return;
    }
    public static void c(LiveStreamFeedWrapper p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "6")) {
          return;
       }
       if (d.a(p0) && !TextUtils.x(p1)) {
          i0.a().e(308, p0.mEntity).d(c.b).d(new b(p1)).a();
       }
       return;
    }
    public static void d(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "1")) {
          return;
       }
       if (!d.a(p0)) {
          return;
       }
       i0.a().e(281, p0.mEntity).a();
       return;
    }
    public static void e(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "4")) {
          return;
       }
       if (!d.a(p0)) {
          return;
       }
       i0.a().e(282, p0.mEntity).d(b.b).a();
       return;
    }
    public static void f(LiveStreamFeedWrapper p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uod, "3")) {
          return;
       }
       if (!d.a(p0)) {
          return;
       }
       i0.a().e(282, p0.mEntity).d(new c(p1)).a();
       return;
    }
}
