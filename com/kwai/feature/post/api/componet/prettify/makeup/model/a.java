package com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;

public class a	// class@001303
{
    public String a;
    public String b;
    public final List c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;

    public void a(){
       super();
       this.c = new ArrayList();
    }
    public Object clone(){
       a uoa;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          uoa = obj;
       }else {
          try{
             obj = super.clone();
             obj.c.clear();
             obj.c.addAll(this.c);
             uoa = obj;
          }catch(java.lang.CloneNotSupportedException e0){
          }
       }
       return uoa;
    }
    public boolean equals(Object p0){
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || (uoa == p0.getClass() && (this.d == p0.d && (this.e == p0.e && (!TextUtils.equals(this.a, p0.a) || this.c.size() != p0.c.size()))))) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= this.c.size()) {
             return true;
          }
          if (this.c.get(i) != p0.c.get(i)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.hashCode();
    }
}
