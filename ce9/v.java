package ce9.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import android.widget.ImageView;

public final class v implements Runnable	// class@0005d2
{
    public final l b;
    public final MagicEmoji$MagicFace c;

    public void v(l p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       l d = this.b.d;
       boolean b = (this.c != null)? true: false;
       d.setSelected(b);
       return;
    }
}
