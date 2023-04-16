package com.yxcorp.gifshow.profile.kslog.KsLogProfileEditTag;
import v2c.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import v2c.d;

public final class KsLogProfileEditTag extends Enum implements e	// class@00137b
{
    public String mName;
    public static final KsLogProfileEditTag[] $VALUES;
    public static final KsLogProfileEditTag EDIT_COMMON;
    public static final KsLogProfileEditTag EDIT_IMAGE_SELECT;
    public static final KsLogProfileEditTag EDIT_PROFILE_PENDANT;
    public static final KsLogProfileEditTag EDIT_PROGRESS;

    static {
       KsLogProfileEditTag ksLogProfile = new KsLogProfileEditTag("EDIT_COMMON", 0, "EditCommon");
       KsLogProfileEditTag.EDIT_COMMON = ksLogProfile;
       KsLogProfileEditTag ksLogProfile1 = new KsLogProfileEditTag("EDIT_PROGRESS", 1, "EditProgress");
       KsLogProfileEditTag.EDIT_PROGRESS = ksLogProfile1;
       KsLogProfileEditTag ksLogProfile2 = new KsLogProfileEditTag("EDIT_PROFILE_PENDANT", 2, "EditProfilePendant");
       KsLogProfileEditTag.EDIT_PROFILE_PENDANT = ksLogProfile2;
       KsLogProfileEditTag ksLogProfile3 = new KsLogProfileEditTag("EDIT_IMAGE_SELECT", 3, "EditImageSelect");
       KsLogProfileEditTag.EDIT_IMAGE_SELECT = ksLogProfile3;
       KsLogProfileEditTag[] ksLogProfile4 = new KsLogProfileEditTag[]{ksLogProfile,ksLogProfile1,ksLogProfile2,ksLogProfile3};
       KsLogProfileEditTag.$VALUES = ksLogProfile4;
    }
    public void KsLogProfileEditTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static KsLogProfileEditTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogProfileEditTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogProfileEditTag.class, p0);
    }
    public static KsLogProfileEditTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogProfileEditTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogProfileEditTag.$VALUES.clone();
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
