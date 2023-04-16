package ne.e;
import ab.h;
import java.lang.String;
import java.lang.Object;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.io.File;
import java.lang.StringBuilder;

public final class e implements h	// class@0026f8
{
    public final String a;

    public void e(String p0){
       this.a = p0;
    }
    public final Object get(){
       return new File(this.a+MetaDiskCache.l);
    }
}
