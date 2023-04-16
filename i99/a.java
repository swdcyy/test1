package i99.a;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;

public final class a implements g	// class@002650
{
    public final HorizontalPhotosFragment b;

    public void a(HorizontalPhotosFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b.v;
       if (p0 != null) {
          p0.setCurrentItem(0);
       }
       return;
    }
}
