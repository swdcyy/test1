package com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveMultiChatGuestWidgetConfig implements Serializable	// class@000a1e
{
    public float mChatViewPositionHeight;
    public float mChatViewPositionLeft;
    public float mChatViewPositionTop;
    public float mChatViewPositionWidth;
    public int mSupportMultiChatCount;
    public float mWidgetAspectRatio;
    public static final long serialVersionUID = 0xa11c29e353f0814c;

    public void LiveMultiChatGuestWidgetConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiChatGuestWidgetConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiChatGuestWidgetConfig{mSupportMultiChatCount="+this.mSupportMultiChatCount+", mWidgetAspectRatio="+this.mWidgetAspectRatio+", mChatViewPositionLeft="+this.mChatViewPositionLeft+", mChatViewPositionTop="+this.mChatViewPositionTop+", mChatViewPositionWidth="+this.mChatViewPositionWidth+", mChatViewPositionHeight="+this.mChatViewPositionHeight+'}';
    }
}
