package com.yxcorp.gifshow.magic.ui.magicemoji.swap.server.ServerSwapDescription;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectDescription;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.models.ServerProcessingInfo;

public class ServerSwapDescription implements Serializable	// class@001c42
{
    public boolean mDisableCache;
    public boolean mRequireFacialReco;
    public String mReturnMediaType;
    public String mServiceType;
    public static final long serialVersionUID = 0x1;

    public void ServerSwapDescription(){
       super();
    }
    public void readDataFromEffectDescription(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ServerSwapDescription.class, "1")) {
          return;
       }
       this.mServiceType = p0.getServerProcessingInfo().getServiceType();
       this.mReturnMediaType = p0.getServerProcessingInfo().getReturnMediaType();
       this.mDisableCache = p0.getServerProcessingInfo().getDisableCache();
       this.mRequireFacialReco = p0.getRequireFacialReco();
       return;
    }
}
