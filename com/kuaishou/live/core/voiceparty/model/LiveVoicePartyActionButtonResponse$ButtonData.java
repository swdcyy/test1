package com.kuaishou.live.core.voiceparty.model.LiveVoicePartyActionButtonResponse$ButtonData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyActionButtonResponse$IconInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveVoicePartyActionButtonResponse$ButtonData implements Serializable	// class@001785
{
    public String animationIconNightUrl;
    public String animationIconUrl;
    public boolean isEnabled;
    public boolean isReddotVisible;
    public String mDarkColor;
    public int mID;
    public List mIconInfoList;
    public String mLightColor;
    public String mName;
    public float mTransparency;
    public String tagText;

    public void LiveVoicePartyActionButtonResponse$ButtonData(){
       super();
       this.isEnabled = true;
       this.isReddotVisible = false;
    }
    public String getFirstAvailableURL(){
       LiveVoicePartyActionButtonResponse$IconInfo iconInfo;
       Iterator obj = PatchProxy.apply(null, this, LiveVoicePartyActionButtonResponse$ButtonData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mIconInfoList)) {
          return null;
       }
       obj = this.mIconInfoList.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          iconInfo = obj.next();
          if (iconInfo == null || TextUtils.x(iconInfo.mURL)) {
             continue ;
          }else {
             break ;
          }
       }
       return iconInfo.mURL;
    }
}
