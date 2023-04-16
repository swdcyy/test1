package com.kuaishou.live.core.voiceparty.model.VoicePartyAbParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class VoicePartyAbParams implements Serializable	// class@0017ac
{
    public boolean mEnableFollowGuestGuide;
    public boolean mEnableGuestOpenVideo;
    public boolean mEnableVoicePartyStickerOptimize;
    public boolean mEnableVoicePartyWishList;
    public static final long serialVersionUID = 0x352a7dbeca3420e8;

    public void VoicePartyAbParams(){
       super();
    }
    public static VoicePartyAbParams fromJson(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyAbParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return a.a.h(p0, VoicePartyAbParams.class);
       }
    }
}
