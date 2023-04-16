package com.kuaishou.android.model.merchant.MerchantEnhanceDisplay$a;
import xwd.c;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ClassLoader;
import android.os.Parcelable;
import org.parceler.b;

public class MerchantEnhanceDisplay$a implements c	// class@000baa
{

    public void MerchantEnhanceDisplay$a(){
       super();
    }
    public Object a(Parcel p0){
       return this.c(p0);
    }
    public void b(Object p0,Parcel p1){
       this.d(p0, p1);
    }
    public MerchantEnhanceDisplay c(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantEnhanceDisplay$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.readParcelable(MerchantEnhanceDisplay.class.getClassLoader()));
    }
    public void d(MerchantEnhanceDisplay p0,Parcel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantEnhanceDisplay$a.class, "1")) {
          return;
       }
       p1.writeParcelable(b.b(p0.getClass(), p0), 0);
       return;
    }
}
