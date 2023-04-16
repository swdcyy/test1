package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class PicTemplateState$a	// class@001344
{
    public final boolean a;
    public final boolean b;

    public void PicTemplateState$a(){
       super(false, false, 3, null);
    }
    public void PicTemplateState$a(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void PicTemplateState$a(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final PicTemplateState$a a(boolean p0,boolean p1){
       PicTemplateState$a uoa = PicTemplateState$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PicTemplateState$a(p0, p1);
    }
    public final boolean b(){
       return this.b;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PicTemplateState$a && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PicTemplateState$a ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       PicTemplateState$a tb = this.b;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateState$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ApplyAllState\(requestConfirmed="+this.a+", applyAllConfirmed="+this.b+"\)";
    }
}
