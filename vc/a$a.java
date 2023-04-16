package vc.a$a;
import com.facebook.common.references.a$c;
import vc.a;
import xc.a;
import java.lang.Object;
import com.facebook.common.references.SharedReference;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import cb.a;

public class a$a implements a$c	// class@002683
{
    public final a a;
    public final a b;

    public void a$a(a p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return this.a.c();
    }
    public void b(SharedReference p0,Throwable p1){
       String str;
       this.a.a(p0, p1);
       String obj = p0.c();
       obj = (obj != null)? obj.getClass().getName(): "<value is null>";
       Object[] objArray = new Object[4];
       objArray[0] = Integer.valueOf(System.identityHashCode(this));
       objArray[1] = Integer.valueOf(System.identityHashCode(p0));
       objArray[2] = obj;
       int i = 3;
       if (p1 == null) {
          str = "";
       }else {
          StringWriter stringWriter = new StringWriter();
          p1.printStackTrace(new PrintWriter(stringWriter));
          str = stringWriter.toString();
       }
       objArray[i] = str;
       a.z("Fresco", "Finalized without closing: %x %x \(type = %s\).\nStack:\n%s", objArray);
       return;
    }
}
