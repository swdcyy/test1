package androidx.appcompat.app.AlertController$c;
import java.lang.Runnable;
import androidx.appcompat.app.AlertController;
import android.view.View;
import java.lang.Object;

public class AlertController$c implements Runnable	// class@00055d
{
    public final View b;
    public final View c;
    public final AlertController d;

    public void AlertController$c(AlertController p0,View p1,View p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       AlertController.f(this.d.A, this.b, this.c);
    }
}
