package com.yxcorp.gifshow.v3.editor.cover.proportion.a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedHashSet;

public final class a$a implements Runnable	// class@000eb3
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       tb.s.remove(tb);
       return;
    }
}
