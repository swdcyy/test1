package com.kuaishou.live.ad.social.r$a;
import km9.a;
import com.kuaishou.live.ad.social.r;
import java.lang.Object;
import zl0.a1;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$ControlInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import zl0.s0;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.ad.social.r$b;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import z1.a;
import java.lang.Long;
import java.lang.Boolean;
import zl0.k0;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;

public class r$a implements a	// class@000a1e
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public boolean Ql(){
       boolean b1;
       r b = this.b.b;
       if (b != null) {
          a1 k = b.k;
          if (k != null) {
             LiveAdConversionTaskDetail mControlInfo = k.mControlInfo;
             if (mControlInfo != null && mControlInfo.mNeedDisplayNoticeCard != null) {
                b1 = true;
             label_0015 :
                return b1;
             }
          }
       }
       b1 = false;
       goto label_0015 ;
    }
    public void bf(int p0){
       r$a uoa = r$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.b;
       r b = uoa.b;
       if (b == null) {
          return;
       }
       uoa.g.C6(b, p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public boolean dg(){
       r$a tb = this.b;
       r b = tb.b;
       if (b != null && b.a != null) {
          return true;
       }
       r$b c = tb.e.c;
       if (c != null && c.conversionEnabled != null) {
          return true;
       }
       return false;
    }
    public void h7(long p0,int p1,a p2){
       if (PatchProxy.isSupport(r$a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, this, r$a.class, "2")) {
          return;
       }
       this.b.e(p0, p1, p2);
       return;
    }
    public a1 pn(){
       return this.b.b;
    }
    public boolean qk(){
       r b = this.b.b;
       boolean b1 = false;
       if (b == null) {
          return b1;
       }
       if (b.a == null) {
          return b1;
       }
       a1 k = b.k;
       if (k == null) {
          if (b.i != 1) {
             b1 = true;
          }
          return b1;
       }else {
          LiveAdConversionTaskDetail mControlInfo = k.mControlInfo;
          if (mControlInfo != null && mControlInfo.mCode != 3) {
             b1 = true;
          }
          return b1;
       }
    }
    public void um(LiveAdSocialMessages$LiveAdSocialConversionTask p0,boolean p1,boolean p2,a p3){
       r$a tb;
       if (PatchProxy.isSupport(r$a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, r$a.class, "1")) {
          return;
       }
       if (p2) {
          if (p0 == null) {
             return;
          }else {
             tb = this.b;
             r b = tb.b;
             if (b != null) {
                LiveAdSocialMessages$LiveAdSocialConversionTask version = p0.version;
                a1 c = b.c;
                if (version - c < 0) {
                   return;
                }else if(b.k != null && !version - c){
                   boolean b1 = this.qk();
                   p3.accept(Boolean.valueOf(b1));
                   this.b.g.K0(b1);
                   return;
                }
             }
             if (p0.conversionEnabled == null) {
                tb.b = new a1(p0);
                p3.accept(Boolean.FALSE);
                this.b.g.K0(false);
                return;
             }else {
                k1.o(new k0(this, p0, p1, p3));
             }
          }
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(r.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p3, tb, r.class, "6")) {
             k1.m(tb.e);
             tb.e.c(p0, p1, p3, false);
             k1.o(tb.e);
          }
       }
       return;
    }
}
