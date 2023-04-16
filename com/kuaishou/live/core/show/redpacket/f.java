package com.kuaishou.live.core.show.redpacket.f;
import im8.g;
import k51.c;
import lnc.a1;
import java.util.HashMap;
import java.util.HashSet;
import com.kuaishou.live.core.show.redpacket.f$a;
import com.kuaishou.live.core.show.redpacket.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv1.f;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import va1.i0;
import joc.d;
import java.lang.Long;
import t02.a0;
import xp5.a;
import android.content.Context;
import i2b.a;
import ekd.m1;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ng2.t;
import ng2.m;
import ng2.k;
import lkd.b;
import ng2.n;
import androidx.viewpager.widget.ViewPager$i;
import ng2.r;
import rq5.a;
import pq5.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.Collections;
import java.lang.Integer;
import java.lang.Math;
import lv1.d;
import java.util.Collection;
import zw1.b;
import ekd.q;
import java.util.Set;
import zw1.a;
import xw1.a;
import ng2.q;
import t02.r1;
import p91.m;

public class f extends c implements g	// class@000e7f
{
    public f A;
    public t B;
    public Map C;
    public Set D;
    public long E;
    public c F;
    public s G;
    public a H;
    public a p;
    public View q;
    public View r;
    public ViewGroup s;
    public ViewPager t;
    public LinearLayout u;
    public a0 v;
    public r1 w;
    public m x;
    public boolean y;
    public List z;
    public static final int I = 0;
    public static final int J = 0;
    public static final int K = 0;
    public static final int L = 0;
    public static String sLivePresenterClassName = "LiveRedPacketOldPendantPresenter";

    static {
       f.I = a1.e(15.00f);
       f.J = a1.e(8.00f);
       f.K = a1.e(8.00f);
       f.L = a1.e(8.00f);
    }
    public void f(){
       super();
       this.C = new HashMap();
       this.D = new HashSet();
       this.G = new f$a(this);
       this.H = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.y = true;
       this.A = new f(this.z);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.z = new ArrayList();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.z = null;
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "5")) {
          return;
       }
       this.y = false;
       f tz = this.z;
       if (tz != null) {
          tz.clear();
       }
       this.B = objArray;
       this.C.clear();
       tz = this.t;
       if (tz == null) {
          return;
       }else {
          tz.setAdapter(objArray);
          i0.e(this.getActivity(), this.t);
          i0.d(this.getActivity(), this.p);
          this.E = 0;
          return;
       }
    }
    public void P8(View p0,long p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uof, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.r == null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uof, "7")) {
             f tv = this.v;
             this.r = (tv != null && (tv.t.c() || this.v.l()))? a.a(this.getContext(), 0x7f0d0be3): a.a(this.getContext(), 0x7f0d0d94);
             this.t = m1.f(this.r, 0x7f0a24fa);
             this.s = m1.f(this.r, 0x7f0a24f6);
             this.u = m1.f(this.r, 0x7f0a24fb);
             this.t.setAdapter(this.A);
             t ot = new t(this.getContext(), this.t, this.u, this.z, this.s);
             this.B = tv;
             i0.b(this.getActivity(), this.t);
             if (!PatchProxy.applyVoid(objArray, this, uof, "18")) {
                this.p = new m(this, new k(this));
                i0.a(this.getActivity(), this.p);
             }
             if (!PatchProxy.applyVoid(objArray, this, uof, "19")) {
                this.t.addOnPageChangeListener(new n(this));
             }
          }
       }
       if (this.t.getVisibility()) {
          this.t.setVisibility(0);
       }
       r or = this.S8();
       f tz = this.z;
       if (tz != null) {
          tz.add(new r(p0, p1));
       }
       this.V8(or);
       this.F.gj(this.H);
       return;
    }
    public final r R8(View p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null && obj.size() > 0) {
          Iterator iterator = this.z.iterator();
          while (iterator.hasNext()) {
             r or = iterator.next();
             if (or.f() == p0) {
                return or;
             }
          }
       }
       return null;
    }
    public final r S8(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null && obj.size() > 0) {
          int i = this.t.getCurrentItem() % this.z.size();
          if (i > 0) {
             return this.z.get(i);
          }
       }
       return objArray;
    }
    public final void V8(r p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "16")) {
          return;
       }
       f tz = this.z;
       if (tz != null) {
          Collections.sort(tz);
       }
       this.A.q();
       tz = this.z;
       if (tz != null && tz.size() > 0) {
          if (p0 != null && (this.z.contains(p0) && (p0.f() != null && p0.f().getTag() instanceof Integer))) {
             this.t.setCurrentItem(p0.f().getTag().intValue());
          }else {
             int i = (this.t.getCurrentItem() / this.z.size()) * this.z.size();
             if (Math.abs((this.t.getCurrentItem() - i)) <= 1) {
                this.t.setCurrentItem(i);
             }else {
                this.t.setAdapter(null);
                this.t.setAdapter(this.A);
             }
          }
       }
       f tz1 = this.z;
       if (tz1 == null || (!tz1.size() && !this.t.getVisibility())) {
          this.t.setVisibility(8);
       }
       this.B.c();
       if (!PatchProxy.applyVoid(null, this, uof, "17")) {
          Iterator iterator = this.C.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       this.W8(this.t.getCurrentItem());
       return;
    }
    public void W8(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "20")) {
          return;
       }
       if (!q.f(this.z) && p0 >= 0) {
          f tz = this.z;
          r or = tz.get((tz.size() - 1));
          Iterator iterator = this.D.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             View view = (or == null)? null: or.f();
             int i = this.z.size() - 1;
             uoa.a(view, i);
          }
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "21")) {
             uof = this.z;
             if (uof != null && this.A != null) {
                r or1 = f.A(uof, p0);
                if (or1 != null) {
                   View view1 = or1.f();
                   if (view1 != null && this.E - (long)view1.hashCode()) {
                      this.E = (long)view1.hashCode();
                      Object tag = view1.getTag(R.id.live_red_packet_pendant_view_tag);
                      if (tag instanceof a) {
                         tag.onShow();
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3fd0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new q());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.v = this.s8(a0.class);
       this.w = this.s8(r1.class);
       this.x = this.r8("LIVE_BASIC_CONTEXT");
       this.F = this.q8(c.class);
       return;
    }
}
