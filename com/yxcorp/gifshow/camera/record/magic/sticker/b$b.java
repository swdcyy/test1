package com.yxcorp.gifshow.camera.record.magic.sticker.b$b;
import fw8.r$a;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.utility.n;
import android.graphics.Rect;
import android.view.KeyEvent;

public class b$b implements r$a	// class@000e5c
{
    public boolean b;
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(Activity p0,View p1,ViewGroup$LayoutParams p2){
       q.k(this, p0, p1, p2);
    }
    public void b(Activity p0,View p1){
       q.j(this, p0, p1);
    }
    public String c(Intent p0){
       return q.h(this, p0);
    }
    public void d(Intent p0,View p1){
       q.l(this, p0, p1);
    }
    public void e(Intent p0){
       q.a(this, p0);
    }
    public void f(FragmentActivity p0,Bundle p1){
       q.d(this, p0, p1);
    }
    public void g(FragmentActivity p0,Bundle p1){
       q.f(this, p0, p1);
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "1")) {
          return;
       }
       b$b tc = this.c;
       if (tc.l != null) {
          b s = tc.s;
          if (s != null) {
             int b = false;
             if (this.b != null) {
                s.dispatchTouchEvent(p1);
                if (p1.getAction() == 3 || p1.getAction() == 1) {
                   this.b = b;
                }
                return;
             }else if(p1.getAction()){
                return;
             }else if(this.c.r.l()){
                ViewGroup viewGroup = this.c.l.findViewById(R.id.magic_fragment);
                View view = (viewGroup != null)? viewGroup.findViewById(R.id.touch_view): null;
                if (g.q(p1, view)) {
                   this.c.s.dispatchTouchEvent(p1);
                   this.b = true;
                }
             }else {
                int[] ointArray = n.p(this.c.s);
                b$b tc1 = this.c;
                tc1 = this.c;
                b t = tc1.t;
                b = (ointArray[b] + tc1.s.getWidth()) - t.right;
                int i = ointArray[1] + t.top;
                int i1 = (ointArray[1] + tc1.s.getHeight()) - this.c.t.bottom;
                if (p1.getRawX() - (float)(ointArray[b] + tc1.t.left) >= 0 && (p1.getRawX() - (float)b <= 0 && (p1.getRawY() - (float)i < 0 || p1.getRawY() - (float)i1 > 0))) {
                   MotionEvent motionEvent = MotionEvent.obtain(p1);
                   motionEvent.setLocation(0, 0);
                   this.c.s.dispatchTouchEvent(motionEvent);
                   this.b = true;
                }
             }
          }
       }
       return;
    }
    public void i(FragmentActivity p0,Intent p1){
       q.e(this, p0, p1);
    }
    public void j(Activity p0,int p1){
       q.i(this, p0, p1);
    }
    public void k(FragmentActivity p0,KeyEvent p1){
       q.b(this, p0, p1);
    }
    public void onSaveInstanceState(Bundle p0){
       q.g(this, p0);
    }
}
