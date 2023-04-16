package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b$b$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b;
import java.lang.Integer;
import msd.l;

public final class VoicePartyTheaterTubeListTabFragment$b$b$a implements View$OnClickListener	// class@001a19
{
    public final VoicePartyTheaterTubeListTabFragment$b$b b;

    public void VoicePartyTheaterTubeListTabFragment$b$b$a(VoicePartyTheaterTubeListTabFragment$b$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$b$b$a.class, "1")) {
          return;
       }
       VoicePartyTheaterTubeListTabFragment$b$b$a tb = this.b;
       VoicePartyTheaterTubeListTabFragment$b$b a = tb.a;
       int adapterPosit = tb.getAdapterPosition();
       Objects.requireNonNull(a);
       VoicePartyTheaterTubeListTabFragment$b uob = VoicePartyTheaterTubeListTabFragment$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(adapterPosit), a, uob, "5")) {
          VoicePartyTheaterTubeListTabFragment$b.K0(a, adapterPosit, false, 2, null);
          a.h.invoke(Integer.valueOf(a.J0(adapterPosit)));
       }
       return;
    }
}
