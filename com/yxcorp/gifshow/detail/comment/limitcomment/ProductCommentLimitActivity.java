package com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment;

public class ProductCommentLimitActivity extends SingleFragmentActivity	// class@001370
{
    public static final int y;

    public void ProductCommentLimitActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProductCommentLimitActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       ProductCommentLimitActivity productComme = ProductCommentLimitActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, productComme, "2")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, productComme, "3")) {
          KwaiActionBar kwaiActionBa = this.findViewById(R.id.title_root);
          kwaiActionBa.k(j.n(this, R.drawable.arg_RES_7f08068e, 0x7f060148), true);
          kwaiActionBa.q(R.string.arg_RES_7f100772);
       }
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, ProductCommentLimitActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProductCommentLimitFragment();
    }
    public int x3(){
       return 0x7f0d0026;
    }
    public boolean y3(){
       return true;
    }
}
