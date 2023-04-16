package aegon.chrome.net.impl.NativeCronetProvider;
import aegon.chrome.net.e;
import android.content.Context;
import aegon.chrome.net.d$a;
import j0.j;
import aegon.chrome.net.g$a;
import aegon.chrome.net.i;
import java.lang.String;
import java.lang.Object;
import java.util.Arrays;

public class NativeCronetProvider extends e	// class@0001d2
{

    public void NativeCronetProvider(Context p0){
       super(p0);
    }
    public d$a b(){
       return new g$a(new j(this.a));
    }
    public String c(){
       return "App-Packaged-Cronet-Provider";
    }
    public String d(){
       return "95.0.4638.74";
    }
    public boolean e(){
       return true;
    }
    public boolean equals(Object p0){
       boolean b = (p0 == this || (p0 instanceof NativeCronetProvider && this.a.equals(p0.a)))? true: false;
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{NativeCronetProvider.class,this.a};
       return Arrays.hashCode(objArray);
    }
}
