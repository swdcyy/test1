package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import vqa.k;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qrd.l1;
import e17.i;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import java.util.Map;

public abstract class GrowthTestLayout$Companion$c implements GrowthTestLayout$Companion$b	// class@00155b
{
    public String a;
    public List b;
    public final String c;

    public void GrowthTestLayout$Companion$c(String p0){
       a.p(p0, "testKey");
       super();
       this.c = p0;
       k b = k.b;
       Class uClass = 1;
       int b1 = false;
       Class uClass1 = (p0 == null || u.S1(p0))? 1: null;
       String str = "";
       if (!uClass1) {
          try{
             d uod = m0.d(str.getClass());
             Boolean uBoolean = null;
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (str instanceof Boolean) {
                   uBoolean = str;
                }
                if (uBoolean != null) {
                   b1 = uBoolean.booleanValue();
                }
                p0 = Boolean.valueOf(b.a().getBoolean(p0, b1));
             }else if(a.g(uod, m0.d(String.class))){
                p0 = b.a().getString(p0, str);
                if (p0 != null && p0.length()) {
                   uClass = 0;
                }
                if (!uClass) {
                   if (p0 == null) {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                if (str instanceof Integer) {
                   uBoolean = str;
                }
                b1 = (uBoolean != null)? uBoolean.intValue(): Integer.MIN_VALUE;
                int intx = b.a().getInt(p0, b1);
                if (intx != Integer.MIN_VALUE) {
                   intx = Integer.valueOf(intx);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                if (str instanceof Long) {
                   uBoolean = str;
                }
                long l = (uBoolean != null)? uBoolean.longValue(): Long.MIN_VALUE;
                l = b.a().getLong(p0, l);
                if (l - Long.MIN_VALUE) {
                   p0 = Long.valueOf(l);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                if (str instanceof Float) {
                   uBoolean = str;
                }
                float f = (uBoolean != null)? uBoolean.floatValue(): Float.MIN_VALUE;
                float floatx = b.a().getFloat(p0, f);
                if (floatx - 1) {
                   floatx = Float.valueOf(floatx);
                }
             }
             str = p0;
          }catch(java.lang.Exception e0){
          }
       }
    label_001e :
       String str1 = str;
       this.a = str1;
       String[] stringArray = new String[]{","};
       this.b = CollectionsKt___CollectionsKt.J5(StringsKt__StringsKt.H4(str1, stringArray, false, 0, 6, null));
       return;
    }
    public void a(List p0){
       GrowthTestLayout$Companion$c uCompanion$c = GrowthTestLayout$Companion$c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCompanion$c, "2")) {
          return;
       }
       String str = "addKeyList";
       a.p(p0, str);
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (!this.b.contains(str1)) {
             this.b.add(str1);
             i2 = i2 + 1;
          }else {
             i1 = i1 + 1;
          }
       }
       String str2 = "";
       int i3 = this.b.size();
       Iterator iterator1 = this.b.iterator();
       while (iterator1.hasNext()) {
          Object obj = iterator1.next();
          int i4 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          int i5 = i3 - 1;
          str2 = (i == i5)? str2+obj: str2+obj+',';
          i = i4;
       }
       str2 = str2;
       a.o(str2, "StringBuilder\(\).apply {\n…             }.toString\(\)");
       this.a = str2;
       if (!PatchProxy.isSupport(uCompanion$c) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i2), Integer.valueOf(i1), this, GrowthTestLayout$Companion$c.class, "1")) {
          a.p(p0, str);
          if (i2 > 0) {
             k.b.c(this.c, this.a);
          }
       }
       StringBuilder str3 = "";
       if (i2 > 0) {
          str3 = str3+"成功添加"+i2+"个选项";
          if (i1 > 0) {
             str3 = str3+"\n";
          }
       }
       if (i1 > 0) {
          str3 = str3+"选择的"+i1+"个选项已经添加过，不要重复添加";
       }
       i.d(R.style.arg_RES_7f110668, str3);
       return;
    }
    public HashMap b(){
       String obj1;
       LinkedHashMap obj = PatchProxy.apply(null, this, GrowthTestLayout$Companion$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          int i = u.S1(obj1) ^ 0x01;
          if (i) {
             uArrayList.add(obj1);
          }
       }
       iterator = CollectionsKt___CollectionsKt.b5(uArrayList).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          obj1 = this.f(str);
          try{
             obj1 = a.a.q(obj1);
             e0.put(str, obj1);
          }catch(java.lang.Exception e0){
          }
       }
       return obj;
    }
    public void c(List p0){
       GrowthTestLayout$Companion$c uCompanion$c = GrowthTestLayout$Companion$c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCompanion$c, "4")) {
          return;
       }
       String str = "removeKeyList";
       a.p(p0, str);
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (this.b.contains(str1)) {
             this.b.remove(str1);
             i2 = i2 + 1;
          }else {
             i1 = i1 + 1;
          }
       }
       String str2 = "";
       int i3 = this.b.size();
       Iterator iterator1 = this.b.iterator();
       while (iterator1.hasNext()) {
          Object obj = iterator1.next();
          int i4 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          int i5 = i3 - 1;
          str2 = (i == i5)? str2+obj: str2+obj+',';
          i = i4;
       }
       str2 = str2;
       a.o(str2, "StringBuilder\(\).apply {\n…             }.toString\(\)");
       this.a = str2;
       if (!PatchProxy.isSupport(uCompanion$c) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i2), Integer.valueOf(i1), this, GrowthTestLayout$Companion$c.class, "3")) {
          a.p(p0, str);
          if (i2 > 0) {
             k.b.c(this.c, this.a);
          }
       }
       StringBuilder str3 = "";
       if (i2 > 0) {
          str3 = str3+"成功删除"+i2+"个选项";
          if (i1 > 0) {
             str3 = str3+"\n";
          }
       }
       if (i1 > 0) {
          str3 = str3+"选择的"+i1+"个选项不包含，不需要删除";
       }
       i.d(R.style.arg_RES_7f110668, str3);
       return;
    }
    public HashMap d(){
       String obj1;
       LinkedHashMap obj = PatchProxy.apply(null, this, GrowthTestLayout$Companion$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          int i = u.S1(obj1) ^ 0x01;
          if (i) {
             uArrayList.add(obj1);
          }
       }
       iterator = CollectionsKt___CollectionsKt.b5(uArrayList).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          obj1 = this.f(str);
          try{
             obj1 = a.a.q(obj1);
             e0.put(str, obj1);
          }catch(java.lang.Exception e0){
          }
       }
       return obj;
    }
    public abstract Collection e();
    public abstract Object f(String p0);
}
