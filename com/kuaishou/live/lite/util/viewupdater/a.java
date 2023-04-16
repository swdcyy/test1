package com.kuaishou.live.lite.util.viewupdater.a;
import com.kuaishou.live.lite.util.viewupdater.a$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e93.f;

public class a	// class@000ba6
{
    public final a$a a;
    public final Object b;
    public boolean c;

    public void a(a$a p0){
       super();
       this.b = new Object();
       this.c = false;
       this.a = p0;
    }
    public void a(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       f.g(this.b);
       this.a.a(p0, p1, this.b);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.c = true;
       f.g(this.b);
       return;
    }
}
