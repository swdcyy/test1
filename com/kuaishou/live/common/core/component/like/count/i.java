package com.kuaishou.live.common.core.component.like.count.i;
import ho1.j;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import hf3.a;
import ds5.a;
import java.lang.Object;
import java.util.ArrayList;
import ho1.h;
import com.kuaishou.live.common.core.component.like.count.i$a;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import ho1.a;
import ho1.i;
import java.lang.Integer;
import ho1.k;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;
import ds5.c;
import com.kuaishou.live.common.core.component.like.count.c;
import com.kuaishou.live.common.core.component.like.count.d;
import com.kuaishou.live.common.core.component.like.count.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.common.core.component.like.count.f;
import com.kuaishou.live.common.core.component.like.count.g;
import com.kuaishou.live.common.core.component.like.count.h;
import java.lang.Number;
import ec3.f;
import java.lang.Long;
import d61.v;
import com.yxcorp.utility.TextUtils;

public class i implements j	// class@001461
{
    public final LiveStreamFeedWrapper a;
    public final a b;
    public final a c;
    public final boolean d;
    public final List e;
    public long f;
    public String g;
    public final g h;
    public final c i;

    public void i(LiveStreamFeedWrapper p0,a p1,a p2,boolean p3){
       super();
       this.e = new ArrayList();
       this.f = -1;
       this.g = "0";
       this.h = new h(this);
       this.i = new i$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       if (!this.e.contains(p0)) {
          this.e.add(p0);
          this.h(this.g, this.f);
       }
       return;
    }
    public void b(a p0){
       i.b(this, p0);
    }
    public void c(a p0){
       i.c(this, p0);
    }
    public void d(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "3")) {
          return;
       }
       long l = k.a(p0, this.e, this.d);
       this.i(l, String.valueOf(l));
       return;
    }
    public void e(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.e.remove(p0);
       return;
    }
    public void f(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "4")) {
          return;
       }
       this.b.u0(310, LiveStreamMessages$SCFeedPush.class, this.h);
       this.c.gd(this.i);
       String str = PatchProxy.apply(objArray, this, oi, "6");
       if (str != patchProxyRe) {
       }else {
          Optional optional = k0.c(this.a, c.a, d.a, e.a);
          str = (optional.isPresent())? optional.get(): k0.c(this.a, f.a, g.a, h.a).or("0");
       }
       Object obj = PatchProxy.applyOneRefs(str, this, oi, "5");
       if (obj != patchProxyRe) {
          l = obj.longValue();
       }else {
          l = 0;
          l = (f.b())? Long.parseLong(str): v.f(str, l);
       }
    label_0078 :
       this.h(str, l);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       this.b.o(310, this.h);
       this.c.fo(this.i);
       this.f = -1;
       return;
    }
    public void h(String p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oi, "9")) {
          return;
       }
       String str = (p1 - this.f >= 0)? 1: null;
       if (!str) {
          return;
       }else {
          this.i(p1, p0);
          k.b(TextUtils.i(p0, String.valueOf(p1)), p1, this.e, this.d);
          return;
       }
    }
    public final void i(long p0,String p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, oi, "10")) {
          return;
       }
       if (p0 - this.f > 0) {
          this.f = p0;
          this.g = p1;
          this.a.setDisplayLikeCount(p1);
       }
       return;
    }
}
