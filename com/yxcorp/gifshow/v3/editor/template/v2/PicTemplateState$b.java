package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import buc.j;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PicTemplateState$b implements j	// class@001345
{
    public final String a;
    public final File b;
    public final boolean c;
    public final j d;
    public final j e;
    public final j f;

    public void PicTemplateState$b(String p0,File p1,boolean p2,j p3,j p4,j p5){
       a.p(p0, "id");
       a.p(p1, "file");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public static PicTemplateState$b a(PicTemplateState$b p0,String p1,File p2,boolean p3,j p4,j p5,j p6,int p7,Object p8){
       PicTemplateState$b b;
       PicTemplateState$b c;
       PicTemplateState$b d;
       PicTemplateState$b e;
       PicTemplateState$b f;
       object oobject;
       p1 = (p7 & 0x01)? p0.getId(): null;
       if (p7 & 0x02) {
          b = p0.b;
       }
       p8 = b;
       if (p7 & 0x04) {
          c = p0.c;
       }
       PicTemplateState$b uob = c;
       if (p7 & 0x08) {
          d = p0.d;
       }
       PicTemplateState$b uob1 = d;
       if (p7 & 0x10) {
          e = p0.e;
       }
       PicTemplateState$b uob2 = e;
       if (p7 & 0x20) {
          f = p0.f;
       }
       PicTemplateState$b uob3 = f;
       Objects.requireNonNull(p0);
       b = PicTemplateState$b.class;
       if (PatchProxy.isSupport(b)) {
          Object[] objArray = new Object[]{p1,p8,Boolean.valueOf(uob),uob1,uob2,uob3};
          p0 = PatchProxy.apply(objArray, p0, b, "2");
          if (p0 != PatchProxyResult.class) {
          label_0074 :
             return p0;
          }
       }
       a.p(p1, "id");
       a.p(p8, "file");
       b = new PicTemplateState$b(p1, p8, uob, uob1, uob2, uob3);
       goto label_0074 ;
    }
    public final j b(){
       return this.f;
    }
    public final File c(){
       return this.b;
    }
    public final j d(){
       return this.d;
    }
    public final j e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateState$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateState$b && (a.g(this.getId(), p0.getId()) && (a.g(this.b, p0.b) && (this.c == p0.c && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && a.g(this.f, p0.f)))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.c;
    }
    public String getId(){
       return this.a;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, PicTemplateState$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getId();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PicTemplateState$b tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateState$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AssetState\(id="+this.getId()+", file="+this.b+", selected="+this.c+", pendingTemplate="+this.d+", previewTemplate="+this.e+", appliedTemplate="+this.f+"\)";
    }
}
