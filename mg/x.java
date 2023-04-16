package mg.x;
import fw8.r$a;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.feature.post.api.feature.bridge.JsListenUserTouchParam;
import f55.g;
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
import mg.x$a;
import java.lang.Runnable;
import ekd.k1;
import android.view.KeyEvent;

public final class x implements r$a	// class@00267c
{
    public final Ref$ObjectRef b;
    public final JsListenUserTouchParam c;
    public final g d;

    public void x(Ref$ObjectRef p0,JsListenUserTouchParam p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
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
       if (p1 != null && !p1.getAction()) {
          k1.r(new x$a(this), 0);
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
