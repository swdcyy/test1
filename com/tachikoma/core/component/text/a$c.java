package com.tachikoma.core.component.text.a$c;
import java.lang.Runnable;
import com.tachikoma.core.component.text.a$d;
import android.graphics.Typeface;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$c implements Runnable	// class@000d96
{
    public final a$d b;
    public final Typeface c;

    public void a$c(a$d p0,Typeface p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       a$c tb = this.b;
       if (tb != null) {
          tb.a(this.c);
       }
       return;
    }
}
