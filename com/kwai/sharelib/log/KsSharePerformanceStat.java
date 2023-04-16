package com.kwai.sharelib.log.KsSharePerformanceStat;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import com.kwai.sharelib.log.KsSharePerformanceStat$shareStartTimestamp$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sharelib.log.KsSharePerformanceStat$requestShareInitStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$requestShareInitEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$pannelAppearedTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$userSelectActionTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$requestShareAnyStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$requestShareAnyEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageDownloadStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageDownloadEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageDecodeStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageDecodeEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageCustomizedStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageCustomizedEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageCompressStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$imageCompressEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$thirdSdkStartTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$thirdSdkEndTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$sendSucceedTimestamp$2;
import com.kwai.sharelib.log.KsSharePerformanceStat$sendFailedTimestamp$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.Long;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.Map;

public final class KsSharePerformanceStat	// class@0016e0
{
    public final HashMap a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public final p m;
    public final p n;
    public final p o;
    public final p p;
    public final p q;
    public final p r;
    public final p s;
    public final p t;
    public String u;
    public boolean v;
    public final String w;

    public void KsSharePerformanceStat(String p0){
       a.p(p0, "statEventKey");
       super();
       this.w = p0;
       this.a = new HashMap();
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.b = s.b(nONE, new KsSharePerformanceStat$shareStartTimestamp$2(this));
       this.c = s.b(nONE, new KsSharePerformanceStat$requestShareInitStartTimestamp$2(this));
       this.d = s.b(nONE, new KsSharePerformanceStat$requestShareInitEndTimestamp$2(this));
       this.e = s.b(nONE, new KsSharePerformanceStat$pannelAppearedTimestamp$2(this));
       this.f = s.b(nONE, new KsSharePerformanceStat$userSelectActionTimestamp$2(this));
       this.g = s.b(nONE, new KsSharePerformanceStat$requestShareAnyStartTimestamp$2(this));
       this.h = s.b(nONE, new KsSharePerformanceStat$requestShareAnyEndTimestamp$2(this));
       this.i = s.b(nONE, new KsSharePerformanceStat$imageDownloadStartTimestamp$2(this));
       this.j = s.b(nONE, new KsSharePerformanceStat$imageDownloadEndTimestamp$2(this));
       this.k = s.b(nONE, new KsSharePerformanceStat$imageDecodeStartTimestamp$2(this));
       this.l = s.b(nONE, new KsSharePerformanceStat$imageDecodeEndTimestamp$2(this));
       this.m = s.b(nONE, new KsSharePerformanceStat$imageCustomizedStartTimestamp$2(this));
       this.n = s.b(nONE, new KsSharePerformanceStat$imageCustomizedEndTimestamp$2(this));
       this.o = s.b(nONE, new KsSharePerformanceStat$imageCompressStartTimestamp$2(this));
       this.p = s.b(nONE, new KsSharePerformanceStat$imageCompressEndTimestamp$2(this));
       this.q = s.b(nONE, new KsSharePerformanceStat$thirdSdkStartTimestamp$2(this));
       this.r = s.b(nONE, new KsSharePerformanceStat$thirdSdkEndTimestamp$2(this));
       this.s = s.b(nONE, new KsSharePerformanceStat$sendSucceedTimestamp$2(this));
       this.t = s.b(nONE, new KsSharePerformanceStat$sendFailedTimestamp$2(this));
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = this.p.getValue();
       }
       return obj.longValue();
    }
    public final long b(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "14");
       if (obj == PatchProxyResult.class) {
          obj = this.o.getValue();
       }
       return obj.longValue();
    }
    public final long c(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "13");
       if (obj == PatchProxyResult.class) {
          obj = this.n.getValue();
       }
       return obj.longValue();
    }
    public final long d(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "12");
       if (obj == PatchProxyResult.class) {
          obj = this.m.getValue();
       }
       return obj.longValue();
    }
    public final long e(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "11");
       if (obj == PatchProxyResult.class) {
          obj = this.l.getValue();
       }
       return obj.longValue();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsSharePerformanceStat.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsSharePerformanceStat && a.g(this.w, p0.w))) {
          return true;
       }
       return false;
    }
    public final long f(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "10");
       if (obj == PatchProxyResult.class) {
          obj = this.k.getValue();
       }
       return obj.longValue();
    }
    public final long g(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = this.j.getValue();
       }
       return obj.longValue();
    }
    public final long h(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = this.i.getValue();
       }
       return obj.longValue();
    }
    public int hashCode(){
       KsSharePerformanceStat obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.w;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final long i(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = this.e.getValue();
       }
       return obj.longValue();
    }
    public final long j(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = this.h.getValue();
       }
       return obj.longValue();
    }
    public final long k(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = this.g.getValue();
       }
       return obj.longValue();
    }
    public final long l(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.d.getValue();
       }
       return obj.longValue();
    }
    public final long m(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.c.getValue();
       }
       return obj.longValue();
    }
    public final long n(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "19");
       if (obj == PatchProxyResult.class) {
          obj = this.t.getValue();
       }
       return obj.longValue();
    }
    public final long o(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "18");
       if (obj == PatchProxyResult.class) {
          obj = this.s.getValue();
       }
       return obj.longValue();
    }
    public final long p(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.b.getValue();
       }
       return obj.longValue();
    }
    public final long q(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = this.r.getValue();
       }
       return obj.longValue();
    }
    public final long r(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "16");
       if (obj == PatchProxyResult.class) {
          obj = this.q.getValue();
       }
       return obj.longValue();
    }
    public final long s(String p0){
       long l;
       long l1;
       Object obj = PatchProxy.applyOneRefs(p0, this, KsSharePerformanceStat.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       switch (p0.hashCode()){
           case 0xa5ca3540:
             if (p0.equals("image_download_cost")) {
                l = this.g();
                l1 = this.h();
             label_00e3 :
                Long longx = Long.valueOf((l - l1));
                l = longx.longValue();
                l1 = this.p();
                l = (1 - l <= 0 && l1 - l > 0)? 1: 0;
                if (!l) {
                   longx = null;
                }
                l = (longx != null)? longx.longValue(): 0;
                return l;
             }
             break;
           case 0xd5ecf7e8:
             if (p0.equals("total_cost")) {
                l = Math.max(this.o(), this.n()) - this.p();
                l1 = this.v() - this.i();
                goto label_00e3 ;
             }
             break;
           case 0xe5858ea0:
             if (p0.equals("share_any_cost")) {
                l = this.j();
                l1 = this.k();
                goto label_00e3 ;
             }
             break;
           case 0xa435517:
             if (p0.equals("share_data_config")) {
                l = Math.max(this.o(), this.n());
                l1 = this.j();
                goto label_00e3 ;
             }
             break;
           case 0xb82caa6:
             if (p0.equals("image_compress_cost")) {
                l = this.a();
                l1 = this.b();
                goto label_00e3 ;
             }
             break;
           case 0x359a108a:
             if (p0.equals("third_sdk_cost")) {
                l = this.q();
                l1 = this.r();
                goto label_00e3 ;
             }
             break;
           case 0x4283ed3c:
             if (p0.equals("share_init_cost")) {
                l = this.l();
                l1 = this.m();
                goto label_00e3 ;
             }
             break;
           case 0x48dfb29a:
             if (p0.equals("image_decode_cost")) {
                l = this.e();
                l1 = this.f();
                goto label_00e3 ;
             }
             break;
           case 0x54e64828:
             if (p0.equals("pannel_show_cost")) {
                l = this.i();
                l1 = this.l();
                goto label_00e3 ;
             }
             break;
           case 0x6550fde7:
             if (p0.equals("image_customized_cost")) {
                l = this.c();
                l1 = this.d();
                goto label_00e3 ;
             }
             break;
           default:
       }
    label_010c :
       throw new UnsupportedOperationException("Wrong performance stat time cost key!");
    }
    public final long t(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsSharePerformanceStat.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       Long longx = this.a.get(p0);
       if (longx == null) {
          longx = Long.valueOf(0);
       }
       a.o(longx, "timeTimestampMap[key] ?: 0");
       return longx.longValue();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsSharePerformanceStat\(statEventKey="+this.w+"\)";
    }
    public final long u(String p0){
       long l;
       Object obj = PatchProxy.applyOneRefs(p0, this, KsSharePerformanceStat.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       switch (p0.hashCode()){
           case 0x8cc22ee2:
             if (!p0.equals("image_compress_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.a();
          label_011d :
             return l;
             break;
           case 0x9fd7a1f8:
             if (!p0.equals("request_share_any_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.j();
             goto label_011d ;
             break;
           case 0xb0b00f81:
             if (!p0.equals("image_customized_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.c();
             goto label_011d ;
             break;
           case 0xc82cf57b:
             if (!p0.equals("pannel_appeared")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.i();
             goto label_011d ;
             break;
           case 0xd3fa1b35:
             if (!p0.equals("image_decode_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.f();
             goto label_011d ;
             break;
           case 0xe219b8d4:
             if (!p0.equals("send_failed")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.n();
             goto label_011d ;
             break;
           case 0xf9789c7e:
             if (!p0.equals("third_sdk_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.q();
             goto label_011d ;
             break;
           case 0xfb10b165:
             if (!p0.equals("user_select_action")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.v();
             goto label_011d ;
             break;
           case 0x93f0a3f:
             if (!p0.equals("request_share_any_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.k();
             goto label_011d ;
             break;
           case 0x145fed4f:
             if (!p0.equals("image_download_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.h();
             goto label_011d ;
             break;
           case 0x1842d402:
             if (!p0.equals("share_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.p();
             goto label_011d ;
             break;
           case 0x3296ac8b:
             if (!p0.equals("send_succeed")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.o();
             goto label_011d ;
             break;
           case 0x45b23988:
             if (!p0.equals("image_customized_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.d();
             goto label_011d ;
             break;
           case 0x54ee786e:
             if (!p0.equals("image_decode_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.e();
             goto label_011d ;
             break;
           case 0x65ba04a9:
             if (!p0.equals("image_compress_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.b();
             goto label_011d ;
             break;
           case 0x77973483:
             if (!p0.equals("request_share_init_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.m();
             goto label_011d ;
             break;
           case 0x78f60908:
             if (!p0.equals("image_download_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.g();
             goto label_011d ;
             break;
           case 0x7e8b7b45:
             if (!p0.equals("third_sdk_start")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.r();
             goto label_011d ;
             break;
           case 0x7ffd8d3c:
             if (!p0.equals("request_share_init_end")) {
                throw new UnsupportedOperationException("Wrong performance stat timestamp key!");
             }
             l = this.l();
             goto label_011d ;
             break;
           default:
             goto label_011e ;
       }
    }
    public final long v(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = this.f.getValue();
       }
       return obj.longValue();
    }
    public final boolean w(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.o() > 0 || this.n() > 0)? true: false;
       return b;
    }
    public final void x(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsSharePerformanceStat.class, "21")) {
          return;
       }
       a.p(p0, "key");
       this.a.put(p0, Long.valueOf(System.currentTimeMillis()));
       return;
    }
}
