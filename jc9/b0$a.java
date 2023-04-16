package jc9.b0$a;
import fw8.r$a;
import jc9.b0;
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
import hc9.e;
import ad9.i;
import com.kwai.feature.post.api.util.g;
import j8c.a;
import q87.c;
import android.view.KeyEvent;

public class b0$a implements r$a	// class@002935
{
    public final b0 b;

    public void b0$a(b0 p0){
       this.b = p0;
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b0$a.class, "1")) {
          return;
       }
       if (!p1.getAction() && (this.b.e.g() == 5 || (this.b.e.g() == 4 && !g.q(p1, this.b.d.g)))) {
          Object[] objArray = new Object[0];
          a.D().w("AutoDownloadBarHandler", "close panel when touch outside .", objArray);
          this.b.d(2);
       }
    label_0047 :
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
