package axc.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import java.lang.Object;

public final class v implements Runnable	// class@0002f8
{
    public final PictureSelectView b;

    public void v(PictureSelectView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.O(false);
    }
}
