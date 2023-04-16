package com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.music.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import i2b.a;

public class LiveKtvReverbEffectView$a extends RecyclerView$Adapter	// class@0016af
{
    public final LiveKtvReverbEffectView e;

    public void LiveKtvReverbEffectView$a(LiveKtvReverbEffectView p0){
       this.e = p0;
       super();
    }
    public void J0(LiveKtvReverbEffectView$b p0,boolean p1){
       LiveKtvReverbEffectView$a uoa = LiveKtvReverbEffectView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       p0.a.setSelected(p1);
       p0.b.setSelected(p1);
       p0 = p0.c;
       int i = (p1)? 0: 8;
       p0.setVisibility(i);
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveKtvReverbEffectView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.h.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveKtvReverbEffectView$a uoa = LiveKtvReverbEffectView$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          SoundEffectItem soundEffectI = this.e.h.get(p1);
          p0.a.setImageResource(soundEffectI.mIcon);
          p0.b.setText(soundEffectI.mName);
          boolean b = (soundEffectI.mReverbLevel == this.e.c.mReverbLevel)? true: false;
          this.J0(p0, b);
          p0.itemView.setOnClickListener(new a(this, soundEffectI, p0));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveKtvReverbEffectView$b uob;
       LiveKtvReverbEffectView$a uoa = LiveKtvReverbEffectView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uob != PatchProxyResult.class) {
          label_002e :
             return uob;
          }
       }
       uob = new LiveKtvReverbEffectView$b(a.g(LayoutInflater.from(p0.getContext()), 0x7f0d0c3f, p0, false));
       goto label_002e ;
    }
}
