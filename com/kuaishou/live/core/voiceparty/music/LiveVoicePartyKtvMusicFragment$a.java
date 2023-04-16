package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.widget.TextView;
import android.graphics.Typeface;
import android.util.SparseIntArray;
import qu2.a;
import co2.f2;
import fs2.f;

public class LiveVoicePartyKtvMusicFragment$a implements ViewPager$i	// class@0017c2
{
    public final LiveVoicePartyKtvMusicFragment b;

    public void LiveVoicePartyKtvMusicFragment$a(LiveVoicePartyKtvMusicFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       LiveVoicePartyKtvMusicFragment$a uoa = LiveVoicePartyKtvMusicFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.isSupport(LiveVoicePartyKtvMusicFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, LiveVoicePartyKtvMusicFragment.class, "7")) {
          if (p0 == 1) {
             uoa.J.setVisibility(8);
             uoa.K.setTypeface(Typeface.DEFAULT_BOLD);
          }else {
             uoa.K.setTypeface(Typeface.DEFAULT);
          }
       }
       uoa = this.b;
       f.d(this.b.S.get(p0), uoa.Q, uoa.P);
       return;
    }
}
