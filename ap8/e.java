package ap8.e;
import sp8.b$a;
import java.lang.CharSequence;
import java.lang.Object;
import tp8.b;
import com.tachikoma.core.event.view.TKInputEvent;
import java.lang.String;
import com.tachikoma.core.event.base.TKBaseEvent;

public final class e implements b$a	// class@0002ff
{
    public final CharSequence a;

    public void e(CharSequence p0){
       this.a = p0;
    }
    public final void a(b p0){
       e ta = this.a;
       if (p0 instanceof TKInputEvent) {
          p0.setType("input");
          p0.setText(ta.toString());
          p0.setState(2);
       }
       return;
    }
}
