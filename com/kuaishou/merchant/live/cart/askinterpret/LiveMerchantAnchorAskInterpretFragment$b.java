package com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment$b;
import y8c.g;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment;
import android.content.Context;
import android.view.LayoutInflater;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y24.f;
import y24.e;
import ml8.c;

public class LiveMerchantAnchorAskInterpretFragment$b extends g	// class@0018f7
{
    public LayoutInflater w;
    public final LiveMerchantAnchorAskInterpretFragment x;

    public void LiveMerchantAnchorAskInterpretFragment$b(LiveMerchantAnchorAskInterpretFragment p0,Context p1){
       this.x = p0;
       super();
       this.w = LayoutInflater.from(p1);
    }
    public ArrayList a1(int p0,f p1){
       ArrayList obj;
       LiveMerchantAnchorAskInterpretFragment$b uob = LiveMerchantAnchorAskInterpretFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(new c("ASK_INTERPRET_LIVE_BASE_CONTEXT", this.x.z));
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       LiveMerchantAnchorAskInterpretFragment$b uob = LiveMerchantAnchorAskInterpretFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new f());
       obj.U7(new e());
       return new f(a.d(this.w, 0x7f0d0658, p0, false), obj);
    }
}
