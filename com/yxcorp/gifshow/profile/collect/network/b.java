package com.yxcorp.gifshow.profile.collect.network.b;
import o3c.p;
import java.util.List;
import qvb.a;
import java.lang.Object;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import wkd.b;
import k2c.a;
import cjd.e;
import erd.o;
import n2c.c;
import erd.g;
import n2c.d;
import la6.b;
import qvb.f;
import qk.g0;
import b06.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Iterator;
import java.lang.Integer;
import com.kuaishou.android.model.mix.CoverMeta;
import f2c.d;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;
import q87.c;

public class b extends p	// class@0012cf
{
    public String p;

    public void b(b p0){
       super();
       this.p = p0.p;
       this.b(p0.getItems());
       this.S1(p0.L0());
    }
    public void b(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("CollectionPostPageList", "onCreateRequest: ....");
       obj = b.a(0x79c94a4a);
       b tp = this.p;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.c(tp, "photo", objArray, 20).map(new e()).doOnNext(new c(this)).doOnError(new d(this));
    }
    public void M1(Object p0,List p1){
       this.k2(p0, p1);
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "5");
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          if (list != null) {
             d.f(list);
          }
       }
       return list;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.a();
       Log.g("CollectionPostPageList", "refresh: ....");
       return;
    }
    public void add(int p0,Object p1){
       this.i2(p0, p1);
    }
    public void add(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
       }else {
          this.j2(p0);
          super.add(p0);
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.j2(iterator.next());
       }
       super.b(p0);
       return;
    }
    public void d2(b p0,List p1){
       this.k2(p0, p1);
    }
    public void e(int p0,List p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "9")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          this.j2(iterator.next());
       }
       super.e(p0, p1);
       return;
    }
    public void i2(int p0,QPhoto p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "11")) {
          return;
       }
       this.j2(p1);
       super.add(p0, p1);
       return;
    }
    public final void j2(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       if (p0.getCoverMeta() == null) {
          d.C().e("CollectionPostPageList", "The photo has not provide coverMeta. Photo = "+p0+", photoId = "+p0.getPhotoId()+" , type = "+p0.getType()+" .", new Exception());
       }
       return;
    }
    public void k2(ProfileFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       List items = p0.getItems();
       if (items == null) {
          return;
       }
       Log.g("CollectionPostPageList", "onLoadItemFromResponse: ....isFirstPage\(\):"+this.K()+", items:"+p1.size()+",new data:"+items.size());
       int i = 0;
       int i1 = (this.K())? 0: p1.size();
       while (i < items.size()) {
          int i2 = i + i1;
          items.get(i).setPosition(i2);
          i = i + 1;
       }
       super.d2(p0, p1);
       return;
    }
    public void l2(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       for (int i = 0; i < this.getCount(); i = i + 1) {
          this.getItem(i).setPosition(i);
       }
       return;
    }
    public void set(int p0,Object p1){
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "12")) {
          this.j2(p1);
          super.set(p0, p1);
       }
       return;
    }
}
