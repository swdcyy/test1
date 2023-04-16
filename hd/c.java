package hd.c;
import jd.a;
import com.facebook.cache.common.CacheKey;
import ta.d;
import java.lang.String;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

public class c extends a	// class@002121
{
    public CacheKey c;
    public final boolean d;

    public void c(){
       super(true);
    }
    public void c(boolean p0){
       super();
       this.d = p0;
    }
    public CacheKey a(){
       if (this.c == null) {
          this.c = (this.d != null)? new d("RoundAsCirclePostprocessor#AntiAliased"): new d("RoundAsCirclePostprocessor");
       }
    label_001b :
       return this.c;
    }
    public void d(Bitmap p0){
       NativeRoundingFilter.toCircleFast(p0, this.d);
    }
}
