package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$b;
import com.yxcorp.gifshow.album.IAlbumMainFragment$a;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.IAlbumMainFragment;

public class AlbumActivityV2$b implements IAlbumMainFragment$a	// class@001c9e
{
    public final AlbumActivityV2 a;

    public void AlbumActivityV2$b(AlbumActivityV2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2$b.class, "1")) {
          return;
       }
       this.a.O.t3(false);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2$b.class, "2")) {
          return;
       }
       this.a.O.t3(true);
       return;
    }
}
