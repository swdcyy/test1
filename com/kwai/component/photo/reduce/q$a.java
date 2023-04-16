package com.kwai.component.photo.reduce.q$a;
import o07.d$a;
import com.kwai.component.photo.reduce.q;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;

public class q$a implements d$a	// class@000b02
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void a(int p0){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.p.setTranslationY((float)(- p0));
       return;
    }
    public void b(int p0){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.p.setTranslationY(0);
       return;
    }
}
