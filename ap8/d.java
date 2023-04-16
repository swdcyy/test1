package ap8.d;
import sp8.b$a;
import java.lang.CharSequence;
import java.lang.Object;
import tp8.b;
import com.tachikoma.core.event.view.TKInputEvent;
import java.lang.String;
import com.tachikoma.core.event.base.TKBaseEvent;

public final class d implements b$a	// class@0002fe
{
    public final CharSequence a;

    public void d(CharSequence p0){
       this.a = p0;
    }
    public final void a(b p0){
       d ta = this.a;
       if (p0 instanceof TKInputEvent) {
          p0.setType("input");
          p0.setText(ta.toString());
          p0.setState(1);
       }
       return;
    }
}
