package com.kuaishou.live.livestage.basic.LayoutConfig;
import fe3.b;
import fe3.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import fe3.g;
import java.util.zip.CRC32;
import zsd.d;
import java.util.Objects;
import java.nio.charset.Charset;
import com.kuaishou.live.livestage.basic.LayoutConfig$toString$1$1;
import java.lang.Appendable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LayoutConfig	// class@000be1
{
    public final b a;
    public final a b;
    public final List c;
    public final int d;

    public void LayoutConfig(b p0,a p1,List p2,int p3){
       a.p(p0, "biz");
       a.p(p1, "size");
       a.p(p2, "windows");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void LayoutConfig(b p0,a p1,List p2,int p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = -1;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static LayoutConfig a(LayoutConfig p0,b p1,a p2,List p3,int p4,int p5,Object p6){
       LayoutConfig b;
       LayoutConfig c;
       LayoutConfig d;
       LayoutConfig a = (p5 & 0x01)? p0.a: null;
       if (p5 & 0x02) {
          b = p0.b;
       }
       if (p5 & 0x04) {
          c = p0.c;
       }
       if (p5 & 0x08) {
          d = p0.d;
       }
       if (PatchProxy.isSupport(LayoutConfig.class)) {
          p0 = PatchProxy.applyFourRefs(a, b, c, Integer.valueOf(d), p0, LayoutConfig.class, "3");
          if (p0 != PatchProxyResult.class) {
          label_004d :
             return p0;
          }
       }
       a.p(a, "biz");
       a.p(b, "size");
       a.p(c, "windows");
       p0 = new LayoutConfig(a, b, c, d);
       goto label_004d ;
    }
    public final b b(){
       return this.a;
    }
    public final int c(){
       return this.d;
    }
    public final a d(){
       return this.b;
    }
    public final List e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LayoutConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LayoutConfig && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public final long f(){
       Iterator obj = PatchProxy.apply(null, this, LayoutConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       StringBuilder str = this.a.a();
       obj = this.c.iterator();
       while (obj.hasNext()) {
          e uoe = obj.next();
          str = str+uoe.e().c()+uoe.e().d()+uoe.e().b()+uoe.e().a();
       }
       String str1 = str;
       a.o(str1, "windows.fold\(StringBuild¡­.height\)\n    }.toString\(\)");
       CRC32 uCRC32 = new CRC32();
       Objects.requireNonNull(str1, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = str1.getBytes(d.a);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       uCRC32.update(bytes);
       return uCRC32.getValue();
    }
    public int hashCode(){
       LayoutConfig obj = PatchProxy.apply(null, this, LayoutConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LayoutConfig tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (((i1 + i) * 31) + this.d);
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, LayoutConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "LayoutConfig\(";
       a.o(obj, "append\(value\)");
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       obj = obj+"  biz=";
       a.o(obj, "append\(\"  biz=\"\)");
       obj = obj+this.a;
       a.o(obj, "append\(value\)");
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       obj = obj+"  size=";
       a.o(obj, "append\(\"  size=\"\)");
       obj = obj+this.b;
       a.o(obj, "append\(value\)");
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       obj = obj+"  windows:";
       a.o(obj, "append\(value\)");
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       CollectionsKt___CollectionsKt.T2(this.c, obj, "\n", null, null, 0, null, LayoutConfig$toString$1$1.INSTANCE, 60, null);
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       obj = obj+"  type=";
       a.o(obj, "append\(\"  type=\"\)");
       obj = obj+this.d;
       a.o(obj, "append\(value\)");
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       obj = obj+"\)";
       a.o(obj, "append\(value\)");
       obj = obj+10;
       a.o(obj, "append\(\'\\n\'\)");
       obj = obj;
       a.o(obj, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return obj;
    }
}
