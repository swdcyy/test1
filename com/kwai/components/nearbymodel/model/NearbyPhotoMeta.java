package com.kwai.components.nearbymodel.model.NearbyPhotoMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class NearbyPhotoMeta implements Serializable	// class@000cba
{
    public LocalLifestylePoi mLocalLifestylePoi;
    public LocalSimpleLabelInfo mLocalSimpleLabelInfo;
    public static final long serialVersionUID = 0xe1f719d247e009c;

    public void NearbyPhotoMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, NearbyPhotoMeta.class, "1")) {
          return;
       }
       e uoe = new e(NearbyPhotoMeta.class, "", "nearbyPhotoMeta");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}
