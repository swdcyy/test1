package com.kwai.sharelib.model.PainterModel$QrContent;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.sharelib.model.PainterModel$QrObject;
import java.lang.CharSequence;
import com.kwai.sharelib.model.PainterModel$QrLayout;

public class PainterModel$QrContent implements Serializable	// class@0016e3
{
    public PainterModel$QrLayout mQrLayout;
    public PainterModel$QrObject[] mQrObjectArray;
    public static final long serialVersionUID = 0xfc87d9148a579ec8;

    public void PainterModel$QrContent(){
       super();
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, PainterModel$QrContent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.mQrObjectArray.length) {
          return "[]";
       }
       obj = "[";
       int i = 0;
       PainterModel$QrContent tmQrObjectAr = this.mQrObjectArray;
       while (i < tmQrObjectAr.length) {
          obj = obj+tmQrObjectAr[i].toString();
          int i1 = this.mQrObjectArray.length - 1;
          if (i == i1) {
             break ;
          }else {
             obj = obj+",";
             i = i + 1;
          }
       }
       return "qrObjects="+obj+"]"+","+"qrLayout="+this.mQrLayout.toString();
    }
}
