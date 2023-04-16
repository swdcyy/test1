package c54.k;
import java.lang.Runnable;
import c54.o;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import c54.c;

public final class k implements Runnable	// class@0004bc
{
    public final o b;
    public final LiveShopFrameModel$Toast c;

    public void k(o p0,LiveShopFrameModel$Toast p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c.a(this.b.c, this.c);
    }
}
