package cl3.f;
import dk3.a;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.autoplay.live.g;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import pp.d;
import uk3.a;
import jl3.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.robust.PatchProxyResult;
import androidx.collection.ArraySet;
import java.util.HashSet;
import cl3.f$a;
import cl3.f$b;
import cl3.f$c;
import cl3.c;
import cl3.f$d;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import kp.r1;
import xp5.a;
import u53.b;
import ul3.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import tkd.b;
import tkd.d;
import gp5.c;
import cl3.a;
import java.lang.Boolean;
import java.lang.Float;
import p51.c;
import cl3.b;
import ll3.j;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.live.preview.item.model.LivePreviewPlayerResolutionOptConfig;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.preview.item.model.LivePreviewPlayerResolutionOptConfig$TimeRange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import com.yxcorp.utility.n;
import cl3.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import java.util.Objects;
import brd.t;
import cl3.d;
import erd.g;
import crd.b;
import com.kuaishou.live.basic.playview.LivePlayViewHelper;
import android.view.View$OnLayoutChangeListener;
import java.util.Set;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import cl3.l;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import cl3.n;
import java.lang.Integer;
import com.kwai.video.waynelive.LivePlayerController;
import at5.a;
import rkd.b;
import ga1.b;
import com.kuaishou.android.live.model.LiveStreamModel;
import p51.d;
import ga1.a;

public class f extends a	// class@000594
{
    public final LiveAutoPlay$d A;
    public final LivePlayerTypeChangeListener B;
    public final LiveAutoPlay$b C;
    public final ViewGroup e;
    public final View f;
    public final g g;
    public final LiveStreamFeed h;
    public final Activity i;
    public final b j;
    public final d k;
    public final QLivePlayConfig l;
    public final boolean m;
    public final c n;
    public n o;
    public int p;
    public int q;
    public int r;
    public int s;
    public LivePlayTextureView t;
    public boolean u;
    public boolean v;
    public final ArraySet w;
    public final Set x;
    public final View$OnLayoutChangeListener y;
    public final View$OnLayoutChangeListener z;

    public void f(Activity p0,View p1,ViewGroup p2,g p3,LiveStreamFeed p4,d p5,a p6,b p7,QLivePlayConfig p8){
       float f;
       c uoc;
       boolean b1;
       super();
       this.w = new ArraySet();
       this.x = new HashSet();
       this.y = new f$a(this);
       this.z = new f$b(this);
       this.A = new f$c(this);
       this.B = new c(this);
       this.C = new f$d(this);
       this.i = p0;
       this.f = p1;
       this.e = p2;
       this.g = p3;
       this.h = p4;
       this.k = p5;
       this.j = p7;
       this.l = p8;
       boolean b = b.b(p4.mConfig, r1.U1(p4)).f();
       this.m = b;
       p3 = PatchProxy.applyOneRefs(p6, null, a.class, "6");
       String str = null;
       if (p3 != PatchProxyResult.class) {
          f = p3.floatValue();
       }else if(p6.d()){
          f = (float)d.a(-87665878).mC() / 2.00f;
       }else {
          f = 0;
       }
       p6 = a.class;
       int i = 1;
       if (PatchProxy.isSupport(p6)) {
          Object[] objArray = new Object[]{p0,null,p2,Boolean.valueOf(b),Float.valueOf(f)};
          uoc = PatchProxy.apply(objArray, null, p6, "1");
          if (uoc != PatchProxyResult.class) {
          }else if(!f - str){
             uoc = c.d(p0, null, p2, b);
          }else if(b){
             uoc = new b(p0, null, p2, f);
          }else {
             uoc = new a(p0, null, p2, f);
          }
       }else {
          goto label_00af ;
       }
       this.n = uoc;
       b = PatchProxy.apply(null, null, j.class, "5");
       if (b != PatchProxyResult.class) {
          i = b.booleanValue();
       }else {
          String str1 = a.t().c("enableLivePreviewLandscapeSizeTimeRange", "");
          if (!TextUtils.x(str1)) {
             LivePreviewPlayerResolutionOptConfig livePreviewP = a.a.h(str1, LivePreviewPlayerResolutionOptConfig.class);
             if (livePreviewP == null || (livePreviewP.mEnablePlayerResolution != null && !q.f(livePreviewP.mTimeRange))) {
                Iterator iterator = livePreviewP.mTimeRange.iterator();
                do {
                   if (iterator.hasNext()) {
                      LivePreviewPlayerResolutionOptConfig$TimeRange timeRange = iterator.next();
                      LivePreviewPlayerResolutionOptConfig$TimeRange mBeginTime = timeRange.mBeginTime;
                      timeRange = timeRange.mEndTime;
                      uoc = PatchProxy.applyTwoRefs(mBeginTime, timeRange, null, j.class, "6");
                      if (uoc != PatchProxyResult.class) {
                         b1 = uoc.booleanValue();
                      }else if(TextUtils.x(mBeginTime) || TextUtils.x(timeRange)){
                         str = "HH:mm";
                         try{
                            SimpleDateFormat simpleDateFo = new SimpleDateFormat(str);
                            Date uDate = simpleDateFo.parse(simpleDateFo.format(new Date()));
                            Date uDate1 = simpleDateFo.parse(mBeginTime);
                            Date uDate2 = simpleDateFo.parse(timeRange);
                            if (uDate == null || (uDate1 != null && uDate2 != null)) {
                               Calendar instance = Calendar.getInstance();
                               Calendar instance1 = Calendar.getInstance();
                               Calendar instance2 = Calendar.getInstance();
                               instance.setTime(uDate);
                               instance1.setTime(uDate1);
                               instance2.setTime(uDate2);
                               if (instance.after(instance1) && instance.before(instance2)) {
                                  b1 = true;
                               }
                            }
                         }catch(java.text.ParseException e8){
                            e8.printStackTrace();
                         }
                      }
                   }
                } while (b1);
             }
          }
          i = false;
       }
       this.v = i;
       return;
    }
    public void c(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          this.p = n.k(this.i);
          int i = n.j(this.i);
          this.q = i;
          if (this.p == null || !i) {
             n.f(this.i).post(new e(this));
          }
       }
       this.g();
       this.e(new LivePlayTextureView(this.i));
       this.g.O(this.A);
       this.g.P(this.C);
       if (a.a()) {
          uof = this.g;
          f tB = this.B;
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoidOneRefs(tB, uof, g.class, "31")) {
             uof.i.add(tB);
          }
       }
       this.a(this.j.c().distinctUntilChanged().subscribe(new d(this)));
       if (LivePlayViewHelper.c.a()) {
          this.f.addOnLayoutChangeListener(this.z);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.g.Y(this.A);
       this.g.Z(this.C);
       f tg = this.g;
       f tB = this.B;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(tB, tg, g.class, "32")) {
          tg.i.remove(tB);
       }
       this.w.clear();
       this.x.clear();
       if (LivePlayViewHelper.c.a()) {
          this.f.removeOnLayoutChangeListener(this.z);
       }
       return;
    }
    public void e(LivePlayTextureView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       if (this.t != null) {
          this.k.c(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "attach player view failed, already has a playerView");
       }
       boolean b = false;
       this.u = b;
       this.t = p0;
       p0.setOpaque(b);
       this.t.setClickable(b);
       this.t.setVisibility(b);
       if (this.t.getLayoutParams() instanceof FrameLayout$LayoutParams) {
          this.e.addView(this.t);
       }else {
          this.e.addView(this.t, new FrameLayout$LayoutParams(-1, -1, 17));
       }
       if (this.v != null) {
          this.t.addOnLayoutChangeListener(this.y);
       }
       f tt = this.t;
       p0.c = tt;
       this.g.d0(tt);
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().o();
       }
       return;
    }
    public final AdaptPlayViewReason f(){
       f obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.a()) {
          return AdaptPlayViewReason.DEFAULT;
       }
       obj = this.o;
       AdaptPlayViewReason vIDEO_CHATTI = (obj != null && obj.c == 1)? AdaptPlayViewReason.VIDEO_CHATTING_START: AdaptPlayViewReason.VIDEO_CHATTING_END;
       return vIDEO_CHATTI;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       if (this.v != null && this.u == null) {
          f tp = this.p;
          f tq = this.q;
          if (this.l.isLandscape()) {
             tq = (int)(((double)this.p / 16.00f) * 9.00f);
          }
          this.g.e0(tp, tq);
       }
       return;
    }
    public void h(int p0,int p1,AdaptPlayViewReason p2){
       float f;
       boolean i;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, f.class, "7")) {
          return;
       }
       if (this.t != null && this.g.Q() != null) {
          Iterator iterator = this.w.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().l(this.g.Q(), p0, p1, this.p, this.q, this.t, this.e)) {
                   return;
                }
                continue ;
             }
          }
       }
       if (this.n != null && this.g.Q() != null) {
          f = (float)p0 / (float)p1;
          if (this.m != null) {
             this.n.j(this.g.Q().isSideBySideStream());
          }
          boolean b = (b.g())? b.e(): n.I(this.i);
          boolean b1 = b;
          f tn = this.n;
          LiveStreamFeed obj = PatchProxy.apply(null, this, uof, "10");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = this.h.mLiveStreamModel;
             i = (obj != null && obj.mIsGRPRCustomized != null)? true: false;
             i = d.a(i) + d.b(this.i);
          }
          int i1 = i;
          b uob = new b(b1, f, i1, this.p, this.q, p2, null);
          tn.a(this.g.Q().isSideBySideStream());
          this.u = true;
       }
       return;
    }
}
