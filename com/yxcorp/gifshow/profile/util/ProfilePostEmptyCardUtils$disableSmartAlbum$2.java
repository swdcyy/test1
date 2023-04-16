package com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$disableSmartAlbum$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class ProfilePostEmptyCardUtils$disableSmartAlbum$2 extends Lambda implements a	// class@0015ca
{
    public static final ProfilePostEmptyCardUtils$disableSmartAlbum$2 INSTANCE;

    static {
       ProfilePostEmptyCardUtils$disableSmartAlbum$2.INSTANCE = new ProfilePostEmptyCardUtils$disableSmartAlbum$2();
    }
    public void ProfilePostEmptyCardUtils$disableSmartAlbum$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils$disableSmartAlbum$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disableEmptyProfileSmartAlbumCard", false);
    }
}
