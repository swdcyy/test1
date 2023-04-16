package com.facebook.react.views.art.ARTTextShadowNode;
import com.facebook.react.views.art.ARTShapeShadowNode;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import kf.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Path;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import android.graphics.Paint$Align;
import android.graphics.Typeface;

public class ARTTextShadowNode extends ARTShapeShadowNode	// class@00139a
{
    public ReadableMap n;
    public int o;

    public void ARTTextShadowNode(){
       super();
       this.o = 0;
    }
    public void b(Canvas p0,Paint p1,float p2){
       ARTShapeShadowNode tg;
       if (PatchProxy.isSupport(ARTTextShadowNode.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, ARTTextShadowNode.class, "1")) {
          return;
       }
       ARTTextShadowNode tn = this.n;
       if (tn == null) {
          return;
       }
       p2 = p2 * this.b;
       if (p2 - 0x3c23d70a <= 0) {
          return;
       }
       String str = "lines";
       if (!tn.hasKey(str)) {
          return;
       }
       ReadableArray array = this.n.getArray(str);
       if (array != null && array.size()) {
          this.d(p0);
          int i = array.size();
          String[] stringArray = new String[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             stringArray[i1] = array.getString(i1);
          }
          String str1 = TextUtils.join("\n", stringArray);
          if (this.f(p1, p2)) {
             this.g(p1);
             tg = this.g;
             if (tg == null) {
                p0.drawText(str1, 0, (- p1.ascent()), p1);
             }else {
                p0.drawTextOnPath(str1, tg, 0, 0, p1);
             }
          }
          if (this.e(p1, p2)) {
             this.g(p1);
             tg = this.g;
             if (tg == null) {
                p0.drawText(str1, 0, (- p1.ascent()), p1);
             }else {
                p0.drawTextOnPath(str1, tg, 0, 0, p1);
             }
          }
          this.c(p0);
          this.markUpdateSeen();
       }
       return;
    }
    public final void g(Paint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTTextShadowNode.class, "2")) {
          return;
       }
       ARTTextShadowNode to = this.o;
       int i = 2;
       String str = 1;
       if (to != null) {
          if (to != str) {
             if (to == i) {
                p0.setTextAlign(Paint$Align.CENTER);
             }
          }else {
             p0.setTextAlign(Paint$Align.RIGHT);
          }
       }else {
          p0.setTextAlign(Paint$Align.LEFT);
       }
       to = this.n;
       if (to != null) {
          String str1 = "font";
          if (to.hasKey(str1)) {
             ReadableMap map = this.n.getMap(str1);
             if (map != null) {
                double d = -0.00f;
                String str2 = "fontSize";
                if (map.hasKey(str2)) {
                   d = (float)map.getDouble(str2);
                }
                p0.setTextSize((d * this.d));
                str1 = "fontWeight";
                d = (map.hasKey(str1) && ("bold").equals(map.getString(str1)))? 1: 0;
                str2 = "fontStyle";
                str2 = (map.hasKey(str2) && ("italic").equals(map.getString(str2)))? 1: 0;
                if (d && str2) {
                   i = 3;
                }else if(d){
                   i = 1;
                }else if(str2){
                   i = 0;
                }
                p0.setTypeface(Typeface.create(map.getString("fontFamily"), i));
             }
          }
       }
       return;
    }
    public void setAlignment(int p0){
       this.o = p0;
    }
    public void setFrame(ReadableMap p0){
       this.n = p0;
    }
}
