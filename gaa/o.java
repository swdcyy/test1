package gaa.o;
import java.lang.Runnable;
import voc.i;
import java.lang.Object;
import java.lang.String;

public final class o implements Runnable	// class@002443
{
    public final i b;

    public void o(i p0){
       this.b = p0;
    }
    public final void run(){
       this.b.g("DOWNLOAD_COVER_TASK", 100, 2);
    }
}
