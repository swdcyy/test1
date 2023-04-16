package m2a.e;
import msd.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;

public final class e implements a	// class@002f04
{
    public final PhotoDetailParam b;

    public void e(PhotoDetailParam p0){
       this.b = p0;
    }
    public final Object invoke(){
       return Boolean.valueOf(this.b.mPhoto.isAllowPhotoDownload());
    }
}
