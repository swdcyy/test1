package kk5.a;
import android.net.Uri;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public abstract class a	// class@002dc6
{
    public final ImageRequestBuilder a;
    public int b;
    public int c;
    public CacheKeyOptions d;
    public static final Uri e;

    static {
       a.e = Uri.EMPTY;
    }
    public void a(){
       super();
       this.a = ImageRequestBuilder.k(a.e);
    }
    public void a(ImageRequestBuilder p0){
       super();
       this.a = p0;
    }
    public void a(a p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
    }
}
