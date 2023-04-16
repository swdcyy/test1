package com.kuaishou.live.core.basic.activity.s;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.kuaishou.live.core.basic.activity.m0;
import java.lang.Boolean;
import android.os.SystemClock;
import android.content.Context;
import androidx.fragment.app.Fragment;
import k51.b;
import m02.q1;
import com.kuaishou.live.core.basic.preload.a;
import java.lang.Integer;
import android.view.View;
import com.kuaishou.live.core.basic.preload.a$b;
import com.kuaishou.live.core.basic.preload.a$a;
import android.view.ViewStub;
import k51.a;
import ekd.m1;
import java.lang.System;
import com.kuaishou.live.core.basic.activity.c;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$d;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import java.lang.Long;
import java.util.Map;
import qrd.l1;

public final class s implements a	// class@001852
{
    public final LivePlayFragment b;
    public final ViewGroup c;

    public void s(LivePlayFragment p0,ViewGroup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(){
       Object obj1;
       Boolean tRUE;
       object oobject1;
       s os = this;
       s b = os.b;
       s c = os.c;
       LivePlayFragment y1 = b.y1;
       Objects.requireNonNull(y1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       m0 obj = PatchProxy.applyOneRefs(c, y1, LivePlayLoader.class, str);
       if (obj != patchProxyRe) {
       }else {
          LivePlayLoader c1 = y1.c;
          LiveStyleParams mShouldAdapt = y1.h.mLiveStyleParams.mShouldAdaptFullscreen;
          Objects.requireNonNull(c1);
          obj = m0.class;
          if (PatchProxy.isSupport(obj)) {
             obj = PatchProxy.applyTwoRefs(c, Boolean.valueOf(mShouldAdapt), c1, obj, str);
             if (obj != patchProxyRe) {
             label_0110 :
                LivePlayLoader c2 = y1.c;
                y1.d.f = c2.c;
                LivePlayLoader f = y1.f;
                f.d = c2.f;
                f.b = c2.d;
                f.a.put(LivePlayStage.BASIC_VIEW_CREATED, Long.valueOf(c2.e));
             }
          }
          long l = SystemClock.elapsedRealtime();
          Context uContext = c1.a.requireContext();
          int i = b.a(R.layout.live_audience_basic_play_layout, 0x7f0d09f3);
          q1 oq1 = new q1(c1);
          a uoa = a.class;
          int i1 = 0;
          int i2 = 3;
          int i3 = 2;
          int i4 = 6;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[i4];
             objArray[i1] = uContext;
             objArray[1] = Integer.valueOf(i);
             objArray[i3] = c;
             objArray[i2] = Boolean.FALSE;
             objArray[4] = oq1;
             object oobject = null;
             objArray[5] = oobject;
             obj1 = PatchProxy.apply(objArray, oobject, uoa, "2");
             if (obj1 != patchProxyRe) {
             }else {
             label_008a :
                obj1 = 1;
                if (PatchProxy.isSupport(uoa)) {
                   Object[] objArray1 = new Object[]{uContext,Integer.valueOf(i),c,Boolean.FALSE,tRUE,tRUE,oq1,oobject1};
                   tRUE = Boolean.TRUE;
                   oobject1 = null;
                   Object obj2 = PatchProxy.apply(objArray1, oobject1, uoa, "7");
                   if (obj2 != patchProxyRe) {
                      obj1 = obj2;
                   }
                }
                obj1 = a.c(uContext, i, c, 0, obj1, 1, false, -1, oq1, null);
             }
          }else {
             goto label_008a ;
          }
          c1.b = obj1;
          obj1.findViewById(R.id.live_audience_play_view_stub).inflate();
          c1.b.setBackgroundColor(0xff000000);
          c1.c = (mShouldAdapt != null || a.i())? m1.f(c1.b, 0x7f0a1a80): c1.b;
          c1.e = System.currentTimeMillis();
          c1.d = SystemClock.elapsedRealtime() - l;
          obj = c1.b;
          goto label_0110 ;
       }
       b.D = obj;
       return l1.a;
    }
}
