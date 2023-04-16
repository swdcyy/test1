package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$enableMoodBubble$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$enableBubbleResTimeOut$2;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$draftBubbleStrategy$2;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$remindDraftBubbleConfig$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import jzb.b;
import jzb.c;

public final class HomePostEntranceExpUtil	// class@001088
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final HomePostEntranceExpUtil h;

    static {
       HomePostEntranceExpUtil.h = new HomePostEntranceExpUtil();
       HomePostEntranceExpUtil.a = s.c(HomePostEntranceExpUtil$enableMoodBubble$2.INSTANCE);
       HomePostEntranceExpUtil.b = s.c(HomePostEntranceExpUtil$newUserBubbleUIStyleAbConfig$2.INSTANCE);
       HomePostEntranceExpUtil.c = s.c(HomePostEntranceExpUtil$enableBubbleResTimeOut$2.INSTANCE);
       HomePostEntranceExpUtil.d = s.c(HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2.INSTANCE);
       HomePostEntranceExpUtil.e = s.c(HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2.INSTANCE);
       HomePostEntranceExpUtil.f = s.c(HomePostEntranceExpUtil$draftBubbleStrategy$2.INSTANCE);
       HomePostEntranceExpUtil.g = s.c(HomePostEntranceExpUtil$remindDraftBubbleConfig$2.INSTANCE);
    }
    public void HomePostEntranceExpUtil(){
       super();
    }
    public static final int a(){
       Object obj = PatchProxy.apply(null, null, HomePostEntranceExpUtil.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = HomePostEntranceExpUtil.f.getValue();
       }
       return obj.intValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, HomePostEntranceExpUtil.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = HomePostEntranceExpUtil.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, HomePostEntranceExpUtil.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = HomePostEntranceExpUtil.d.getValue();
       }
       return obj.booleanValue();
    }
    public static final b d(){
       Object obj = PatchProxy.apply(null, null, HomePostEntranceExpUtil.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomePostEntranceExpUtil.e.getValue();
    }
    public static final int f(){
       Object obj = PatchProxy.apply(null, null, HomePostEntranceExpUtil.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = HomePostEntranceExpUtil.b.getValue();
       }
       return obj.intValue();
    }
    public static final c g(){
       Object obj = PatchProxy.apply(null, null, HomePostEntranceExpUtil.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomePostEntranceExpUtil.g.getValue();
    }
    public final int e(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((HomePostEntranceExpUtil.f() - 1) < 0)? 0: HomePostEntranceExpUtil.f() - 1;
       return i;
    }
}
