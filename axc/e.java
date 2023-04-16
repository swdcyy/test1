package axc.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import java.lang.Object;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller;

public final class e implements Runnable	// class@0002e6
{
    public final EditorTimeLineView b;
    public final int c;

    public void e(EditorTimeLineView p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.scrollTo(this.c, 0);
    }
}
