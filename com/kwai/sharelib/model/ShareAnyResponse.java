package com.kwai.sharelib.model.ShareAnyResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShareAnyResponse implements Serializable	// class@0016ef
{
    public ShareAnyResponse$ShareAnyData mShareAnyData;
    public static final long serialVersionUID = 0xb1f89bdd4cb69796;

    public void ShareAnyResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareAnyResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareAnyResponse{mShareAnyData="+this.mShareAnyData+'}';
    }
}
