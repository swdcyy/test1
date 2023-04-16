package com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealContact$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.Context;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import java.util.Map;
import qrd.j0;
import java.lang.IllegalStateException;
import ssd.e;
import ssd.e$a;
import kotlinx.coroutines.c;
import m6b.a;
import android.content.SharedPreferences;
import n6b.b;
import kotlin.Pair;
import qrd.r0;
import kkc.i;
import trd.t0;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.dispatcher.KwaiPush;
import y35.b;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import y35.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import zk.g;
import java.lang.Long;
import dsd.a;
import java.lang.Number;
import java.lang.CharSequence;
import gx7.d;
import ftd.j2;
import ftd.z0;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealContact$1$1$2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import kotlinx.coroutines.a;

public final class ThirdMatrixInitModuleForSubProcess$dealContact$1 extends SuspendLambda implements p	// class@001d92
{
    public final Context $context;
    public final long $current;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;

    public void ThirdMatrixInitModuleForSubProcess$dealContact$1(Context p0,long p1,c p2){
       this.$context = p0;
       this.$current = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ThirdMatrixInitModuleForSubProcess$dealContact$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, ThirdMatrixInitModuleForSubProcess$dealContact$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new ThirdMatrixInitModuleForSubProcess$dealContact$1(this.$context, this.$current, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ThirdMatrixInitModuleForSubProcess$dealContact$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Long longx;
       i d;
       boolean b;
       JsonElement obj = PatchProxy.applyOneRefs(p0, this, ThirdMatrixInitModuleForSubProcess$dealContact$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       ThirdMatrixInitModuleForSubProcess$dealContact$1 tlabel = this.label;
       int i = 0;
       d uod = 1;
       if (tlabel != null) {
          if (tlabel != uod) {
             if (tlabel == 2) {
                j0.n(p0);
             label_00b4 :
                if (p0 != null) {
                   obj = p0.a();
                   JsonObject jsonObject = p0.b();
                   if (p0.getResult() == uod) {
                      p0 = a.a;
                      SharedPreferences$Editor uEditor = p0.edit();
                      uEditor.putLong("contactLastRequestTimestamp", this.$current);
                      g.a(uEditor);
                      if (obj != null) {
                         JsonObject jsonObject1 = obj.r().m0("interval");
                         if (jsonObject1 != null) {
                            g og = jsonObject1.r0("request_interval_ms");
                            if (og != null) {
                               longx = a.g(og.t());
                            label_00f6 :
                               if (longx != null) {
                                  p0 = p0.edit();
                                  p0.putLong("contactRequestIntervalInMs", longx.longValue());
                                  g.a(p0);
                               }
                               if (jsonObject != null) {
                                  p0 = jsonObject.toString();
                                  a.o(p0, "pushData.toString\(\)");
                                  if (!p0.length()) {
                                     i = 1;
                                  }
                                  if (!i && !a.g(jsonObject.toString(), "{}")) {
                                     b.b(b.a, "CONTACT_RES_SUC", null, 2, null);
                                     p0 = a.f(d.b, z0.g(), null, new ThirdMatrixInitModuleForSubProcess$dealContact$1$1$2(jsonObject, null), 2, null);
                                  }
                               }
                            label_0143 :
                               b.a.d("res payload is null", Channel.CONTACT);
                               return l1.a;
                            }
                         }
                      }
                      longx = null;
                      goto label_00f6 ;
                   }else {
                      b.a.d(p0.getErrMsg(), Channel.CONTACT);
                      p0 = l1.a;
                   }
                   if (p0 != null) {
                   label_016a :
                      return l1.a;
                   }
                }
                b.a.d("res is null", Channel.CONTACT);
                p0 = l1.a;
                goto label_016a ;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          this.L$0 = tlabel;
          this.label = uod;
          if (c.a(e.b.p(0, 3000), this) == obj) {
             return obj;
          }
       }
       long longx1 = a.a.getLong("contactLastDislikeTimestamp", -1);
       b.b(b.a, "CONTACT_REQ_SUC", null, 2, null);
       p0 = new Pair[2];
       p0[0] = r0.a("last_dislike_ts", String.valueOf(longx1));
       d = i.d;
       b = (d.d(this.$context) && !d.c(this.$context))? true: false;
       p0[uod] = r0.a("screen_on", String.valueOf(b));
       p0 = t0.j0(p0);
       String packageName = this.$context.getPackageName();
       a.o(packageName, "context.packageName");
       this.L$0 = tlabel;
       this.J$0 = longx1;
       this.L$1 = p0;
       this.label = 2;
       p0 = KwaiPush.fetchInitiativePush(packageName, Channel.CONTACT, p0, this);
       if (p0 == obj) {
          return obj;
       }else {
          goto label_00b4 ;
       }
    }
}
