package com.yxcorp.gifshow.v3.editor.prettify.filter.a;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFilterGroup;
import e1c.p;
import java.util.Iterator;
import o1c.w0;
import n0c.c;
import java.lang.Boolean;
import java.lang.Integer;
import usc.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import brd.t;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import n0c.c$a;
import t45.d;
import brd.z;
import usc.b;
import erd.o;

public class a extends a	// class@001169
{
    public c g;
    public final List h;

    public void a(boolean p0){
       super(p0);
       this.h = new ArrayList();
    }
    public List b(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(Filters.getGroupedFilters(this.r()));
       a.G(obj);
       ArrayList uArrayList = new ArrayList();
       if (!q.f(obj)) {
          int i = 0;
          FilterConfig uFilterConfi = obj.get(i);
          RecoFilterGroup recoGroup = RecoFilterGroup.getRecoGroup();
          recoGroup.setGroupId(uFilterConfi.getGroupId());
          recoGroup.setGroupName(uFilterConfi.getGroupName());
          uArrayList.add(recoGroup);
          a.B(uArrayList, obj);
          for (; i < uArrayList.size(); i = i + 1) {
             uArrayList.get(i).setPosition(i);
          }
       }
       return uArrayList;
    }
    public p getDataType(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p("EMPTY_KEY");
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.h.clear();
       Iterator iterator = this.g().iterator();
       while (iterator.hasNext()) {
          w0 ow0 = iterator.next();
          if (ow0.k()) {
             ow0.o(null);
             ow0.n(-1);
          }
       }
       return;
    }
    public void n(c p0){
       this.g = p0;
    }
    public FilterVideoPlugin$FilterEntranceType r(){
       return FilterVideoPlugin$FilterEntranceType.EDIT;
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.h.isEmpty() ^ 0x01);
    }
    public FilterConfig v(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.y(this.h, new a(p0)).orNull();
    }
    public t x(){
       t obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditDataManager", "getRecoFilters, mRecoRequest:"+this.g, objArray);
       if (this.g == null) {
          return t.just(new c$a(new ArrayList()));
       }
       if (!this.h.isEmpty()) {
          return t.just(new c$a(this.h));
       }
       z c = d.c;
       obj = this.g.b().observeOn(c).map(new b(this)).subscribeOn(c);
       return obj.observeOn(d.a);
    }
}
