package com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;

public class KwaiLinkDefaultServerInfo$a implements Parcelable$Creator	// class@000a3d
{

    public void KwaiLinkDefaultServerInfo$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       KwaiLinkDefaultServerInfo kwaiLinkDefa = PatchProxy.applyOneRefs(p0, this, KwaiLinkDefaultServerInfo$a.class, "1");
       if (kwaiLinkDefa != PatchProxyResult.class) {
       }else {
          kwaiLinkDefa = new KwaiLinkDefaultServerInfo(p0);
       }
       return kwaiLinkDefa;
    }
    public Object[] newArray(int p0){
       KwaiLinkDefaultServerInfo[] kwaiLinkDefa = new KwaiLinkDefaultServerInfo[p0];
       return kwaiLinkDefa;
    }
}
