package com.kwai.sharelib.model.PainterModel$ImageContent;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PainterModel$ImageContent implements Serializable	// class@0016e2
{
    public String mIcon;
    public String mImageBytes;
    public String mImageUrl;
    public String mSlogan;
    public String mSubTitle;
    public String mTitle;
    public static final long serialVersionUID = 0xee683434e8f07f7;

    public void PainterModel$ImageContent(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PainterModel$ImageContent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{"+"icon="+this.mIcon+","+"imageUrl="+this.mImageUrl+","+"title="+this.mTitle+","+"subTitle="+this.mSubTitle+"mSlogan="+this.mSlogan+"}";
    }
}
