package com.yxcorp.gifshow.ad.half.b$a;
import a2.a;
import com.yxcorp.gifshow.ad.half.b;
import android.view.View;
import b2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b$a extends a	// class@001782
{
    public final b d;

    public void b$a(b p0){
       this.d = p0;
       super();
    }
    public void f(View p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "1")) {
          return;
       }
       super.f(p0, p1);
       if (this.d.f != null) {
          p1.a(0x100000);
          p1.g0(true);
       }else {
          p1.g0(false);
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       b$a obj;
       if (PatchProxy.isSupport(b$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 == 0x100000) {
          obj = this.d;
          if (obj.f != null) {
             obj.cancel();
             return true;
          }
       }
       return super.h(p0, p1, p2);
    }
}
