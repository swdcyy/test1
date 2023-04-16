package com.yxcorp.gifshow.profile.model.ProfilePhotoMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class ProfilePhotoMeta implements Serializable	// class@0013ab
{
    public ProfileRankIconInfo mProfileRankIconInfo;
    public static final String PART_FIELD = "profilePhotoMeta";
    public static final long serialVersionUID = 0xc3eb6813bda5e03c;

    public void ProfilePhotoMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, ProfilePhotoMeta.class, "1")) {
          return;
       }
       e uoe = new e(ProfilePhotoMeta.class, "", "profilePhotoMeta");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}
