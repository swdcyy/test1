package com.kwai.library.slide.base.pagelist.a;
import qvb.f;
import java.util.HashMap;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yy6.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import java.util.Locale;
import lnc.f4;
import qe6.d;
import wkd.b;
import om9.b;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.kwai.components.social.util.network.NetworkTrace;
import li5.a;
import cjd.e;
import erd.o;
import zy6.d;
import erd.g;
import java.util.List;
import la6.b;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import ip.c;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import ip.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import qvb.a;
import java.util.Iterator;
import com.kwai.framework.model.user.User;

public class a extends f	// class@0008ec
{
    public final Map p;
    public final String q;
    public final boolean r;
    public QPhoto s;
    public boolean t;
    public boolean u;
    public boolean v;
    public String w;

    public void a(){
       super();
       this.p = new HashMap();
       this.u = true;
       this.v = true;
       this.r = false;
       this.q = "";
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          return objArray;
       }
       if (obj != null) {
          Object[] objArray1 = new Object[0];
          b.C().w("GROOT", "ProfileFeedPL , onCreateRequest -- photo:  "+this.s.toString(), objArray1);
       }
       String language = d.d(f4.a()).getLanguage();
       Object obj1 = b.a(-1194651878);
       String userId = this.s.getUserId();
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj1.d(userId, language, 20, "public", objArray, this.q, this.w, a.c("DetailProfileFeedPageList")).map(new e()).doOnNext(new d(this));
    }
    public void M1(Object p0,List p1){
       this.m2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.m2(p0, p1);
    }
    public boolean h2(ProfileFeedResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List items = p0.getItems();
       boolean b = true;
       if (q.f(items)) {
          return b;
       }
       if (this.s == null) {
          return b;
       }
       if (items.get(0) == null) {
          return b;
       }
       int i = 0x188c3889;
       if (b.a(i).a(this.s.getAdvertisement())) {
          a uoa = b.a(i).d(this.s.getAdvertisement());
          if (uoa != null && (uoa.getSidePhoto() != null && TextUtils.n(uoa.getSidePhoto().getUserId(), items.get(0).getUserId()))) {
             return b;
          }
       }
       if (TextUtils.n(this.s.getUserId(), items.get(0).getUserId())) {
          return b;
       }else {
          Object[] objArray = new Object[0];
          b.C().w("GROOT", "ProfileFeedPL, response user not equals current user", objArray);
          return 0;
       }
    }
    public boolean i(){
       return false;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.p.clear();
       return;
    }
    public List j2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.get(p0);
    }
    public QPhoto k2(){
       return this.s;
    }
    public boolean l2(){
       return this.v;
    }
    public void m2(ProfileFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       List items = p0.getItems();
       if (q.f(items)) {
          return;
       }
       int i = 0;
       if (this.h2(p0)) {
          if (this.K()) {
             p1.clear();
          }else if(this.v != null){
             items.remove(this.s);
          }
          if (this.u != null && (!this.getItems().contains(this.s) && !items.contains(this.s))) {
             p1.add(i, this.s);
          }
       label_004d :
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (!p1.contains(qPhoto)) {
                p1.add(qPhoto);
             }
          }
       }else if(!this.getItems().contains(this.s)){
          p1.add(i, this.s);
       }
       a ts = this.s;
       if (ts != null) {
          this.p.put(ts.getUserId(), this.getItems());
       }
       return;
    }
    public void n2(boolean p0){
       this.u = p0;
    }
    public void o2(boolean p0){
       this.v = p0;
    }
    public void p2(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       Iterator iterator = this.d1().iterator();
       while (iterator.hasNext()) {
          iterator.next().getUser().sync(p0);
       }
       return;
    }
    public void q2(QPhoto p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.s = p0;
       if (p1) {
          this.clear();
       }
       return;
    }
}
