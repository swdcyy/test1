package com.yxcorp.gifshow.rn.a;
import jz6.a;
import android.content.Context;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Dialog;
import android.view.Window;
import android.view.View;
import com.yxcorp.gifshow.rn.a$a;

public class a extends a	// class@001b22
{
    public a$a b;
    public boolean c;

    public void a(Context p0){
       super(p0);
    }
    public void a(Context p0,int p1){
       super(p0, p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.c != null && this.isShowing()) {
          int i = 0;
          if (p0.getAction() == 1) {
             obj = PatchProxy.applyTwoRefs(this.getContext(), p0, this, a.class, "2");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                b = (int)p0.getX();
                int i1 = (int)p0.getY();
                View decorView = this.getWindow().getDecorView();
                b = (b >= 0 && (i1 >= 0 && (b > decorView.getWidth() || i1 > decorView.getHeight())))? true: false;
             }
             if (b) {
             label_0069 :
                a tb = this.b;
                if (tb != null && tb.a()) {
                   i = 1;
                }
                if (i) {
                   return true;
                }else {
                   this.cancel();
                }
             }
          }
          if (p0.getAction() == 4) {
             goto label_0069 ;
          }
       }
    label_007a :
       return true;
    }
    public void setCanceledOnTouchOutside(boolean p0){
       this.c = p0;
    }
}
