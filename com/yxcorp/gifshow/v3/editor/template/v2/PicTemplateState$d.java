package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$d;
import buc.j;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PicTemplateState$d implements j	// class@001347
{
    public final String a;
    public final String b;
    public final int c;

    public void PicTemplateState$d(String p0,String p1,int p2){
       a.p(p0, "id");
       a.p(p1, "title");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int a(){
       return this.c;
    }
    public final String b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateState$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateState$d && (a.g(this.getId(), p0.getId()) && (a.g(this.b, p0.b) && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public String getId(){
       return this.a;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, PicTemplateState$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getId();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PicTemplateState$d tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (((i1 + i) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateState$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TemplateGroupState\(id="+this.getId()+", title="+this.b+", itemCount="+this.c+"\)";
    }
}
