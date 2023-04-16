package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import buc.j;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PicTemplateState$e implements j	// class@001348
{
    public final String a;
    public final List b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final PicTemplateState$ResourceState f;
    public final boolean g;
    public final PicTemplate h;
    public final boolean i;

    public void PicTemplateState$e(String p0,List p1,float p2,boolean p3,boolean p4,PicTemplateState$ResourceState p5,boolean p6,PicTemplate p7,boolean p8){
       a.p(p0, "id");
       a.p(p1, "icons");
       a.p(p5, "resourceState");
       a.p(p7, "data");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public void PicTemplateState$e(String p0,List p1,float p2,boolean p3,boolean p4,PicTemplateState$ResourceState p5,boolean p6,PicTemplate p7,boolean p8,int p9,u p10){
       int i = p9;
       float f = (i & 0x04)? 0: p2;
       boolean b = (i & 0x08)? false: p3;
       boolean b1 = (i & 0x10)? false: p4;
       PicTemplateState$ResourceState uNKNOWN = (i & 0x20)? PicTemplateState$ResourceState.UNKNOWN: 0;
       PicTemplateState$ResourceState resourceStat = uNKNOWN;
       boolean b2 = (i & 0x40)? false: p6;
       boolean b3 = (i & 0x0100)? false: p8;
       super(p0, p1, f, b, b1, resourceStat, b2, p7, b3);
       return;
    }
    public static PicTemplateState$e a(PicTemplateState$e p0,String p1,List p2,float p3,boolean p4,boolean p5,PicTemplateState$ResourceState p6,boolean p7,PicTemplate p8,boolean p9,int p10,Object p11){
       PicTemplateState$e uoe = p0;
       int i = p10;
       PicTemplateState$e uoe1 = null;
       String id = (i & 0x01)? p0.getId(): uoe1;
       if (i & 0x02) {
          uoe1 = uoe.b;
       }
       PicTemplateState$e c = (i & 0x04)? uoe.c: p3;
       PicTemplateState$e d = (i & 0x08)? uoe.d: p4;
       PicTemplateState$e e = (i & 0x10)? uoe.e: p5;
       PicTemplateState$e f = (i & 0x20)? uoe.f: p6;
       PicTemplateState$e g = (i & 0x40)? uoe.g: p7;
       PicTemplateState$e h = (i & 0x0080)? uoe.h: p8;
       PicTemplateState$e i1 = (i & 0x0100)? uoe.i: p9;
       PicTemplateState$e uoe2 = PicTemplateState$e.class;
       if (PatchProxy.isSupport(uoe2)) {
          Object[] objArray = new Object[9];
          objArray[0] = id;
          objArray[1] = uoe1;
          objArray[2] = Float.valueOf(c);
          objArray[3] = Boolean.valueOf(d);
          objArray[4] = Boolean.valueOf(e);
          objArray[5] = f;
          objArray[6] = Boolean.valueOf(g);
          objArray[7] = h;
          objArray[8] = Boolean.valueOf(i1);
          uoe = PatchProxy.apply(objArray, p0, uoe2, "2");
          if (uoe != PatchProxyResult.class) {
          label_00c7 :
             return uoe;
          }
       }
       a.p(id, "id");
       a.p(uoe1, "icons");
       a.p(f, "resourceState");
       a.p(h, "data");
       p0 = new PicTemplateState$e(id, uoe1, c, d, e, f, g, h, i1);
       goto label_00c7 ;
    }
    public final PicTemplate b(){
       return this.h;
    }
    public final List c(){
       return this.b;
    }
    public final float d(){
       return this.c;
    }
    public final boolean e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateState$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateState$e && (a.g(this.getId(), p0.getId()) && (a.g(this.b, p0.b) && (!Float.compare(this.c, p0.c) && (this.d == p0.d && (this.e == p0.e && (a.g(this.f, p0.f) && (this.g == p0.g && (a.g(this.h, p0.h) && this.i == p0.i)))))))))) {
          return true;
       }
       return false;
    }
    public final PicTemplateState$ResourceState f(){
       return this.f;
    }
    public final boolean g(){
       return this.i;
    }
    public String getId(){
       return this.a;
    }
    public final boolean h(){
       return this.e;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, PicTemplateState$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getId();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PicTemplateState$e tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + Float.floatToIntBits(this.c)) * 31;
       tb = this.d;
       int i3 = 1;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.h;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       PicTemplateState$e ti = this.i;
       if (ti == null) {
          i3 = ti;
       }
       return (i1 + i3);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateState$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TemplateState\(id="+this.getId()+", icons="+this.b+", progress="+this.c+", progressVisible="+this.d+", selected="+this.e+", resourceState="+this.f+", divider="+this.g+", data="+this.h+", sameOfPlc="+this.i+"\)";
    }
}
