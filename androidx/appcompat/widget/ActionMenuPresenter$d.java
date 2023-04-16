package androidx.appcompat.widget.ActionMenuPresenter$d;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.content.Context;
import androidx.appcompat.view.menu.e;
import android.view.View;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.a;

public class ActionMenuPresenter$d extends i	// class@0005cd
{
    public final ActionMenuPresenter m;

    public void ActionMenuPresenter$d(ActionMenuPresenter p0,Context p1,e p2,View p3,boolean p4){
       this.m = p0;
       super(p1, p2, p3, p4, 0x7f0400f1);
       this.h(0x800005);
       this.a(p0.D);
    }
    public void e(){
       a d = this.m.d;
       if (d != null) {
          d.close();
       }
       this.m.z = null;
       super.e();
       return;
    }
}
