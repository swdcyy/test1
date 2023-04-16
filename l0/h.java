package l0.h;
import java.net.URLStreamHandlerFactory;
import aegon.chrome.net.g;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.net.URLStreamHandler;
import l0.e;

public class h implements URLStreamHandlerFactory	// class@0024e8
{
    public final g b;

    public void h(g p0){
       super();
       Objects.requireNonNull(p0, "CronetEngine is null.");
       this.b = p0;
    }
    public URLStreamHandler createURLStreamHandler(String p0){
       if (("http").equals(p0) || ("https").equals(p0)) {
          return new e(this.b);
       }
       return null;
    }
}
