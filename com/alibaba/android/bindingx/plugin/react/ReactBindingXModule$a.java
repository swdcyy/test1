package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$a;
import x5.i$d;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Double;
import java.lang.Throwable;
import z5.d;

public final class ReactBindingXModule$a implements i$d	// class@000e20
{
    public final ReactApplicationContext a;

    public void ReactBindingXModule$a(ReactApplicationContext p0){
       this.a = p0;
       super();
    }
    public View a(String p0,Object[] p1){
       try{
          Activity currentActiv = this.a.getCurrentActivity();
          if (currentActiv != null && !TextUtils.isEmpty(p0)) {
          label_0010 :
             return currentActiv.findViewById((int)Double.valueOf(p0.trim()).doubleValue());
          }
       }catch(java.lang.NumberFormatException e4){
          d.a("number format error", e4);
       }
       return null;
    }
}
