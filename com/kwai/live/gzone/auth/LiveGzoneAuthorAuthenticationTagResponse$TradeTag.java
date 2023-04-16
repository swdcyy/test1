package com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$TradeTag;
import mkd.a;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$Tag;
import com.yxcorp.gifshow.model.CDNUrl;

public class LiveGzoneAuthorAuthenticationTagResponse$TradeTag extends LiveGzoneAuthorAuthenticationTagResponse$Tag implements a	// class@000c68
{
    public boolean mIsDynamicLink;
    public CDNUrl[] mMedalIcon;
    public String mMedalLink;
    public String mMedalName;
    public static final long serialVersionUID = 0x997480e18dcfe60b;

    public void LiveGzoneAuthorAuthenticationTagResponse$TradeTag(){
       super();
    }
    public void afterDeserialize(){
       this.mTitle = this.mMedalName;
       this.mLink = this.mMedalLink;
       LiveGzoneAuthorAuthenticationTagResponse$TradeTag tmMedalIcon = this.mMedalIcon;
       if (tmMedalIcon != null && tmMedalIcon.length > 0) {
          this.mIcon = tmMedalIcon[0].mUrl;
       }
       return;
    }
}
