package ij9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView;
import java.lang.Object;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class b implements Runnable	// class@002854
{
    public final CustomBannerView b;

    public void b(CustomBannerView p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       tb.smoothScrollToPosition((tb.g.i0() + 1));
    }
}
