package com.yxcorp.gifshow.homepage.menu.redesign.c$a;
import sta.a;
import com.yxcorp.gifshow.homepage.menu.redesign.c;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.ArrayList;
import fo5.b;
import java.util.Collection;
import ekd.q;
import xl8.b;
import java.lang.Boolean;

public class c$a implements a	// class@00177e
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public List a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c$a obj = PatchProxy.apply(objArray, this, c$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(objArray, obj, c.class, "10");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          List list = obj.H.d();
          if (!q.f(list)) {
             uArrayList.addAll(list);
          }
          list = obj.H.l();
          if (!q.f(list)) {
             uArrayList.addAll(list);
          }
          list = obj.H.q();
          if (!q.f(list)) {
             uArrayList.addAll(list);
          }
       }
       return uArrayList;
    }
    public List b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c$a obj = PatchProxy.apply(objArray, this, c$a.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(objArray, obj, c.class, "11");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          List list = obj.H.d();
          if (!q.f(list)) {
             uArrayList.addAll(list);
          }
          list = obj.H.l();
          if (!q.f(list)) {
             uArrayList.addAll(list);
          }
          ArrayList uArrayList1 = new ArrayList(obj.H.q());
          if (!q.f(uArrayList1) && (uArrayList1.size() <= obj.p || obj.N.a().booleanValue())) {
             uArrayList.addAll(uArrayList1);
          }else {
             uArrayList.addAll(uArrayList1.subList(0, obj.p));
          }
       }
       return uArrayList;
    }
    public boolean c(){
       return true;
    }
}
