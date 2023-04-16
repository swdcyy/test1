package cm2.m;
import android.view.View$OnClickListener;
import cm2.p;
import java.lang.Object;
import android.view.View;
import cm2.p$b;

public final class m implements View$OnClickListener	// class@000564
{
    public final p b;

    public void m(p p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p j = this.b.J;
       if (j != null) {
          j.c();
       }
       return;
    }
}
