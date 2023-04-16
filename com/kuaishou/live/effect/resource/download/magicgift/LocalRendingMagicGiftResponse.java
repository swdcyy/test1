package com.kuaishou.live.effect.resource.download.magicgift.LocalRendingMagicGiftResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class LocalRendingMagicGiftResponse implements Serializable	// class@001b4a
{
    public String mExpId;
    public List mMagicFaces;
    public List mPreDownload;
    public static final long serialVersionUID = 0x4ebd330a60b982c1;

    public void LocalRendingMagicGiftResponse(){
       super();
       this.mMagicFaces = new ArrayList();
       this.mPreDownload = new ArrayList();
       this.mExpId = "";
    }
    public String getExpId(){
       return this.mExpId;
    }
    public List getMagicFaces(){
       return this.mMagicFaces;
    }
    public List getPreDownload(){
       return this.mPreDownload;
    }
    public int getPreDownloadNum(){
       LocalRendingMagicGiftResponse obj = PatchProxy.apply(null, this, LocalRendingMagicGiftResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPreDownload;
       int i = (obj != null)? obj.size(): 0;
       return i;
    }
}
