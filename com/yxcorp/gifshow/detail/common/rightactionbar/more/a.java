package com.yxcorp.gifshow.detail.common.rightactionbar.more.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import qa9.s;
import whc.k0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import whc.b;
import whc.a;
import brd.t;
import whc.i;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class a implements View$OnClickListener	// class@0014ab
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b s;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       s.b(b.P8(this.b));
       s = this.b.s;
       if (s != null) {
          k0 ok0 = k0.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, s, ok0, "34")) {
             long l = Long.parseLong(s.a.getPhotoId());
             a.a().c(l, 0).subscribe(new i(s), new a());
             if (!PatchProxy.applyVoid(objArray, s, ok0, "35")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.type = 1;
                uElementPack.action2 = "PERMANENT_PERMISSION";
                u1.M(null, s.c, 1, uElementPack, null, null);
             }
          }
       }
       return;
    }
}
