package gaa.n0;
import java.lang.Runnable;
import voc.i;
import java.lang.Object;
import java.lang.String;

public final class n0 implements Runnable	// class@002440
{
    public final i b;
    public final int c;

    public void n0(i p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.g("DOWNLOAD_PICTURE_TASK", this.c, 8);
    }
}
