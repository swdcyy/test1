package com.yxcorp.plugin.setting.stencil.item.SwitchAccountItem;
import ehc.g;
import ihc.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k2b.e0;
import com.yxcorp.gifshow.settings.stencil.item.ToolKitKt;
import com.yxcorp.plugin.setting.stencil.item.SwitchAccountItem$action$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import msd.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class SwitchAccountItem extends b implements g	// class@00091d
{
    public final g n;
    public final g o;
    public final l p;

    public void SwitchAccountItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.n = ToolKitKt.b(p1, this.d);
       this.o = this;
       this.p = new SwitchAccountItem$action$1(this);
    }
    public g f(){
       return this.o;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, SwitchAccountItem.class, "3")) {
          return;
       }
       SwitchAccountItem tn = this.n;
       if (tn != null) {
          tn.g();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x784f;
       u1.u(1, uElementPack, null);
       return;
    }
    public l getAction(){
       return this.p;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, SwitchAccountItem.class, "2")) {
          return;
       }
       SwitchAccountItem tn = this.n;
       if (tn != null) {
          tn.h();
       }
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       urlPackage.page = 5;
       uElementPack.action = 0x784f;
       u1.y0(urlPackage, 3, uElementPack, null);
       return;
    }
}
