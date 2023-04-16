package com.yxcorp.gifshow.camera.rn.ktv.tune.list.category.detail.KtvCategoryDetailActivity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import li9.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.BasePostActivity;

public class KtvCategoryDetailActivity extends BaseKtvKrnActivity	// class@000ffa
{
    public String P;
    public String Q;

    public void KtvCategoryDetailActivity(){
       super();
       this.P = "";
       this.Q = "";
    }
    public Fragment G3(){
       LaunchModel$b obj = PatchProxy.apply(null, this, KtvCategoryDetailActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LaunchModel$b();
       obj.i("KMusicRefactor");
       obj.j("list");
       obj.e("id", this.P).e("pageName", this.Q).e("containerSource", "KtvCategoryDetailActivity");
       this.K3(obj);
       return KwaiRnFragment.Yg(obj.h());
    }
    public int M(){
       return 4;
    }
    public int P2(){
       return 1;
    }
    public int getPage(){
       return 306;
    }
    public String getPageParams(){
       Object[] obj = PatchProxy.apply(null, this, KtvCategoryDetailActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this.Q,this.P};
       return String.format("name=%s&id=%s", obj);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KtvCategoryDetailActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://ktv_category_detail";
    }
    public void onCreate(Bundle p0){
       KtvCategoryDetailActivity ktvCategoryD = KtvCategoryDetailActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ktvCategoryD, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ktvCategoryD, "4") && (this.getIntent().getScheme() != null && this.getIntent().getData() != null)) {
          String str = x0.a(this.getIntent().getData(), "id");
          String str1 = x0.a(this.getIntent().getData(), "name");
          if (TextUtils.x(str) || TextUtils.x(str1)) {
             Object[] objArray = new Object[0];
             a.C().w("KtvCategoryDetailActivity", "initKtvCategory id : "+str+" name : "+str1, objArray);
          }else {
             this.P = str;
             this.Q = str1;
          }
       }
       super.onCreate(p0);
       if (TextUtils.x(this.P)) {
          this.finish();
       }
       return;
    }
}
