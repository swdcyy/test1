package com.yxcorp.gifshow.ad.tachikoma.page.AdtkActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkActivity$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yx.j0;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import android.content.Intent;
import android.os.Parcelable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import moc.b;
import android.view.KeyEvent;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import wkd.b;
import ey.c;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import p49.d;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment$a;
import kotlin.jvm.internal.a;

public final class AdtkActivity extends SingleFragmentActivity	// class@00183a
{
    public AdtkFragment y;
    public HashMap z;
    public static final AdtkActivity$a A;

    static {
       AdtkActivity.A = new AdtkActivity$a(null);
    }
    public void AdtkActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AdtkActivity.class, "3")) {
          return;
       }
       super.finish();
       Object[] objArray = new Object[0];
       j0.f("AdtkActivity", "AdtkActivity finish", objArray);
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AdtkActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       return "AD_TK_PAGE";
    }
    public void onCreate(Bundle p0){
       AdtkActivity uAdtkActivit = AdtkActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdtkActivit, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       j0.f("AdtkActivity", "AdtkActivity onCreate", objArray);
       this.overridePendingTransition(0, 0);
       if (!PatchProxy.applyVoid(null, this, uAdtkActivit, "2")) {
          i.i(this, 0, 0, true);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdtkActivity.class, "6")) {
          return;
       }
       super.onDestroy();
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdtkActivity", "AdtkActivity onDestroy", objArray);
       AdtkPageConfig parcelableEx = this.getIntent().getParcelableExtra("adtk_config");
       if (parcelableEx != null) {
          Object[] objArray1 = new Object[i];
          j0.f("AdtkActivity", "AdtkActivity remove feed", objArray1);
          b.f(parcelableEx.a());
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdtkActivity uAdtkActivit = AdtkActivity.class;
       if (PatchProxy.isSupport(uAdtkActivit)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uAdtkActivit, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdtkActivity", "AdtkActivity onKeyDown", objArray);
       AdtkActivity ty = this.y;
       if (ty != null) {
          if (PatchProxy.isSupport(AdtkFragment.class)) {
             Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, ty, AdtkFragment.class, "11");
             if (obj1 != patchProxyRe) {
                i = obj1.booleanValue();
             }
          }
          if (p0 == 4 && (p1 != null && !p1.getAction())) {
             AdtkFragment l = ty.l;
             if (l != null) {
                l.c(4);
             }
             i = true;
          }
       }
    label_005d :
       return i;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AdtkActivity.class, "8")) {
          return;
       }
       super.onPause();
       b.a(-2043625950).b(this);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdtkActivity.class, "7")) {
          return;
       }
       super.onResume();
       b.a(-2043625950).a(this, BusinessType.TACHIKOMA, SubBusinessType.DATUKA, (double)d.d.a("ad_universal_apm_TK_Datuka", 0));
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdtkFragment$a obj = PatchProxy.apply(objArray, this, AdtkActivity.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = AdtkFragment.r;
       Objects.requireNonNull(obj);
       AdtkFragment uAdtkFragmen = PatchProxy.apply(objArray, obj, AdtkFragment$a.class, "1");
       if (uAdtkFragmen != patchProxyRe) {
       }else {
          uAdtkFragmen = new AdtkFragment();
       }
       this.y = uAdtkFragmen;
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       uAdtkFragmen.setArguments(intent.getExtras());
       return uAdtkFragmen;
    }
}
