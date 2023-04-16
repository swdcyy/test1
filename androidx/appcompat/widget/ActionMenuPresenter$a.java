package androidx.appcompat.widget.ActionMenuPresenter$a;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.content.Context;
import androidx.appcompat.view.menu.m;
import android.view.View;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.j$a;

public class ActionMenuPresenter$a extends i	// class@0005ca
{
    public final ActionMenuPresenter m;

    public void ActionMenuPresenter$a(ActionMenuPresenter p0,Context p1,m p2,View p3){
       this.m = p0;
       super(p1, p2, p3, false, 0x7f0400f1);
       if (!p2.getItem().n()) {
          ActionMenuPresenter l = p0.l;
          if (l == null) {
             l = p0.j;
          }
          this.f(l);
       }
       this.a(p0.D);
       return;
    }
    public void e(){
       ActionMenuPresenter$a tm = this.m;
       tm.A = null;
       tm.E = 0;
       super.e();
    }
}
