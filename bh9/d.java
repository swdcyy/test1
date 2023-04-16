package bh9.d;
import java.lang.Runnable;
import bh9.r;
import java.lang.Object;
import java.util.BitSet;

public final class d implements Runnable	// class@000499
{
    public final r b;

    public void d(r p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       tb.t.clear(1);
       tb.l2();
    }
}
