package com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class ChannelInfo	// class@0021be
{
    public String channelType;
    public String h5LandingUrl;
    public String icon;
    public String id;
    public boolean isDefault;
    public MarkInfo markInfo;
    public String name;

    public void ChannelInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChannelInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof ChannelInfo) {
          return b;
       }
       if (TextUtils.n(this.id, p0.id) && TextUtils.n(this.channelType, p0.channelType)) {
          b = true;
       }
       return b;
    }
    public String getChannelDisplayName(){
       return this.name;
    }
    public String getChannelOriginId(){
       return this.id;
    }
    public String getChannelOriginName(){
       return this.name;
    }
    public boolean isNovelBoyChannel(){
       Object obj = PatchProxy.apply(null, this, ChannelInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (("20001").equals(this.id) || ("40001").equals(this.id))? true: false;
       return b;
    }
    public boolean isNovelGirlChannel(){
       Object obj = PatchProxy.apply(null, this, ChannelInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (("20002").equals(this.id) || ("40002").equals(this.id))? true: false;
       return b;
    }
}
