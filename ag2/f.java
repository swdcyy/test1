package ag2.f;
import c12.f;
import ag2.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.quiz.manager.j$a;
import com.kuaishou.live.core.show.quiz.manager.e;
import x61.c;
import lp3.c;
import lp3.i;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.quiz.manager.j;
import dg2.u;
import com.kuaishou.live.core.show.quiz.notice.b$a;
import androidx.lifecycle.MutableLiveData;
import z61.h;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import dg2.d;
import z61.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import ag2.c;
import ag2.e;
import ag2.a;
import ag2.b;
import ag2.d;

public class f extends f	// class@0000cd
{
    public a0 K;
    public j L;
    public e M;
    public u N;
    public b$a O;
    public i P;
    public MutableLiveData Q;
    public h R;
    public MutableLiveData S;
    public h T;
    public final j$a U;
    public static String sLivePresenterClassName = "LiveQuizBottomBarV2Presenter";

    public void f(){
       super();
       this.U = new f$a(this);
    }
    public void Q(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "3")) {
          return;
       }
       this.M.i(this.U);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(null, this, uof, "5")) {
          this.P.a(uoc).O0(3001);
          this.P.a(uoc).O0(3002);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.q8(j.class);
       this.N = this.q8(u.class);
       this.O = this.q8(b$a.class);
       this.M = this.q8(e.class);
       this.P = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       c uoc = c.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          this.Q = new MutableLiveData();
          h oh = new h();
          this.R = oh;
          oh.c = true;
          oh.e = 0x7f0702e8;
          StringBuilder str = "本场可用x ";
          h obj = PatchProxy.apply(objArray, this, uof, "8");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): this.L.e().a();
          oh.mText = str+i;
          uof = this.R;
          uof.d = 0x7f0620c7;
          uof.a = 0x7f081336;
          uof.mFeatureId = 3001;
          uof.mIsVisible = Boolean.valueOf(this.K.c.isQuizReviveCardEnable());
          uof = this.R;
          uof.mClickCallback = new c(this);
          uof.mShowCallback = new e(this);
          a uoa = new a(this);
          uof.mShowLogParamsSupplier = uoa;
          uof.mClickLogParamsSupplier = uoa;
          this.Q.setValue(uof);
          this.P.a(uoc).v1(this.Q);
          this.S = new MutableLiveData();
          obj = new h();
          this.T = obj;
          obj.c = true;
          obj.mText = "橡皮擦";
          obj.e = 0x7f0702e8;
          obj.d = 0x7f0620c7;
          obj.a = 0x7f08133a;
          obj.mFeatureId = 3002;
          obj.mIsVisible = Boolean.valueOf(this.K.c.isQuizGroupEnable());
          uof = this.T;
          uof.mClickCallback = new b(this);
          uof.mShowCallback = new d(this);
          this.S.setValue(uof);
          this.P.a(uoc).v1(this.S);
       }
       this.M.a(this.U);
       return;
    }
}
