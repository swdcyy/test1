package jd6.i$a;
import fw8.r$a;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jd6.i;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.fragment.app.PluginManagerForMemoryRestart;
import android.view.MotionEvent;
import android.view.KeyEvent;

public final class i$a implements r$a	// class@001b4e
{

    public void i$a(){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "1")) {
          return;
       }
       if (i.a(i.b) && (p0 != null && p1 != null)) {
          FeatureManager a = FeatureManager.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, a, FeatureManager.class, "18")) {
             a.p(p0, "activity");
             PluginManagerForMemoryRestart.e(p0, p1);
          }
       }
       return;
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       q.c(this, p0, p1);
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
       FeatureManager a;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       a.p(p0, "outState");
       if (i.a(i.b)) {
          a = FeatureManager.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(p0, a, FeatureManager.class, "19")) {
             a.p(p0, "bundle");
             PluginManagerForMemoryRestart.a.f(p0);
          }
       }
       return;
    }
}
