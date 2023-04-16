package ojd.a;
import ojd.g;
import ojd.f;
import okhttp3.MediaType;
import java.lang.Object;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class a extends g	// class@001f1e
{
    public byte[] f;

    public void a(f p0,byte[] p1,long p2,long p3,MediaType p4){
       super(p0, p1, p2, p3, p4);
       this.f = p1;
    }
    public InputStream a(){
       return new ByteArrayInputStream(this.f);
    }
}
