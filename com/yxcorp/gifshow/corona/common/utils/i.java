package com.yxcorp.gifshow.corona.common.utils.i;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wq9.a;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt;
import uq9.s;
import java.lang.Runnable;
import t45.c;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import com.yxcorp.gifshow.corona.common.utils.a;
import uq9.r;
import android.view.View$OnSystemUiVisibilityChangeListener;

public class i	// class@001277
{
    public boolean a;
    public int b;
    public int c;
    public boolean d;

    public void i(){
       super();
    }
    public void a(Activity p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, i.class, "1")) {
          return;
       }
       this.b(p0, p1, p2, true);
       return;
    }
    public void b(Activity p0,boolean p1,boolean p2,boolean p3){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, i.class, "2")) {
          return;
       }
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, i.class, "3")) {
          if (a.c()) {
             if (!p1) {
                p0.setRequestedOrientation(-1);
             }
          }else if(CoronaExperimentUtilKt.A.l() && p1){
             c.a(new s(p0, p1, p2));
          }else if(p1){
             i = (p2)? 8: 0;
          }else {
             i = 1;
          }
          p0.setRequestedOrientation(i);
       }
       Window window = p0.getWindow();
       if (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidThreeRefs(window, Boolean.valueOf(p1), Boolean.valueOf(p3), this, i.class, "4") && (p1 != this.a || (this.b != window.getAttributes().flags || this.c != window.getDecorView().getSystemUiVisibility())))) {
          if (p1) {
             this.b = window.getAttributes().flags;
             this.c = window.getDecorView().getSystemUiVisibility();
             this.d = true;
             window.clearFlags(2048);
             window.addFlags(1024);
             window.getDecorView().setSystemUiVisibility(5638);
          }else {
             a.c(window);
             if (this.d != null) {
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.flags = this.b;
                window.setAttributes(attributes);
                if (p3) {
                   this.c = this.c | 0;
                }
                window.getDecorView().setSystemUiVisibility(this.c);
                window.getDecorView().setOnSystemUiVisibilityChangeListener(new r(this, window));
                this.d = false;
             }
          }
       }
       this.a = p1;
       return;
    }
}
