package k99.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import androidx.viewpager.widget.ViewPager;
import com.kwai.framework.model.feed.BaseFeed;
import exb.b;
import zic.p0;

public final class w implements Runnable	// class@002b9b
{
    public final HorizontalAtlasExpandPresenterV4 b;
    public final GifshowActivity c;

    public void w(HorizontalAtlasExpandPresenterV4 p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       w tb = this.b;
       HorizontalAtlasExpandPresenterV4 b = tb.B;
       if (b != null) {
          p0.c(this.c, HorizontalAtlasExpandPresenterV4.P8(tb).mEntity, new StatModel("COVER"), null, b.getCurrentItem());
       }
       return;
    }
}
