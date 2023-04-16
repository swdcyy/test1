package ak.c;
import ak.b;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.os.Bundle;
import java.lang.String;

public final class c	// class@000202
{
    public final View a;
    public boolean b;
    public int c;

    public void c(b p0){
       super();
       this.b = false;
       this.c = 0;
       this.a = p0;
    }
    public final void a(){
       ViewParent parent = this.a.getParent();
       if (parent instanceof CoordinatorLayout) {
          parent.l(this.a);
       }
       return;
    }
    public int b(){
       return this.c;
    }
    public boolean c(){
       return this.b;
    }
    public void d(Bundle p0){
       this.b = p0.getBoolean("expanded", false);
       this.c = p0.getInt("expandedComponentIdHint", false);
       if (this.b != null) {
          this.a();
       }
       return;
    }
    public Bundle e(){
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("expanded", this.b);
       uBundle.putInt("expandedComponentIdHint", this.c);
       return uBundle;
    }
    public boolean f(boolean p0){
       if (this.b == p0) {
          return false;
       }
       this.b = p0;
       this.a();
       return true;
    }
    public void g(int p0){
       this.c = p0;
    }
}
