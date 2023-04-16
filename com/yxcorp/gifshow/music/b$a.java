package com.yxcorp.gifshow.music.b$a;
import com.yxcorp.gifshow.music.util.a;
import com.yxcorp.gifshow.music.b;
import com.yxcorp.gifshow.music.util.a$a;
import d46.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;

public class b$a extends a	// class@001fda
{
    public final c S;
    public final b T;

    public void b$a(b p0,a$a p1,c p2){
       this.T = p0;
       this.S = p2;
       super(p1);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b$a tS = this.S;
       if (tS != null) {
          tS.onCancelled();
       }
       super.h();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tS = this.S;
       if (tS != null) {
          tS.b();
       }
       super.k();
       return;
    }
    public void x(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       b$a tS = this.S;
       if (tS != null) {
          tS.a(p0);
       }
       super.x(p0);
       return;
    }
}
