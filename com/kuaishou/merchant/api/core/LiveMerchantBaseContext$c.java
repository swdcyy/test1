package com.kuaishou.merchant.api.core.LiveMerchantBaseContext$c;
import xwd.c;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ClassLoader;
import android.os.Parcelable;
import org.parceler.b;
import com.google.protobuf.nano.MessageNano;

public class LiveMerchantBaseContext$c implements c	// class@001503
{

    public void LiveMerchantBaseContext$c(){
       super();
    }
    public Object a(Parcel p0){
       return this.c(p0);
    }
    public void b(Object p0,Parcel p1){
       this.d(p0, p1);
    }
    public ClientContent$LiveStreamPackage c(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantBaseContext$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       byte[] uobyteArray = b.a(p0.readParcelable(byte[].class.getClassLoader()));
       if (uobyteArray != null) {
          return ClientContent$LiveStreamPackage.parseFrom(uobyteArray);
       }
       return null;
    }
    public void d(ClientContent$LiveStreamPackage p0,Parcel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantBaseContext$c.class, "1")) {
          return;
       }
       byte[] uobyteArray = (p0 != null)? MessageNano.toByteArray(p0): null;
       p1.writeParcelable(b.c(uobyteArray), 0);
       return;
    }
}
