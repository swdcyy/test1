package com.yxcorp.gifshow.log.g;
import k2b.z;
import com.yxcorp.gifshow.log.f;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import k2b.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import com.yxcorp.gifshow.log.g$b;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.log.b;
import k2b.k2;
import java.lang.Boolean;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.log.g$a;
import k2b.v;
import java.util.ArrayList;
import fg6.a;
import java.util.HashMap;
import android.content.ComponentName;
import java.lang.StringBuilder;
import com.google.gson.Gson;
import com.yxcorp.utility.Log;
import java.util.HashSet;
import ok.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import k2b.e0;
import s00.b$b;
import s00.b;
import com.google.protobuf.nano.MessageNano;

public class g implements z	// class@0011e3
{
    public x a;
    public Set b;
    public static x c;

    static {
       g.c = Suppliers.a(f.b);
    }
    public void g(){
       super();
       this.a = Suppliers.a(new u(this));
    }
    public ClientEvent$ExpTagTransList I1(){
       k2 ok2;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4b316083).l0();
       if (obj == null) {
          return objArray;
       }
       int i = 10;
       g$b uob = new g$b(i);
       Iterator iterator = obj.e().iterator();
       while (iterator.hasNext()) {
          b uob1 = iterator.next();
          ok2 = uob1.D();
          if (g.c.get().booleanValue() && (ok2.j != null && (q.f(this.a()) || (!q.f(this.a()) && !this.a().contains(ok2.d))))) {
             ImmutableList immutableLis = uob1.I();
             int i1 = immutableLis.size() - 2;
             while (i1 >= 0) {
                k2 ok21 = immutableLis.get(i1);
                if (ok21.j == null) {
                   uob.a(ok21.z);
                   uob.a(ok21.A);
                   break ;
                }
                i1 = i1 - 1;
             }
          }
          uob.a(ok2.z);
          uob.a(ok2.A);
       }
       ClientEvent$ExpTagTransList uExpTagTrans = uob.b();
       if (uExpTagTrans != null) {
          ClientEvent$ExpTagTransList expTagTrans = uExpTagTrans.expTagTrans;
          if (expTagTrans != null && (expTagTrans.length >= i && SystemUtil.K())) {
             g$a uoa = new g$a(objArray);
             uoa.a = obj.e().size();
             uoa.b = new ArrayList();
             Gson a = a.a;
             Iterator iterator1 = obj.e().iterator();
             while (iterator1.hasNext()) {
                b uob2 = iterator1.next();
                if (uob2 == null) {
                   continue ;
                }else {
                   HashMap hashMap = new HashMap();
                   ok2 = uob2.D();
                   if (ok2 != null) {
                      hashMap.put("page", String.valueOf(ok2.c));
                   }
                   hashMap.put("hash", String.valueOf(uob2.E()));
                   hashMap.put("name", uob2.H().toString());
                   uoa.b.add(hashMap);
                }
             }
             Log.d("ExpTagList", "expTagListTooLong, "+a.q(uoa));
          }
       }
       return uExpTagTrans;
    }
    public final Set a(){
       g obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          return obj;
       }
       HashSet hashSet = new HashSet(this.a.get());
       this.b = hashSet;
       return hashSet;
    }
    public g$b b(o p0){
       p0 = PatchProxy.applyOneRefs(null, this, g.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       g$b uob = new g$b(10);
       b uob1 = b.a(0x4b316083).l0();
       if (uob1 == null) {
          return uob;
       }
       Iterator iterator = uob1.e().iterator();
       while (iterator.hasNext()) {
          k2 ok2 = iterator.next().D();
          uob.a(ok2.z);
          uob.a(ok2.A);
       }
       return uob;
    }
    public ClientEvent$ExpTagTransList c(BaseFragment p0){
       b obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4b316083).l0();
       if (obj == null) {
          return null;
       }
       FragmentActivity activity = p0.getActivity();
       g$b uob = new g$b(10);
       Iterator iterator = obj.e().iterator();
       while (iterator.hasNext()) {
          b uob1 = iterator.next();
          if (activity != null && uob1.M(activity)) {
             break ;
          }else {
             k2 ok2 = uob1.D();
             uob.a(ok2.z);
             uob.a(ok2.A);
          }
       }
       uob.a(p0.K5());
       uob.a(p0.I1());
       return uob.b();
    }
    public String d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       ClientEvent$ExpTagTransList obj = PatchProxy.apply(objArray, this, og, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.I1();
       if (obj == null) {
          return objArray;
       }
       String str = PatchProxy.applyOneRefs(obj, this, og, "2");
       if (str != patchProxyRe) {
       }else {
          Log.b("ExpTagList", "api expTagList = "+a.a.q(obj.expTagTrans));
          str = b.b().a(MessageNano.toByteArray(obj));
       }
       return str;
    }
}
