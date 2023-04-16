package axc.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import java.lang.Object;

public final class w implements Runnable	// class@0002f9
{
    public final PictureSelectView b;

    public void w(PictureSelectView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.O(false);
    }
}
