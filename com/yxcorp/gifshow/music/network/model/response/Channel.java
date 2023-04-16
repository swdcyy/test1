package com.yxcorp.gifshow.music.network.model.response.Channel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class Channel implements Serializable	// class@00205e
{
    public CDNUrl[] mDarkIconUrls;
    public String mIcon;
    public CDNUrl[] mIconUrls;
    public long mId;
    public String mName;
    public String mType;
    public static final long serialVersionUID = 0xf890fa383ba3af2e;

    public void Channel(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Channel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof Channel) {
          return false;
       }
       if (!(p0.mName).equals(this.mName) || (p0.mId - this.mId || (!(p0.mType).equals(this.mType) || !(p0.mIcon).equals(this.mIcon)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, Channel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.hashCode();
    }
}
