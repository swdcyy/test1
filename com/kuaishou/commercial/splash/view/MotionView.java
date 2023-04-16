package com.kuaishou.commercial.splash.view.MotionView;
import android.view.View$OnTouchListener;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;
import com.kuaishou.commercial.splash.view.MotionView$a;

public class MotionView extends View implements View$OnTouchListener	// class@001631
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public MotionView$a l;

    public void MotionView(Context p0){
       super(p0, null);
    }
    public void MotionView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MotionView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.setOnTouchListener(this);
    }
    public boolean onTouch(View p0,MotionEvent p1){
       MotionView td;
       MotionView ti;
       MotionView tf;
       MotionView te;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, MotionView.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int action = p1.getAction();
       String str = "MotionView";
       int i = 0;
       if (action) {
          if (action != 1) {
             if (action == 2) {
                action = (int)p1.getRawX();
                int i1 = (int)p1.getRawY();
                if (this.d > null) {
                   this.j = action - this.c;
                }
                if (this.e > null) {
                   this.k = i1 - this.b;
                }
                Object[] objArray = new Object[i];
                j0.a(str, "ACTION_MOVE£ºmoveFromStartX:"+this.j+"moveFromStartY: "+this.k, objArray);
                td = this.d;
                if (td > null) {
                   ti = this.i;
                   tf = this.f;
                   if ((this.j - ti) > tf) {
                      this.j = tf + ti;
                   }
                }
                te = this.e;
                if (te > null) {
                   tf = this.h;
                   if ((this.k - tf) > this.f) {
                      this.k = tf + this.g;
                   }
                }
                if (td > null) {
                   ti = this.j;
                   if (ti > td) {
                   label_008d :
                      if (te > null) {
                         td = this.k;
                         if (td > te) {
                         label_0096 :
                            this.layout(ti, td, (this.getWidth() + ti), (this.getHeight() + td));
                            td = this.l;
                            if (td != null) {
                               td.b(this.j, this.k);
                            }
                         }
                      }
                      td = this.h;
                      goto label_0096 ;
                   }
                }
                ti = this.i;
                goto label_008d ;
             }
          }else {
             td = this.l;
             if (td != null) {
                td.a(this.j, this.k, this.c, this.b);
             }
          }
       }else {
          Object[] objArray1 = new Object[i];
          j0.a(str, "ACTION_DOWN", objArray1);
          this.c = (int)p1.getRawX();
          action = (int)p1.getRawY();
          this.b = action;
          this.j = i;
          this.k = i;
          te = this.l;
          if (te != null) {
             te.c(this.c, action);
          }
       }
       return true;
    }
    public void setOnMotionListener(MotionView$a p0){
       this.l = p0;
    }
}
