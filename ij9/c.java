package ij9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView;
import java.lang.Object;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class c implements Runnable	// class@002855
{
    public final CustomBannerView b;

    public void c(CustomBannerView p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       tb.smoothScrollToPosition((tb.g.i0() + 1));
    }
}
