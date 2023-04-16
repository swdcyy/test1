package com.yxcorp.gifshow.growth.framework.GrowthListActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;
import java.util.ArrayList;
import pna.h;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.growth.framework.GrowthListActivity$a;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import pna.j;
import kotlin.jvm.internal.a;
import ekd.j0;
import java.lang.Iterable;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public final class GrowthListActivity extends GifshowActivity	// class@001370
{
    public GrowthListFragment y;

    public void GrowthListActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, GrowthListActivity.class, "3")) {
          return;
       }
       GrowthListActivity ty = this.y;
       if (ty != null) {
          Intent intent = new Intent();
          h.c(intent, ty.o);
          this.setResult(-1, intent);
       }
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GrowthListActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, GrowthListActivity.class, "2")) {
          return;
       }
       GrowthListActivity ty = this.y;
       if (ty == null || ty.eh() != true) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       j d;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthListActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       w9.b(this, new GrowthListActivity$a(this));
       Intent intent = this.getIntent();
       if (intent != null) {
          j oj = PatchProxy.applyOneRefs(intent, null, h.class, str);
          if (oj != PatchProxyResult.class) {
          }else {
             a.p(intent, "$this$listSelectorOption");
             oj = new j();
             String str1 = j0.f(intent, "KEY_ACTIVITY_TITLE");
             if (str1 == null) {
                d = oj.a;
             }
             oj.a = str1;
             oj.b = j0.b(intent, "KEY_SELECT_ACTIVITY_TYPE", oj.b);
             oj.c = j0.b(intent, "KEY_SELECT_VIEW_TYPE", oj.c);
             ArrayList stringArrayL = intent.getStringArrayListExtra("KEY_ITEM_LIST");
             if (stringArrayL != null) {
                stringArrayL = CollectionsKt___CollectionsKt.e2(stringArrayL, oj.d);
                if (stringArrayL != null) {
                label_006a :
                   oj.d = stringArrayL;
                   ArrayList uArrayList = h.a(intent);
                   if (uArrayList == null) {
                      uArrayList = new ArrayList();
                   }
                   oj.e = uArrayList;
                }
             }
             d = oj.d;
             goto label_006a ;
          }
          if (oj != null) {
             GrowthListFragment growthListFr = new GrowthListFragment();
             if (!PatchProxy.applyVoidOneRefs(oj, growthListFr, GrowthListFragment.class, str)) {
                a.p(oj, "value");
                growthListFr.n = oj;
                growthListFr.o = new ArrayList(oj.e);
             }
             this.y = growthListFr;
             e uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(0x1020002, growthListFr);
             uoe.m();
          }
       }
       return;
    }
}
