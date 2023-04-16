package hd9.y;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import java.lang.Object;

public final class y implements Runnable	// class@002630
{
    public final f b;

    public void y(f p0){
       this.b = p0;
    }
    public final void run(){
       this.b.release();
    }
}
