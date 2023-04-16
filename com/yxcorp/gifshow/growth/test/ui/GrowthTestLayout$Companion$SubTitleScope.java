package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import java.util.List;
import zqa.b$e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import zqa.b$b;
import zqa.b;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import msd.l;
import msd.a;
import zqa.b$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1;
import zqa.b$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$edit$model$1;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$a;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$b;
import java.lang.Long;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$c;
import java.lang.Float;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$d;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$b;
import zqa.b$d;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$editList$model$1;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$editList$model$2;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$editList$model$3;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$editList$model$4;
import java.util.Map;
import zqa.b$f;
import zqa.b$i;
import zqa.b$k;

public class GrowthTestLayout$Companion$SubTitleScope	// class@001557
{
    public final List a;
    public final b$e b;

    public void GrowthTestLayout$Companion$SubTitleScope(List p0,b$e p1){
       a.p(p0, "models");
       super();
       this.a = p0;
       this.b = p1;
    }
    public static void b(GrowthTestLayout$Companion$SubTitleScope p0,String p1,String p2,boolean p3,boolean p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = null;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(GrowthTestLayout$Companion$SubTitleScope.class) || !PatchProxy.applyVoidFourRefs(p1, p2, Boolean.valueOf(p3), Boolean.valueOf(p4), p0, GrowthTestLayout$Companion$SubTitleScope.class, "9")) {
          a.p(p1, "title");
          b$b uob = new b$b(p1, p2, p3, p4);
          GrowthTestLayout$Companion$SubTitleScope b = p0.b;
          if (b != null) {
             b.d(uob);
          }else {
             p0.a.add(uob);
          }
       }
       return;
    }
    public static void e(GrowthTestLayout$Companion$SubTitleScope p0,String p1,Comparable p2,c p3,GrowthTestLayout$Companion$a p4,int p5,Object p6){
       p0.c(p1, p2, null, p4);
    }
    public static void f(GrowthTestLayout$Companion$SubTitleScope p0,String p1,Comparable p2,c p3,String p4,int p5,Object p6){
       p0.d(p1, p2, null, p4);
    }
    public static void m(GrowthTestLayout$Companion$SubTitleScope p0,String p1,String p2,l p3,int p4,Object p5){
       p0.l(p1, p2, null);
    }
    public final void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthTestLayout$Companion$SubTitleScope.class, "4")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "onClick");
       b$a uoa = new b$a(p0, p1);
       GrowthTestLayout$Companion$SubTitleScope tb = this.b;
       if (tb != null) {
          tb.d(uoa);
       }else {
          this.a.add(uoa);
       }
       return;
    }
    public final void c(String p0,Comparable p1,c p2,GrowthTestLayout$Companion$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, GrowthTestLayout$Companion$SubTitleScope.class, "6")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "example");
       a.p(p3, "handler");
       b$c uoc = new b$c(p0, new GrowthTestLayout$Companion$SubTitleScope$edit$model$1(p3), new GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1(p3, p1, p2));
       GrowthTestLayout$Companion$SubTitleScope tb = this.b;
       if (tb != null) {
          tb.d(uoc);
       }else {
          this.a.add(uoc);
       }
       return;
    }
    public final void d(String p0,Comparable p1,c p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, GrowthTestLayout$Companion$SubTitleScope.class, "5")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "example");
       a.p(p3, "testKey");
       if (p1 instanceof String) {
          this.c(p0, "", p2, new GrowthTestLayout$Companion$SubTitleScope$a(p3));
       }else if(p1 instanceof Integer){
          this.c(p0, Integer.valueOf(1), p2, new GrowthTestLayout$Companion$SubTitleScope$b(p3));
       }else if(p1 instanceof Long){
          this.c(p0, Long.valueOf(1), p2, new GrowthTestLayout$Companion$SubTitleScope$c(p3));
       }else if(p1 instanceof Float){
          this.c(p0, Float.valueOf(0x3f800000), p2, new GrowthTestLayout$Companion$SubTitleScope$d(p3));
       }
       return;
    }
    public final void g(String p0,GrowthTestLayout$Companion$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthTestLayout$Companion$SubTitleScope.class, "7")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "handler");
       b$d uod = new b$d(p0, new GrowthTestLayout$Companion$SubTitleScope$editList$model$1(p1), new GrowthTestLayout$Companion$SubTitleScope$editList$model$2(p1), new GrowthTestLayout$Companion$SubTitleScope$editList$model$3(p1), new GrowthTestLayout$Companion$SubTitleScope$editList$model$4(p1));
       GrowthTestLayout$Companion$SubTitleScope tb = this.b;
       if (tb != null) {
          tb.d(v0);
       }else {
          this.a.add(v0);
       }
       return;
    }
    public final List h(){
       return this.a;
    }
    public final b$e i(){
       return this.b;
    }
    public final void j(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthTestLayout$Companion$SubTitleScope.class, "3")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "key");
       a.p(p2, "map");
       b$f uof = new b$f(p0, p1, p2);
       GrowthTestLayout$Companion$SubTitleScope tb = this.b;
       if (tb != null) {
          tb.d(uof);
       }else {
          this.a.add(uof);
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, GrowthTestLayout$Companion$SubTitleScope.class, "1")) {
          return;
       }
       b$i oi = new b$i();
       GrowthTestLayout$Companion$SubTitleScope tb = this.b;
       if (tb != null) {
          tb.d(oi);
       }else {
          this.a.add(oi);
       }
       return;
    }
    public final void l(String p0,String p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthTestLayout$Companion$SubTitleScope.class, "2")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "key");
       b$k ok = new b$k(p0, p1, p2);
       GrowthTestLayout$Companion$SubTitleScope tb = this.b;
       if (tb != null) {
          tb.d(ok);
       }else {
          this.a.add(ok);
       }
       return;
    }
}
