package com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView$a;
import hkd.d;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.preview.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.widget.RelativeLayout;
import com.yxcorp.utility.n;

public class KsAlbumVideoPlayerView$a extends d	// class@001b20
{
    public final KsAlbumVideoPlayerView b;

    public void KsAlbumVideoPlayerView$a(KsAlbumVideoPlayerView p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView$a.class, "1")) {
          return;
       }
       KsAlbumVideoPlayerView b = this.b.b;
       if (b == null) {
          return;
       }
       String str = b.b();
       if (TextUtils.isEmpty(str)) {
          return;
       }
       this.b.f.setText(str);
       ViewGroup$MarginLayoutParams layoutParams = this.b.f.getLayoutParams();
       layoutParams.leftMargin = n.c(this.b.getContext(), 10.00f);
       layoutParams.topMargin = n.c(this.b.getContext(), 0x41f00000);
       this.b.f.setLayoutParams(layoutParams);
       return;
    }
}
