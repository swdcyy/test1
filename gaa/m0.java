package gaa.m0;
import java.lang.Runnable;
import voc.i;
import java.lang.Object;
import java.lang.String;

public final class m0 implements Runnable	// class@00243e
{
    public final i b;
    public final int c;

    public void m0(i p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.g("DOWNLOAD_PICTURE_TASK", this.c, 8);
    }
}
