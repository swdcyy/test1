package com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceDrawingGiftBoxView;
import jk1.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ia2.a;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup;
import lnc.l1;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import ia2.b;

public class LiveAudienceDrawingGiftBoxView extends RelativeLayout implements d	// class@000b67
{
    public View b;
    public View c;
    public View d;
    public ViewGroup e;
    public View f;
    public h g;
    public boolean h;

    public void LiveAudienceDrawingGiftBoxView(Context p0){
       super(p0, null, 0);
    }
    public void LiveAudienceDrawingGiftBoxView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceDrawingGiftBoxView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int getLandscapeGiftBoxHeightWidth(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceDrawingGiftBoxView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!a.c()) {
          return a1.d(0x7f070804);
       }
       int i = a.a(n.d(this));
       if (i <= 0) {
          i = a1.d(R.dimen.arg_RES_7f070804);
       }
       return i;
    }
    public void onAttachedToWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceDrawingGiftBoxView.class, "5")) {
          return;
       }
       super.onAttachedToWindow();
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceDrawingGiftBoxView.class, "2")) {
          Activity uActivity = n.d(this);
          if (uActivity != null) {
             if (l1.a()) {
                if (!PatchProxy.applyVoidOneRefs(uActivity, this, LiveAudienceDrawingGiftBoxView.class, "4")) {
                   this.b.setVisibility(0);
                   if (!this.c.getVisibility()) {
                      this.c.setVisibility(8);
                   }
                   int i = n.j(uActivity);
                   this.d.getLayoutParams().height = i - a1.e(100.00f);
                   this.e.getLayoutParams().height = i;
                   this.getLayoutParams().height = i;
                   this.getLayoutParams().width = this.getLandscapeGiftBoxHeightWidth();
                   if (a.c() && !PatchProxy.applyVoid(objArray, this, LiveAudienceDrawingGiftBoxView.class, "6")) {
                      uActivity = n.d(this);
                      if (uActivity != null) {
                         i = n.j(uActivity);
                         this.e.setBackground(objArray);
                         this.setBackground(a.b(this.h));
                         LiveAudienceDrawingGiftBoxView tf = this.f;
                         if (tf != null) {
                            tf.setVisibility(0);
                            this.f.getLayoutParams().width = (int)((float)i * 0.29f);
                         }
                      }
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(uActivity, this, LiveAudienceDrawingGiftBoxView.class, "3")){
                this.d.getLayoutParams().height = a1.e(0x42fa0000);
                this.getLayoutParams().height = -2;
                this.getLayoutParams().width = n.k(uActivity);
             }
          }
       }
       return;
    }
}
