package nj.k;
import java.lang.Runnable;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import java.lang.Object;

public final class k implements Runnable	// class@002717
{
    public final TunaSlidePlayFragment b;
    public final int c;

    public void k(TunaSlidePlayFragment p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.eh(this.c);
    }
}
