package com.yxcorp.gifshow.profile.viewer.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment$a;
import java.lang.Object;
import android.view.View;
import crd.b;
import lnc.b9;
import java.lang.String;
import k2b.h;
import com.yxcorp.gifshow.fragment.f;
import k2b.e0;
import brd.t;
import com.yxcorp.gifshow.profile.util.f;
import a6c.a;
import a6c.b;
import erd.g;

public final class a implements View$OnClickListener	// class@0015e9
{
    public final ProfilePhotoViewListFragment$a b;

    public void a(ProfilePhotoViewListFragment$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       b9.a(tb.n);
       h.k("BROWSING_HIS_OPEN").i(tb.g);
       tb.d(true);
       tb.n = f.b("enable_photo_viewer", true).subscribe(new a(tb), new b(tb));
    }
}
