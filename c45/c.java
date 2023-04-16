package c45.c;
import java.lang.Runnable;
import com.kwai.android.longinus.LonginusLibrary;
import java.lang.String;
import java.lang.Object;

public final class c implements Runnable	// class@00041c
{
    public final LonginusLibrary b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public void c(LonginusLibrary p0,String p1,String p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       LonginusLibrary.a(this.b, this.c, this.d, this.e, this.f);
    }
}
