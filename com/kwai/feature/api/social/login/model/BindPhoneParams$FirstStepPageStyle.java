package com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BindPhoneParams$FirstStepPageStyle extends Enum	// class@001110
{
    public static final BindPhoneParams$FirstStepPageStyle[] $VALUES;
    public static final BindPhoneParams$FirstStepPageStyle ORIGIN_BIND_PAGE_FIRST;
    public static final BindPhoneParams$FirstStepPageStyle PHONE_ONEKEY_BIND_DIALOG_FIRST;
    public static final BindPhoneParams$FirstStepPageStyle PHONE_ONEKEY_BIND_PAGE_FIRST;

    static {
       BindPhoneParams$FirstStepPageStyle uFirstStepPa = new BindPhoneParams$FirstStepPageStyle("PHONE_ONEKEY_BIND_PAGE_FIRST", 0);
       BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_PAGE_FIRST = uFirstStepPa;
       BindPhoneParams$FirstStepPageStyle uFirstStepPa1 = new BindPhoneParams$FirstStepPageStyle("PHONE_ONEKEY_BIND_DIALOG_FIRST", 1);
       BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_DIALOG_FIRST = uFirstStepPa1;
       BindPhoneParams$FirstStepPageStyle uFirstStepPa2 = new BindPhoneParams$FirstStepPageStyle("ORIGIN_BIND_PAGE_FIRST", 2);
       BindPhoneParams$FirstStepPageStyle.ORIGIN_BIND_PAGE_FIRST = uFirstStepPa2;
       BindPhoneParams$FirstStepPageStyle[] uFirstStepPa3 = new BindPhoneParams$FirstStepPageStyle[]{uFirstStepPa,uFirstStepPa1,uFirstStepPa2};
       BindPhoneParams$FirstStepPageStyle.$VALUES = uFirstStepPa3;
    }
    public void BindPhoneParams$FirstStepPageStyle(String p0,int p1){
       super(p0, p1);
    }
    public static BindPhoneParams$FirstStepPageStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BindPhoneParams$FirstStepPageStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BindPhoneParams$FirstStepPageStyle.class, p0);
    }
    public static BindPhoneParams$FirstStepPageStyle[] values(){
       Object obj = PatchProxy.apply(null, null, BindPhoneParams$FirstStepPageStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BindPhoneParams$FirstStepPageStyle.$VALUES.clone();
    }
}
