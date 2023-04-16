package com.kwai.emotion.adapter.match.search.f$a;
import pk5.b;
import com.kwai.emotion.adapter.match.search.f;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotion.adapter.match.search.e;

public class f$a extends b	// class@000d6b
{
    public final f h;

    public void f$a(f p0,long p1,int p2){
       this.h = p0;
       super(p1, p2);
    }
    public void a(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.h.z = (p0.toString()).trim();
       f$a th = this.h;
       th.w.i2(th.z);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       f$a th = this.h;
       th.z = "";
       th.w.i2("");
       return;
    }
    public void c(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       this.h.z = (p0.toString()).trim();
       f$a th = this.h;
       th.w.i2(th.z);
       return;
    }
}
