package com.yxcorp.gifshow.album.home.AlbumFragment$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import z69.o;
import tyc.q0;

public final class AlbumFragment$c implements View$OnClickListener	// class@0019ee
{
    public final AlbumFragment b;

    public void AlbumFragment$c(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment$c.class, "1")) {
          return;
       }
       AlbumFragment$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, AlbumFragment.class, "72")) {
          tb.T.a(p0, new o(tb));
       }
       return;
    }
}
