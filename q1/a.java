package q1.a;
import q1.b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.Gravity;
import android.graphics.Outline;

public class a extends b	// class@002949
{

    public void a(Resources p0,Bitmap p1){
       super(p0, p1);
    }
    public void c(int p0,int p1,int p2,Rect p3,Rect p4){
       Gravity.apply(p0, p1, p2, p3, p4, 0);
    }
    public void getOutline(Outline p0){
       this.i();
       p0.setRoundRect(this.h, this.b());
    }
}
