package de.j;
import de.f;
import java.lang.Object;
import ce.b;
import ce.b$a;
import android.view.View;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class j implements f	// class@001e43
{
    public final int a;
    public final int b;

    public void j(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0){
       j ta = this.a;
       j tb = this.b;
       b$a uoa = p0.f(ta);
       if (uoa.d == null) {
          throw new IllegalStateException("Unable to find viewState manager for tag "+ta);
       }
       uoa = uoa.a;
       if (uoa == null) {
          throw new IllegalStateException("Unable to find viewState view for tag "+ta);
       }
       uoa.sendAccessibilityEvent(tb);
       return;
    }
    public String toString(){
       return "SendAccessibilityEvent ["+this.a+"] "+this.b;
    }
}
