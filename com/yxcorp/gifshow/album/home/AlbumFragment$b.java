package com.yxcorp.gifshow.album.home.AlbumFragment$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o79.d;
import w69.k0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class AlbumFragment$b implements View$OnClickListener	// class@0019ed
{
    public final AlbumFragment b;

    public void AlbumFragment$b(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment$b.class, "1")) {
          return;
       }
       AlbumFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, AlbumFragment.class, "71")) {
          d.b("close");
          AlbumFragment e = tb.E;
          if (e == null || e.a() != true) {
             FragmentActivity activity = tb.getActivity();
             if (activity != null) {
                activity.finish();
             }
          }
       }
       return;
    }
}
