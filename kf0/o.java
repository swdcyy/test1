package kf0.o;
import kf0.o$a;
import nsd.u;
import kf0.s;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kf0.f;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import zsd.u;
import com.kuaishou.growth.pendant.core.manager.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import kf0.o$b;
import java.util.Objects;
import java.lang.Integer;
import kf0.f$b;
import kf0.f$a;
import java.util.Map;
import crd.b;
import lnc.b9;
import kf0.k;
import java.util.concurrent.Callable;
import brd.t;
import kf0.l;
import erd.o;
import t45.d;
import brd.z;
import kf0.m;
import kf0.n;
import erd.g;
import java.util.List;
import kf0.o$c;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import kf0.o$d;
import ub.b;

public final class o	// class@002d1a
{
    public String a;
    public CDNUrl[] b;
    public CDNUrl[] c;
    public int d;
    public int e;
    public Runnable f;
    public int g;
    public int h;
    public Runnable i;
    public final f j;
    public String k;
    public final String l;
    public int m;
    public long n;
    public final PendantAnimImageView o;
    public final TaskCommonParams p;
    public static final int q;
    public static final int r;
    public static final o$a s;

    static {
       o.s = new o$a(null);
       s d = s.d;
       o.q = d.a(80.00f);
       o.r = d.a(80.00f);
    }
    public void o(PendantAnimImageView p0,TaskCommonParams p1){
       a.p(p0, "mImageView");
       a.p(p1, "mParams");
       super();
       this.o = p0;
       this.p = p1;
       this.g = o.q;
       this.h = o.r;
       this.j = new f("task");
       TaskPendantConfig mPendantConf = p1.getMPendantConfig();
       if (mPendantConf != null) {
          TaskUIConfig mUiConfig = mPendantConf.getMUiConfig();
          if (mUiConfig != null) {
             this.b = mUiConfig.getMIconUrls();
             this.c = mUiConfig.getMCompleteIconUrls();
             this.a = mUiConfig.getMAnimResUrl();
             int mAnimFrameDu = (mUiConfig.getMAnimFrameDuration() > 0)? mUiConfig.getMAnimFrameDuration(): 33;
             this.d = mAnimFrameDu;
             this.m = mUiConfig.getMAnimRepeatCount();
             mAnimFrameDu = mUiConfig.getMAnimIntervalDuration();
             if (mAnimFrameDu < 0) {
                mAnimFrameDu = 5;
             }
             this.n = (long)mAnimFrameDu * 1000;
             if (mUiConfig.getMWidth() > 0 && mUiConfig.getMHeight() > 0) {
                this.g = mUiConfig.getMWidth();
                this.h = mUiConfig.getMHeight();
             }
          }
       }
       this.l = p1.getMActivityId();
       o ta = this.a;
       ta = (ta == null || u.S1(ta))? 1: null;
       if (!ta) {
          f.a(this.a, "task");
       }
       return;
    }
    public final void a(String p0,String p1,CDNUrl[] p2){
       o this;
       o oo = this;
       object oobject = p0;
       String str = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "3")) {
          return;
       }
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "TaskPendantAnimationHelper", "fetchAnimResource animKey: "+str+",mCurrentAnimKey "+oo.k, false, 4, null);
       if (a.g(oo.k, str)) {
          return;
       }
       oo.k = str;
       oo.j.a();
       this.c();
       o j = oo.j;
       o l = oo.l;
       this = oo.g;
       o h = oo.h;
       o$b uob = new o$b(oo, str, p2);
       Objects.requireNonNull(j);
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{l,oobject,str,Integer.valueOf(this),Integer.valueOf(h),uob};
          if (PatchProxy.applyVoid(objArray, j, uof, "2")) {
          label_0129 :
             return;
          }
       }
       a.p(oobject, "resourceUrl");
       a.p(str, "resourceKey");
       TaskCenterLogUtil.d(b, "TaskAnimResourceFetcher", "native fetchAnimResource start, activityId = "+l+", resourceUrl = "+oobject+", key = "+str, false, 4, null);
       f$b uob1 = new f$b(uob, l, p0, p1, j.b, false);
       String str1 = oobject+str;
       b9.a(j.a.get(str1));
       b.onStart();
       b uob2 = t.fromCallable(new k(oobject, str, this, h)).map(new l(b)).subscribeOn(d.c).observeOn(d.a).subscribe(new m(b), new n(b));
       a.o(uob2, "disposable");
       j.a.put(str1, uob2);
       goto label_0129 ;
    }
    public final void b(List p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "6")) {
          return;
       }
       if (this.m > null) {
          this.o.setCallback(new o$c(this, p0));
          b = false;
       }else {
          this.o.setCallback(null);
          b = true;
       }
       this.o.r0(p0, b, (long)this.d, this.m);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       o ti = this.i;
       if (ti != null) {
          k1.m(ti);
          this.i = null;
       }
       return;
    }
    public final void d(PendantAnimImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "13")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "setFallbackImage", false, 4, null);
       o te = this.e;
       if (te > null) {
          p0.setPlaceHolderImage(te);
       }
       return;
    }
    public final void e(PendantAnimImageView p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "12")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "setImageUrl", false, 4, null);
       this.k = null;
       this.j.a();
       this.o.p0();
       this.c();
       if (!j.h(p1)) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-growth:pendant-task");
          uoa.d(ImageSource.ICON);
          a.m(p1);
          p0.Y(p1, uoa.a(), new o$d(this, p0));
       }else {
          this.d(p0);
       }
       return;
    }
}
