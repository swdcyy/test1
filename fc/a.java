package fc.a;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import android.net.Uri;

public class a implements CacheKey	// class@001fe4
{
    public final String a;

    public void a(int p0){
       super();
       this.a = "anim://"+p0;
    }
    public String a(){
       return this.a;
    }
    public boolean b(){
       return false;
    }
    public boolean c(Uri p0){
       return (p0.toString()).startsWith(this.a);
    }
}
