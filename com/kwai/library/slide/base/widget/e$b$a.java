package com.kwai.library.slide.base.widget.e$b$a;
import android.util.Property;
import com.kwai.library.slide.base.widget.e$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.library.slide.base.widget.e;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;

public class e$b$a extends Property	// class@0008fe
{
    public final e a;
    public final e$b b;

    public void e$b$a(e$b p0,Class p1,String p2,e p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public Object get(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e$b$a.class, "2");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = Float.valueOf(this.b.d.l);
       }
       return p0;
    }
    public void set(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$b$a.class, "1")) {
       }else {
          this.b.d.k(p1.floatValue());
       }
       return;
    }
}
