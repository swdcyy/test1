package androidx.appcompat.view.menu.f;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.e;
import java.lang.Object;
import q0.e;
import android.os.IBinder;
import androidx.appcompat.app.a$a;
import android.content.Context;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.j;
import android.widget.ListAdapter;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import androidx.appcompat.app.a;
import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.content.DialogInterface;
import androidx.appcompat.view.menu.c$a;
import androidx.appcompat.view.menu.h;
import android.view.MenuItem;
import android.view.KeyEvent;
import android.view.KeyEvent$DispatcherState;

public class f implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, j$a	// class@0005ad
{
    public e b;
    public a c;
    public c d;
    public j$a e;

    public void f(e p0){
       super();
       this.b = p0;
    }
    public void a(){
       f tc = this.c;
       if (tc != null) {
          tc.dismiss();
       }
       return;
    }
    public void b(e p0,boolean p1){
       if (p1 || p0 == this.b) {
          this.a();
       }
       f te = this.e;
       if (te != null) {
          te.b(p0, p1);
       }
       return;
    }
    public boolean c(e p0){
       f te = this.e;
       if (te != null) {
          return te.c(p0);
       }
       return false;
    }
    public void d(IBinder p0){
       f tb = this.b;
       a$a uoa = new a$a(tb.w());
       c uoc = new c(uoa.b(), 0x7f0d0010);
       this.d = uoc;
       uoc.l(this);
       this.b.b(this.d);
       uoa.c(this.d.d(), this);
       View view = tb.A();
       if (view != null) {
          uoa.e(view);
       }else {
          uoa.f(tb.y());
          uoa.n(tb.z());
       }
       uoa.j(this);
       a uoa1 = uoa.a();
       this.c = uoa1;
       uoa1.setOnDismissListener(this);
       WindowManager$LayoutParams attributes = this.c.getWindow().getAttributes();
       attributes.type = 1003;
       attributes.flags = attributes.flags | 0x20000;
       this.c.show();
       return;
    }
    public void onClick(DialogInterface p0,int p1){
       this.b.N(this.d.d().getItem(p1), 0);
    }
    public void onDismiss(DialogInterface p0){
       this.d.b(this.b, true);
    }
    public boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (p1 == 82 || p1 == 4) {
          if (!p2.getAction() && !p2.getRepeatCount()) {
             Window window = this.c.getWindow();
             if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                   KeyEvent$DispatcherState keyDispatche = decorView.getKeyDispatcherState();
                   if (keyDispatche != null) {
                      keyDispatche.startTracking(p2, this);
                      return true;
                   }
                }
             }
          }else if(p2.getAction() == 1 && !p2.isCanceled()){
             Window window1 = this.c.getWindow();
             if (window1 != null) {
                View decorView1 = window1.getDecorView();
                if (decorView1 != null) {
                   KeyEvent$DispatcherState keyDispatche1 = decorView1.getKeyDispatcherState();
                   if (keyDispatche1 != null && keyDispatche1.isTracking(p2)) {
                      this.b.e(true);
                      p0.dismiss();
                      return true;
                   }
                }
             }
          }
       }
       return this.b.performShortcut(p1, p2, 0);
    }
}
