package androidx.appcompat.view.menu.ActionMenuItemView$a;
import w0.m;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View;
import v0.e;
import androidx.appcompat.view.menu.ActionMenuItemView$b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.e$b;

public class ActionMenuItemView$a extends m	// class@000595
{
    public final ActionMenuItemView k;

    public void ActionMenuItemView$a(ActionMenuItemView p0){
       this.k = p0;
       super(p0);
    }
    public e b(){
       ActionMenuItemView k = this.k.k;
       if (k != null) {
          return k.a();
       }
       return null;
    }
    public boolean c(){
       ActionMenuItemView$a tk = this.k;
       ActionMenuItemView i = tk.i;
       boolean b = false;
       if (i != null && i.g(tk.f)) {
          e uoe = this.b();
          if (uoe != null && uoe.d()) {
             b = true;
          }
       }
       return b;
    }
}
