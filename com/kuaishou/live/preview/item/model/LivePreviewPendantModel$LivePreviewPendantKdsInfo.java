package com.kuaishou.live.preview.item.model.LivePreviewPendantModel$LivePreviewPendantKdsInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePreviewPendantModel$LivePreviewPendantKdsInfo implements Serializable	// class@000df5
{
    public String mBundleId;
    public String mKdsData;
    public static final long serialVersionUID = 0xb15a8d99c48f58d2;

    public void LivePreviewPendantModel$LivePreviewPendantKdsInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewPendantModel$LivePreviewPendantKdsInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "[LivePreviewPendantKdsInfo] bundleId =  "+this.mBundleId+"; data = "+this.mKdsData;
    }
}
