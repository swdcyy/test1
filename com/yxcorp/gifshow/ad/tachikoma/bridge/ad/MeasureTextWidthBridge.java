package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.MeasureTextWidthBridge;
import a59.e;
import java.lang.String;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.MeasureTextWidthBridge$MeasureTextParams;
import com.google.gson.Gson;
import androidx.appcompat.widget.AppCompatTextView;
import android.app.Application;
import o56.a;
import android.content.Context;
import tkd.b;
import tkd.d;
import rx4.i;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.yxcorp.utility.n;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.StringBuilder;
import yx.j0;

public final class MeasureTextWidthBridge extends e	// class@001815
{

    public void MeasureTextWidthBridge(){
       super();
    }
    public String a(){
       return "measureText";
    }
    public Object c(JSONObject p0,a p1){
       int i;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, MeasureTextWidthBridge.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       try{
          i = 0;
          String str = p0.toString();
          a.o(str, "data.toString\(\)");
          if (!TextUtils.x(str)) {
             MeasureTextWidthBridge$MeasureTextParams measureTextP = a.a.h(str, MeasureTextWidthBridge$MeasureTextParams.class);
             if (measureTextP != null) {
                String mText = measureTextP.getMText();
                int i1 = 1;
                float f = (mText == null || !mText.length())? Float.MIN_VALUE: 0;
                AppCompatTextView uAppCompatTe = (!f && measureTextP.getMFontSize() - (float)i > 0)? 1: null;
                if (!uAppCompatTe) {
                   measureTextP = null;
                }
                if (measureTextP != null) {
                   uAppCompatTe = new AppCompatTextView(a.b());
                   if (measureTextP.getMAdjustFontSizeWithSystemChange()) {
                      uAppCompatTe.setTextSize(2, measureTextP.getMFontSize());
                   }else {
                      uAppCompatTe.setTextSize(i1, measureTextP.getMFontSize());
                   }
                   d.a(0x256720e1).yw(uAppCompatTe, measureTextP.getMFontFamily(), measureTextP.getMFontWeight(), null, null);
                   uAppCompatTe.setIncludeFontPadding(measureTextP.getMIncludeFontPadding());
                   uAppCompatTe.setText(measureTextP.getMText());
                   uAppCompatTe.measure(i, i);
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.a0("width", Integer.valueOf(n.P(a.b(), (float)uAppCompatTe.getMeasuredWidth())));
                   jsonObject.a0("height", Integer.valueOf(n.P(a.b(), (float)uAppCompatTe.getMeasuredHeight())));
                   str = jsonObject.toString();
                   a.o(str, "JsonObject\(\).apply {\n   бн\)\)\n          }.toString\(\)");
                   return str;
                }
             }
          }
       }catch(java.lang.Exception e9){
          Object[] objArray = new Object[i];
          j0.c("PageStatusBridge", "handleJsCall error: "+e9, objArray);
       }
       return this.e();
    }
}
