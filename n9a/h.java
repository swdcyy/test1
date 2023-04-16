package n9a.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.view.FeaturedSeekBar;
import java.lang.Object;
import android.view.View;

public final class h implements Runnable	// class@00310f
{
    public final FeaturedSeekBar b;

    public void h(FeaturedSeekBar p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       tb.r = false;
       tb.o = 0x3f800000;
       tb.invalidate();
    }
}
