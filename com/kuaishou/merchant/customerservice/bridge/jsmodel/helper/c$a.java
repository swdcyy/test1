package com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c$a;
import ot.c;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import ot.b;
import java.io.FileOutputStream;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.System;
import java.nio.channels.FileChannel;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c$b;

public class c$a implements c	// class@00166e
{
    public long a;
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
       this.a = 0;
    }
    public void a(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a = 0;
       this.c();
       this.b.f(20, new Exception("Arya recorder error with code:"+p0));
       return;
    }
    public void b(ByteBuffer p0,int p1,int p2){
       b.b(this, p0, p1, p2);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "4")) {
          return;
       }
       c f = this.b.f;
       if (f == null) {
          return;
       }
       try{
          f.flush();
          f = this.b.f;
          if (f != null) {
             f.close();
          }
       }catch(java.io.IOException e2){
          this.b.f(17, e2);
          f = this.b.f;
          if (f != null) {
             f.close();
          }
       }catch(java.io.IOException e2){
          a.l(MerchantCommonLogBiz.BRIDGE, "MerchantAudioRecorder", "onAudioRecordFinished", e2);
       }
       return;
    }
    public void onAudioEncoded(ByteBuffer p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.b.b == 1 && this.b.f != null) {
          try{
             if (!this.a - null) {
                this.a = System.currentTimeMillis();
             }
             this.b.f.getChannel().write(p0);
             c$a tb = this.b;
             long l = System.currentTimeMillis() - this.a;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Integer.valueOf(p1), tb, c.class, "10")) {
                c d = tb.d;
                if (d != null) {
                   d.b(l, p1);
                }
             }
          }catch(java.io.IOException e7){
             this.b.a(17, e7);
          }
       }
    }
    public void onAudioRecordFinished(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a = 0;
       this.c();
       if (this.b.b == 2) {
          uoa = this.b;
          c c = uoa.c;
          long l = (long)p0;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(c, Long.valueOf(l), uoa, c.class, "11")) {
             c d = uoa.d;
             if (d != null) {
                d.c(c, l);
             }
          }
       }else {
          this.b.b();
       }
       return;
    }
}
