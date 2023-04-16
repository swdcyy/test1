package ne9.d;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class d	// class@00316b
{
    public final String format;
    public final float quality;

    public void d(){
       super(0x3f800000, "jpg");
    }
    public void d(float p0,String p1){
       a.p(p1, "format");
       super();
       this.quality = p0;
       this.format = p1;
    }
    public final String a(){
       return this.format;
    }
    public final float b(){
       return this.quality;
    }
}
