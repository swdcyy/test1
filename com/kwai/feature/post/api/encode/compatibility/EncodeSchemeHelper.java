package com.kwai.feature.post.api.encode.compatibility.EncodeSchemeHelper;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.p3;
import java.lang.Throwable;
import w46.b;
import java.lang.Integer;
import java.lang.Boolean;
import q87.c;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import com.kwai.feature.post.api.encode.compatibility.EncodeSchemeHelper$AverageValue;
import v16.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.RuntimeException;
import java.lang.Long;

public class EncodeSchemeHelper	// class@001310
{
    public static boolean a;

    public void EncodeSchemeHelper(){
       super();
    }
    public static EncodeConfig a(EncodeConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeSchemeHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       int i1 = 0;
       int b = (p0.isUseHardwareEncode() && !p0.isEncodeTypeModifiable())? true: false;
       EncodeSchemeHelper.a = b;
       b = p0.getWidth();
       int height = p0.getHeight();
       try{
          EncodeSchemeHelper.c(p0);
       }catch(java.lang.Exception e5){
          Object[] objArray = new Object[i1];
          p3.D().u("Recorder", e5, objArray);
       }
       try{
          if (!p0.isForceDisableConfigFallback()) {
             EncodeSchemeHelper.b(p0, b, height);
          }
       }catch(java.lang.Exception e1){
          Object[] objArray1 = new Object[i1];
          p3.D().u("Recorder", e1, objArray1);
       }
       height = 960;
       if (p0.getHeight() <= height) {
          p0.setPreviewMaxSize(height);
       }
       Object[] objArray2 = new Object[]{Integer.valueOf(p0.getWidth()),Integer.valueOf(p0.getHeight()),Boolean.valueOf(p0.isUseHardwareEncode())};
       Object[] objArray3 = new Object[i1];
       p3.D().w("Recorder", String.format("config:%d*%d hw:%s", objArray2), objArray3);
       return p0;
    }
    public static void b(EncodeConfig p0,int p1,int p2){
       if (PatchProxy.isSupport(EncodeSchemeHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, EncodeSchemeHelper.class, "3")) {
          return;
       }
       EncodeSchemeHelper.i(p0, p1);
       boolean b = p0.isUseHardwareEncode();
       if (b) {
          return;
       }
       String str = "*";
       String str1 = "resulution";
       int i = 2;
       if (!EncodeSchemeHelper.h(b, p0.getWidth(), p0.getHeight())) {
          int width = p0.getWidth();
          int height = p0.getHeight();
          if (p0.getWidth() >= 720 && EncodeSchemeHelper.h(b, 540, 960)) {
             p0.setWidth(540);
             p0.setHeight(960);
             p0.setPreviewMaxSize(960);
          }else if(!EncodeSchemeHelper.a && (b && (p1 >= 540 && EncodeSchemeHelper.h(0, 540, 960)))){
             p0.setUseHardwareEncode(0);
             p0.setWidth(540);
             p0.setHeight(960);
             p0.setPreviewMaxSize(960);
             if (width <= 540) {
                Object[] objArray1 = new Object[i];
                objArray1[0] = str1;
                objArray1[1] = p0.getWidth()+str+p0.getHeight();
                p3.D().A("Recorder", "fs_undecline", objArray1);
                return;
             }
          }else {
             p0.setWidth(360);
             p0.setHeight(640);
          }
          Object[] objArray = new Object[]{Integer.valueOf(width),Integer.valueOf(height),Integer.valueOf(p0.getWidth()),Integer.valueOf(p0.getHeight())};
          objArray = new Object[0];
          p3.D().w("Recorder", String.format("reduce resulution %d*%d-->%d*%d", objArray), objArray);
       }else {
          Object[] objArray2 = new Object[i];
          objArray2[0] = str1;
          objArray2[1] = p0.getWidth()+str+p0.getHeight();
          p3.D().A("Recorder", "fs_undecline", objArray2);
       }
       EncodeSchemeHelper.i(p0, p1);
       return;
    }
    public static void c(EncodeConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, EncodeSchemeHelper.class, "2")) {
          return;
       }
       if (!p0.isFullScreen()) {
          if (p0.getWidth() >= 720) {
             if (Build$VERSION.SDK_INT > 21 && (p0.isForceDisableConfigFallback() || EncodeSchemeHelper.h(p0.isUseHardwareEncode(), 720, 1280))) {
                p0.setWidth(720);
                p0.setHeight(1280);
                p0.setPreviewMaxSize(1280);
             }else {
                p0.setWidth(540);
                p0.setHeight(960);
                p0.setPreviewMaxSize(960);
             }
          }else {
             p0.setWidth(360);
             p0.setHeight(640);
          }
       }
       return;
    }
    public static EncodeSchemeHelper$AverageValue d(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(EncodeSchemeHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, EncodeSchemeHelper.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = a.g(p0, p1, p2);
       if (!TextUtils.isEmpty(str)) {
          try{
             return new Gson().h(str, EncodeSchemeHelper$AverageValue.class);
          }catch(com.google.gson.JsonSyntaxException e7){
             e7.printStackTrace();
          }
          return new EncodeSchemeHelper$AverageValue();
       }else {
          goto label_0040 ;
       }
    }
    public static String e(int p0,int p1){
       EncodeSchemeHelper uEncodeSchem = EncodeSchemeHelper.class;
       if (PatchProxy.isSupport(uEncodeSchem)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uEncodeSchem, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EncodeSchemeHelper.f(false, p0, p1)+" "+EncodeSchemeHelper.f(true, p0, p1);
    }
    public static String f(boolean p0,int p1,int p2){
       String obj;
       if (PatchProxy.isSupport(EncodeSchemeHelper.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, EncodeSchemeHelper.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.g(p0, p1, p2);
       if (!TextUtils.isEmpty(obj)) {
          try{
             EncodeSchemeHelper$AverageValue uAverageValu = new Gson().h(obj, EncodeSchemeHelper$AverageValue.class);
             if (uAverageValu.getCount() > 0) {
                Object[] objArray = new Object[]{String.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(uAverageValu.getCount()),Long.valueOf(uAverageValu.getAverageValue()),Long.valueOf(uAverageValu.getMinValue()),Long.valueOf(uAverageValu.getMaxValue())};
                return String.format("%s %d*%d cnt:%d average:%d min:%d max:%d", objArray);
             }
          }catch(com.google.gson.JsonSyntaxException e7){
             e7.printStackTrace();
          }
       }
    }
    public static boolean g(EncodeSchemeHelper$AverageValue p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, EncodeSchemeHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long averageValue = p0.getAverageValue();
       boolean b = true;
       if (averageValue - 14 < 0 && p0.getCount() - 1 >= 0) {
          int i = (int)p0.getCount();
          if (i != b) {
             if (i != 2) {
                if (i != 3) {
                   obj = new Object[0];
                   p3.D().w("Recorder", "fullscreen abnormal", obj);
                   return 0;
                }else if(averageValue - 11 > 0){
                   b = false;
                }
                return b;
             }else if(averageValue - 9 > 0){
                b = false;
             }
             return b;
          }else if(averageValue - 7 > 0){
             b = false;
          }
       }
       return b;
    }
    public static boolean h(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(EncodeSchemeHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, EncodeSchemeHelper.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EncodeSchemeHelper.g(EncodeSchemeHelper.d(p0, p1, p2));
    }
    public static void i(EncodeConfig p0,int p1){
       EncodeSchemeHelper uEncodeSchem = EncodeSchemeHelper.class;
       if (PatchProxy.isSupport(uEncodeSchem) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uEncodeSchem, "4")) {
          return;
       }
       boolean b = p0.isUseHardwareEncode();
       if (EncodeSchemeHelper.a || (b && p0.getWidth() <= p1)) {
          boolean b1 = (a.c() < 3)? true: false;
          p0.setUseHardwareEncode(b1);
       }
    label_0034 :
       return;
    }
}
