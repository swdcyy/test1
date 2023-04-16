package com.kuaishou.live.core.basic.activity.p;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import qrd.l1;
import t02.g;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import pp.d;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kuaishou.live.core.basic.activity.c0;
import msd.l;
import en8.a;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import f12.d;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import java.util.Iterator;
import vy6.a;
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.e;
import m02.h;
import java.lang.Runnable;
import ekd.k1;
import m02.g;

public final class p implements a	// class@00184c
{
    public final LivePlayFragment b;

    public void p(LivePlayFragment p0){
       this.b = p0;
    }
    public final Object invoke(){
       l1 a;
       p tb = this.b;
       if (tb.x1 != null) {
          a = l1.a;
       }else {
          tb.J.H.g(LivePlayFragment.K1, "attachedOnScrollEnd", ImmutableMap.of("userName", TextUtils.k(tb.H.getUserName())));
          tb.n1 = false;
          LivePlayFragment y1 = tb.y1;
          Objects.requireNonNull(y1);
          if (!PatchProxy.applyVoid(null, y1, LivePlayLoader.class, "9") && (y1.b != null && y1.g.U1())) {
             y1.b.g(c0.b);
          }
       label_004c :
          tb.p = tb.e1.J(tb, tb.H.mEntity);
          tb.Oh(true);
          if (!PatchProxy.applyVoid(null, tb, DetailSlidePlayFragment.class, "11")) {
             Iterator iterator = tb.u.iterator();
             while (iterator.hasNext()) {
                iterator.next().k1();
             }
             DetailSlidePlayFragment v = tb.v;
             if (v != null) {
                v.t1().k(tb);
             }
          }
          LivePlayFragment z1 = tb.z1;
          Objects.requireNonNull(z1);
          if (!PatchProxy.applyVoid(null, z1, e.class, "5")) {
             k1.s(new h(z1), z1, 20);
             k1.s(new g(z1), z1, 3000);
          }
          a = l1.a;
       }
       return a;
    }
}
