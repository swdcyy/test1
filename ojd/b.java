package ojd.b;
import ojd.g;
import ojd.f;
import java.io.File;
import okhttp3.MediaType;
import java.lang.Object;
import java.io.InputStream;
import java.io.FileInputStream;

public final class b extends g	// class@001f1f
{
    public File f;

    public void b(f p0,File p1,long p2,long p3,MediaType p4){
       super(p0, p1, p2, p3, p4);
       this.f = p1;
    }
    public InputStream a(){
       return new FileInputStream(this.f);
    }
}
