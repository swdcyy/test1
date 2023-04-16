package bh.a$a;
import eh.a;
import android.content.Context;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a$a implements a	// class@000b2c
{
    public final Context a;

    public void a$a(Context p0){
       this.a = p0;
       super();
    }
    public File getCacheDir(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.getCacheDir(), "animation_network_cache");
    }
}
