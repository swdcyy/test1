package k81.a;
import g9c.a;
import g81.a;
import k81.e;
import java.util.HashMap;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import k81.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import com.kuaishou.live.basic.model.QLiveMessage;
import k81.j;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import k81.g;
import msd.a;
import k51.b;
import android.view.ViewGroup;
import k81.k;
import android.content.Context;

public class a extends a	// class@002cd2
{
    public final e g;
    public final Map h;
    public final Map i;
    public final a j;
    public d k;
    public j l;

    public void a(a p0){
       super(false);
       this.g = new e();
       this.h = new HashMap();
       this.i = new HashMap();
       this.e = new ArrayList();
       this.j = p0;
       this.G0(true);
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
       }else {
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, h.class, "2")) {
             h d = p0.d;
             if (d != null) {
                p0.b(p0.itemView, d);
                h c = p0.c;
                if (c != null) {
                   c.b(d);
                }
             }
             p0.d = null;
          }
       }
       return;
    }
    public long d0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return (long)System.identityHashCode(this.N0(p0));
    }
    public int f0(int p0){
       QLiveMessage obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.N0(p0);
       if (obj == null) {
          b.G(LiveLogTag.COMMENT, "getItemViewType message is null", "position", Integer.valueOf(p0), "itemCount", Integer.valueOf(this.getItemCount()), null);
          return Integer.MIN_VALUE;
       }else {
          Class class = obj.getClass();
          Integer integer = this.h.get(class);
          if (integer == null) {
             b.H(LiveLogTag.COMMENT, "getItemViewType don\'t register class", "class", class, null);
             return Integer.MIN_VALUE;
          }else {
             return integer.intValue();
          }
       }
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          QLiveMessage qLiveMessage = this.N0(p1);
          if (qLiveMessage != null) {
             a tg = this.g;
             Objects.requireNonNull(tg);
             if (!PatchProxy.applyVoidOneRefs(qLiveMessage, tg, e.class, "1")) {
                if (qLiveMessage.mHasShowed == null) {
                   tg.a.add(TextUtils.k(qLiveMessage.getId()));
                }
                if (tg.a.size() >= 30) {
                   tg.a();
                }
             }
             Objects.requireNonNull(p0);
             h oh = h.class;
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(qLiveMessage, Integer.valueOf(p1), p0, oh, "1")) {
                p0.d = qLiveMessage;
                p0.e = p1;
                b.b("LiveCommentsViewHolder::onBindData", new g(p0, qLiveMessage, p1));
                h c = p0.c;
                if (c != null) {
                   c.a(qLiveMessage);
                }
                qLiveMessage.mHasShowed = true;
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       h oh;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          oh = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (oh != PatchProxyResult.class) {
          }else {
          label_0019 :
             k ok = this.i.get(Integer.valueOf(p1));
             if (ok != null) {
                h oh1 = ok.a(p0, this.j);
                oh1.b = this.k;
                oh1.c = this.l;
                oh = oh1;
             }else {
                oh = new h(new View(p0.getContext()));
             }
          }
       }else {
          goto label_0019 ;
       }
       return oh;
    }
}
