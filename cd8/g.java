package cd8.g;
import cd8.f;
import bud.c;
import ma8.i;
import android.widget.EditText;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import cd8.g$a;
import java.lang.Runnable;
import cd8.f$a;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import android.view.View;
import ma8.g;

public class g implements f, c	// class@0003fa
{
    public final EditText a;
    public f$a b;
    public Handler c;
    public i d;

    public void g(i p0,EditText p1,int p2){
       super();
       this.d = p0;
       this.a = p1;
       p1.setInputType((p1.getInputType() | p2));
       this.c = new Handler(Looper.getMainLooper());
    }
    public void a(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "5")) {
          return;
       }
       og = this.b;
       if (og == null) {
          return;
       }
       if (p0) {
          this.c.postDelayed(new g$a(this), 100);
       }else {
          og.h(this);
       }
       return;
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.a.clearFocus();
       InputMethodManager systemServic = this.a.getContext().getSystemService("input_method");
       if (systemServic != null) {
          systemServic.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
       }
       return;
    }
    public void q2(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.a.requestFocus();
       InputMethodManager systemServic = this.a.getContext().getSystemService("input_method");
       if (systemServic != null) {
          systemServic.showSoftInput(this.a, 1);
       }
       return;
    }
    public void r2(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       if (p0 == this.b) {
          this.d.h().r(this);
          this.b = null;
       }
       return;
    }
    public void s2(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b = p0;
       this.d.h().w0(this);
       return;
    }
}
