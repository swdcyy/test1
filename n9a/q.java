package n9a.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import java.lang.Object;

public final class q implements Runnable	// class@003118
{
    public final NasaFeaturedSeekBar b;

    public void q(NasaFeaturedSeekBar p0){
       this.b = p0;
    }
    public final void run(){
       NasaFeaturedSeekBar.a(this.b);
    }
}
