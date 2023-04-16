package com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import java.util.Objects;
import java.lang.Float;
import android.widget.ImageView;
import android.view.View;

public class CloudMusicRecyclerFragmentV2$a extends RecyclerView$r	// class@001fde
{
    public final CloudMusicRecyclerFragmentV2 a;

    public void CloudMusicRecyclerFragmentV2$a(CloudMusicRecyclerFragmentV2 p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(CloudMusicRecyclerFragmentV2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, CloudMusicRecyclerFragmentV2$a.class, "1")) {
          return;
       }
       CloudMusicRecyclerFragmentV2$a ta = this.a;
       p1 = ta.S + p2;
       ta.S = p1;
       int i = Math.abs(p1);
       p1 = CloudMusicRecyclerFragmentV2.T;
       float f = 0x3f800000;
       if (i <= p1) {
          f = ((float)i * f) / (float)p1;
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(CloudMusicRecyclerFragmentV2.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), ta, CloudMusicRecyclerFragmentV2.class, "6")) {
          CloudMusicRecyclerFragmentV2 q = ta.Q;
          if (q != null) {
             q.setAlpha(f);
          }else {
             CloudMusicRecyclerFragmentV2 r = ta.R;
             if (r != null) {
                r.setAlpha(f);
             }
          }
       }
       return;
    }
}
