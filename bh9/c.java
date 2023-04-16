package bh9.c;
import java.lang.Runnable;
import bh9.r;
import java.lang.Object;
import java.util.BitSet;

public final class c implements Runnable	// class@000498
{
    public final r b;

    public void c(r p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       tb.t.clear(4);
       tb.l2();
    }
}
