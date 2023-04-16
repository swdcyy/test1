package com.tachikoma.core.component.input.b;
import sp8.b$a;
import java.lang.Object;
import tp8.b;
import com.tachikoma.core.event.view.TKInputEvent;
import java.lang.String;
import com.tachikoma.core.event.base.TKBaseEvent;

public final class b implements b$a	// class@000d7c
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(b p0){
       if (p0 instanceof TKInputEvent) {
          p0.setType("input");
          p0.setText("");
          p0.setState(2);
       }
       return;
    }
}
