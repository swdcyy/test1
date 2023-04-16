package com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class VoicePartyFeedBaseFragment$a extends RecyclerView$n	// class@0014ed
{
    public final VoicePartyFeedBaseFragment a;

    public void VoicePartyFeedBaseFragment$a(VoicePartyFeedBaseFragment p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, VoicePartyFeedBaseFragment$a.class, "1")) {
          return;
       }
       int i = 0;
       if (this.a.ia().g1(p2.getChildAdapterPosition(p1))) {
          p0.left = i;
          p0.right = i;
          p0.top = i;
          p0.bottom = i;
       }else {
          int i1 = 1;
          int i2 = ((p2.getChildAdapterPosition(p1) - this.a.ia().b1()) < 2)? 1: 0;
          if (p2.getChildAdapterPosition(p1) % 2) {
             i1 = 0;
          }
          if (i2) {
             i = VoicePartyFeedBaseFragment.H;
          }
          p0.top = i;
          int h = VoicePartyFeedBaseFragment.H;
          if (!i1) {
             h = h / 2;
          }
          p0.left = h;
          h = VoicePartyFeedBaseFragment.H;
          if (i1) {
             h = h / 2;
          }
          p0.right = h;
          p0.bottom = VoicePartyFeedBaseFragment.H;
       }
       return;
    }
}
