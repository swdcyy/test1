package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.CharSequence;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import xf6.l;

public final class GrowthTestLayoutPartImpl$a implements GrowthTestLayout$Companion$a	// class@0014f9
{

    public void GrowthTestLayoutPartImpl$a(){
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayoutPartImpl$a.class, "2")) {
       }else if(p0 != null){
          g.a(b.c(a.b(), "growth_preference", 0).edit().putInt("key_preference_notification_show_interval", p0.intValue()));
       }
       i.d(R.style.arg_RES_7f110668, "设置已生效");
       return;
    }
    public Object b(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, GrowthTestLayoutPartImpl$a.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          int i = l.e("key_preference_notification_show_interval", -1);
          if (i >= 0 && 4 >= i) {
             objArray = Integer.valueOf(i);
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
