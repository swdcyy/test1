package com.yxcorp.gifshow.qrcode.resolver.entity.QRCodeResolveParam;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.qrcode.resolver.entity.QRCodeResolveParam$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kwai.feature.api.qrcode.model.ScanParam;

public class QRCodeResolveParam implements Serializable	// class@0016e3
{
    public boolean mIsFromAlbum;
    public QRCodeResolveParam$a mQRCodeLogListener;
    public String mQRCodeResult;
    public Map mQRCodeSubjects;
    public String mScanPageSource;
    public ScanParam mScanParam;
    public static final long serialVersionUID = 0xf3202d751fd1a5bf;

    public void QRCodeResolveParam(){
       super();
    }
    public QRCodeResolveParam$a getQRCodeLogListener(){
       return this.mQRCodeLogListener;
    }
    public String getQRCodePageSource(){
       return this.mScanPageSource;
    }
    public String getQRCodeResult(){
       Object obj = PatchProxy.apply(null, this, QRCodeResolveParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.I(this.mQRCodeResult);
    }
    public Map getQRCodeSubjects(){
       return this.mQRCodeSubjects;
    }
    public ScanParam getQRScanParam(){
       return this.mScanParam;
    }
    public boolean isFromAlbum(){
       return this.mIsFromAlbum;
    }
    public QRCodeResolveParam setFromAlbum(boolean p0){
       this.mIsFromAlbum = p0;
       return this;
    }
    public QRCodeResolveParam setQRCodeLogListener(QRCodeResolveParam$a p0){
       this.mQRCodeLogListener = p0;
       return this;
    }
    public QRCodeResolveParam setQRCodeResult(String p0){
       this.mQRCodeResult = p0;
       return this;
    }
    public QRCodeResolveParam setQRCodeSubjects(Map p0){
       this.mQRCodeSubjects = p0;
       return this;
    }
    public QRCodeResolveParam setScanParams(ScanParam p0){
       this.mScanParam = p0;
       return this;
    }
    public QRCodeResolveParam setScanSource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QRCodeResolveParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mScanPageSource = TextUtils.I(p0);
       return this;
    }
}
