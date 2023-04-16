package com.kuaishou.live.preview.item.model.LivePreviewPendantModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.preview.item.model.LivePreviewPendantModel$LivePreviewPendantKdsInfo;

public class LivePreviewPendantModel implements Serializable	// class@000df6
{
    public LivePreviewPendantModel$LivePreviewPendantKdsInfo mKdsInfo;
    public String mPendantId;
    public static final long serialVersionUID = 0xe07ea068e4c91721;

    public void LivePreviewPendantModel(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewPendantModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "[LivePreviewPendantModel] pendantId = "+this.mPendantId+"; kdsInfo = "+this.mKdsInfo.toString();
    }
}
