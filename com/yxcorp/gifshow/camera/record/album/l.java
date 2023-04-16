package com.yxcorp.gifshow.camera.record.album.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.album.o;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import android.view.View;
import lnc.a1;
import sb9.r;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.album.m;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import tkd.b;
import tkd.d;
import ra0.d;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import j8c.a;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import sb9.u;
import sb9.v;
import com.yxcorp.gifshow.camera.bubble.b$b;
import sb9.o;
import k07.g;
import brd.t;
import sb9.m;
import com.yxcorp.gifshow.camera.record.album.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.d;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.album.j;
import erd.o;
import com.yxcorp.gifshow.camera.record.album.d;
import com.yxcorp.gifshow.camera.record.album.f;
import com.yxcorp.gifshow.camera.bubble.c;

public final class l implements Runnable	// class@001cbb
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       Objects.requireNonNull(tb);
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oo, "7")) {
       }else if(!tb.o2() && tb.w != null){
          b uob = new b(RecordBubbleItem.ALBUM_AGGREGATION).n(tb.t).A(R.string.arg_RES_7f100172);
          uob.q(5000);
          uob.t((- a1.d(R.dimen.arg_RES_7f070329)));
          uob = uob.z(new r(tb));
          uob.v(m.a);
          tb.w.n(uob);
          if (!PatchProxy.applyVoid(objArray, tb, oo, "8")) {
             d uod = d.a(0x1bf6ff1d);
             if (uod.isAvailable()) {
                int i = 0;
                String str = "AlbumController";
                if (i.g().getHideSmartAlbumEntrance().get(Boolean.FALSE).booleanValue()) {
                   objArray = new Object[i];
                   a.D().w(str, "showNewSmartAlbumTips: hide smart album", objArray);
                }else if(!QCurrentUser.ME.isEnableLocalIntelligenceAlbum()){
                   objArray = new Object[i];
                   a.D().w(str, "showNewSmartAlbumTips: disable smart album", objArray);
                }else {
                   boolean b = uod.TX();
                   uob = new b(RecordBubbleItem.SMART_ALBUM).n(tb.t).z(new u(tb, uod));
                   uob.u(new v(tb, uod));
                   uob.o(new o(tb, b));
                   if (b) {
                      uob.A(R.string.arg_RES_7f104893).s(R.layout.arg_RES_7f0d00a6);
                      tb.Y1(uod.U5().subscribe(new m(tb, uob, b), e.b));
                   }else {
                      tb.Y1(uod.U5().observeOn(d.c).flatMap(j.b).observeOn(d.a).subscribe(new d(tb, uob, b), f.b));
                   }
                }
             }
          }
       }
       tb.w.u(RecordBubbleItem.ALBUM_AGGREGATION);
       return;
    }
}
