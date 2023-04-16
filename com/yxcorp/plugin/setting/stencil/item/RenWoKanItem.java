package com.yxcorp.plugin.setting.stencil.item.RenWoKanItem;
import ehc.g;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k2b.e0;
import com.yxcorp.gifshow.settings.stencil.item.ToolKitKt;
import com.yxcorp.plugin.setting.stencil.item.RenWoKanItem$action$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import msd.l;

public final class RenWoKanItem extends a implements g	// class@00091b
{
    public final g r;
    public final g s;
    public final l t;

    public void RenWoKanItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = ToolKitKt.b(p1, this.d);
       this.s = this;
       this.t = new RenWoKanItem$action$1(this, p1);
    }
    public g f(){
       return this.s;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, RenWoKanItem.class, "2")) {
          return;
       }
       RenWoKanItem tr = this.r;
       if (tr != null) {
          tr.g();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x76b0;
       u1.u(1, uElementPack, null);
       return;
    }
    public l getAction(){
       return this.t;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RenWoKanItem.class, "1")) {
          return;
       }
       RenWoKanItem tr = this.r;
       if (tr != null) {
          tr.h();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x76b3;
       u1.u0(3, uElementPack, null);
       return;
    }
}
