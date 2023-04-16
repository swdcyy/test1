package com.yxcorp.gifshow.profile.kslog.KsLogProfileAvatarTag;
import v2c.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import v2c.d;

public final class KsLogProfileAvatarTag extends Enum implements e	// class@00137a
{
    public String mName;
    public static final KsLogProfileAvatarTag[] $VALUES;
    public static final KsLogProfileAvatarTag AVATAR;

    static {
       KsLogProfileAvatarTag ksLogProfile = new KsLogProfileAvatarTag("AVATAR", 0, "Avatar");
       KsLogProfileAvatarTag.AVATAR = ksLogProfile;
       KsLogProfileAvatarTag[] ksLogProfile1 = new KsLogProfileAvatarTag[]{ksLogProfile};
       KsLogProfileAvatarTag.$VALUES = ksLogProfile1;
    }
    public void KsLogProfileAvatarTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static KsLogProfileAvatarTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogProfileAvatarTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogProfileAvatarTag.class, p0);
    }
    public static KsLogProfileAvatarTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogProfileAvatarTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogProfileAvatarTag.$VALUES.clone();
    }
    public List a(String p0,String p1){
       return d.b(this, p0, p1);
    }
    public List appendTag(String p0){
       return d.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
