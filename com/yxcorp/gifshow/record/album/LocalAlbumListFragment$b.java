package com.yxcorp.gifshow.record.album.LocalAlbumListFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p8c.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class LocalAlbumListFragment$b extends m	// class@0016fe
{
    public final LocalAlbumListFragment c;

    public void LocalAlbumListFragment$b(LocalAlbumListFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumListFragment$b.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, v.class, "58")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "VIDEO_REC";
          uElementPack.name = "home_camera_click";
          u1.u(6, uElementPack, null);
       }
       this.c.nh();
       return;
    }
}
