package com.kuaishou.live.common.core.component.music.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$a;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$d;

public class a extends m	// class@0016b4
{
    public final SoundEffectItem c;
    public final LiveKtvReverbEffectView$b d;
    public final LiveKtvReverbEffectView$a e;

    public void a(LiveKtvReverbEffectView$a p0,SoundEffectItem p1,LiveKtvReverbEffectView$b p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       LiveKtvReverbEffectView$a e = this.e.e;
       a tc = this.c;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(tc, e, LiveKtvReverbEffectView.class, "3")) {
          LiveKtvReverbEffectView c = e.c;
          if (tc.mReverbLevel != c.mReverbLevel) {
             e.d.m0(e.h.indexOf(c), "");
          }
          e.c = tc;
       }
       this.e.J0(this.d, true);
       LiveKtvReverbEffectView e1 = this.e.e.e;
       if (e1 != null) {
          e1.a(this.c);
       }
       return;
    }
}
