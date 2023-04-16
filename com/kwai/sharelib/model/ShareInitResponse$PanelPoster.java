package com.kwai.sharelib.model.ShareInitResponse$PanelPoster;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ShareInitResponse$PanelPoster implements Serializable	// class@0016f0
{
    public String[] mQrBytes;
    public String[] mQrShareUrls;
    public String[] mQrTypes;
    public String mShareId;
    public static final long serialVersionUID = 0x5971466c61795e5;

    public void ShareInitResponse$PanelPoster(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse$PanelPoster.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PanelPoster{mQrBytes="+Arrays.toString(this.mQrBytes)+", mQrTypes="+Arrays.toString(this.mQrTypes)+", mQrShareUrls="+Arrays.toString(this.mQrShareUrls)+", mShareId=\'"+this.mShareId+'''+'}';
    }
}
