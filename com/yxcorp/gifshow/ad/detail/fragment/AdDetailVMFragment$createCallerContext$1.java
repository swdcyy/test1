package com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment$createCallerContext$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;

public final class AdDetailVMFragment$createCallerContext$1 extends Lambda implements a	// class@001555
{
    public final AdDetailVMFragment this$0;

    public void AdDetailVMFragment$createCallerContext$1(AdDetailVMFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final Activity invoke(){
       Object obj = PatchProxy.apply(null, this, AdDetailVMFragment$createCallerContext$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.getActivity();
    }
    public Object invoke(){
       return this.invoke();
    }
}
