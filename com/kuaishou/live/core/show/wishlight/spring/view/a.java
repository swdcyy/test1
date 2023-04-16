package com.kuaishou.live.core.show.wishlight.spring.view.a;
import com.kuaishou.live.core.show.wishlight.spring.view.c$b;
import com.kuaishou.live.core.show.wishlight.spring.view.LiveBottomBarWishLightGiftView;
import mn2.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.Map;
import java.lang.Integer;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import java.lang.Runnable;
import ekd.k1;

public class a extends c$b	// class@0012bb
{
    public final c a;
    public final LiveBottomBarWishLightGiftView b;

    public void a(LiveBottomBarWishLightGiftView p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, uoc, "15")) {
          if (!PatchProxy.applyVoid(objArray, ta, uoc, "17")) {
             String str = DateUtils.j(System.currentTimeMillis(), objArray);
             Integer integer = ta.h.get(str);
             int i = 1;
             integer = (integer == null)? Integer.valueOf(i): Integer.valueOf((integer.intValue() + i));
             ta.h.put(str, integer);
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("liveWishLightShowedTimesMap", b.e(ta.h));
             g.a(uEditor);
          }
          if (ta.o0()) {
             k1.r(ta.u, 3000);
          }
       }
       return;
    }
}
