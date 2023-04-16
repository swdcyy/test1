package com.yxcorp.gifshow.share.widget.MerchantForwardFragment$b;
import y8c.g;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$c;
import ml8.c;

public final class MerchantForwardFragment$b extends g	// class@001d0f
{
    public final MerchantForwardFragment w;

    public void MerchantForwardFragment$b(MerchantForwardFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       MerchantForwardFragment$b uob = MerchantForwardFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d048d), new MerchantForwardFragment$c(this.w));
    }
}
