package com.yxcorp.gifshow.share.platform.QQForward$Companion$mTencent$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import com.tencent.tauth.Tencent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yic.m;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.content.Context;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import com.yxcorp.utility.SystemUtil;
import ip7.k;
import java.lang.Number;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collection;
import java.lang.Integer;
import wkd.b;
import mhc.y;
import mhc.f2;
import java.lang.StringBuilder;

public final class QQForward$Companion$mTencent$2 extends Lambda implements a	// class@001c0c
{
    public final QQForward$Companion this$0;

    public void QQForward$Companion$mTencent$2(QQForward$Companion p0){
       this.this$0 = p0;
       super(0);
    }
    public final Tencent invoke(){
       int b;
       f2 obj2;
       Tencent tencent;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       QQForward$Companion$mTencent$2 obj = PatchProxy.apply(objArray, this, QQForward$Companion$mTencent$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = "Singleton.get\(ForwardSer¡­::class.java\).shareConfig";
       if (m.a()) {
          obj = this.this$0;
          Objects.requireNonNull(obj);
          String str1 = "2";
          KwaiOperator$a obj1 = PatchProxy.apply(objArray, obj, QQForward$Companion.class, str1);
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             String str2 = SystemUtil.E(KwaiOperator.q.b(), "com.tencent.mobileqq");
             Object obj4 = PatchProxy.applyTwoRefs(str2, "8.2.8", objArray, k.class, str1);
             if (obj4 != patchProxyRe) {
                b = obj4.intValue();
             }else {
                try{
                   b = -1;
                   if (str2 != null) {
                      a.m(str2);
                      String[] stringArray = new String[0];
                      objArray = new Regex("\\.").split(str2, 0).toArray(stringArray);
                      Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                      a.m("8.2.8");
                      String[] stringArray1 = new String[0];
                      Object[] objArray1 = new Regex("\\.").split("8.2.8", 0).toArray(stringArray1);
                      Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                      int i = 0;
                      while (true) {
                         if (i < objArray.length && i < objArray1.length) {
                            int i1 = Integer.parseInt(objArray[i]);
                            int i2 = Integer.parseInt(objArray1[i]);
                            if (i1 >= i2) {
                               if (i1 > i2) {
                               label_00a8 :
                                  b = 1;
                               }else {
                                  i = i + 1;
                               }
                            }
                         }else if(objArray.length > i){
                            goto label_00a8 ;
                         }else if(objArray1.length > i){
                            b = 0;
                         }
                      }
                      return tencent;
                   }
                }catch(java.lang.NumberFormatException e0){
                   b = str2.compareTo("8.2.8");
                }
             }
          }
          if (b) {
             obj2 = b.a(0x91df3e4);
             a.o(obj2, "Singleton.get\(ForwardService::class.java\)");
             obj2 = obj2.a();
             a.o(obj2, str);
             obj1 = KwaiOperator.q;
             Context uContext = obj1.b();
             tencent = Tencent.createInstance(obj2.c(), uContext, obj1.b().getPackageName()+".fileprovider");
             goto label_0111 ;
          }
       }
       Object obj3 = b.a(0x91df3e4);
       a.o(obj3, "Singleton.get\(ForwardService::class.java\)");
       obj2 = obj3.a();
       a.o(obj2, str);
       tencent = Tencent.createInstance(obj2.c(), KwaiOperator.q.b());
       goto label_0111 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
