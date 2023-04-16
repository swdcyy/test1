package cia.v;
import erd.g;
import cia.w$a;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import xl8.b;

public final class v implements g	// class@000518
{
    public final w$a b;

    public void v(w$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       if (tb.b.a() != p0) {
          tb.b.d(p0);
       }
       return;
    }
}
