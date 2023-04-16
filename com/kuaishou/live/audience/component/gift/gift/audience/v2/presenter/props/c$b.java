package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c$b;
import gl1.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c;
import z1.k;
import vg1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lz0.c;
import java.lang.Boolean;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import mk1.b;
import k2b.e0;
import ik1.a0;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;

public class c$b extends a	// class@000b5c
{
    public final c c;

    public void c$b(c p0,k p1,c p2){
       this.c = p0;
       super(p1, p2);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       this.c.f1("live_props");
       return;
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c$b.class, "1")) {
          return;
       }
       this.c.c9();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       Objects.requireNonNull(this.c);
       a0.m(this.c.w.Z2.b(), this.c.w.Z2.a(), "PROP_LIST_PANEL", this.c.w.Z2.y(), this.c.B.i());
       c$b tc = this.c;
       tc.j9(tc.B, "CLIENT_GIFT_BOX_TAB_SHOW", "[LiveAudienceGiftBoxPropsPresenter][onGiftTabShown]show props tab", 1);
       return;
    }
    public void j(boolean p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       uob = this.c;
       if (uob.F != null) {
          uob.C9(p0, p1);
       }
       return;
    }
    public LiveProp k(){
       return this.c.T;
    }
}
