package com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment$c;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment;
import java.lang.Object;
import java.lang.Long;
import w69.z;
import r79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import sb9.r0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.e0;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class AlbumWrapperFragment$c implements IAlbumMainFragment$b	// class@001ca9
{
    public final AlbumWrapperFragment a;

    public void AlbumWrapperFragment$c(AlbumWrapperFragment p0){
       this.a = p0;
       super();
    }
    public void a(Long p0){
       z.b(this, p0);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumWrapperFragment$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onItemSelected", objArray);
       this.a.ch(0);
       AlbumWrapperFragment$c ta = this.a;
       AlbumWrapperFragment p = ta.p;
       if (!PatchProxy.applyVoidTwoRefs(ta, p, null, r0.class, "10") && !PatchProxy.applyVoidThreeRefs(ta, "pick_picture", p, null, r0.class, "11")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = ta.o();
          urlPackage.params = "task_id="+p;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "pick_picture";
          uElementPack.action2 = "RECORD_PRODUCTION_MAKE_OPERATION";
          uElementPack.type = 1;
          u1.A(urlPackage, "", 1, uElementPack, null);
       }
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumWrapperFragment$c.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onItemUnSelected", objArray);
       this.a.ch(0);
       return;
    }
}
