package mf9.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import com.kwai.video.westeros.models.EffectDescription;
import java.lang.Object;
import android.view.ViewGroup;
import android.graphics.Rect;

public final class g implements Runnable	// class@003027
{
    public final b b;
    public final EffectDescription c;

    public void g(b p0,EffectDescription p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       tb.z1(tb.s, tb.t, this.c);
    }
}
