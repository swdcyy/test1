package com.yxcorp.gifshow.album.home.AlbumFragment$f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.util.List;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;

public final class AlbumFragment$f implements View$OnClickListener	// class@0019f1
{
    public final AlbumFragment b;

    public void AlbumFragment$f(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment$f.class, "1")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.b.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof AlbumAssetFragment) {
                   continue ;
                }
                uFragment.fh();
             }
          }
       }
       AlbumFragment.qh(this.b, false, 1, null);
       return;
    }
}
