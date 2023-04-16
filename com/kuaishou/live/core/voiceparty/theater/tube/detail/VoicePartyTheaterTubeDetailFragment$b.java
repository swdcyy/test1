package com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$b;
import y8c.g;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$e;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.d;
import ml8.c;

public class VoicePartyTheaterTubeDetailFragment$b extends g	// class@001a04
{
    public final VoicePartyTheaterTubeDetailFragment w;

    public void VoicePartyTheaterTubeDetailFragment$b(VoicePartyTheaterTubeDetailFragment p0){
       this.w = p0;
       super();
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeDetailFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyTheaterTubeDetailFragment$e(p0, this.w.J);
    }
    public f h1(ViewGroup p0,int p1){
       VoicePartyTheaterTubeDetailFragment$b uob = VoicePartyTheaterTubeDetailFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = (this.w.I == 1)? a.i(p0, R.layout.arg_RES_7f0d16f0): a.i(p0, R.layout.arg_RES_7f0d16f3);
       return new f(view, new d());
    }
}
