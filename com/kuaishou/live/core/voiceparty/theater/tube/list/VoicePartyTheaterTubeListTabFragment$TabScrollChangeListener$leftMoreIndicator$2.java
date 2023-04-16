package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$leftMoreIndicator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;

public final class VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$leftMoreIndicator$2 extends Lambda implements a	// class@001a11
{
    public final VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener this$0;

    public void VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$leftMoreIndicator$2(VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$leftMoreIndicator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d.getView();
       a.m(obj);
       return obj.findViewById(0x7f0a3c8f);
    }
    public Object invoke(){
       return this.invoke();
    }
}
