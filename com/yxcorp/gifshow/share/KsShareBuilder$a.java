package com.yxcorp.gifshow.share.KsShareBuilder$a;
import n3d.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.kwaishare.kit.ShareKitConfig;
import java.util.Objects;
import msd.q;

public final class KsShareBuilder$a implements a	// class@001b41
{
    public static final KsShareBuilder$a b;

    static {
       KsShareBuilder$a.b = new KsShareBuilder$a();
    }
    public void KsShareBuilder$a(){
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KsShareBuilder$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KsShareBuilder$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(ShareKitConfig.k);
       ShareKitConfig.i.invoke(Integer.valueOf(p0), Integer.valueOf(p1), p2);
       return;
    }
}
