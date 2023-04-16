package com.kuaishou.live.playback.list.c;
import erd.g;
import com.kuaishou.live.playback.list.LivePlaybackListFragment;
import java.lang.Object;
import gi3.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import g9c.a;
import java.util.ArrayList;
import ekd.q;
import hi3.c;
import java.lang.Iterable;
import ok.o;
import qk.y;
import s1c.r0;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Math;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import y8c.t;

public final class c implements g	// class@000d27
{
    public final LivePlaybackListFragment b;

    public void c(LivePlaybackListFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LivePlaybackListFragment.class, "18")) {
       }else if(p0 == null || TextUtils.isEmpty(p0.a)){
          ArrayList uArrayList = q.b(tb.g7().Q0());
          if (y.q(uArrayList, new c(p0)) && tb.Hh()) {
             p0 = tb.I;
             if (p0 != null) {
                p0 = p0.b;
                if (p0 != null) {
                   p0 = p0.mOwnerCount;
                   if (p0 != null) {
                      p0.mLivePlayBack = Math.max((p0.mLivePlayBack - 1), 0);
                      tb.I.b.notifyChanged();
                   }
                }
             }
          }
          tb.g7().W0(uArrayList);
          tb.g7().k0();
          if (q.f(uArrayList)) {
             tb.sh().i();
             tb.sh().g();
          }
       }
       return;
    }
}
