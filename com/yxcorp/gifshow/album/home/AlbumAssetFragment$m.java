package com.yxcorp.gifshow.album.home.AlbumAssetFragment$m;
import erd.g;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class AlbumAssetFragment$m implements g	// class@0019e1
{
    public final FragmentActivity b;
    public final AlbumAssetFragment c;

    public void AlbumAssetFragment$m(FragmentActivity p0,AlbumAssetFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumAssetFragment$m.class, "1")) {
       }else {
          AlbumAssetFragment$m tc = this.c;
          tc.y = null;
          tc.I = p0.getStringExtra("camera_photo_path");
          this.c.startActivityForResult(p0, 256);
          this.b.overridePendingTransition(R.anim.arg_RES_7f010063, 0x7f010062);
          PatchProxy.onMethodExit(AlbumAssetFragment$m.class, "1");
       }
       return;
    }
}
