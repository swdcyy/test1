package com.yxcorp.gifshow.v3.editor.cover.proportion.a$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ooc.g1;

public final class a$c implements Runnable	// class@000eb5
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$c.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, g1.class, "42")) {
          g1.e("", "RECOMMEND_COVER");
       }
       return;
    }
}
