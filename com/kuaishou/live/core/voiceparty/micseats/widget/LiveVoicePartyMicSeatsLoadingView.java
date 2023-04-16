package com.kuaishou.live.core.voiceparty.micseats.widget.LiveVoicePartyMicSeatsLoadingView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.List;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import nt2.a;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import lnc.b9;
import android.view.ViewGroup;
import java.lang.Integer;

public class LiveVoicePartyMicSeatsLoadingView extends LinearLayout	// class@00177c
{
    public List b;
    public b c;
    public int d;
    public boolean e;
    public Drawable f;
    public Drawable g;
    public int h;

    public void LiveVoicePartyMicSeatsLoadingView(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartyMicSeatsLoadingView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyMicSeatsLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.h = 4;
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyMicSeatsLoadingView.class, "1")) {
       }else {
          b uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060186));
          DrawableCreator$Shape oval = DrawableCreator$Shape.Oval;
          uob.s(oval);
          this.f = uob.a();
          uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f0601cb));
          uob.s(oval);
          this.g = uob.a();
          this.setOrientation(0);
          this.setLayoutParams(new LinearLayout$LayoutParams(-1, -1));
          this.setGravity(17);
          for (int i = 0; i < 3; i++) {
             View view = new View(this.getContext());
             view.setBackground(this.f);
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.a((float)this.h), this.a((float)this.h));
             if (i == 2) {
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
             }else {
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = this.a((float)this.h);
             }
             view.setLayoutParams(layoutParams);
             this.addView(view);
             this.b.add(view);
          }
       }
       return;
    }
    public final int a(float p0){
       if (PatchProxy.isSupport(LiveVoicePartyMicSeatsLoadingView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, LiveVoicePartyMicSeatsLoadingView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return n.c(this.getContext(), p0);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyMicSeatsLoadingView.class, "3")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.c = t.interval(0, 250, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a(this), h.b);
       this.e = true;
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyMicSeatsLoadingView.class, "4")) {
          return;
       }
       b9.a(this.c);
       this.e = false;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyMicSeatsLoadingView.class, "5")) {
          return;
       }
       super.onAttachedToWindow();
       this.b();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyMicSeatsLoadingView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.c();
       return;
    }
    public void setDotWidthDp(int p0){
       this.h = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyMicSeatsLoadingView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyMicSeatsLoadingView.class, "2")) {
          return;
       }
       super.setVisibility(p0);
       if (!p0) {
          this.b();
       }else {
          this.c();
       }
       return;
    }
}
