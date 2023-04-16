package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VoicePartyTheaterTubeListTabFragment$c extends RecyclerView$n	// class@001a1c
{
    public final int a;
    public final int b;
    public final int c;

    public void VoicePartyTheaterTubeListTabFragment$c(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       IllegalArgumentException illegalArgum = (p0 > 0 && (p1 >= 0 && p2 >= 0))? 1: null;
       if (illegalArgum) {
          return;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, VoicePartyTheaterTubeListTabFragment$c.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       float f = (float)this.a;
       float f1 = (float)p2.getChildAdapterPosition(p1) % f;
       VoicePartyTheaterTubeListTabFragment$c tb = this.b;
       p0.left = (int)(((f1 / f) * (float)tb) + 0x3f000000);
       p0.right = (int)((((f - (float)1) - f1) / f) * (float)tb);
       p0.bottom = this.c;
       return;
    }
}
