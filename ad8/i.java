package ad8.i;
import java.lang.Runnable;
import ja8.c;
import ja8.e;
import java.lang.Object;
import com.mini.js.jscomponent.keyboard.GlobalKeyboard;
import com.mini.d;
import java.lang.StringBuilder;
import java.lang.String;
import com.mini.js.helper.a;

public final class i implements Runnable	// class@000081
{
    public final c b;
    public final e c;

    public void i(c p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       boolean b = GlobalKeyboard.a().b();
       if (d.f()) {
          d.a("<input>", "hideKeyboard GlobalKeyboard.getInstance\(\).hideKeyboard\(\) ½á¹ûÊÇ "+b);
       }
       tb.a(a.c(tc, b));
       return;
    }
}
