package b3d.e0;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import java.lang.Enum;

public final class e0	// class@000325
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[LoginPageLauncher$LoginType.values().length];
       e0.a = ointArray;
       LoginPageLauncher$LoginType fULLSCREEN_L = LoginPageLauncher$LoginType.FULLSCREEN_LOGIN;
       ointArray[fULLSCREEN_L.ordinal()] = 1;
       LoginPageLauncher$LoginType pHONE_LOGIN = LoginPageLauncher$LoginType.PHONE_LOGIN;
       ointArray[pHONE_LOGIN.ordinal()] = 2;
       LoginPageLauncher$LoginType pHONE_ONE_KE = LoginPageLauncher$LoginType.PHONE_ONE_KEY_V4_LOGIN;
       ointArray[pHONE_ONE_KE.ordinal()] = 3;
       LoginPageLauncher$LoginType eMAIL_LOGIN = LoginPageLauncher$LoginType.EMAIL_LOGIN;
       ointArray[eMAIL_LOGIN.ordinal()] = 4;
       LoginPageLauncher$LoginType hISTORY_ONE_ = LoginPageLauncher$LoginType.HISTORY_ONE_KEY_LOGIN;
       ointArray[hISTORY_ONE_.ordinal()] = 5;
       LoginPageLauncher$LoginType kWAI_APP_LOG = LoginPageLauncher$LoginType.KWAI_APP_LOGIN;
       ointArray[kWAI_APP_LOG.ordinal()] = 6;
       LoginPageLauncher$LoginType cAPTCHA_RESE = LoginPageLauncher$LoginType.CAPTCHA_RESET_PASSWORD;
       ointArray[cAPTCHA_RESE.ordinal()] = 7;
       LoginPageLauncher$LoginType mULTI_LOGIN_ = LoginPageLauncher$LoginType.MULTI_LOGIN_ACCOUNT_SELECT;
       ointArray[mULTI_LOGIN_.ordinal()] = 8;
       LoginPageLauncher$LoginType mULTI_RETRIE = LoginPageLauncher$LoginType.MULTI_RETRIEVE_ACCOUNT_SELECT;
       ointArray[mULTI_RETRIE.ordinal()] = 9;
       LoginPageLauncher$LoginType rEGISTER_USE = LoginPageLauncher$LoginType.REGISTER_USER_INFO_SETTING;
       ointArray[rEGISTER_USE.ordinal()] = 10;
       LoginPageLauncher$LoginType rETRIEVE_PAS = LoginPageLauncher$LoginType.RETRIEVE_PASSWORD;
       ointArray[rETRIEVE_PAS.ordinal()] = 11;
       LoginPageLauncher$LoginType rESET_SELECT = LoginPageLauncher$LoginType.RESET_SELECT_ACCOUNT_PASSWORD;
       ointArray[rESET_SELECT.ordinal()] = 12;
       LoginPageLauncher$LoginType sET_PASSWORD = LoginPageLauncher$LoginType.SET_PASSWORD;
       ointArray[sET_PASSWORD.ordinal()] = 13;
       LoginPageLauncher$LoginType sWITCH_ACCOU = LoginPageLauncher$LoginType.SWITCH_ACCOUNT;
       ointArray[sWITCH_ACCOU.ordinal()] = 14;
       LoginPageLauncher$LoginType rESET_ACCOUN = LoginPageLauncher$LoginType.RESET_ACCOUNT_CHECKING;
       ointArray[rESET_ACCOUN.ordinal()] = 15;
       LoginPageLauncher$LoginType aCCOUNT_RISK = LoginPageLauncher$LoginType.ACCOUNT_RISK_CHECKING;
       ointArray[aCCOUNT_RISK.ordinal()] = 16;
       ointArray = new int[LoginPageLauncher$LoginType.values().length];
       e0.b = ointArray;
       ointArray[fULLSCREEN_L.ordinal()] = 1;
       ointArray[pHONE_LOGIN.ordinal()] = 2;
       ointArray[pHONE_ONE_KE.ordinal()] = 3;
       ointArray[eMAIL_LOGIN.ordinal()] = 4;
       ointArray[hISTORY_ONE_.ordinal()] = 5;
       ointArray[kWAI_APP_LOG.ordinal()] = 6;
       ointArray[cAPTCHA_RESE.ordinal()] = 7;
       ointArray[mULTI_LOGIN_.ordinal()] = 8;
       ointArray[mULTI_RETRIE.ordinal()] = 9;
       ointArray[rEGISTER_USE.ordinal()] = 10;
       ointArray[rETRIEVE_PAS.ordinal()] = 11;
       ointArray[rESET_SELECT.ordinal()] = 12;
       ointArray[sET_PASSWORD.ordinal()] = 13;
       ointArray[sWITCH_ACCOU.ordinal()] = 14;
       ointArray[rESET_ACCOUN.ordinal()] = 15;
       ointArray[aCCOUNT_RISK.ordinal()] = 16;
    }
}
