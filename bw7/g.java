package bw7.g;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$13;
import java.lang.Object;

public final class g implements Runnable	// class@00039a
{
    public final ToBAudioManager$13 b;
    public final boolean c;

    public void g(ToBAudioManager$13 p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ToBAudioManager$13.a(this.b, this.c);
    }
}
