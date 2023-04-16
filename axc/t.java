package axc.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import java.lang.Object;

public final class t implements Runnable	// class@0002f6
{
    public final PictureSelectView b;

    public void t(PictureSelectView p0){
       this.b = p0;
    }
    public final void run(){
       PictureSelectView.L(this.b);
    }
}
