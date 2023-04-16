package axc.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import java.lang.Object;

public final class u implements Runnable	// class@0002f7
{
    public final PictureSelectView b;

    public void u(PictureSelectView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.O(false);
    }
}
