package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Comparable;
import zqa.c;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Integer;
import java.lang.StringBuilder;
import e17.i;
import java.lang.Long;
import java.lang.Float;

public final class GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1 extends Lambda implements l	// class@001552
{
    public final Comparable $example;
    public final GrowthTestLayout$Companion$a $handler;
    public final c $range;

    public void GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1(GrowthTestLayout$Companion$a p0,Comparable p1,c p2){
       this.$handler = p0;
       this.$example = p1;
       this.$range = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       boolean i;
       Comparable uComparable;
       Long longx1;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1.class, "1")) {
          return;
       }
       a.p(p0, "content");
       Object obj = null;
       if (u.S1(p0)) {
          this.$handler.a(obj);
       }else {
          try{
             GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1 t$example = this.$example;
             String str = " 之间的整数";
             if (t$example instanceof Integer) {
                i = Integer.parseInt(p0);
                Integer integer = Integer.valueOf(i);
                GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1 t$range = this.$range;
                i = (t$range != null)? t$range.a(integer): new c(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE)).a(Integer.valueOf(i));
                if (!i) {
                   i = "请输入 ";
                   t$example = this.$range;
                   if (t$example != null) {
                      uComparable = t$example.b();
                      if (uComparable != null) {
                      label_0072 :
                         i = i+uComparable+" 到 ";
                         t$example = this.$range;
                         if (t$example != null) {
                            uComparable = t$example.c();
                            if (uComparable != null) {
                            label_0087 :
                               a.o(i.d(R.style.arg_RES_7f110668, i+uComparable+str), "KSToast.applyStyle\(R.sty…tyle_toast_failed, alert\)");
                            }
                         }
                         integer = Integer.valueOf(Integer.MAX_VALUE);
                         goto label_0087 ;
                      }
                   }
                   uComparable = Integer.valueOf(0);
                   goto label_0072 ;
                }else {
                   this.$handler.a(integer);
                }
             }else if(t$example instanceof Long){
                long l = Long.parseLong(p0);
                Long longx = Long.valueOf(l);
                GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1 t$range1 = this.$range;
                boolean b = (t$range1 != null)? t$range1.a(longx): new c(Long.valueOf(0), Long.valueOf(Long.MAX_VALUE)).a(Long.valueOf(l));
                if (!b) {
                   longx = "请输入 ";
                   t$example = this.$range;
                   if (t$example != null) {
                      uComparable = t$example.b();
                      if (uComparable != null) {
                      label_00f8 :
                         longx = longx+uComparable+" 到 ";
                         t$example = this.$range;
                         if (t$example != null) {
                            uComparable = t$example.c();
                            if (uComparable != null) {
                            label_010d :
                               a.o(i.d(R.style.arg_RES_7f110668, longx+uComparable+str), "KSToast.applyStyle\(R.sty…tyle_toast_failed, alert\)");
                            }
                         }
                         longx1 = Long.valueOf(Long.MAX_VALUE);
                         goto label_010d ;
                      }
                   }
                   longx1 = Long.valueOf(0);
                   goto label_00f8 ;
                }else {
                   this.$handler.a(longx);
                }
             }else if(t$example instanceof Float){
                float f = Float.parseFloat(p0);
                Float uFloat = Float.valueOf(f);
                GrowthTestLayout$Companion$SubTitleScope$edit$wrapOnSave$1 t$range2 = this.$range;
                i = (t$range2 != null)? t$range2.a(uFloat): new c(Float.valueOf(0), Float.valueOf(Float.MAX_VALUE)).a(Float.valueOf(f));
                if (!i) {
                   i = "请输入 ";
                   t$example = this.$range;
                   if (t$example != null) {
                      uComparable = t$example.b();
                      if (uComparable != null) {
                      label_017b :
                         i = i+uComparable+" 到 ";
                         t$example = this.$range;
                         if (t$example != null) {
                            uComparable = t$example.c();
                            if (uComparable != null) {
                            label_0190 :
                               a.o(i.d(R.style.arg_RES_7f110668, i+uComparable+" 之间的小数"), "KSToast.applyStyle\(R.sty…tyle_toast_failed, alert\)");
                            }
                         }
                         uFloat = Float.valueOf(Float.MAX_VALUE);
                         goto label_0190 ;
                      }
                   }
                   uFloat = Float.valueOf(0);
                   goto label_017b ;
                }else {
                   this.$handler.a(uFloat);
                }
             }else {
                t$example = this.$handler;
                if (!p0 instanceof Comparable) {
                   p0 = obj;
                }
                t$example.a(p0);
             }
          }catch(java.lang.Exception e0){
             a.o(i.d(R.style.arg_RES_7f110668, "请输入整数: \n-2147483648 到 2147483647"), "KSToast.applyStyle\(R.sty…LUE} 到 ${Int.MAX_VALUE}\"\)");
          }
       }
    }
}
