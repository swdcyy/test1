package com.kuaishou.merchant.transaction.order.comment.MerchantOrderAdditionalCommentActivity;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import android.content.Intent;
import uk4.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;

public final class MerchantOrderAdditionalCommentActivity extends MerchantSingleFragmentActivity	// class@000857
{
    public HashMap A;

    public void MerchantOrderAdditionalCommentActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderAdditionalCommentActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderAdditionalCommentActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       a.a(this.getIntent(), this, "kwai://merchant/additional_comment", "2");
       this.finish();
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderAdditionalCommentActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       BaseFragment uBaseFragmen = new BaseFragment(null, null, null, null, 15, null);
       return obj;
    }
}
