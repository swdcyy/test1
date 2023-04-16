package com.yxcorp.gifshow.log.t;
import com.yxcorp.gifshow.log.t$a;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import android.util.LruCache;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import k2b.k2;
import q2b.i;
import java.lang.Number;
import java.util.List;
import java.util.Collection;
import java.lang.CharSequence;
import com.google.common.base.Optional;

public class t	// class@001b42
{
    public final LinkedHashMap a;
    public final List b;
    public ImmutableList c;
    public ImmutableList d;
    public final LruCache e;
    public final LruCache f;
    public t$a g;

    public void t(t$a p0){
       super();
       this.c = ImmutableList.of();
       this.d = ImmutableList.of();
       this.e = new LruCache(20);
       this.f = new LruCache(20);
       this.a = new LinkedHashMap();
       this.b = new ArrayList();
       this.g = p0;
    }
    public static String e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, t.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"/"+TextUtils.I(p1);
    }
    public static String f(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.e(p0.o(), p0.h5());
    }
    public static String g(k2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.e(p0.d, p0.f);
    }
    public static String h(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, t.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.e(p0.p(), p0.m());
    }
    public final void a(k2 p0){
       int i;
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ot, "9")) {
          return;
       }
       String obj = PatchProxy.applyOneRefs(p0, this, ot, "10");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = t.g(p0);
          int i2 = 0;
          while (true) {
             if (i2 < this.b.size()) {
                if ((t.g(this.b.get(i2))).equals(obj)) {
                   i = i2;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                i = -1;
             }
          }
       }
       if (i >= 0) {
          int i1 = this.b.size() - 1;
          while (i1 > i) {
             k2 ok2 = this.b.get(i1);
             this.g.c(ok2);
             this.b.remove(ok2);
             i1--;
          }
       }else {
          this.b.add(p0);
       }
       this.c = ImmutableList.copyOf(this.b);
       return;
    }
    public final void b(String p0,k2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "3")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.f.put(p0, p1);
       }
       return;
    }
    public Optional c(k2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(this.a.get(t.g(p0)));
    }
    public Optional d(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(this.a.get(t.h(p0)));
    }
}
