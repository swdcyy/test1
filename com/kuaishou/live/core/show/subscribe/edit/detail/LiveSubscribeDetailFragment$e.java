package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import tk2.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.util.List;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Integer;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams$DisplayMode;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$g;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$c;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailItemView;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$f;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribePendantSwitchItemView;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$a;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$b;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$d;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeSelectItemView;

public class LiveSubscribeDetailFragment$e extends RecyclerView$Adapter	// class@0010fe
{
    public final LiveSubscribeDetailFragment e;

    public void LiveSubscribeDetailFragment$e(LiveSubscribeDetailFragment p0){
       this.e = p0;
       super();
    }
    public void LiveSubscribeDetailFragment$e(LiveSubscribeDetailFragment p0,s p1){
       super(p0);
    }
    public final int J0(){
       LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail obj = PatchProxy.apply(null, this, LiveSubscribeDetailFragment$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e.k.mSubscribeInfoList;
       if (obj != null) {
          return obj.size();
       }
       return 0;
    }
    public final LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo K0(int p0){
       LiveSubscribeDetailFragment$e uoe = LiveSubscribeDetailFragment$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < this.J0()) {
          return this.e.k.mSubscribeInfoList.get(p0);
       }else {
          return null;
       }
    }
    public int f0(int p0){
       LiveSubscribeDetailFragment$e uoe = LiveSubscribeDetailFragment$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo liveSubscrib = this.K0(p0);
       if (liveSubscrib == null) {
          return 3;
       }else if(liveSubscrib.mDisplayConfig != null){
          liveSubscrib = (this.e.gh())? 5: 4;
          return liveSubscrib;
       }else if(liveSubscrib.mIsBanned != null || this.e.j.a == SubscribeDialogParams$DisplayMode.DetailList){
          return 1;
       }else {
          return 2;
       }
    }
    public int getItemCount(){
       LiveSubscribeDetailFragment obj = PatchProxy.apply(null, this, LiveSubscribeDetailFragment$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e.k;
       if (obj == null || q.f(obj.mSubscribeInfoList)) {
          return 0;
       }
       return (this.J0() + 1);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveSubscribeDetailFragment$e uoe = LiveSubscribeDetailFragment$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          p0.a(this.K0(p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveSubscribeDetailFragment$c uoc;
       LiveSubscribeDetailFragment$e uoe = LiveSubscribeDetailFragment$e.class;
       if (PatchProxy.isSupport(uoe)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (uoc != PatchProxyResult.class) {
          }else {
          label_001a :
             int i = 2;
             if (p1 == 1) {
                p1 = 0x7f0d0dec;
                if (this.e.j.h == null) {
                   i = 0;
                }
                uoc = new LiveSubscribeDetailFragment$c(this.e, a.j(p0, p1, i));
             }else if(p1 == 3){
                p1 = 0x7f0d0df2;
                if (this.e.j.h == null) {
                   i = 0;
                }
                uoc = new LiveSubscribeDetailFragment$f(this.e, a.j(p0, p1, i));
             }else if(p1 == 4){
                uoc = new LiveSubscribeDetailFragment$a(this.e, a.i(p0, 0x7f0d0dea));
             }else if(p1 == 5){
                uoc = new LiveSubscribeDetailFragment$b(this.e, a.i(p0, 0x7f0d0deb));
             }else {
                p1 = 0x7f0d0df7;
                if (this.e.j.h == null) {
                   i = 0;
                }
                uoc = new LiveSubscribeDetailFragment$d(this.e, a.j(p0, p1, i));
             }
          }
       }else {
          goto label_001a ;
       }
       return uoc;
    }
}
