package com.kuaishou.android.live.model.d;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveStreamModel$LiteSideBarParam;
import java.lang.Integer;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.c;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.Number;
import com.google.common.base.Optional;
import com.kuaishou.android.live.model.b;
import com.kuaishou.android.live.model.a;
import sp.a;

public class d	// class@000841
{

    public void d(){
       super();
    }
    public static Integer a(LiveStreamModel$LiteSideBarParam p0){
       return d.k(p0);
    }
    public static LiveStreamModel$LiteSideBarParam b(LiveStreamModel$LiteSideBarParam p0,LiveStreamModel p1){
       d.l(p0, p1);
       return p0;
    }
    public static LiveStreamModel$LiteSideBarParam c(LiveStreamModel p0){
       return d.i(p0);
    }
    public static Integer d(LiveStreamModel$LiteSideBarParam p0){
       return d.j(p0);
    }
    public static LiveStreamModel$LiteSideBarParam e(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LiveStreamModel.class, c.b);
    }
    public static LiveStreamModel$LiteSideBarParam f(BaseFeed p0){
       LiveStreamModel$LiteSideBarParam obj = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.e(p0);
       if (obj == null) {
          obj = new LiveStreamModel$LiteSideBarParam();
          d.m(p0, obj);
       }
       return obj;
    }
    public static int g(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(d.e(p0)).transform(b.b).or(Integer.valueOf(-1)).intValue();
    }
    public static int h(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(d.e(p0)).transform(a.b).or(Integer.valueOf(0)).intValue();
    }
    public static LiveStreamModel$LiteSideBarParam i(LiveStreamModel p0){
       return p0.mLiteSideBarParam;
    }
    public static Integer j(LiveStreamModel$LiteSideBarParam p0){
       return Integer.valueOf(p0.mPositionInSideBarDataSource);
    }
    public static Integer k(LiveStreamModel$LiteSideBarParam p0){
       return Integer.valueOf(p0.mSourceTypeForLog);
    }
    public static LiveStreamModel$LiteSideBarParam l(LiveStreamModel$LiteSideBarParam p0,LiveStreamModel p1){
       p1.mLiteSideBarParam = p0;
       return p0;
    }
    public static void m(BaseFeed p0,LiveStreamModel$LiteSideBarParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "1")) {
          return;
       }
       e.h(p0, LiveStreamModel.class, new a(p1));
       return;
    }
    public static void n(BaseFeed p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uod, "6")) {
          return;
       }
       p0.mPositionInSideBarDataSource = p1;
       return;
    }
    public static void o(BaseFeed p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uod, "4")) {
          return;
       }
       p0.mSourceTypeForLog = p1;
       return;
    }
}
