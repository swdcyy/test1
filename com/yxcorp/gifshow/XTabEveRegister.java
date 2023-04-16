package com.yxcorp.gifshow.XTabEveRegister;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj5.c;
import com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$1;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.DefaultHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import tra.a;
import com.yxcorp.utility.Log;
import java.lang.Long;
import java.util.HashMap;
import com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$2;
import msd.a;
import com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$3;
import com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$4;
import com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$5;

public final class XTabEveRegister	// class@00130c
{
    public static final XTabEveRegister a;

    static {
       XTabEveRegister.a = new XTabEveRegister();
    }
    public void XTabEveRegister(){
       super();
    }
    public static final void a(){
       String str1;
       if (PatchProxy.applyVoid(null, null, XTabEveRegister.class, "1")) {
          return;
       }
       c o = c.o;
       XTabEveRegister$registerCTRPredictorDataProvider$1 iNSTANCE = XTabEveRegister$registerCTRPredictorDataProvider$1.INSTANCE;
       Objects.requireNonNull(o);
       if (!PatchProxy.applyVoidOneRefs(iNSTANCE, o, c.class, "8")) {
          a.p(iNSTANCE, "resultHandler");
          c.d = iNSTANCE;
       }
       StringBuilder str = " 默认展示的tab = ";
       if (!TextUtils.x(DefaultHelper.g())) {
          str1 = DefaultHelper.g();
       }else {
          Boolean uBoolean = a.f();
          a.o(uBoolean, "DefaultPreferenceHelper.getXBlockUserChangedTab\(\)");
          str1 = (uBoolean.booleanValue())? DefaultHelper.c(): "blocks";
       }
       str1 = "XTabEveRegister";
       Log.g(str1, str+str1);
       Log.g(str1, "最近一次进入xtab的时间 = "+DefaultHelper.f());
       Log.g(str1, "是否进入过xtab："+DefaultHelper.e());
       str = "是否进入过各子tab:";
       HashMap hashMap = (DefaultHelper.d() == null)? DefaultHelper.b(): DefaultHelper.d();
       Log.g(str1, str+hashMap);
       o.g("default_xtab_channel_name", XTabEveRegister$registerCTRPredictorDataProvider$2.INSTANCE);
       o.g("last_xtab_enter_timestamp", XTabEveRegister$registerCTRPredictorDataProvider$3.INSTANCE);
       o.g("has_enter_xtab", XTabEveRegister$registerCTRPredictorDataProvider$4.INSTANCE);
       o.g("has_enter_xtab_second_map", XTabEveRegister$registerCTRPredictorDataProvider$5.INSTANCE);
       return;
    }
}
