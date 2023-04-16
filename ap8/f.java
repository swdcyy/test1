package ap8.f;
import sp8.b$a;
import com.tachikoma.core.component.input.TKInput$b;
import java.lang.Object;
import tp8.b;
import java.util.Objects;
import com.tachikoma.core.event.view.TKInputEvent;
import java.lang.String;
import com.tachikoma.core.event.base.TKBaseEvent;
import com.tachikoma.core.component.input.TKInput;

public final class f implements b$a	// class@000300
{
    public final TKInput$b a;

    public void f(TKInput$b p0){
       this.a = p0;
    }
    public final void a(b p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 instanceof TKInputEvent) {
          p0.setType("input");
          p0.setText(ta.b.getText());
          p0.setState(4);
       }
       return;
    }
}
