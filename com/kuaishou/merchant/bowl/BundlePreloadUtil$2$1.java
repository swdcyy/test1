package com.kuaishou.merchant.bowl.BundlePreloadUtil$2$1;
import java.util.HashMap;
import com.kuaishou.merchant.bowl.BundlePreloadUtil$2;
import tx4.w;
import java.lang.Object;

public class BundlePreloadUtil$2$1 extends HashMap	// class@001602
{
    public final BundlePreloadUtil$2 this$0;
    public final w val$tkBundleInfo;

    public void BundlePreloadUtil$2$1(BundlePreloadUtil$2 p0,w p1){
       this.this$0 = p0;
       this.val$tkBundleInfo = p1;
       super();
       this.put("bundleId", p1.b);
       this.put("bundleVersion", p1.c);
    }
}
