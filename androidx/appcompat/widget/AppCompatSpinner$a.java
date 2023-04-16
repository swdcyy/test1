package androidx.appcompat.widget.AppCompatSpinner$a;
import w0.m;
import androidx.appcompat.widget.AppCompatSpinner;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner$e;
import v0.e;
import androidx.appcompat.widget.AppCompatSpinner$f;

public class AppCompatSpinner$a extends m	// class@0005ee
{
    public final AppCompatSpinner$e k;
    public final AppCompatSpinner l;

    public void AppCompatSpinner$a(AppCompatSpinner p0,View p1,AppCompatSpinner$e p2){
       this.l = p0;
       this.k = p2;
       super(p1);
    }
    public e b(){
       return this.k;
    }
    public boolean c(){
       if (!this.l.getInternalPopup().d()) {
          this.l.b();
       }
       return true;
    }
}
