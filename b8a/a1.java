package b8a.a1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.a1$a;
import nsd.u;
import android.os.Handler;
import android.os.Looper;
import b8a.a1$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.a;
import com.yxcorp.gifshow.util.DateUtils;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeMeta;
import qrd.l1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import b8a.a1$b;
import java.lang.Runnable;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import android.text.format.Time;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public final class a1 extends PresenterV2	// class@00038e
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public f s;
    public final Handler t;
    public final a1$c u;
    public static boolean v;
    public static final a1$a w;

    static {
       a1.w = new a1$a(null);
    }
    public void a1(){
       super();
       this.t = new Handler(Looper.getMainLooper());
       this.u = new a1$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "2")) {
          return;
       }
       if (!a1.v && a.m() - DateUtils.l()) {
          a1 tq = this.q;
          String str = "mFragment";
          if (tq == null) {
             a.S(str);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tq.requireParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
          this.r = slidePlayVie;
          if (slidePlayVie == null) {
             a.S("mSlidePlayViewModel");
          }
          a1 tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tq1, this.u);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "7")) {
          return;
       }
       a1.v = false;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "6")) {
          return;
       }
       a1 tr = this.r;
       if (tr != null) {
          if (tr == null) {
             a.S("mSlidePlayViewModel");
          }
          a1 tq = this.q;
          if (tq == null) {
             a.S("mFragment");
          }
          tr.D(tq, this.u);
       }
       this.t.removeCallbacksAndMessages(null);
       return;
    }
    public final void P8(int p0){
       a1 uoa1 = a1.class;
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa1, "4")) {
          return;
       }
       RelaxTimeFeed relaxTimeFee = new RelaxTimeFeed();
       RelaxTimeMeta relaxTimeMet = new RelaxTimeMeta();
       relaxTimeMet.mRelaxType = p0;
       relaxTimeFee.mRelaxTimeMeta = relaxTimeMet;
       relaxTimeFee.mCommonMeta = new CommonMeta();
       a1 tr = this.r;
       String str = "mSlidePlayViewModel";
       if (tr == null) {
          a.S(str);
       }
       a1 tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       if (tr.H(tp)) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          a1 tp1 = this.p;
          if (tp1 == null) {
             a.S("mPhoto");
          }
          if (tr.f0(tp1)) {
             this.t.removeCallbacksAndMessages(null);
             this.t.post(new a1$b(this, relaxTimeFee, p0));
          }
       }
       return;
    }
    public final boolean R8(int p0,int p1,long p2){
       if (PatchProxy.isSupport(a1.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, a1.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = (p0 / 1000) / 60;
       int i = p0 / 60;
       p0 = p0 % 60;
       p1 = (p1 / 1000) / 60;
       int i1 = p1 / 60;
       p1 = p1 % 60;
       int i2 = 0;
       Object[] objArray = new Object[i2];
       o.C().w("NasaTimeManagementPresenter", i+':'+p0+'-'+i1+':'+p1, objArray);
       Time time = new Time();
       time.set(p2);
       Time time1 = new Time();
       time1.set(p2);
       time1.hour = i;
       time1.minute = p0;
       Time time2 = new Time();
       time2.set(p2);
       time2.hour = i1;
       time2.minute = p1;
       boolean b = true;
       if (!time1.before(time2)) {
          long l = (long)0x5265c00;
          time1.set((time1.toMillis(b) - l));
          if (!time.before(time1) && !time.after(time2)) {
             i2 = 1;
          }
          time2 = new Time();
          time2.set((time1.toMillis(b) + l));
          if (!time.before(time2)) {
          label_00c8 :
             return b;
          }
       }else if(!time.before(time1) && !time.after(time2)){
          i2 = 1;
       }
       b = i2;
       goto label_00c8 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "1")) {
          return;
       }
       f obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.s = obj;
       Object obj1 = this.q8(QPhoto.class);
       a.o(obj1, "inject\(QPhoto::class.java\)");
       this.p = obj1;
       return;
    }
}
