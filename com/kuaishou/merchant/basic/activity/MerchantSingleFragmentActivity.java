package com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import ct3.a;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.os.SystemClock;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseActivity;
import ht3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import android.view.MotionEvent;
import android.view.View;
import android.app.Activity;
import ot3.m0;
import android.widget.EditText;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import android.content.Intent;
import gr8.a;
import q74.d;
import dt3.c;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import androidx.fragment.app.e;

public abstract class MerchantSingleFragmentActivity extends SingleFragmentActivity implements a	// class@0015a7
{
    public final long y;
    public String z;

    public void MerchantSingleFragmentActivity(){
       super();
       this.y = SystemClock.elapsedRealtime();
    }
    public boolean A3(){
       return this instanceof MerchantPurchaseActivity;
    }
    public boolean S(b p0){
       List obj = PatchProxy.applyOneRefs(p0, this, MerchantSingleFragmentActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getSupportFragmentManager().getFragments();
       int i = 0;
       if (obj != null && (!obj.isEmpty() && obj.get(i) == p0)) {
          i = true;
       }
    label_002b :
       return i;
    }
    public final long a(){
       return this.y;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       View obj = PatchProxy.applyOneRefs(p0, this, MerchantSingleFragmentActivity.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0.getAction() && this.A3()) {
          obj = this.getCurrentFocus();
          Object obj1 = PatchProxy.applyTwoRefs(obj, p0, null, m0.class, str);
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(obj instanceof EditText){
             int[] ointArray = new int[2]{0,0};
             obj.getLocationInWindow(ointArray);
             int i = ointArray[0];
             b = ointArray[1];
             int i1 = obj.getHeight() + b;
             int i2 = obj.getWidth() + i;
             float x = p0.getX();
             float y = p0.getY();
             if (x - (float)i > 0 && (x - (float)i2 < 0 && (y - (float)b <= 0 || y - (float)i1 >= 0))) {
                b = true;
             }
          }
          b = false;
          if (b) {
             n.C(this);
             obj.clearFocus();
          }
       }
    label_0077 :
       return super.dispatchTouchEvent(p0);
    }
    public void n1(){
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantSingleFragmentActivity.class, "2")) {
          return;
       }
       try{
          Intent intent = this.getIntent();
          if (intent != null) {
             this.z = intent.getStringExtra("preloadTraceId");
          }
          super.onCreate(p0);
          d.b(this);
          c.a(this);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void z3(){
       MerchantSingleFragmentActivity merchantSing = MerchantSingleFragmentActivity.class;
       if (PatchProxy.applyVoid(null, this, merchantSing, "3")) {
          return;
       }
       Fragment uFragment = this.u3();
       if (uFragment == null) {
          return;
       }
       try{
          if (!PatchProxy.applyVoidOneRefs(uFragment, this, merchantSing, "5") && !TextUtils.isEmpty(this.z)) {
             Bundle arguments = uFragment.getArguments();
             if (arguments == null) {
                arguments = new Bundle();
             }
             arguments.putString("preloadTraceId", this.z);
             uFragment.setArguments(arguments);
          }
       }catch(java.lang.Exception e0){
          a.l(MerchantCommonLogBiz.PRELOADER, "MerchantSingleFragmentActivity", "attachPreloadTraceId error", e0);
       }
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, uFragment);
       uoe.m();
       return;
    }
}
