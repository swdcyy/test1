package i2a.c;
import erd.o;
import com.yxcorp.gifshow.detail.nonslide.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;

public final class c implements o	// class@002767
{
    public final b b;

    public void c(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       if (!TextUtils.x(tb.h)) {
          p0.setExpTag(tb.h);
       }
       return p0;
    }
}
