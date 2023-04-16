package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$recommendPanelFragmentLazy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.Trace;
import xc3.c;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import xc3.d;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import java.lang.NullPointerException;

public final class LiveLiteRecommendSideBarRootVC$recommendPanelFragmentLazy$1 extends Lambda implements a	// class@000ae5
{
    public final LiveLiteRecommendSideBarRootVC this$0;

    public void LiveLiteRecommendSideBarRootVC$recommendPanelFragmentLazy$1(LiveLiteRecommendSideBarRootVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteRecommendPanelFragment invoke(){
       LiveLiteRecommendSideBarRootVC s;
       Object[] objArray;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       String obj1 = PatchProxy.apply(null, obj, LiveLiteRecommendSideBarRootVC$recommendPanelFragmentLazy$1.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = "LiveLiteRecommendSideBarRootVC::initRecommendPanel";
       long l = System.nanoTime();
       Trace.beginSection(obj1);
       float f = 1000000.00f;
       c uoc = obj.this$0.W2();
       LiveLiteRecommendSideBarCoreModel liveLiteReco = obj.this$0.V2();
       s = obj.this$0.s;
       LiveLiteRecommendSideBarCoreModel liveLiteReco1 = liveLiteReco;
       LiveLiteRecommendSideBarRootVC liveLiteReco2 = s;
       LiveLiteRecommendSideBarCoreModel liveLiteReco3 = liveLiteReco;
       LiveLiteRecommendPanelFragment liveLiteReco4 = PatchProxy.applyThreeRefs(uoc, liveLiteReco1, s, 0, LiveLiteRecommendPanelFragment.class, "1");
       if (liveLiteReco4 != patchProxyRe) {
       }else {
          liveLiteReco4 = new LiveLiteRecommendPanelFragment(uoc, liveLiteReco3, liveLiteReco2);
       }
       Activity uActivity = obj.this$0.B2();
       if (uActivity != null) {
          c supportFragm = uActivity.getSupportFragmentManager();
          a.o(supportFragm, "\(activity as GifshowActi¡­y\).supportFragmentManager");
          if (!supportFragm.isDestroyed()) {
             e uoe = supportFragm.beginTransaction();
             uoe.v(R.id.live_lite_recommend_side_bar_content_view, liveLiteReco4);
             uoe.m();
          }
          Trace.endSection();
          float f1 = (float)(System.nanoTime() - l) / f;
          if (f.b()) {
             if (SystemUtil.K()) {
                objArray = new Object[]{obj1,Float.valueOf(f1)};
                str1 = String.format(str1, Arrays.copyOf(objArray, 2));
                a.o(str1, str);
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
             }
          }else {
             objArray = new Object[]{obj1,Float.valueOf(f1)};
             str1 = String.format(str1, Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
          return r0.a(Long.valueOf((long)f1), liveLiteReco4).getSecond();
       }else {
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       }
    }
    public Object invoke(){
       return this.invoke();
    }
}
