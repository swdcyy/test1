package de.k;
import de.f;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import java.lang.Object;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import java.lang.String;
import java.lang.StringBuilder;

public class k implements f	// class@001e44
{
    public final EventEmitterWrapper a;
    public final int b;

    public void k(int p0,EventEmitterWrapper p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public void a(b p0){
       Objects.requireNonNull(p0);
       UiThreadUtil.assertOnUiThread();
       p0.h = this.a;
    }
    public String toString(){
       return "UpdateEventEmitterMountItem ["+this.b+"]";
    }
}
