package com.yxcorp.gifshow.album.home.AlbumFragment$e;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AlbumFragment$e extends ViewOutlineProvider	// class@0019f0
{
    public final AlbumFragment a;

    public void AlbumFragment$e(AlbumFragment p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumFragment$e.class, "1")) {
          return;
       }
       if (p1 != null) {
          int i = (p0 != null)? p0.getWidth(): 0;
          int i1 = (p0 != null)? p0.getHeight() + (int)this.a.Fh(): 0;
          p1.setRoundRect(0, 0, i, i1, this.a.Fh());
       }
       return;
    }
}
