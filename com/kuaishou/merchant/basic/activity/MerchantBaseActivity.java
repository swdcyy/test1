package com.kuaishou.merchant.basic.activity.MerchantBaseActivity;
import ct3.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.SystemClock;
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

public abstract class MerchantBaseActivity extends GifshowActivity implements a	// class@0015a5
{
    public final long y;

    public void MerchantBaseActivity(){
       super();
       this.y = SystemClock.elapsedRealtime();
    }
    public boolean S(b p0){
       List obj = PatchProxy.applyOneRefs(p0, this, MerchantBaseActivity.class, "1");
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
}
