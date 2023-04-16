package gaa.k0;
import java.lang.Runnable;
import voc.i;
import java.lang.Object;
import java.lang.String;

public final class k0 implements Runnable	// class@00243a
{
    public final i b;
    public final float c;

    public void k0(i p0,float p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.g("DOWNLOAD_COVER_TASK", (int)this.c, 2);
    }
}
