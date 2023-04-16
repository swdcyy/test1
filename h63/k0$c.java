package h63.k0$c;
import c77.p;
import h63.k0;
import java.lang.Object;
import java.lang.Integer;
import mrd.a;
import brd.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i63.b;
import v53.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import java.lang.Boolean;
import v53.f;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import w37.b;
import java.util.Objects;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lp3.e;
import lp3.c;
import lp3.b;
import c77.l;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import d61.y;
import java.lang.Number;
import android.view.View;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import h63.a;
import y43.a;
import mrd.c;
import androidx.recyclerview.widget.RecyclerView;
import jz1.a;

public class k0$c implements p	// class@002c89
{
    public a b;
    public final k0 c;

    public void k0$c(k0 p0){
       this.c = p0;
       super();
       this.b = a.h(Integer.valueOf(0));
    }
    public t Ja(){
       return this.c.N;
    }
    public String Q2(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.J;
       if (obj == null) {
          return null;
       }
       b uob = obj.d();
       if (uob != null) {
          return uob.t().e();
       }
       return null;
    }
    public boolean Q6(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.J;
       boolean b = (obj != null && obj.x())? true: false;
       return b;
    }
    public void Ub(LiveGzoneTabSource p0,boolean p1){
       k0$c uoc = k0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "5")) {
          return;
       }
       k0 j = this.c.J;
       if (j != null) {
          j.p(LiveGzoneTab$TabType.CHAT, null, p0, p1);
       }
       return;
    }
    public boolean V1(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.y;
       if (obj != null) {
          return obj.V1();
       }
       return false;
    }
    public void W8(String p0,String p1,LiveGzoneTabSource p2,boolean p3){
       if (PatchProxy.isSupport(k0$c.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, k0$c.class, "6")) {
          return;
       }
       k0 j = this.c.J;
       if (j != null) {
          Objects.requireNonNull(j);
          if (PatchProxy.isSupport(f.class) && (!PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p3), p2, j, f.class, "31") && j.d != null)) {
             f r = j.r;
             if (r != null) {
                int i = r.size();
                int i1 = 0;
                while (i1 < i) {
                   b uob = j.r.get(i1);
                   if (uob.t() != null && TextUtils.n(uob.t().e(), p0)) {
                      j.y(uob, p1, p3, p2, i1);
                      break ;
                   }
                   i1 = i1 + 1;
                }
             }
          }
       }
       return;
    }
    public a Yf(){
       return this.b;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public l fe(){
       return this.c.I;
    }
    public boolean h4(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k0 obj = PatchProxy.apply(objArray, this, k0$c.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c.J;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, f.class, "17");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(obj.x != null || obj.x()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0042 :
             return b;
          }
       }
       b = false;
       goto label_0042 ;
    }
    public boolean jg(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a1.i(this.c.getActivity()) && y.d(this.c.getActivity())) {
          return false;
       }
       obj = this.c.p;
       if (obj != null && !obj.h4()) {
          return true;
       }
       obj = this.c.y;
       if (obj != null && obj.Ae()) {
          return true;
       }
       return false;
    }
    public int ol(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c.J;
       int height = (obj != null && obj.b() != null)? this.c.J.b().getHeight(): 0;
       return height;
    }
    public int on(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c.y;
       if (obj != null) {
          return obj.so();
       }
       return 0;
    }
    public boolean q6(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c.J;
       boolean b = true;
       if (obj != null) {
          LiveGzoneTabSource cLICK = LiveGzoneTabSource.CLICK;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(cLICK, obj, f.class, "28");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(obj.f.i() != null && (obj.f.i().intValue() == 3 && TextUtils.n(obj.d.b(obj.c()).c(), LiveGzoneTab$TabType.ACTIVITY.mTypeValue))){
             obj.m.p.Ub(cLICK, b);
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_006f :
             return b;
          }
       }
       b = false;
       goto label_006f ;
    }
    public c sf(){
       return this.c.O;
    }
    public RecyclerView x5(){
       k0 obj = PatchProxy.apply(null, this, k0$c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.A;
       if (obj instanceof a) {
          return obj.x5();
       }
       return null;
    }
}
