package com.kuaishou.cover.Link$b;
import java.lang.Runnable;
import com.kuaishou.cover.Link;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d30.c;
import a30.d;

public class Link$b implements Runnable	// class@0016ce
{
    public final Link b;

    public void Link$b(Link p0){
       this.b = p0;
       super();
    }
    public void run(){
       Link c;
       if (PatchProxy.applyVoid(null, this, Link$b.class, "1")) {
          return;
       }
       c.d("link close");
       c = this.b.c;
       if (c != null) {
          c.a(false);
       }
       return;
    }
}
