package com.yxcorp.gifshow.ad.AdProcess$g;
import erd.g;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import vq4.d;

public final class AdProcess$g implements g	// class@0014e5
{
    public final String b;

    public void AdProcess$g(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess$g.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          if (!TextUtils.isEmpty(this.b)) {
             p0.K0 = this.b;
          }
       }
       return;
    }
}
