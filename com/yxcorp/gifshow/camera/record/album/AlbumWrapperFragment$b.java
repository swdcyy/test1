package com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment$b;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import r79.c;

public class AlbumWrapperFragment$b implements IAlbumMainFragment$g	// class@001ca8
{
    public final AlbumWrapperFragment a;

    public void AlbumWrapperFragment$b(AlbumWrapperFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment$b.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onPreviewPageFinished", objArray);
       AlbumWrapperFragment$b ta = this.a;
       ta.j = false;
       ta.ch(0);
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumWrapperFragment$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onPreviewItem", objArray);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment$b.class, "1")) {
          return;
       }
       this.a.j = true;
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onPreviewPageStarted", objArray);
       this.a.ch(0);
       return;
    }
}
