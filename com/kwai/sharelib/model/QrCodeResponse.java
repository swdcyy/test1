package com.kwai.sharelib.model.QrCodeResponse;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class QrCodeResponse implements a	// class@0016ec
{
    public String[] mCoverBytes;
    public String[] mCoverUrls;
    public QrCodeResponse$ExtParam mExtParams;
    public String[] mQrBytes;
    public String[] mQrShareUrls;
    public String[] mQrTypes;
    public String[] mQrUrls;
    public String mShareId;
    public String mShareUrl;

    public void QrCodeResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, QrCodeResponse.class, "1")) {
          return;
       }
       if (TextUtils.x(this.mShareUrl)) {
          QrCodeResponse tmQrShareUrl = this.mQrShareUrls;
          if (tmQrShareUrl != null && tmQrShareUrl.length > 0) {
             this.mShareUrl = tmQrShareUrl[0];
          }
       }
       return;
    }
}
