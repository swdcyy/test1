package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar;
import android.widget.LinearLayout;
import com.kuaishou.live.core.voiceparty.customview.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar$b;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar$BottomBarLayout;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import co2.f2;
import op2.e;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import qk.m;
import sr2.c;
import ok.o;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar$d;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class LiveVoicePartyBottomBar extends LinearLayout	// class@0014b4
{
    public LiveVoicePartyBottomBar$b[] b;
    public View c;
    public final Map d;
    public final Map e;
    public final Map f;
    public int g;
    public static final LiveVoicePartyBottomBar$c h;
    public static final boolean i;

    static {
       LiveVoicePartyBottomBar.h = a.a;
    }
    public void LiveVoicePartyBottomBar(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartyBottomBar(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveVoicePartyBottomBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new ArrayMap();
       this.e = new ArrayMap();
       this.f = new ArrayMap();
       this.g = 0;
       View view = a.c(p0, R.layout.arg_RES_7f0d0e33, this);
       Iterator iterator = LiveVoicePartyBottomBar$b.s.iterator();
       while (iterator.hasNext()) {
          LiveVoicePartyBottomBar$b uob = iterator.next();
          this.c = view.findViewById(0x7f0a279b);
          this.d.put(uob, view.findViewById(uob.a));
       }
       this.i(LiveVoicePartyBottomBar$BottomBarLayout.SIX_SEAT, 3);
       this.setPadding(a1.e(10.00f), 0, 0, a1.e(10.00f));
       this.setClipChildren(0);
       return;
    }
    public static LiveVoicePartyBottomBar$c b(){
       return LiveVoicePartyBottomBar.h;
    }
    public boolean a(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyBottomBar.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveVoicePartyBottomBar.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.f((p0 | this.g));
    }
    public View c(LiveVoicePartyBottomBar$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyBottomBar.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.findViewById(p0.a);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyBottomBar.class, "2")) {
          return;
       }
       LiveVoicePartyBottomBar tc = this.c;
       if (tc != null) {
          tc.setVisibility(8);
       }
       return;
    }
    public boolean e(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyBottomBar.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveVoicePartyBottomBar.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.f(((~ p0) & this.g));
    }
    public boolean f(int p0){
       if (this.g == p0) {
          return false;
       }
       this.g = p0;
       return true;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyBottomBar.class, "1")) {
          return;
       }
       LiveVoicePartyBottomBar tc = this.c;
       if (tc != null) {
          tc.setVisibility(0);
       }
       return;
    }
    public void h(f2 p0){
       LiveVoicePartyBottomBar$BottomBarLayout uBottomBarLa;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyBottomBar.class, "9")) {
          return;
       }
       if (p0.h() > 0) {
          int i = p0.h();
          if (!PatchProxy.isSupport(LiveVoicePartyBottomBar.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), this, LiveVoicePartyBottomBar.class, "10")) {
             if (PatchProxy.isSupport(LiveVoicePartyBottomBar.class)) {
                uBottomBarLa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(i), this, LiveVoicePartyBottomBar.class, "17");
                if (uBottomBarLa != PatchProxyResult.class) {
                }else {
                label_0048 :
                   int i1 = 4;
                   if (this.g & i1) {
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.CROSS_ROOM_PK_INVITING;
                   }else if(i == 3){
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.SIX_SEAT;
                   }else if(i == 2){
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.VIDEO;
                   }else if(i == 1){
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.KTV_NEW;
                   }else if(i == 5){
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.TEAM_PK;
                   }else if(i == 6){
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.CROSS_ROOM_PK;
                   }else if(i == i1){
                      e uoe = p0.s();
                      if (uoe != null) {
                         if (uoe.b() == TheaterDisplayMode.FULL_SCREEN_LANDSCAPE) {
                            uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.THEATER_FULL_SCREEN_LANDSCAPE;
                         }else if(uoe.b() == TheaterDisplayMode.FULL_SCREEN_PORTRAIT){
                            uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.THEATER_FULL_SCREEN_PORTRAIT;
                         }
                      }
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.THEATER_HALF_SCREEN;
                   }else {
                      uBottomBarLa = LiveVoicePartyBottomBar$BottomBarLayout.SIX_SEAT;
                   }
                }
             }else {
                goto label_0048 ;
             }
             this.i(uBottomBarLa, i);
          }
       }
       return;
    }
    public final void i(LiveVoicePartyBottomBar$BottomBarLayout p0,int p1){
       int i1;
       LiveVoicePartyBottomBar$d uod;
       if (PatchProxy.isSupport(LiveVoicePartyBottomBar.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartyBottomBar.class, "11")) {
          return;
       }
       LiveVoicePartyBottomBar$b[] uobArray = m.t(p0.mButtons).p(new c(this)).w(LiveVoicePartyBottomBar$b.class);
       this.b = uobArray;
       this.removeAllViews();
       if (!PatchProxy.isSupport(LiveVoicePartyBottomBar.class) || !PatchProxy.applyVoidTwoRefs(uobArray, Integer.valueOf(p1), this, LiveVoicePartyBottomBar.class, "13")) {
          int len = uobArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uobArray[i];
             View view1 = this.d.get(oobject);
             if (PatchProxy.isSupport(LiveVoicePartyBottomBar.class)) {
                Object obj = PatchProxy.applyTwoRefs(oobject, Integer.valueOf(p1), this, LiveVoicePartyBottomBar.class, "14");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.intValue();
                }else if(!oobject.b.a(p1, this.g)){
                   i1 = 8;
                }else {
                   i1 = 0;
                }
                Integer integer = this.e.get(oobject);
                if (integer != null) {
                   i1 = integer.intValue();
                }
             }else {
                goto label_007b ;
             }
             if (i1 == 8) {
                uod = this.f.get(oobject);
                if (!view1.getVisibility() && uod != null) {
                   uod.a(view1, false);
                }
                view1.setVisibility(8);
                this.addView(view1);
             }else {
                LinearLayout$LayoutParams layoutParams = view1.getLayoutParams();
                layoutParams.weight = (float)oobject.a();
                layoutParams.rightMargin = a1.e(8.00f);
                uod = this.f.get(oobject);
                if (view1.getVisibility() && uod != null) {
                   uod.a(view1, true);
                }
                view1.setVisibility(i1);
                this.addView(view1, layoutParams);
             }
             i = i + 1;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(uobArray, this, LiveVoicePartyBottomBar.class, "12")) {
          ArrayList uArrayList = new ArrayList(LiveVoicePartyBottomBar$b.s);
          uArrayList.removeAll(Arrays.asList(uobArray));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             View view = this.d.get(iterator.next());
             view.setVisibility(8);
             this.addView(view);
          }
       }
       return;
    }
}
