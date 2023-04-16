package fy0.h;
import erd.g;
import fy0.j;
import fy0.i$a$a;
import java.lang.Object;
import java.lang.Integer;
import android.view.View;
import android.widget.ImageView;

public final class h implements g	// class@0023d4
{
    public final j b;
    public final i$a$a c;

    public void h(j p0,i$a$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tc = this.c;
       boolean b = (p0.intValue() == this.b.e())? true: false;
       if (!tc.a.getVisibility()) {
          tc.a.setSelected(b);
       }else if(!tc.e.getVisibility()){
          tc.e.setSelected(b);
       }
       return;
    }
}
