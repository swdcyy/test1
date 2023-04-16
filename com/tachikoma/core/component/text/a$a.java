package com.tachikoma.core.component.text.a$a;
import java.lang.Runnable;
import java.lang.String;
import com.tachikoma.core.component.text.a$d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hp8.e;
import android.graphics.Typeface;
import com.tachikoma.core.component.text.a;

public final class a$a implements Runnable	// class@000d94
{
    public final String b;
    public final a$d c;

    public void a$a(String p0,a$d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a.a(this.c, e.c().g(this.b, 0));
       return;
    }
}
