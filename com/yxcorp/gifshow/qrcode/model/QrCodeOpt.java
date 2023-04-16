package com.yxcorp.gifshow.qrcode.model.QrCodeOpt;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class QrCodeOpt extends Enum	// class@0016df
{
    public static final QrCodeOpt[] $VALUES;
    public static final QrCodeOpt DISMISS_POPUP;
    public static final QrCodeOpt SHARE_PLATFORM_SHOW;

    static {
       QrCodeOpt qrCodeOpt = new QrCodeOpt("DISMISS_POPUP", 0);
       QrCodeOpt.DISMISS_POPUP = qrCodeOpt;
       QrCodeOpt qrCodeOpt1 = new QrCodeOpt("SHARE_PLATFORM_SHOW", 1);
       QrCodeOpt.SHARE_PLATFORM_SHOW = qrCodeOpt1;
       QrCodeOpt[] qrCodeOptArr = new QrCodeOpt[]{qrCodeOpt,qrCodeOpt1};
       QrCodeOpt.$VALUES = qrCodeOptArr;
    }
    public void QrCodeOpt(String p0,int p1){
       super(p0, p1);
    }
    public static QrCodeOpt valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, QrCodeOpt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(QrCodeOpt.class, p0);
    }
    public static QrCodeOpt[] values(){
       Object obj = PatchProxy.apply(null, null, QrCodeOpt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QrCodeOpt.$VALUES.clone();
    }
}
