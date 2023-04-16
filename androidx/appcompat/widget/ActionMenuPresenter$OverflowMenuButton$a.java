package androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$a;
import w0.m;
import androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import v0.e;
import v0.c;
import androidx.appcompat.view.menu.i;

public class ActionMenuPresenter$OverflowMenuButton$a extends m	// class@0005c6
{
    public final ActionMenuPresenter k;
    public final ActionMenuPresenter$OverflowMenuButton l;

    public void ActionMenuPresenter$OverflowMenuButton$a(ActionMenuPresenter$OverflowMenuButton p0,View p1,ActionMenuPresenter p2){
       this.l = p0;
       this.k = p2;
       super(p1);
    }
    public e b(){
       ActionMenuPresenter z = this.l.d.z;
       if (z == null) {
          return null;
       }
       return z.c();
    }
    public boolean c(){
       this.l.d.G();
       return true;
    }
    public boolean d(){
       ActionMenuPresenter$OverflowMenuButton d = this.l.d;
       if (d.B != null) {
          return false;
       }
       d.x();
       return true;
    }
}
