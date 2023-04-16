package b99.s0;
import java.lang.Runnable;
import b99.t0;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;

public final class s0 implements Runnable	// class@0003b9
{
    public final t0 b;
    public final PlcEntryStyleInfo c;

    public void s0(t0 p0,PlcEntryStyleInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.S8(this.c);
    }
}
