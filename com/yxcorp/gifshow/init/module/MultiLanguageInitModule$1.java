package com.yxcorp.gifshow.init.module.MultiLanguageInitModule$1;
import me7.b$b;
import com.yxcorp.gifshow.init.module.MultiLanguageInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l06.b;
import q87.c;

public class MultiLanguageInitModule$1 implements b$b	// class@00198e
{
    public final MultiLanguageInitModule a;

    public void MultiLanguageInitModule$1(MultiLanguageInitModule p0){
       this.a = p0;
       super();
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, MultiLanguageInitModule$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().t(p0, p1, objArray);
       PatchProxy.onMethodExit(MultiLanguageInitModule$1.class, "1");
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, MultiLanguageInitModule$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w(p0, p1, objArray);
       PatchProxy.onMethodExit(MultiLanguageInitModule$1.class, "2");
       return;
    }
}
