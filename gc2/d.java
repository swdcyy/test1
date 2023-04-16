package gc2.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.lang.Object;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class d implements Runnable	// class@002afc
{
    public final KwaiImageView b;
    public final List c;

    public void d(KwaiImageView p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       if (tb.getWidth() > 0 && tb.getHeight() > 0) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          tb.b0(tc.toArray(uCDNUrlArray), null, tb.getWidth(), tb.getHeight());
       }else {
          b.c0(LiveLogTag.LUCKY_STAR, "can not get valid size", "url", tc);
          tb.P(tc);
       }
       return;
    }
}
