package aqc.a;
import com.yxcorp.gifshow.decoration.widget.f;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.safearea.SafeAreaView;
import com.yxcorp.gifshow.decoration.widget.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcorp.gifshow.v3.f;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.util.Pair;
import java.lang.Float;
import android.graphics.RectF;
import java.util.Objects;
import android.view.View;
import aqc.b;

public class a implements f	// class@0002bc
{
    public SafeAreaView a;
    public float b;
    public float c;
    public boolean d;
    public boolean e;
    public f$b f;
    public f$a g;
    public static final int h;
    public static final int i;

    static {
       a.h = a1.e(3.00f);
       a.i = a1.e(0x41f00000);
    }
    public void a(Context p0){
       super();
       this.b = 0;
       this.c = 0;
       this.d = false;
       this.e = false;
       this.a = new SafeAreaView(p0);
    }
    public void a(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.g = p0;
       this.a.setHintString(p0.d);
       this.d = p0.a;
       this.e = p0.b;
       if (p0.c != null) {
          this.a.N();
       }else {
          this.a.O();
       }
       return;
    }
    public boolean b(){
       a uoa = a.class;
       Object obj = PatchProxy.apply(null, this, uoa, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e == null || !this.a.getVisibility()) {
          return 0;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "3") && this.a.getVisibility()) {
          this.a.setVisibility(0);
          uoa = this.f;
          if (uoa != null) {
             uoa.a();
          }
          f.P(20);
       }
       return true;
    }
    public boolean c(){
       return this.d;
    }
    public Pair d(MotionEvent p0,float p1,float p2,Rect p3){
       int this;
       float f;
       RectF left2;
       RectF right2;
       float f1;
       RectF bottom;
       a tc;
       int i;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), p3, this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = this.b();
       RectF safeAreaRect = this.a.getSafeAreaRect();
       Rect left = p3.left;
       RectF left1 = safeAreaRect.left;
       this = a.h;
       if ((float)left - ((float)this + left1) < 0 && p1 > 0) {
          if (b && (left1 - (float)left) - (float)this < 0) {
             this.b = p0.getRawX();
             f = (float)p3.left;
             left2 = safeAreaRect.left;
          }else {
             tc = this.b;
             if (tc > 0 && (tc - p0.getRawX()) - (float)a.i <= 0) {
                f = (float)p3.left;
                left2 = safeAreaRect.left;
             }else {
                this.b = 0;
             }
          }
          f = f - left2;
       label_006f :
          Rect right = p3.right;
          RectF right1 = safeAreaRect.right;
          if ((float)right - (right1 - (float)this) > 0 && p1 < 0) {
             if (b && ((float)right - right1) - (float)this < 0) {
                this.b = p0.getRawX();
                p1 = (float)p3.right;
                right2 = safeAreaRect.right;
             }else if(this.b > 0 && (p0.getRawX() - this.b) - (float)a.i <= 0){
                p1 = (float)p3.right;
                right2 = safeAreaRect.right;
             }else {
                this.b = 0;
             }
             p1 = p1 - right2;
          }else {
             p1 = f;
          }
          left = p3.top;
          left1 = safeAreaRect.top;
          if ((float)left - ((float)this + left1) < 0 && p2 > 0) {
             if (b && (left1 - (float)left) - (float)this < 0) {
                this.c = p0.getRawY();
                f = (float)p3.top;
                left2 = safeAreaRect.top;
             }else {
                tc = this.c;
                if (tc > 0 && (tc - p0.getRawY()) - (float)a.i <= 0) {
                   f = (float)p3.top;
                   left2 = safeAreaRect.top;
                }else {
                   this.c = 0;
                }
             }
             f = f - left2;
          label_00f3 :
             right = p3.bottom;
             right1 = safeAreaRect.bottom;
             if ((float)right - (right1 - (float)this) > 0 && p2 < 0) {
                if (b && ((float)right - right1) - (float)this < 0) {
                   this.c = p0.getRawY();
                   f1 = (float)p3.bottom;
                   bottom = safeAreaRect.bottom;
                }else if(this.c > 0 && (p0.getRawY() - this.c) - (float)a.i <= 0){
                   f1 = (float)p3.bottom;
                   bottom = safeAreaRect.bottom;
                }else {
                   this.c = 0;
                }
                bottom = f1 - bottom;
             }else {
                p2 = f;
             }
             return new Pair(Float.valueOf(p1), Float.valueOf(bottom));
          }
          i = p2;
          goto label_00f3 ;
       }
       i = p1;
       goto label_006f ;
    }
    public void detach(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       Objects.requireNonNull(this.a);
       SafeAreaView.L = null;
       return;
    }
    public View e(){
       return this.a;
    }
    public void f(f$b p0){
       this.f = p0;
    }
    public f$a g(){
       return this.g;
    }
    public boolean h(Rect p0,boolean p1){
       RectF obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.d == null) {
          return false;
       }else {
          obj = this.a.getSafeAreaRect();
          int h = (p1)? a.h: -1;
          return b.a(p0, obj, h);
       }
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
}
