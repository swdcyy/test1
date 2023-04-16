package androidx.appcompat.app.AlertController$b;
import androidx.core.widget.NestedScrollView$b;
import androidx.appcompat.app.AlertController;
import android.view.View;
import java.lang.Object;
import androidx.core.widget.NestedScrollView;

public class AlertController$b implements NestedScrollView$b	// class@00055c
{
    public final View b;
    public final View c;
    public final AlertController d;

    public void AlertController$b(AlertController p0,View p1,View p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void d5(NestedScrollView p0,int p1,int p2,int p3,int p4){
       AlertController.f(p0, this.b, this.c);
    }
}
