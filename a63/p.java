package a63.p;
import com.kwai.library.widget.layout.DraggedFrameLayout$a;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiZoomImageView;

public final class p implements DraggedFrameLayout$a	// class@000060
{
    public final n a;

    public void p(n p0){
       this.a = p0;
    }
    public final boolean a(){
       boolean b = (this.a.p.getScale() - 0x3f866666 < 0)? true: false;
       return b;
    }
}
