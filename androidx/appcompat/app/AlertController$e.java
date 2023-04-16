package androidx.appcompat.app.AlertController$e;
import java.lang.Runnable;
import androidx.appcompat.app.AlertController;
import android.view.View;
import java.lang.Object;

public class AlertController$e implements Runnable	// class@00055f
{
    public final View b;
    public final View c;
    public final AlertController d;

    public void AlertController$e(AlertController p0,View p1,View p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       AlertController.f(this.d.g, this.b, this.c);
    }
}
