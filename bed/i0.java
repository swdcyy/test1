package bed.i0;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import um6.h;
import android.os.Bundle;

public final class i0 implements g	// class@00040d
{
    public final GifshowActivity b;
    public final Music c;

    public void i0(GifshowActivity p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0.c7(this.b, this.c, null);
    }
}
