package com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;

public class a$a	// class@001302
{
    public String a;
    public String b;
    public String c;
    public String d;
    public float e;
    public MakeupMaterial f;
    public String g;

    public void a$a(){
       super();
    }
    public boolean equals(Object p0){
       a$a uoa = a$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       if (Float.compare(p0.e, this.e) || (!TextUtils.equals(this.a, p0.a) || (!TextUtils.equals(this.b, p0.b) || (!TextUtils.equals(this.c, p0.c) || (!TextUtils.equals(this.d, p0.d) || this.f != p0.f))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.hashCode();
    }
}
