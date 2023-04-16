package com.kuaishou.merchant.api.core.LiveMerchantBaseContext$b;
import xwd.c;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import java.lang.ClassLoader;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$a;

public class LiveMerchantBaseContext$b implements c	// class@001502
{

    public void LiveMerchantBaseContext$b(){
       super();
    }
    public Object a(Parcel p0){
       return this.c(p0);
    }
    public void b(Object p0,Parcel p1){
       this.d(p0, p1);
    }
    public LiveMerchantBaseContext c(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantBaseContext$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.readParcelable(LiveMerchantBaseContext$Builder.class.getClassLoader())).build();
    }
    public void d(LiveMerchantBaseContext p0,Parcel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantBaseContext$b.class, "1")) {
          return;
       }
       p1.writeParcelable(b.c(new LiveMerchantBaseContext$Builder(p0, null)), 0);
       return;
    }
}
