package com.kuaishou.commercial.tach.container.KwaiTKContainer$b$a;
import zw4.a$a;
import java.lang.String;
import java.lang.Integer;
import tx4.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b;

public final class KwaiTKContainer$b$a implements a$a	// class@001678
{
    public final String a;
    public final Integer b;
    public final boolean c;
    public final f d;

    public void KwaiTKContainer$b$a(String p0,Integer p1,boolean p2,f p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, KwaiTKContainer$b$a.class, "1")) {
          return;
       }
       KwaiTKContainer.U0.b(this.a, this.b, this.c, this.d);
       return;
    }
}
