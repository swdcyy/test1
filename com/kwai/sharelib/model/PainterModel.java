package com.kwai.sharelib.model.PainterModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PainterModel implements Serializable	// class@0016e7
{
    public PainterModel$ImageContent mImageContent;
    public String mPainterId;
    public TkConfig mPosterTkConfig;
    public PainterModel$QrContent mQrParams;
    public String mType;
    public PainterModel$VideoContent mVideoContent;
    public static final long serialVersionUID = 0xed08c306799f04dc;

    public void PainterModel(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PainterModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PainterModel{mPainterId=\'"+this.mPainterId+'''+", mType=\'"+this.mType+'''+", mQrParams="+this.mQrParams+", mImageContent="+this.mImageContent+", mVideoContent="+this.mVideoContent+", mPosterTkConfig="+this.mPosterTkConfig+'}';
    }
}
