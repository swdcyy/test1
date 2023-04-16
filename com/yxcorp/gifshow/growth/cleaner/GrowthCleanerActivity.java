package com.yxcorp.gifshow.growth.cleaner.GrowthCleanerActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import vma.a;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Number;
import lnc.a1;
import zf6.l;
import com.yxcorp.gifshow.growth.cleaner.GrowthCleanerFragment;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import msd.l;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import ena.i;
import com.kwai.sdk.switchconfig.a;
import androidx.fragment.app.Fragment;

public final class GrowthCleanerActivity extends SingleFragmentActivity	// class@0012f9
{
    public GrowthCleanerFragment y;

    public void GrowthCleanerActivity(){
       super();
    }
    public final void A3(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerActivity.class, "2")) {
          return;
       }
       if (j0.a(this.getIntent(), "PUSH", false)) {
          a.n(((1 << (a.b() - 1)) | a.d()));
       }
       return;
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GrowthCleanerActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, GrowthCleanerActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.m(a1.a(0x7f060028), a1.a(0x7f060028));
    }
    public String getUrl(){
       return "ks://growth_cleaner";
    }
    public String o(){
       return "CLEAN_RUBBISH";
    }
    public void onBackPressed(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthCleanerActivity.class, "4")) {
          return;
       }
       GrowthCleanerActivity ty = this.y;
       if (ty != null) {
          Iterator obj = PatchProxy.apply(objArray, ty, GrowthCleanerFragment.class, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = ty.k.iterator();
             while (true) {
                if (obj.hasNext()) {
                   if (obj.next().invoke(ty).booleanValue()) {
                      b = true;
                   }
                }else {
                   b = false;
                }
             }
             return;
          }
          if (b == true) {
          }
       }
       super.onBackPressed();
       goto label_004a ;
    }
    public void onCreate(Bundle p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = PatchProxy.apply(null, null, i.class, "4");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else if(!a.t().a("growthAppCleanerEnableFlag", 7)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.finish();
          return;
       }else {
          this.A3();
          return;
       }
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerActivity.class, "3")) {
          return;
       }
       super.onNewIntent(p0);
       this.A3();
       this.b2(1);
       return;
    }
    public Fragment u3(){
       GrowthCleanerFragment growthCleane = PatchProxy.apply(null, this, GrowthCleanerActivity.class, "5");
       if (growthCleane != PatchProxyResult.class) {
       }else {
          growthCleane = new GrowthCleanerFragment();
          this.y = growthCleane;
       }
       return growthCleane;
    }
}
