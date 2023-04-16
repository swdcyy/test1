package com.yxcorp.login.userlogin.fragment.RetrievePasswordFragment$RetrievePasswordPage;
import java.lang.Enum;
import com.yxcorp.login.userlogin.fragment.ResetPasswordByPhoneFragment;
import java.lang.String;
import java.lang.Class;
import com.yxcorp.login.userlogin.fragment.ResetPasswordByEmailFragment;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RetrievePasswordFragment$RetrievePasswordPage extends Enum	// class@001b47
{
    public Class mClass;
    public int mName;
    public static final RetrievePasswordFragment$RetrievePasswordPage[] $VALUES;
    public static final RetrievePasswordFragment$RetrievePasswordPage MAIL;
    public static final RetrievePasswordFragment$RetrievePasswordPage PHONE;

    static {
       RetrievePasswordFragment$RetrievePasswordPage retrievePass = new RetrievePasswordFragment$RetrievePasswordPage("PHONE", 0, 0x7f1042bc, ResetPasswordByPhoneFragment.class);
       RetrievePasswordFragment$RetrievePasswordPage.PHONE = retrievePass;
       RetrievePasswordFragment$RetrievePasswordPage retrievePass1 = new RetrievePasswordFragment$RetrievePasswordPage("MAIL", 1, 0x7f1042bb, ResetPasswordByEmailFragment.class);
       RetrievePasswordFragment$RetrievePasswordPage.MAIL = retrievePass1;
       RetrievePasswordFragment$RetrievePasswordPage[] retrievePass2 = new RetrievePasswordFragment$RetrievePasswordPage[]{retrievePass,retrievePass1};
       RetrievePasswordFragment$RetrievePasswordPage.$VALUES = retrievePass2;
    }
    public void RetrievePasswordFragment$RetrievePasswordPage(String p0,int p1,int p2,Class p3){
       super(p0, p1);
       this.mName = p2;
       this.mClass = p3;
    }
    public static RetrievePasswordFragment$RetrievePasswordPage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RetrievePasswordFragment$RetrievePasswordPage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RetrievePasswordFragment$RetrievePasswordPage.class, p0);
    }
    public static RetrievePasswordFragment$RetrievePasswordPage[] values(){
       Object obj = PatchProxy.apply(null, null, RetrievePasswordFragment$RetrievePasswordPage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RetrievePasswordFragment$RetrievePasswordPage.$VALUES.clone();
    }
}
