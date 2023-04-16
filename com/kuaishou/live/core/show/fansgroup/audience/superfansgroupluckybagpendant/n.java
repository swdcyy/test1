package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.n;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import android.view.View;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LivePendantInfo;
import i82.b;
import java.lang.String;
import java.lang.Object;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;
import i82.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import i82.f0;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel;
import androidx.lifecycle.ViewModel;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import i82.q;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import i82.s;
import java.util.Objects;
import i82.r;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.g;
import android.view.View$OnClickListener;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import i82.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.Lifecycle;

public class n implements LifecycleOwner, ViewModelStoreOwner	// class@000b41
{
    public final m b;
    public final LifecycleRegistry c;
    public final ViewModelStore d;

    public void n(View p0,LivePendantInfo p1,b p2,String p3,String p4){
       super();
       LifecycleRegistry lifecycleReg = new LifecycleRegistry(this);
       this.c = lifecycleReg;
       this.d = new ViewModelStore();
       lifecycleReg.setCurrentState(Lifecycle$State.CREATED);
       lifecycleReg.setCurrentState(Lifecycle$State.RESUMED);
       m om = new m(p4, p2);
       this.b = om;
       t ot = new t();
       ViewModelProvider viewModelPro = PatchProxy.apply(null, this, n.class, "5");
       if (viewModelPro != PatchProxyResult.class) {
       }else {
          viewModelPro = new ViewModelProvider(this, new f0(this));
       }
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel liveAudience = viewModelPro.get(LiveAudienceSuperFansGroupLuckyBagPendantViewModel.class);
       if (!PatchProxy.applyVoidFourRefs(this, liveAudience, p0, p3, ot, t.class, "1")) {
          SelectShapeTextView selectShapeT = p0.findViewById(R.id.live_top_right_super_fans_group_pendant_tag_text_view);
          p0.findViewById(R.id.live_top_right_super_fans_group_lucky_bag_icon_image_view).L(p3);
          liveAudience.g.observe(this, new q(p0.findViewById(R.id.live_top_right_super_fans_group_lucky_bag_pendant_timer_text_view)));
          liveAudience.e.observe(this, new s(selectShapeT));
          Objects.requireNonNull(selectShapeT);
          liveAudience.c.observe(this, new r(selectShapeT));
          p0.findViewById(R.id.live_top_right_super_fans_group_lucky_bag_pendant_item).setOnClickListener(new g(ot, liveAudience));
       }
       Objects.requireNonNull(om);
       if (!PatchProxy.applyVoidOneRefs(p1, om, m.class, "2")) {
          om.h();
          om.g();
          om.b(p1);
          om.j(p1.mDrawChanceId, p1.mNextFetchTimestampMs);
          ClientContent$LiveStreamPackage liveStreamPa = om.f.a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, u.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_LUCKY_BAG_PENDANT";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(9, uElementPack, uContentPack);
          }
          b.c0(LiveLogTag.LIVE_SUPER_FANS_GROUP_PENDANT, "handlePendantInfo", "pendant info", p1.toString());
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.c;
    }
    public ViewModelStore getViewModelStore(){
       return this.d;
    }
}
