package com.yxcorp.gifshow.camera.record.album.slideup.list.d;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a$b;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.ArrayList;
import om6.k;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import t45.d;
import brd.z;
import wb9.h;
import java.util.List;
import wb9.d;
import erd.g;
import crd.b;

public final class d implements a$b	// class@001cd7
{
    public final h a;

    public void d(h p0){
       this.a = p0;
    }
    public final void a(QMedia p0,int p1){
       d ta = this.a;
       Objects.requireNonNull(ta);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), ta, oh, "12")) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, oh, "19")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PHOTO_ALBUM_CONTENT";
             u1.u(1, uElementPack, objArray);
          }
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p0);
          y6.s(k.class, LoadPolicy.DIALOG).G(d.a).R(new h(ta, uArrayList, p0), new d(ta));
       }
       return;
    }
}
