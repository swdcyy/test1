package com.kuaishou.live.core.voiceparty.util.a;
import android.content.DialogInterface$OnCancelListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements DialogInterface$OnCancelListener	// class@001ad4
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void onCancel(DialogInterface p0){
       b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartyActionUtil showUnfollowDialog cancel");
    }
}
