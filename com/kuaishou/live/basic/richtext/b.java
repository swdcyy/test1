package com.kuaishou.live.basic.richtext.b;
import java.lang.Object;
import bc.b;
import android.text.style.ReplacementSpan;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class b	// class@000d01
{
    public final b a;

    public void b(){
       super();
       this.a = new b();
    }
    public void a(ReplacementSpan p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       this.b("\x27\x02\x00");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "5")) {
          this.d(p0, (this.c() - 1), this.c());
       }
       return;
    }
    public void b(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.a.append(p0);
       return;
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.length();
    }
    public final void d(Object p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "6")) {
          return;
       }
       this.a.setSpan(p0, p1, p2, 33);
       return;
    }
}
