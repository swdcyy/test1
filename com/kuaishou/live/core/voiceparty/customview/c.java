package com.kuaishou.live.core.voiceparty.customview.c;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar$c;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyBottomBar$b;
import com.kuaishou.live.core.voiceparty.emoji.play.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;

public final class c implements LiveVoicePartyBottomBar$c	// class@0014c5
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(int p0,int p1){
       boolean b;
       LiveVoicePartyCommonConfig obj = PatchProxy.apply(null, null, f.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = a.M(LiveVoicePartyCommonConfig.class);
          b = (obj == null || obj.mDisableShowEmojiButton == null)? true: false;
       }
       return b;
    }
}
