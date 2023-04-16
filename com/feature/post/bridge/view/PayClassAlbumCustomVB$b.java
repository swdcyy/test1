package com.feature.post.bridge.view.PayClassAlbumCustomVB$b;
import android.view.View$OnClickListener;
import com.feature.post.bridge.view.PayClassAlbumCustomVB;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import o79.d;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public final class PayClassAlbumCustomVB$b implements View$OnClickListener	// class@0014d9
{
    public final PayClassAlbumCustomVB b;

    public void PayClassAlbumCustomVB$b(PayClassAlbumCustomVB p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       d.b("close");
       FragmentActivity activity = this.b.j().getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}
