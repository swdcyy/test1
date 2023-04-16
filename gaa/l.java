package gaa.l;
import java.lang.Runnable;
import voc.i;
import java.lang.Object;
import java.lang.String;

public final class l implements Runnable	// class@00243d
{
    public final i b;

    public void l(i p0){
       this.b = p0;
    }
    public final void run(){
       this.b.g("DOWNLOAD_COVER_TASK", 100, 2);
    }
}
