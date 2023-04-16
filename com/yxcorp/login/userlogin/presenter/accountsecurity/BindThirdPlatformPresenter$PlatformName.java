package com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter$PlatformName;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BindThirdPlatformPresenter$PlatformName extends Enum	// class@001b9e
{
    public static final BindThirdPlatformPresenter$PlatformName[] $VALUES;
    public static final BindThirdPlatformPresenter$PlatformName QQ;
    public static final BindThirdPlatformPresenter$PlatformName WECHAT;

    static {
       BindThirdPlatformPresenter$PlatformName platformName = new BindThirdPlatformPresenter$PlatformName("WECHAT", 0);
       BindThirdPlatformPresenter$PlatformName.WECHAT = platformName;
       BindThirdPlatformPresenter$PlatformName platformName1 = new BindThirdPlatformPresenter$PlatformName("QQ", 1);
       BindThirdPlatformPresenter$PlatformName.QQ = platformName1;
       BindThirdPlatformPresenter$PlatformName[] platformName2 = new BindThirdPlatformPresenter$PlatformName[]{platformName,platformName1};
       BindThirdPlatformPresenter$PlatformName.$VALUES = platformName2;
    }
    public void BindThirdPlatformPresenter$PlatformName(String p0,int p1){
       super(p0, p1);
    }
    public static BindThirdPlatformPresenter$PlatformName valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BindThirdPlatformPresenter$PlatformName.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BindThirdPlatformPresenter$PlatformName.class, p0);
    }
    public static BindThirdPlatformPresenter$PlatformName[] values(){
       Object obj = PatchProxy.apply(null, null, BindThirdPlatformPresenter$PlatformName.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BindThirdPlatformPresenter$PlatformName.$VALUES.clone();
    }
}
