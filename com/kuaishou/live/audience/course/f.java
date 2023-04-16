package com.kuaishou.live.audience.course.f;
import im8.g;
import k51.c;
import s31.o;
import s31.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.course.n;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import s31.y;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCCoursePromote;
import s31.n;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCCoursePromoteClosed;
import s31.m;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import s31.r;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.o;
import nl8.n;

public class f extends c implements g	// class@000c02
{
    public a0 p;
    public a q;
    public boolean r;
    public n s;
    public y t;
    public LiveStreamMessages$SCCoursePromote u;
    public final View$OnClickListener v;
    public static String sLivePresenterClassName = "LiveCourseAudiencePromotionPresenter";

    public void f(){
       super();
       this.q = new o(this);
       this.v = new l(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       n on = this.P8();
       Objects.requireNonNull(on);
       if (!PatchProxy.applyVoid(objArray, on, n.class, "3")) {
          on.c.setValue(on.b);
          on.d.a(c.class).v1(on.c);
       }
       this.t = new y(this.p.c);
       if (!PatchProxy.applyVoid(objArray, this, uof, "7")) {
          this.p.Z2.u().u0(356, LiveStreamMessages$SCCoursePromote.class, new n(this));
          this.p.Z2.u().u0(357, LiveStreamMessages$SCCoursePromoteClosed.class, new m(this));
       }
       return;
    }
    public void J8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "10")) {
          this.r = false;
          this.P8().setVisible(false);
          this.P8().l(objArray);
       }
       n on = this.P8();
       Objects.requireNonNull(on);
       if (!PatchProxy.applyVoid(objArray, on, n.class, "4")) {
          on.d.a(c.class).O0(1012);
       }
       return;
    }
    public final n P8(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s == null) {
          this.s = new n(this.v);
       }
       return this.s;
    }
    public final Fragment R8(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.Z2.b();
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.P8().setVisible(false);
       return;
    }
    public final boolean V8(){
       BaseFragment obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.Z2.b();
       boolean b = (obj != null && (obj.getActivity() == null || obj.getActivity().isFinishing()))? true: false;
       return b;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       if (this.r != null) {
          this.P8().setVisible(true);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new r());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.P8().i(n.a(this));
       return;
    }
}
