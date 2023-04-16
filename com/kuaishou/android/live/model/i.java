package com.kuaishou.android.live.model.i;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.LiveSquareParams;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.e;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.Number;
import com.google.common.base.Optional;
import com.kuaishou.android.live.model.f;
import com.kuaishou.android.live.model.g;
import com.kuaishou.android.live.model.h;
import sp.b;

public class i	// class@000846
{

    public void i(){
       super();
    }
    public static LiveSquareParams a(LiveStreamModel p0){
       return i.k(p0);
    }
    public static Integer b(LiveSquareParams p0){
       return i.l(p0);
    }
    public static Integer c(LiveSquareParams p0){
       return i.m(p0);
    }
    public static LiveSquareParams d(LiveSquareParams p0,LiveStreamModel p1){
       i.o(p0, p1);
       return p0;
    }
    public static Boolean e(LiveSquareParams p0){
       return i.n(p0);
    }
    public static LiveSquareParams f(BaseFeed p0){
       LiveSquareParams obj = PatchProxy.applyOneRefs(p0, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i.g(p0);
       if (obj == null) {
          obj = new LiveSquareParams();
          i.q(p0, obj);
       }
       return obj;
    }
    public static LiveSquareParams g(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LiveStreamModel.class, e.b);
    }
    public static int h(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(i.g(p0)).transform(f.b).or(Integer.valueOf(0)).intValue();
    }
    public static int i(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(i.g(p0)).transform(g.b).or(Integer.valueOf(0)).intValue();
    }
    public static boolean j(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Optional.fromNullable(i.g(p0)).transform(h.b).or(Boolean.FALSE).booleanValue();
    }
    public static LiveSquareParams k(LiveStreamModel p0){
       return p0.mLiveSquareParams;
    }
    public static Integer l(LiveSquareParams p0){
       return Integer.valueOf(p0.mLiveSquareReferLiveSourceType);
    }
    public static Integer m(LiveSquareParams p0){
       return Integer.valueOf(p0.mLiveSquareSourceFeedLiveSourceType);
    }
    public static Boolean n(LiveSquareParams p0){
       return Boolean.valueOf(p0.mIsLiveSquareSourceFeed);
    }
    public static LiveSquareParams o(LiveSquareParams p0,LiveStreamModel p1){
       p1.mLiveSquareParams = p0;
       return p0;
    }
    public static void p(BaseFeed p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oi, "4")) {
          return;
       }
       p0.mIsLiveSquareSourceFeed = p1;
       return;
    }
    public static void q(BaseFeed p0,LiveSquareParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "1")) {
          return;
       }
       e.h(p0, LiveStreamModel.class, new b(p1));
       return;
    }
    public static void r(BaseFeed p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oi, "6")) {
          return;
       }
       p0.mLiveSquareSourceFeedLiveSourceType = p1;
       return;
    }
}
