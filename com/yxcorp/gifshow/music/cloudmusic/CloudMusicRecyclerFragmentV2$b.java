package com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CloudMusicRecyclerFragmentV2$b extends RecyclerView$n	// class@001fdf
{
    public final CloudMusicRecyclerFragmentV2 a;

    public void CloudMusicRecyclerFragmentV2$b(CloudMusicRecyclerFragmentV2 p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CloudMusicRecyclerFragmentV2$b.class, "1")) {
          return;
       }
       if (!p2.getChildAdapterPosition(p1)) {
          p0.set(0, 0, 0, 0);
       }
       return;
    }
}
