package com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList;
import s1b.b;
import jb5.d;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$a;
import nsd.u;
import yv8.c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$mRecoExtCollector$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.ref.WeakReference;
import ekd.e0;
import android.content.Context;
import android.media.AudioManager;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$onCreateRequest$1;
import en9.d;
import msd.l;
import erd.g;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$onCreateRequest$2;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$b;
import qc5.a;
import java.lang.System;
import java.lang.Math;
import wkd.b;
import zc5.b;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$c;
import java.util.concurrent.Callable;
import r1b.b;
import com.yxcorp.gifshow.loadmore.config.LoadMorePolicy;

public final class HomeUniversalTabPageList extends d implements b	// class@0011b9
{
    public int C;
    public c D;
    public boolean E;
    public WeakReference F;
    public AudioManager G;
    public b H;
    public int I;
    public long J;
    public String K;
    public final p L;
    public String M;
    public final String N;
    public static final HomeUniversalTabPageList$a O;

    static {
       HomeUniversalTabPageList.O = new HomeUniversalTabPageList$a(null);
    }
    public void HomeUniversalTabPageList(int p0,c p1,boolean p2,String p3){
       a.p(p1, "realActionBizType");
       super();
       this.N = p3;
       this.C = p0;
       this.D = p1;
       this.L = s.c(HomeUniversalTabPageList$mRecoExtCollector$2.INSTANCE);
       this.E = p2;
       this.F = new WeakReference(this);
       this.G = e0.b.getSystemService("audio");
       this.M = "3";
    }
    public boolean E1(){
       return false;
    }
    public t I1(){
       t obj = PatchProxy.apply(null, this, HomeUniversalTabPageList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.I1();
       this.N2(this.C);
       obj = this.Q2().observeOn(d.a).doOnNext(new d(new HomeUniversalTabPageList$onCreateRequest$1(this))).doOnNext(new d(new HomeUniversalTabPageList$onCreateRequest$2(this))).doOnError(new HomeUniversalTabPageList$b(this));
       a.o(obj, "requestFeedFromNetwork\(\)¡­rror { onNetworkError\(\) }");
       return obj;
    }
    public t Q2(){
       a obj = PatchProxy.apply(null, this, HomeUniversalTabPageList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W2();
       a.o(obj, "mRecoExtCollector");
       String str = obj.a();
       d tu = this.u;
       long l = System.currentTimeMillis();
       if (Math.abs((l - this.J)) - (long)300 > 0) {
          b.a(-869999145).h();
       }
       this.J = l;
       t ot = t.defer(new HomeUniversalTabPageList$c(this, str, tu)).subscribeOn(d.c);
       a.o(ot, "Observable.defer {\n     ¡­eOn\(KwaiSchedulers.ASYNC\)");
       return ot;
    }
    public final a W2(){
       Object obj = PatchProxy.apply(null, this, HomeUniversalTabPageList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public void X(b p0){
       b l = (p0 != null)? p0.l: null;
       this.I = (l == null)? 0: p0.l.mPageSize;
       this.H = p0;
       return;
    }
    public int r2(){
       return 2;
    }
    public int t2(){
       return 3;
    }
    public int w2(){
       return 104;
    }
    public String z2(){
       return "common";
    }
}
