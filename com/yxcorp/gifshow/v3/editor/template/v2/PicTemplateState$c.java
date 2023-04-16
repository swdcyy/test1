package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import java.util.Set;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import trd.d1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PicTemplateState$c	// class@001346
{
    public final Set a;

    public void PicTemplateState$c(){
       super(null, 1, null);
    }
    public void PicTemplateState$c(Set p0){
       a.p(p0, "shownTemplates");
       super();
       this.a = p0;
    }
    public void PicTemplateState$c(Set p0,int p1,u p2){
       p0 = (p1 & 0x01)? d1.k(): null;
       super(p0);
       return;
    }
    public final PicTemplateState$c a(Set p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateState$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "shownTemplates");
       return new PicTemplateState$c(p0);
    }
    public final Set b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateState$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateState$c && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PicTemplateState$c obj = PatchProxy.apply(null, this, PicTemplateState$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateState$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoggerState\(shownTemplates="+this.a+"\)";
    }
}
