package gaa.j0;
import java.lang.Runnable;
import voc.i;
import java.lang.Object;
import java.lang.String;

public final class j0 implements Runnable	// class@002438
{
    public final i b;

    public void j0(i p0){
       this.b = p0;
    }
    public final void run(){
       this.b.g("DOWNLOAD_COVER_TASK", 100, 2);
    }
}
