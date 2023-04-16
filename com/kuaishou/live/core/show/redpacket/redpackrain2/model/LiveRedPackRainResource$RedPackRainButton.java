package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainButton;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPicture;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$a;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainText;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;

public final class LiveRedPackRainResource$RedPackRainButton implements Serializable	// class@000f06
{
    public boolean mHidden;
    public CDNUrl[] mImageUrls;
    public String mLink;
    public LiveRedPackRainResource$RedPackRainText mRedPackRainText;
    public static final long serialVersionUID = 0xd57edfc30c3ce807;

    public void LiveRedPackRainResource$RedPackRainButton(){
       super();
    }
    public static LiveRedPackRainResource$RedPackRainButton fromSCMessage(LiveRedPackRainMessage$RedPackRainButton p0){
       Object obj = null;
       LiveRedPackRainResource$RedPackRainButton obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRedPackRainResource$RedPackRainButton.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new LiveRedPackRainResource$RedPackRainButton();
       obj1.mImageUrls = LiveRedPackRainResource$a.a(p0.picture);
       obj1.mLink = p0.link;
       obj1.mHidden = p0.isHidden;
       obj1.mRedPackRainText = LiveRedPackRainResource$RedPackRainText.fromSCMessage(p0.text);
       return obj1;
    }
}
