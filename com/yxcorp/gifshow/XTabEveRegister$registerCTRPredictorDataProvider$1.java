package com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import yj5.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.DefaultHelper;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import xf6.d;
import java.lang.StringBuilder;
import e17.i;
import com.yxcorp.utility.Log;

public final class XTabEveRegister$registerCTRPredictorDataProvider$1 extends Lambda implements l	// class@001307
{
    public static final XTabEveRegister$registerCTRPredictorDataProvider$1 INSTANCE;

    static {
       XTabEveRegister$registerCTRPredictorDataProvider$1.INSTANCE = new XTabEveRegister$registerCTRPredictorDataProvider$1();
    }
    public void XTabEveRegister$registerCTRPredictorDataProvider$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XTabEveRegister$registerCTRPredictorDataProvider$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (!TextUtils.x(p0.a()) && TextUtils.n(p0.action, "replaceTab")) {
          String str = p0.a();
          if (!PatchProxy.applyVoidOneRefs(str, null, DefaultHelper.class, "2")) {
             SharedPreferences$Editor uEditor = DefaultHelper.a.edit();
             uEditor.putString("predict_tab", str);
             g.a(uEditor);
          }
       }
       if (d.q()) {
          i.d(R.style.arg_RES_7f11066a, "端智能推理成功！结果为："+p0.a());
       }
       Log.g("XTabEveRegister", "端智能推理成功！结果为： "+p0.a());
       return;
    }
}
