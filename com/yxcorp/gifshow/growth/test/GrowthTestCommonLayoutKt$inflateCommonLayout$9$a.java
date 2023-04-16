package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$9$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vqa.k;
import pna.k;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Long;
import java.lang.StringBuilder;
import java.io.File;
import dqa.d;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.kwai.robust.PatchProxyResult;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Float;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$9$a implements GrowthTestLayout$Companion$a	// class@0014f6
{

    public void GrowthTestCommonLayoutKt$inflateCommonLayout$9$a(){
       super();
    }
    public void a(Object p0){
       String str;
       Iterator obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, GrowthTestCommonLayoutKt$inflateCommonLayout$9$a.class, "2")) {
       }else {
          k.b.c("KEY_PRE_EMBEDDED_VIDEO_IDS", obj);
          if (obj != null) {
             p0 = PreEmbeddedHelper.c;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(obj, p0, PreEmbeddedHelper.class, "7")) {
                a.p(obj, "ids");
                if (TextUtils.isEmpty(StringsKt__StringsKt.o5(obj).toString())) {
                   p0.f("未输入任何视频 ID，请重新输入");
                }else {
                   String[] stringArray = new String[]{","};
                   ArrayList uArrayList = new ArrayList();
                   obj = StringsKt__StringsKt.H4(obj, stringArray, false, 0, 6, null).iterator();
                   while (obj.hasNext()) {
                      try{
                         str = obj.next();
                         Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                         if (!TextUtils.isEmpty(StringsKt__StringsKt.o5(str).toString())) {
                            uArrayList.add(Long.valueOf(Long.parseLong(str)));
                         }
                      }catch(java.lang.Exception e0){
                         PreEmbeddedHelper.c.f("ID "+str+" 输入有误，请检查后重新输入，然后重新下载");
                      }
                   }
                   p0.a(p0.d(), false);
                   c.c(new d(uArrayList));
                }
             }
          }
       }
    }
    public Object b(){
       Object[] objArray1;
       Boolean tRUE;
       try{
          String str = String.class;
          Object[] objArray = null;
          objArray1 = PatchProxy.apply(objArray, this, GrowthTestCommonLayoutKt$inflateCommonLayout$9$a.class, "1");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             k b = k.b;
             String str1 = "KEY_PRE_EMBEDDED_VIDEO_IDS";
             if (!u.S1(str1)) {
                d uod = m0.d(str);
                boolean b1 = false;
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (b.a().getBoolean(str1, b1)) {
                      tRUE = Boolean.TRUE;
                   }
                }else if(a.g(uod, m0.d(str))){
                   tRUE = b.a().getString(str1, "");
                   if (tRUE == null || !tRUE.length()) {
                      b1 = true;
                   }
                   if (!b1) {
                      if (tRUE == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   int i = Integer.MIN_VALUE;
                   int intx = b.a().getInt(str1, i);
                   if (intx != i) {
                      tRUE = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   long longx = b.a().getLong(str1, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      tRUE = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   float floatx = b.a().getFloat(str1, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                   }
                }
                objArray = tRUE;
             }
          label_00cc :
             objArray1 = objArray;
          }
       }catch(java.lang.Exception e0){
       }
       return objArray1;
    }
}
