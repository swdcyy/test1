package com.yxcorp.gifshow.message.init.l;
import erd.o;
import com.yxcorp.gifshow.message.init.s;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import pa6.a;
import qa6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import zb5.i;
import com.yxcorp.gifshow.message.init.o;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.message.init.k;
import com.yxcorp.gifshow.message.init.h;
import erd.g;
import com.yxcorp.gifshow.message.init.j;
import hdb.v;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import java.lang.StringBuilder;
import k2b.u1;
import hdb.o;
import tkd.b;
import tkd.d;
import pv5.c;

public final class l implements o	// class@001d5d
{
    public final s b;

    public void l(s p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       boolean b;
       l tb = this.b;
       Objects.requireNonNull(tb);
       p0 = PatchProxyResult.class;
       Object[] objArray = null;
       t ot = PatchProxy.apply(objArray, tb, s.class, "31");
       if (ot != p0) {
       }else if(!SystemUtil.L(a.b())){
          ot = t.just(Boolean.TRUE);
       }else {
          a uoa = a.a();
          if (!TextUtils.isEmpty(uoa.a) && (TextUtils.isEmpty(uoa.b) || TextUtils.isEmpty(uoa.c))) {
             Object obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "16");
             if (obj != p0) {
                b = obj.booleanValue();
             }else {
                p0 = IMConfigUtil.i.r();
                p0 = (p0 != null)? p0.mEnableForceRefreshAnonymousTokenWhenEmpty: null;
             }
             if (b != null) {
                b = tb.c;
                if (b < 3) {
                   b++;
                   tb.c = b;
                   u1.R("MessageManager_loginAnonymous_empty", " params:"+uoa.c+","+uoa.b+","+uoa.a, 13);
                   o.e("force refresh anonymous token params:"+uoa.c+","+uoa.b+","+uoa.a);
                   d.a(0x6154d94e).HF();
                }
             }
             ot = t.just(Boolean.FALSE);
          }else {
             p0 = b.a(-1989170423);
             ot = t.fromCallable(new o(tb, p0)).flatMap(new k(p0, uoa)).doOnNext(h.b).doOnError(j.b).onErrorResumeNext(new v(tb));
          }
       }
       return ot;
    }
}
