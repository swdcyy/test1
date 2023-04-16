package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.b;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.LivePropChangeStateResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.SparseArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import b01.c;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import vg1.c;
import android.widget.BaseAdapter;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lz0.c;
import t02.a0;
import brd.t;
import ry1.b;
import b01.g;
import bp6.a;
import crd.b;
import mk1.h;
import cl1.c;

public final class b implements g	// class@000b5a
{
    public final c b;
    public final int c;
    public final LiveProp d;

    public void b(c p0,int p1,LiveProp p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       LiveProp mPropId1;
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       LivePropChangeStateResponse mNewPropList = p0.mNewPropList;
       if (mNewPropList == null) {
          if (tc == 1) {
             if (!PatchProxy.applyVoidOneRefs(td, tb, uoc, "11")) {
                String str = tb.U.get(td.mPropType);
                Object obj = PatchProxy.applyOneRefs(str, tb, uoc, "13");
                if (obj != PatchProxyResult.class) {
                }else if(TextUtils.x(str) || q.f(tb.S)){
                   obj = null;
                }else {
                   obj = y.y(tb.S, new c(str)).orNull();
                }
                if (obj != null) {
                   obj.setUnused();
                }
                td.setUsed();
                tb.U.put(td.mPropType, td.mPropId);
                tb.S8().notifyDataSetChanged();
                LiveLogTag lIVE_PROPS = LiveLogTag.LIVE_PROPS;
                LiveProp mPropId = td.mPropId;
                str = (obj == null)? "null": obj.mPropId;
                b.d0(lIVE_PROPS, "LiveAudienceGiftBoxPropsPresenter onLoadPropSucceed", "requestUsedPropId", mPropId, "oldUsedSameTypePropId", str);
             }
          }else if(PatchProxy.applyVoidOneRefs(td, tb, uoc, "12")){
             td.setUnused();
             tb.U.put(td.mPropType, "");
             tb.S8().notifyDataSetChanged();
             b.c0(LiveLogTag.LIVE_PROPS, "LiveAudienceGiftBoxPropsPresenter onUnloadPropSucceed", "propId", td.mPropId);
          }
       }else {
          tb.S = mNewPropList;
          tb.y9();
       }
       if (p0.mLivePropChangePrivilegeResponse != null) {
          tb.w.b3.T3().subscribe(new g(p0), new a());
       }
       tb.v.t.d();
       return;
    }
}
