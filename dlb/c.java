package dlb.c;
import ok.o;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c implements o	// class@0024c0
{
    public final QPhoto b;

    public void c(QPhoto p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return TextUtils.n(p0.getPhotoId(), this.b.getPhotoId());
    }
}
