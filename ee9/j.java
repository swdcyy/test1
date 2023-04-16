package ee9.j;
import java.lang.Runnable;
import ee9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;

public final class j implements Runnable	// class@00212b
{
    public final l b;
    public final MagicEmoji$MagicFace c;

    public void j(l p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.g2(this.c);
    }
}
