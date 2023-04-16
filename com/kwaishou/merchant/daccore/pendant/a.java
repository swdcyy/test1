package com.kwaishou.merchant.daccore.pendant.a;
import com.kwaishou.merchant.daccore.pendant.base.BaseDynamicPendant;
import d08.b;
import o08.a;
import java.lang.StringBuilder;
import java.lang.String;
import l08.c;
import c08.a;
import b08.a;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.util.Map;
import android.view.View;
import k08.b;
import java.lang.Runnable;
import hu4.h;
import android.view.ViewGroup;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import f08.f;
import java.lang.Throwable;

public class a extends BaseDynamicPendant	// class@00132c
{
    public a l;
    public static final int m;

    public void a(b p0){
       super(p0);
       this.l = new a("RNPendant_"+this.e(), a.d(p0.b()));
    }
    public void b(){
       super.b();
       this.l.a("pendantDidMount");
    }
    public void h(JsonObject p0,DataSource p1){
       HashMap hashMap = new HashMap();
       hashMap.put("data", p0);
       hashMap.put("source", Integer.valueOf(p1.getSource()));
       this.l.b("receiveRemoveEvent", hashMap);
    }
    public void j(JsonObject p0){
       HashMap hashMap = new HashMap();
       hashMap.put("data", p0);
       this.l.b("update", hashMap);
    }
    public void k(int p0){
       super.k(p0);
       this.l.a("pendantWillUnmount");
       if (p0 <= 0) {
          this.o();
       }else {
          View view = this.g();
          if (view != null) {
             view.postDelayed(new b(this), (long)p0);
          }
       }
       return;
    }
    public final void o(){
       try{
          h oh = this.n();
          h oh1 = this.m();
          if (oh != null) {
             ViewGroup viewGroup = oh.d();
             if (viewGroup instanceof MerchantKrnContainerView) {
                viewGroup.b();
                f.g(this.d(), this.e(), "has unload RNView");
             label_0024 :
                if (oh1 != null) {
                   viewGroup = oh1.d();
                   if (viewGroup instanceof MerchantKrnContainerView) {
                      viewGroup.b();
                      f.g(this.d(), this.e(), "has unload RNExtraView");
                   }
                }
             }else {
                goto label_0024 ;
             }
          }else {
             goto label_0024 ;
          }
       }catch(java.lang.Exception e0){
          f.f(this.d(), this.e(), "unload RNView error", e0);
       }
       return;
    }
}
