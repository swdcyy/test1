package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$j;
import x5.i$e;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import x5.i$c;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Double;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.f;
import com.facebook.react.bridge.UiThreadUtil;
import z5.c;
import z5.f;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$j$a;
import java.lang.Runnable;

public final class ReactBindingXModule$j implements i$e	// class@000e2b
{
    public final ReactApplicationContext a;

    public void ReactBindingXModule$j(ReactApplicationContext p0){
       this.a = p0;
       super();
    }
    public void a(View p0,String p1,Object p2,i$c p3,Map p4,Object[] p5){
       object oobject;
       int i2;
       ReactBindingXModule$j oj = this;
       int i = p5;
       if (i && i.length >= 1) {
          int i1 = 0;
          if (i[i1] instanceof String) {
             oobject = i[i1];
          label_0016 :
             if (oj.a != null && !TextUtils.isEmpty(oobject)) {
                String str = oobject.trim();
                try{
                   i1 = -1;
                   i2 = (int)Double.valueOf(str).doubleValue();
                }catch(java.lang.Exception e0){
                   i2 = -1;
                }
                UIManagerModule nativeModule = oj.a.getNativeModule(UIManagerModule.class);
                if (nativeModule != null && i2 != i1) {
                   f uIImplementa = nativeModule.getUIImplementation();
                   if (uIImplementa != null) {
                      if (UiThreadUtil.isOnUiThread()) {
                         f.a(p1).a(i2, p0, p2, p3, p4, uIImplementa);
                      }else {
                         ReactBindingXModule$j$a oj$a = new ReactBindingXModule$j$a(this, p1, i2, p0, p2, p3, p4, uIImplementa);
                         UiThreadUtil.runOnUiThread(v10);
                      }
                   }
                }
             }
             return;
          }
       }
       oobject = null;
       goto label_0016 ;
    }
}
