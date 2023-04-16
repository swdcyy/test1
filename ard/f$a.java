package ard.f$a;
import java.io.OutputStream;
import ard.f;
import java.lang.StringBuffer;

public class f$a extends OutputStream	// class@00022b
{
    public final StringBuffer b;
    public final f c;

    public void f$a(f p0,StringBuffer p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void write(int p0){
       this.b+(char)p0;
    }
}
