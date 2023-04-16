package com.kuaishou.live.common.core.component.chat.b$b;
import sfc.a;
import com.kuaishou.live.common.core.component.chat.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;

public class b$b extends a	// class@001039
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       super.b(p0);
       b$b tc = this.c;
       b j = tc.j;
       if (j != null) {
          j.f = p0;
          tc.close(4);
       }
       return;
    }
}
