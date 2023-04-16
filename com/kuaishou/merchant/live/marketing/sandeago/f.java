package com.kuaishou.merchant.live.marketing.sandeago.f;
import java.lang.Object;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import android.content.DialogInterface$OnShowListener;
import crd.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import crd.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ot3.z;
import y04.d;
import y04.c;
import brd.t;
import cjd.e;
import erd.o;
import n64.k;
import n64.l;

public class f	// class@001a3c
{

    public void f(){
       super();
    }
    public static void a(g p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uof, "4")) {
          return;
       }
       try{
          p0.accept(Boolean.valueOf(p1));
       }catch(java.lang.Exception e4){
          a.l(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoJumpHelper", "accepts jump result error", e4);
       }
       return;
    }
    public static b b(FragmentActivity p0,Commodity p1,LiveMerchantBaseContext p2,int p3,DialogInterface$OnShowListener p4,g p5){
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          p4 = PatchProxy.apply(objArray, null, uof, "2");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       if (p0.isFinishing()) {
          a.s(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoJumpHelper", "activity is null or activity is finishing");
          f.a(p5, i);
          return c.b();
       }else {
          ProgressFragment progressFrag = z.a(p0);
          g og = p5;
          FragmentActivity uFragmentAct = p0;
          LiveMerchantBaseContext liveMerchant = p2;
          Commodity uCommodity = p1;
          int i1 = p3;
          k ok = new k(progressFrag, og, uFragmentAct, liveMerchant, uCommodity, i1);
          l ol = new l(progressFrag, og, uFragmentAct, liveMerchant, uCommodity, i1);
          return c.a().m(p2.getLiveStreamId(), p1.mId, p2.getLivePayload()).map(new e()).subscribe(v8, v9);
       }
    }
}
