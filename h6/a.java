package h6.a;
import java.lang.Object;
import java.lang.String;
import h6.b;
import android.util.Base64;

public class a	// class@0020fe
{
    public final byte[] a;

    public void a(byte[] p0){
       super();
       this.a = p0;
    }
    public final String a(){
       return Base64.encodeToString(this.a, 3);
    }
}
