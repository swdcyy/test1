package com.kwai.feature.api.social.login.model.BindPhoneParams$ActionBarType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BindPhoneParams$ActionBarType extends Enum	// class@00110f
{
    public static final BindPhoneParams$ActionBarType[] $VALUES;
    public static final BindPhoneParams$ActionBarType TYPE_BACK;
    public static final BindPhoneParams$ActionBarType TYPE_BACK_AND_SKIP;
    public static final BindPhoneParams$ActionBarType TYPE_NONE;
    public static final BindPhoneParams$ActionBarType TYPE_SKIP;

    static {
       BindPhoneParams$ActionBarType uActionBarTy = new BindPhoneParams$ActionBarType("TYPE_BACK", 0);
       BindPhoneParams$ActionBarType.TYPE_BACK = uActionBarTy;
       BindPhoneParams$ActionBarType uActionBarTy1 = new BindPhoneParams$ActionBarType("TYPE_SKIP", 1);
       BindPhoneParams$ActionBarType.TYPE_SKIP = uActionBarTy1;
       BindPhoneParams$ActionBarType uActionBarTy2 = new BindPhoneParams$ActionBarType("TYPE_BACK_AND_SKIP", 2);
       BindPhoneParams$ActionBarType.TYPE_BACK_AND_SKIP = uActionBarTy2;
       BindPhoneParams$ActionBarType uActionBarTy3 = new BindPhoneParams$ActionBarType("TYPE_NONE", 3);
       BindPhoneParams$ActionBarType.TYPE_NONE = uActionBarTy3;
       BindPhoneParams$ActionBarType[] uActionBarTy4 = new BindPhoneParams$ActionBarType[]{uActionBarTy,uActionBarTy1,uActionBarTy2,uActionBarTy3};
       BindPhoneParams$ActionBarType.$VALUES = uActionBarTy4;
    }
    public void BindPhoneParams$ActionBarType(String p0,int p1){
       super(p0, p1);
    }
    public static BindPhoneParams$ActionBarType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BindPhoneParams$ActionBarType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BindPhoneParams$ActionBarType.class, p0);
    }
    public static BindPhoneParams$ActionBarType[] values(){
       Object obj = PatchProxy.apply(null, null, BindPhoneParams$ActionBarType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BindPhoneParams$ActionBarType.$VALUES.clone();
    }
}
