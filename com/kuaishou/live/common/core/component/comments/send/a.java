package com.kuaishou.live.common.core.component.comments.send.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$n;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import dk5.b;
import z47.d;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jl5.f;
import android.text.Editable;
import pf1.e;
import java.lang.CharSequence;
import ok.o;
import rf1.a;
import java.lang.Character;

public class a implements BaseEditorFragment$n	// class@0010ce
{
    public final b a;
    public final int b;
    public f c;
    public static final Pattern d;

    static {
       a.d = Pattern.compile("\(\\[[^]]*]\)");
    }
    public void a(int p0,boolean p1){
       super();
       this.a = b.e();
       this.c = null;
       this.b = p0 * 2;
       if (p1) {
          this.c = new d();
       }
       return;
    }
    public static boolean b(a p0,String p1){
       boolean b;
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.applyOneRefs(p1, p0, a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!p0.a.a(p1)){
          p0 = p0.c;
          if (p0 == null || !p0.c(p1)) {
             b = false;
          }
       }
       b = true;
       return b;
    }
    public boolean a(Editable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.length() > this.b) {
          int i1 = a.a(p0, a.d, new e(this));
          int i2 = 1;
          while (i1 > this.b) {
             i = p0.length() - i2;
             if (Character.isLowSurrogate(p0.charAt(i))) {
                i = p0.length() - 2;
                p0.delete(i, p0.length());
             }else {
                i = p0.length() - i2;
                p0.delete(i, p0.length());
             }
             i1 = a.a(p0, a.d, new e(this));
             i = 1;
          }
       }
       return i;
    }
}
