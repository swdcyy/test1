package j7a.d;
import sd5.h;
import j7a.i;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import uc6.c;
import sd5.d;

public final class d implements h	// class@00292a
{
    public final i a;

    public void d(i p0){
       this.a = p0;
    }
    public final Bitmap a(){
       Bitmap uBitmap;
       d ta = this.a;
       if (ta.s.getDetailPlayConfig().isSharePlayer()) {
          ta.P8("provide bitmap for share");
          uBitmap = ta.p.N().a();
       }else {
          uBitmap = null;
       }
       return uBitmap;
    }
}
