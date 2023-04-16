package com.kuaishou.live.preview.item.bottomcard.handler.i;
import hk3.a;
import gk3.b;
import java.lang.Object;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ok3.b;
import ik3.c$a;
import hk3.c;
import ik3.b;
import ik3.c;
import hk3.b;
import java.lang.Runnable;
import ekd.k1;
import kk3.f$b;
import com.kuaishou.live.preview.item.bottomcard.handler.h;

public abstract class i implements a	// class@000d87
{
    public final b a;

    public void i(b p0){
       super();
       this.a = p0;
    }
    public void a(LivePreviewBottomCardModel p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "3")) {
          c$a uoa = new c$a();
          uoa.e(p0.mCardType);
          uoa.b(p0.mBizId);
          uoa.g(p0.mPriority);
          uoa.h(p0.mShowCardMillis);
          uoa.f(p0.mIsCardHoldOn);
          uoa.d(this.c(p0));
          uoa.c(new c(this, p0));
          c uoc = uoa.a();
          LivePreviewBottomCardModel mDelayShowMi = p0.mDelayShowMillis;
          if (mDelayShowMi > 0) {
             k1.s(new b(this, uoc), this, mDelayShowMi);
          }else {
             this.a.c().b(uoc);
          }
       }
       return;
    }
    public void b(LivePreviewBottomCardModel p0,b p1){
       h.a(this, p0, p1);
    }
    public abstract b c(LivePreviewBottomCardModel p0);
    public abstract void d(LivePreviewBottomCardModel p0);
    public boolean e(){
       return true;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
}
