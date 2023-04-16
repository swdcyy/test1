package com.kwai.component.saber.executor.d;
import com.kwai.component.saber.executor.g$b;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.saber.executor.e;
import fg6.a;
import rg5.b;
import java.lang.Class;
import com.google.gson.Gson;
import java.util.Map;
import com.kwai.component.saber.executor.e$b;

public final class d implements g$b	// class@000b2e
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void a(String p0){
       b uob = a.a.h(p0, b.class);
       if (uob == null) {
       }else if(e.g.containsKey(uob.mType)){
          e.g.get(uob.mType).a(uob);
       }
       return;
    }
}
