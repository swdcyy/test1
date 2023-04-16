package laa.b0;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import java.util.Iterator;
import java.io.File;
import qkd.b;

public final class b0 implements Runnable	// class@002d7a
{
    public final List b;

    public void b0(List p0){
       this.b = p0;
    }
    public final void run(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          b.q(iterator.next());
       }
       return;
    }
}
