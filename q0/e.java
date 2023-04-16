package q0.e;
import q0.c;
import android.app.Dialog;
import android.content.Context;
import q0.e$a;
import q0.d;
import android.os.Bundle;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.KeyEvent;
import android.view.Window;
import a2.h$a;
import android.view.Window$Callback;
import a2.h;
import u0.b;
import u0.b$a;
import java.lang.String;
import java.lang.CharSequence;

public class e extends Dialog implements c	// class@002942
{
    public d b;
    public final h$a c;

    public void e(Context p0){
       super(p0, 0);
    }
    public void e(Context p0,int p1){
       super(p0, e.b(p0, p1));
       this.c = new e$a(this);
       d uod = this.a();
       uod.N(e.b(p0, p1));
       uod.w(null);
    }
    public static int b(Context p0,int p1){
       TypedValue typedValue;
       if (!p1) {
          typedValue = new TypedValue();
          p0.getTheme().resolveAttribute(R.attr.arg_RES_7f0402d1, typedValue, true);
          typedValue = typedValue.resourceId;
       }
       return typedValue;
    }
    public d a(){
       if (this.b == null) {
          this.b = d.i(this, this);
       }
       return this.b;
    }
    public void addContentView(View p0,ViewGroup$LayoutParams p1){
       this.a().d(p0, p1);
    }
    public boolean c(KeyEvent p0){
       return super.dispatchKeyEvent(p0);
    }
    public boolean d(int p0){
       return this.a().F(p0);
    }
    public void dismiss(){
       super.dismiss();
       this.a().x();
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       return h.e(this.c, this.getWindow().getDecorView(), this, p0);
    }
    public View findViewById(int p0){
       return this.a().k(p0);
    }
    public void invalidateOptionsMenu(){
       this.a().s();
    }
    public void onCreate(Bundle p0){
       this.a().r();
       super.onCreate(p0);
       this.a().w(p0);
    }
    public void onStop(){
       super.onStop();
       this.a().C();
    }
    public void onSupportActionModeFinished(b p0){
    }
    public void onSupportActionModeStarted(b p0){
    }
    public b onWindowStartingSupportActionMode(b$a p0){
       return null;
    }
    public void setContentView(int p0){
       this.a().G(p0);
    }
    public void setContentView(View p0){
       this.a().H(p0);
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       this.a().I(p0, p1);
    }
    public void setTitle(int p0){
       super.setTitle(p0);
       this.a().O(this.getContext().getString(p0));
    }
    public void setTitle(CharSequence p0){
       super.setTitle(p0);
       this.a().O(p0);
    }
}
