package com.kwai.sharelib.model.PainterModel$QrObject;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PainterModel$QrObject implements Serializable	// class@0016e5
{
    public String mQrBytes;
    public int mQrCorrectionLevel;
    public String mQrShareUrl;
    public String mQrType;
    public String mQrUrl;
    public String mShareId;
    public static final long serialVersionUID = 0xfc87d9148a579ec8;

    public void PainterModel$QrObject(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PainterModel$QrObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{"+"shareId="+this.mShareId+","+"qrUrl="+this.mQrUrl+","+"qrBytes="+this.mQrBytes+","+"qrShareUrl="+this.mQrShareUrl+","+"qrCorrectionLevel="+this.mQrCorrectionLevel+","+"qrType="+this.mQrType+"}";
    }
}
