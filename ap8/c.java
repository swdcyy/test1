package ap8.c;
import sp8.b$a;
import android.text.Editable;
import java.lang.Object;
import tp8.b;
import com.tachikoma.core.event.view.TKInputEvent;
import java.lang.String;
import com.tachikoma.core.event.base.TKBaseEvent;

public final class c implements b$a	// class@0002fd
{
    public final Editable a;

    public void c(Editable p0){
       this.a = p0;
    }
    public final void a(b p0){
       c ta = this.a;
       if (p0 instanceof TKInputEvent) {
          p0.setType("input");
          p0.setText(ta.toString());
          p0.setState(3);
       }
       return;
    }
}
