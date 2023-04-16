package com.yxcorp.gifshow.profile.adapter.g;
import im8.g;
import y8c.g;
import s1c.r0;
import jv6.b;
import q99.a;
import elb.g0;
import a9c.e;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.Object;
import v1c.d;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.kwai.framework.model.user.User;
import z5c.d3;
import s1c.a;
import java.lang.String;
import z5c.i2;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.adapter.g$a;
import k2b.t2$a;
import im8.c;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import ekd.j;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.lang.Long;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType;
import v1c.l;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y8c.a;
import ml8.c;
import v1c.c;

public class g extends g implements g	// class@00120f
{
    public b A;
    public int B;
    public final PublishSubject C;
    public ArrayList D;
    public final b E;
    public a F;
    public final PublishSubject w;
    public r0 x;
    public boolean y;
    public PhotoItemViewParam z;

    public void g(r0 p0,b p1,a p2){
       super(new g0());
       this.w = PublishSubject.g();
       this.A = new b(null);
       PublishSubject publishSubje = PublishSubject.g();
       this.C = publishSubje;
       this.x = p0;
       this.E = p1;
       publishSubje.subscribe(new d(this));
       PhotoItemViewParam$a builder = PhotoItemViewParam.getBuilder(-1, 4);
       boolean b = true;
       builder.q(b);
       this.z = builder.a();
       g tx = this.x;
       if (tx.c != b || !d3.a(tx.b)) {
          b = false;
       }
       this.y = b;
       tx = this.x;
       this.B = tx.e.b;
       this.n1("PROFILE_ENABLE_LIKE_COUNT", Boolean.valueOf(i2.a(tx.c, tx.b.getId())));
       this.F = p2;
       return;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.D == null) {
          obj = new Object[]{this,v6,new c("USER_PROFILE", this.x.d.mUserProfile)};
          g$a uoa = new g$a(this.r1(this.x.c), this.w, this.C, this.A, this.E);
          ArrayList uArrayList = j.a(obj);
          this.D = uArrayList;
          g tF = this.F;
          if (tF != null) {
             uArrayList.add(tF);
          }
       }
       return this.D;
    }
    public long d0(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       QPhoto qPhoto = this.N0(p0);
       if (qPhoto == null) {
          return -1;
       }else if(w.j0(qPhoto.mEntity)){
          return (long)qPhoto.hashCode();
       }else {
          return Long.parseLong(qPhoto.getPhotoId());
       }
    }
    public int f0(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       QPhoto qPhoto = this.N0(p0);
       if (qPhoto == null) {
          return -1;
       }else {
          return ProfilePhotoItemType.getPhotoItemType(qPhoto).getViewType();
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new l());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       View obj;
       PresenterV2 presenterV2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, g.class, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, g.class, "5");
          if (obj != patchProxyRe) {
          }else if(p1 == 20){
             obj = a.i(p0, R.layout.arg_RES_7f0d1682);
          }else {
             obj = a.k(p0, R.layout.arg_RES_7f0d0951, false);
          }
       }else {
          goto label_002e ;
       }
       String str = "6";
       if (PatchProxy.isSupport2(g.class, str)) {
          presenterV2 = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p1), this, g.class, str);
          if (presenterV2 != patchProxyRe) {
          label_006e :
             return new f(obj, presenterV2);
          }
       }
       presenterV2 = new PresenterV2();
       ProfilePhotoItemType.getPhotoItemType(p1).addPresenter(presenterV2, this.x, this.k.f());
       PatchProxy.onMethodExit(g.class, str);
       goto label_006e ;
    }
    public t2$a r1(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new c(this, p0);
    }
}
