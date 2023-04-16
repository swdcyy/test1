package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import tvc.e;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.util.Collection;
import java.lang.Iterable;
import buc.j;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PicTemplateState extends e	// class@001349
{
    public final int a;
    public final PicTemplateState$b b;
    public final int c;
    public final PicTemplateState$e d;
    public final boolean e;
    public final List f;
    public final PicTemplateState$ResourceState g;
    public final List h;
    public final List i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final PicTemplateState$a q;
    public final Workspace$Type r;
    public final PicTemplateState$c s;

    public void PicTemplateState(List p0,PicTemplateState$ResourceState p1,List p2,List p3,boolean p4,boolean p5,boolean p6,int p7,int p8,int p9,int p10,PicTemplateState$a p11,Workspace$Type p12,PicTemplateState$c p13){
       a.p(p0, "assets");
       a.p(p1, "templateState");
       a.p(p2, "templateGroups");
       a.p(p3, "templates");
       a.p(p11, "applyAllState");
       a.p(p12, "workspaceType");
       a.p(p13, "logger");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
       this.l = p6;
       this.m = p7;
       this.n = p8;
       this.o = p9;
       this.p = p10;
       this.q = p11;
       this.r = p12;
       this.s = p13;
       Iterator iterator = p0.iterator();
       boolean b = false;
       int i = 0;
       while (true) {
          int i1 = -1;
          if (iterator.hasNext()) {
             if (iterator.next().f()) {
             label_0060 :
                this.a = i;
                this.b = CollectionsKt___CollectionsKt.F2(this.f, i);
                iterator = this.i.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   if (iterator.next().h()) {
                      i1 = i;
                   }else {
                      i++;
                   }
                }
                this.c = i1;
                PicTemplateState$e uoe = CollectionsKt___CollectionsKt.F2(this.i, i1);
                this.d = uoe;
                if (uoe != null) {
                   PicTemplateState tf = this.f;
                   if (!tf instanceof Collection || !tf.isEmpty()) {
                      iterator = tf.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            j oj = iterator.next().e();
                            String id = (oj != null)? oj.getId(): null;
                            int i2 = a.g(id, this.d.getId()) ^ 1;
                            if (i2) {
                               tf = 1;
                            }else {
                               continue ;
                            }
                         }
                      }
                      if (tf) {
                         b = true;
                      }
                   }
                   tf = 0;
                   goto label_00d1 ;
                }
             }else {
                i++;
             }
          }else {
             i = -1;
             goto label_0060 ;
          }
       }
       this.e = b;
       return;
    }
    public static PicTemplateState a(PicTemplateState p0,List p1,PicTemplateState$ResourceState p2,List p3,List p4,boolean p5,boolean p6,boolean p7,int p8,int p9,int p10,int p11,PicTemplateState$a p12,Workspace$Type p13,PicTemplateState$c p14,int p15,Object p16){
       PicTemplateState picTemplateS1;
       PicTemplateState picTemplateS2;
       PicTemplateState picTemplateS = p0;
       int i = p15;
       PicTemplateState f = (i & 0x01)? picTemplateS.f: p1;
       PicTemplateState g = (i & 0x02)? picTemplateS.g: p2;
       PicTemplateState h = (i & 0x04)? picTemplateS.h: p3;
       PicTemplateState i1 = (i & 0x08)? picTemplateS.i: p4;
       PicTemplateState j = (i & 0x10)? picTemplateS.j: p5;
       PicTemplateState k = (i & 0x20)? picTemplateS.k: p6;
       PicTemplateState l = (i & 0x40)? picTemplateS.l: p7;
       PicTemplateState m = (i & 0x0080)? picTemplateS.m: p8;
       PicTemplateState n = (i & 0x0100)? picTemplateS.n: p9;
       PicTemplateState o = (i & 0x0200)? picTemplateS.o: p10;
       PicTemplateState p = (i & 0x0400)? picTemplateS.p: p11;
       PicTemplateState q = (i & 0x0800)? picTemplateS.q: p12;
       PicTemplateState r = (i & 0x1000)? picTemplateS.r: p13;
       PicTemplateState s = (i & 0x2000)? picTemplateS.s: p14;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(PicTemplateState.class)) {
          Object[] objArray = new Object[14];
          objArray[0] = f;
          objArray[1] = g;
          objArray[2] = h;
          objArray[3] = i1;
          objArray[4] = Boolean.valueOf(j);
          objArray[5] = Boolean.valueOf(k);
          objArray[6] = Boolean.valueOf(l);
          objArray[7] = Integer.valueOf(m);
          objArray[8] = Integer.valueOf(n);
          objArray[9] = Integer.valueOf(o);
          objArray[10] = Integer.valueOf(p);
          objArray[11] = q;
          objArray[12] = r;
          objArray[13] = s;
          picTemplateS1 = p;
          picTemplateS2 = o;
          picTemplateS = PatchProxy.apply(objArray, p0, PicTemplateState.class, "1");
          if (picTemplateS != PatchProxyResult.class) {
          label_013e :
             return picTemplateS;
          }
       }else {
          picTemplateS2 = o;
          picTemplateS1 = p;
       }
       a.p(f, "assets");
       a.p(g, "templateState");
       a.p(h, "templateGroups");
       a.p(i1, "templates");
       a.p(q, "applyAllState");
       a.p(r, "workspaceType");
       a.p(s, "logger");
       p0 = new PicTemplateState(f, g, h, i1, j, k, l, m, n, picTemplateS2, picTemplateS1, q, r, s);
       goto label_013e ;
    }
    public final boolean b(){
       return this.e;
    }
    public final PicTemplateState$a c(){
       return this.q;
    }
    public final List d(){
       return this.f;
    }
    public final boolean e(){
       return this.k;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateState.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateState && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && (a.g(this.i, p0.i) && (this.j == p0.j && (this.k == p0.k && (this.l == p0.l && (this.m == p0.m && (this.n == p0.n && (this.o == p0.o && (this.p == p0.p && (a.g(this.q, p0.q) && (a.g(this.r, p0.r) && a.g(this.s, p0.s)))))))))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.n;
    }
    public final int g(){
       return this.p;
    }
    public final int h(){
       return this.m;
    }
    public int hashCode(){
       PicTemplateState obj = PatchProxy.apply(null, this, PicTemplateState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PicTemplateState tg = this.g;
       int i2 = (tg != null)? tg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tg = this.h;
       i2 = (tg != null)? tg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tg = this.i;
       i2 = (tg != null)? tg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tg = this.j;
       int i3 = 1;
       if (tg != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tg = this.k;
       if (tg != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tg = this.l;
       if (tg == null) {
          i3 = tg;
       }
       i1 = (((((((((i1 + i3) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31;
       tg = this.q;
       i2 = (tg != null)? tg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tg = this.r;
       i2 = (tg != null)? tg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tg = this.s;
       if (tg != null) {
          i = tg.hashCode();
       }
       return (i1 + i);
    }
    public final int i(){
       return this.o;
    }
    public final PicTemplateState$c j(){
       return this.s;
    }
    public final boolean k(){
       return this.j;
    }
    public final PicTemplateState$b l(){
       return this.b;
    }
    public final int m(){
       return this.a;
    }
    public final PicTemplateState$e n(){
       return this.d;
    }
    public final int o(){
       return this.c;
    }
    public final List p(){
       return this.h;
    }
    public final PicTemplateState$ResourceState q(){
       return this.g;
    }
    public final List r(){
       return this.i;
    }
    public final Workspace$Type s(){
       return this.r;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PicTemplateState\(assets="+this.f+", templateState="+this.g+", templateGroups="+this.h+", templates="+this.i+", processing="+this.j+", editing="+this.k+", released="+this.l+", initSelectedAssetFlag="+this.m+", focusSelectedAssetFlag="+this.n+", initSelectedTemplateFlag="+this.o+", focusSelectedTemplateFlag="+this.p+", applyAllState="+this.q+", workspaceType="+this.r+", logger="+this.s+"\)";
    }
}
