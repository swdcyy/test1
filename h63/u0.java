package h63.u0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.BitSet;
import java.util.ArrayList;
import h63.u0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h63.t0;
import y43.a;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import j47.b;
import tkd.b;
import tkd.d;
import os5.h;
import android.app.Activity;
import android.view.View;
import java.util.List;
import c77.s;
import com.kuaishou.live.gzone.widget.LiveGzoneScrollViewLogPager;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import c77.p;
import java.lang.Boolean;
import c77.l;
import c77.o;
import ekd.m1;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import com.kwai.robust.PatchProxyResult;
import h63.x0;
import java.util.Map;
import java.util.HashMap;

public class u0 extends PresenterV2 implements g	// class@002c9f
{
    public a p;
    public b q;
    public View r;
    public ViewPager s;
    public GzonePagerSlidingTabStrip t;
    public BitSet u;
    public List v;
    public s w;

    public void u0(){
       super();
       this.u = new BitSet();
       this.v = new ArrayList();
       this.w = new u0$a(this);
    }
    public void E8(){
       u0 ou0 = u0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ou0, "5")) {
          if (this.q == null) {
             this.q = new t0(this);
          }
          a[] uoaArray = new a[]{AudienceBizRelation.PK,AudienceBizRelation.GAME_INTERACTIVE_PK};
          this.p.D.u5(this.q, uoaArray);
       }
       d.a(0x2cb5d4a8).Z5(this.getActivity(), this.t);
       this.P8();
       return;
    }
    public void J8(){
       u0 ou0 = u0.class;
       if (PatchProxy.applyVoid(null, this, ou0, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ou0, "10")) {
          a[] uoaArray = new a[]{AudienceBizRelation.PK,AudienceBizRelation.GAME_INTERACTIVE_PK};
          this.p.D.G5(this.q, uoaArray);
       }
       this.v.clear();
       d.a(0x2cb5d4a8).B4(this.getActivity(), this.t);
       this.s = null;
       return;
    }
    public final void P8(){
       u0 ou0 = u0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou0, "4")) {
          return;
       }
       if (this.p.D.E6(AudienceBizRelation.PK) || this.p.D.E6(AudienceBizRelation.GAME_INTERACTIVE_PK)) {
          if (!PatchProxy.applyVoid(objArray, this, ou0, "6")) {
             this.w.d(false, 1);
             a p = this.p.p;
             if (p != null) {
                p.Ub(LiveGzoneTabSource.PK, false);
             }
             this.s.h(false, "pk");
             this.R8(false);
          }
       }else if(PatchProxy.applyVoid(objArray, this, ou0, "7")){
          this.w.d(1, 1);
          this.s.h(1, "pk");
          this.R8(1);
       }
       return;
    }
    public final void R8(boolean p0){
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou0, "9")) {
          return;
       }
       a p = this.p.p;
       if (p == null) {
          return;
       }
       l ol = p.fe();
       if (ol != null) {
          ol = ol.d;
          if (ol != null) {
             ol.b(p0);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1f95);
       this.t = m1.f(p0, 0x7f0a3cb6);
       this.s = m1.f(p0, 0x7f0a1f93);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new x0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(u0.class, new x0());
       }else {
          obj.put(u0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u0.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       return;
    }
}
