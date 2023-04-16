package com.kuaishou.live.lite.util.viewupdater.a$c;
import com.kuaishou.live.lite.util.viewupdater.a$a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.util.viewupdater.b;
import e93.f;

public class a$c implements a$a	// class@000ba5
{
    public LiveLiteScatterLoadManager a;

    public void a$c(LiveLiteScatterLoadManager p0){
       super();
       this.a = p0;
    }
    public void a(String p0,Runnable p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$c.class, "1")) {
          return;
       }
       f.i("name", new b(this, p0, p1), p2);
       return;
    }
}
