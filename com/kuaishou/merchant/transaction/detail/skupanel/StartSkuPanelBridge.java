package com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge;
import an4.a;
import java.lang.String;
import p55.a;
import java.lang.Object;
import f55.g;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import ekd.q;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.detail.skupanel.TransactionSkuPanelFragment;
import ii4.m;
import com.kwai.framework.plugin.PluginManager;
import android.content.res.Resources;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public class StartSkuPanelBridge extends a	// class@00077d
{

    public void StartSkuPanelBridge(){
       super();
    }
    public String f(){
       return "startSkuPanel";
    }
    public void g(a p0,Object p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, StartSkuPanelBridge.class, "1")) {
       }else if(p0.getContext() instanceof GifshowActivity){
          GifshowActivity context = p0.getContext();
          if (!context.isFinishing()) {
             if (q.h(p1)) {
                this.b(p2, -1, "params is empty");
             }else {
                HashMap hashMap = new HashMap(p1);
                p1 = "kwai://merchant/transaction/sku/panel"+"?";
                Iterator iterator = hashMap.keySet().iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   Object obj = hashMap.get(str);
                   if (obj != null) {
                      p1 = p1+str+"="+obj+"&";
                   }
                }
                if ((p1).endsWith("&")) {
                   p1.substring(0, p1.length());
                }
                p1 = TransactionSkuPanelFragment.Ch(p1);
                p1.E = new m(this, p2);
                PluginManager.H.J(context.getResources(), true);
                p1.show(context.getSupportFragmentManager(), "");
             }
          }
       }
       this.b(p2, 0x1e84a, "current page is finished");
       return;
    }
}
