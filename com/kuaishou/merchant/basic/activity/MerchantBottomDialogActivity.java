package com.kuaishou.merchant.basic.activity.MerchantBottomDialogActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ot3.a0;
import android.view.Window;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import lnc.a1;
import android.os.Bundle;

public class MerchantBottomDialogActivity extends GifshowActivity	// class@0015a6
{

    public void MerchantBottomDialogActivity(){
       super();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onAttachedToWindow(){
       int i;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, MerchantBottomDialogActivity.class, str)) {
          return;
       }
       super.onAttachedToWindow();
       a0 uoa0 = a0.class;
       if (!PatchProxy.applyVoidOneRefs(this, objArray, uoa0, str) && this.getWindow() != null) {
          Object obj = PatchProxy.applyOneRefs(this, objArray, uoa0, "1");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             i = (n.j(this) * 3) / 5;
             if (i <= 0) {
                i = a1.d(R.dimen.arg_RES_7f070899);
             }
          }
          a0.a(this, i);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBottomDialogActivity.class, "1")) {
          return;
       }
       this.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f01010d);
       super.onCreate(p0);
       this.i = 0x7f01010d;
       return;
    }
}
