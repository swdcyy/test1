package com.google.common.io.b;
import java.lang.Object;
import java.io.Writer;
import java.lang.CharSequence;
import ok.n;
import com.google.common.io.c;
import com.google.common.io.c$c;
import java.util.Deque;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.Class;
import com.google.common.base.b;
import java.lang.RuntimeException;

public abstract class b	// class@0018e6
{

    public void b(){
       super();
    }
    public abstract Writer a();
    public void b(CharSequence p0){
       n.j(p0);
       c uoc = new c(c.e);
       Writer writer = this.a();
       uoc.c.addFirst(writer);
       writer.append(p0);
       writer.flush();
       uoc.close();
    }
}
