package h33.j;
import java.lang.Runnable;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.util.Objects;
import h33.k;
import java.util.concurrent.Callable;
import brd.t;
import h33.h;
import erd.o;
import h33.e;
import h33.f;
import erd.g;
import crd.b;

public final class j implements Runnable	// class@002c25
{
    public final y b;
    public final SlipSwitchButton c;

    public void j(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j tb = this.b;
       j tc = this.c;
       Objects.requireNonNull(tb);
       t.fromCallable(new k(tb, tc)).flatMap(new h(tb)).subscribe(new e(tb, tc), new f(tb, tc));
    }
}
