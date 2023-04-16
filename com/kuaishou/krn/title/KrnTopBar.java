package com.kuaishou.krn.title.KrnTopBar;
import com.kuaishou.krn.title.AbsTopBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import cw9.c;
import android.view.View;
import com.kuaishou.krn.title.ButtonParams$PositionId;
import com.kwai.robust.PatchProxyResult;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.TextView;
import java.lang.Math;
import com.kuaishou.krn.title.KrnTopBar$a;
import java.lang.Enum;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;

public class KrnTopBar extends AbsTopBar	// class@00091c
{
    public Context b;
    public int c;
    public int d;
    public int e;
    public int f;

    public void KrnTopBar(Context p0){
       super(p0, null);
    }
    public void KrnTopBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KrnTopBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = p0;
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnTopBar.class, "1")) {
       }else {
          this.f = c.a(p0.getResources(), 0x7f07047d);
          this.e = c.a(p0.getResources(), 0x7f07047e);
          this.c = c.a(p0.getResources(), 0x7f07047c);
          this.d = c.a(p0.getResources(), 0x7f07047b);
       }
       return;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnTopBar.class, "8")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(4);
          p0.setFocusable(false);
       }
       return;
    }
    public void b(ButtonParams$PositionId p0,View p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnTopBar.class, "7")) {
          return;
       }
       boolean b = true;
       p1.setFocusable(b);
       int i = 0;
       p1.setVisibility(i);
       p1.setMinimumWidth(this.e);
       RelativeLayout$LayoutParams layoutParams = PatchProxy.applyOneRefs(p1, this, KrnTopBar.class, "3");
       if (layoutParams != PatchProxyResult.class) {
       }else if(p1 instanceof TextView){
          layoutParams = new RelativeLayout$LayoutParams(-2, this.d);
       }else {
          layoutParams = new RelativeLayout$LayoutParams(this.c, this.d);
       }
       layoutParams.topMargin = Math.max(i, ((this.f - this.d) / 2));
       layoutParams.alignWithParent = b;
       int i1 = KrnTopBar$a.a[p0.ordinal()];
       if (i1 != b) {
          if (i1 == 2 && !PatchProxy.applyVoidTwoRefs(layoutParams, p1, this, KrnTopBar.class, "5")) {
             layoutParams.addRule(11);
             i1 = ButtonParams$PositionId.RIGHT1;
             view = this.findViewById(i1.positionId);
             if (view != null) {
                this.removeView(view);
             }
             this.addView(p1, layoutParams);
             p1.setId(i1.positionId);
          }
       }else if(PatchProxy.applyVoidTwoRefs(layoutParams, p1, this, KrnTopBar.class, "4")){
          layoutParams.addRule(9);
          i1 = ButtonParams$PositionId.LEFT1;
          view = this.findViewById(i1.positionId);
          if (view != null) {
             this.removeView(view);
          }
          this.addView(p1, layoutParams);
          p1.setId(i1.positionId);
       }
       return;
    }
    public void setTitle(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnTopBar.class, "6")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = PatchProxy.applyOneRefs(p0, this, KrnTopBar.class, "2");
       if (layoutParams != PatchProxyResult.class) {
       }else {
          layoutParams = new RelativeLayout$LayoutParams(-1, -1);
          layoutParams.addRule(13);
       }
       this.addView(p0, layoutParams);
       return;
    }
}
