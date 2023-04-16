package com.tachikoma.core.component.text.a;
import java.lang.Object;
import com.tachikoma.core.component.text.a$d;
import android.graphics.Typeface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.text.a$c;
import java.lang.Runnable;
import iq8.x;
import android.content.Context;
import hp8.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import com.tachikoma.core.component.text.a$a;
import iq8.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.component.text.a$b;
import no8.e;
import hp8.c;
import oo8.e;
import java.util.Objects;
import oo8.a;

public class a	// class@000d98
{

    public void a(){
       super();
    }
    public static void a(a$d p0,Typeface p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       x.f(new a$c(p0, p1));
       return;
    }
    public static void b(Context p0,String p1,String p2,a$d p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "1")) {
          return;
       }
       a$b obj = PatchProxy.applyTwoRefs(p0, p2, null, d.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): d.a(p0, p2).exists();
       if (b) {
          o.a(new a$a(p2, p3));
          return;
       }else if(TextUtils.isEmpty(p1)){
          return;
       }else {
          obj = new a$b(p2, p3);
          if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, obj, null, d.class, "1")) {
             e uoe = e.b();
             File uFile = d.a(p0, p2);
             c uoc = new c(obj);
             Objects.requireNonNull(uoe);
             if (!PatchProxy.applyVoidThreeRefs(p1, uFile, uoc, uoe, e.class, "10")) {
                uoe = uoe.j;
                if (uoe != null) {
                   uoe.a(p1, uFile, uoc);
                }
             }
          }
          return;
       }
    }
}
