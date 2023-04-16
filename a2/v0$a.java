package a2.v0$a;
import a2.v0$e;
import android.view.Window;
import android.view.View;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;

public class v0$a extends v0$e	// class@0000bb
{
    public final Window a;
    public final View b;

    public void v0$a(Window p0,View p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int a(){
       return 0;
    }
    public void b(int p0){
       int i = 1;
       while (i <= 256) {
          int i1 = p0 & i;
          if (i1) {
             this.c(i);
          }
          i = i << 1;
       }
       return;
    }
    public final void c(int p0){
       if (p0 != 1) {
          int i = 2;
          if (p0 != i) {
             if (p0 == 8) {
                this.a.getContext().getSystemService("input_method").hideSoftInputFromWindow(this.a.getDecorView().getWindowToken(), 0);
             }
             return;
          }else {
             this.d(i);
             return;
          }
       }else {
          this.d(4);
          return;
       }
    }
    public void d(int p0){
       View decorView = this.a.getDecorView();
       decorView.setSystemUiVisibility((p0 | decorView.getSystemUiVisibility()));
    }
}
