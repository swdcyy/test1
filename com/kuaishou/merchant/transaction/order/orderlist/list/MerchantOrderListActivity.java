package com.kuaishou.merchant.transaction.order.orderlist.list.MerchantOrderListActivity;
import je.a;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import ot3.h0;
import com.kuaishou.merchant.transaction.order.orderlist.list.MerchantOrderListFragment;
import fl4.a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ml4.a;
import androidx.lifecycle.ViewModel;
import fl4.b;
import kl4.m;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import com.kuaishou.ksmvvm.command.KSCommand;
import androidx.fragment.app.Fragment;

public class MerchantOrderListActivity extends MerchantSingleFragmentActivity implements a	// class@000886
{
    public a A;
    public m B;
    public final HashMap C;
    public Uri D;
    public MerchantOrderListFragment E;

    public void MerchantOrderListActivity(){
       super();
       this.C = new HashMap();
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderListActivity.class, "6")) {
          return;
       }
       this.onBackPressed();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderListActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       MerchantOrderListActivity tD;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantOrderListActivity merchantOrde = MerchantOrderListActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, merchantOrde, "2")) {
          return;
       }
       Object[] objArray = null;
       Uri uri = PatchProxy.apply(objArray, this, merchantOrde, "5");
       if (uri != patchProxyRe) {
       }else {
          Intent intent = this.getIntent();
          if (intent != null && intent.getData() != null) {
             uri = intent.getData();
             if (!uri.isHierarchical() || TextUtils.isEmpty(uri.getEncodedQuery())) {
             }
          }
       }
       this.D = uri;
       String str = "";
       if (!PatchProxy.applyVoid(objArray, this, merchantOrde, "4")) {
          tD = this.C;
          MerchantOrderListActivity tD1 = this.D;
          String str1 = (tD1 == null)? str: tD1.toString();
          tD.put("refer", str1);
          this.C.put("pageSource", "native");
          h0.b(this.D, this.C);
       }
       tD = this.D;
       MerchantOrderListFragment merchantOrde1 = PatchProxy.applyOneRefs(tD, objArray, MerchantOrderListFragment.class, "1");
       if (merchantOrde1 != patchProxyRe) {
       }else {
          merchantOrde1 = new MerchantOrderListFragment();
          merchantOrde1.m = tD;
       }
       this.E = merchantOrde1;
       if (!PatchProxy.applyVoid(objArray, this, merchantOrde, "3")) {
          this.A = ViewModelProviders.of(this, new a(this)).get(a.class);
          this.B = ViewModelProviders.of(this, new b(this)).get(m.class);
          SearchParams searchParams = new SearchParams();
          searchParams.mPostParams.putAll(this.C);
          this.A.c.setValue(searchParams);
          m g = this.B.g;
          merchantOrde = this.D;
          if (merchantOrde != null) {
             str = merchantOrde.toString();
          }
          g.setValue(str);
          MerchantOrderListActivity tB = this.B;
          tB.b = this.E.l;
          tB.i.putAll(this.C);
          this.B.j.a();
          this.B.k.a();
       }
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       return this.E;
    }
}
