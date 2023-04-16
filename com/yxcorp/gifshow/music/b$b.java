package com.yxcorp.gifshow.music.b$b;
import com.yxcorp.gifshow.music.util.a;
import com.yxcorp.gifshow.music.b;
import com.yxcorp.gifshow.music.util.a$a;
import d46.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;

public class b$b extends a	// class@001fdb
{
    public final b S;
    public final b T;

    public void b$b(b p0,a$a p1,b p2){
       this.T = p0;
       this.S = p2;
       super(p1);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "3")) {
          return;
       }
       super.h();
       this.S.a(null);
       return;
    }
    public void x(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.S.a(p0);
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       this.S.a(null);
       return;
    }
}
