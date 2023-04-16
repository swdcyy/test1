package com.kuaishou.live.lite.util.viewupdater.a$b;
import com.kuaishou.live.lite.util.viewupdater.a$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e93.f;

public class a$b implements a$a	// class@000ba4
{

    public void a$b(){
       super();
    }
    public void a(String p0,Runnable p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "1")) {
          return;
       }
       f.i(p0, p1, p2);
       return;
    }
}
