package com.kwai.sharelib.model.PainterModel$QrLayout;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PainterModel$QrLayout implements Serializable	// class@0016e4
{
    public float mQrImageRelativeWidth;
    public float mQrImageRelativeX;
    public float mQrImageRelativeY;
    public static final long serialVersionUID = 0xd38521788fec6081;

    public void PainterModel$QrLayout(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PainterModel$QrLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{"+"qrImageRelativeX="+this.mQrImageRelativeX+","+"qrImageRelativeY="+this.mQrImageRelativeY+","+"qrImageRelativeWidth="+this.mQrImageRelativeWidth+"}";
    }
}
