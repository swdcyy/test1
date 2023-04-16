package c54.j;
import java.lang.Runnable;
import c54.o;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCarUpdateCallBack;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import c54.o$b;

public final class j implements Runnable	// class@0004bb
{
    public final o b;
    public final LiveStreamMessages$SCLiveCarUpdateCallBack c;

    public void j(o p0,LiveStreamMessages$SCLiveCarUpdateCallBack p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j tb = this.b;
       Objects.requireNonNull(tb);
       tb.e(this.c.updateParams, null, 0, null);
    }
}
