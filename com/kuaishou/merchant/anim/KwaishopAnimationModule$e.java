package com.kuaishou.merchant.anim.KwaishopAnimationModule$e;
import hf.a$b;
import com.kuaishou.merchant.anim.KwaishopAnimationModule;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e$a;
import la4.b;
import crd.b;
import la4.l;

public final class KwaishopAnimationModule$e implements a$b	// class@0014e6
{
    public final KwaishopAnimationModule a;
    public final String b;
    public final String c;
    public final String d;

    public void KwaishopAnimationModule$e(KwaishopAnimationModule p0,String p1,String p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public String a(){
       return this.b;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule$e.class, "1")) {
          return;
       }
       l.a(this.a.getCurrentActivity(), new KwaishopAnimationModule$e$a(this, p0), false);
       return;
    }
}
