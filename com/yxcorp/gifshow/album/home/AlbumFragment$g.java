package com.yxcorp.gifshow.album.home.AlbumFragment$g;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import w69.k;
import android.widget.ImageView;

public final class AlbumFragment$g implements Observer	// class@0019f2
{
    public final AlbumFragment b;

    public void AlbumFragment$g(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumFragment$g.class, "1")) {
       }else {
          AlbumFragment$g tb = this.b;
          a.h(p0, "granted");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(AlbumFragment.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, AlbumFragment.class, "41") && tb.b1 == null)) {
             tb.b1 = b;
             int i = 0;
             if (b) {
                b = tb.A;
                if (b == null) {
                   a.S("mAlbumUIOptions");
                }
                tb.W = b.z();
                b = tb.s;
                if (b != null) {
                   b.setVisibility(i);
                }
             }else {
                tb.W = i;
                b = tb.s;
                if (b != null) {
                   b.setVisibility(8);
                }
                tb.ph(true);
             }
          }
          PatchProxy.onMethodExit(AlbumFragment$g.class, "1");
       }
       return;
    }
}
