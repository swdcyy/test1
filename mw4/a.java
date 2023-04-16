package mw4.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import oe6.g;
import java.lang.reflect.Type;
import com.kwai.social.startup.relation.model.AccountFreezeConfig;
import com.kwai.social.startup.relation.model.ContactGuide;
import com.kwai.social.startup.relation.model.IntimateRelationConfig;
import com.kwai.social.startup.reminder.model.NewsSlidePlayConfig;
import com.kwai.social.startup.reminder.model.NotifyMixConfig;
import com.kwai.social.startup.follow.model.ProfileYiTianConfig;
import com.kwai.social.startup.follow.model.ProfileLastSeenConfig;
import java.util.List;
import com.kwai.social.startup.relation.model.PymkConfig;
import com.kwai.social.startup.relation.model.LoginDialogPojo;
import com.kwai.social.startup.reminder.model.ShareToFollowConfig;
import com.kwai.social.startup.relation.model.SocialRelationConfig;
import com.kwai.social.startup.relation.model.SocialShakeConfig;

public final class a	// class@001ee5
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static void A(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt(b.d("user")+"remindNewFriendsCount", p0);
       g.a(uEditor);
    }
    public static AccountFreezeConfig a(Type p0){
       String str = a.a.getString("accountFreezeConfig", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static String b(){
       return a.a.getString("BiologyAuthenticationUrl", "");
    }
    public static boolean c(){
       return a.a.getBoolean("checkBigR", false);
    }
    public static ContactGuide d(Type p0){
       String str = a.a.getString("contactGuide", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean e(){
       return a.a.getBoolean(b.d("user")+"disableFollowFansListPublicGuide", false);
    }
    public static boolean f(){
       return a.a.getBoolean("DisableRegisterExploreFriend", false);
    }
    public static boolean g(){
       return a.a.getBoolean("DisableRegisterFillUserInfo", false);
    }
    public static boolean h(){
       return a.a.getBoolean("DisableUseOldToken", false);
    }
    public static boolean i(){
       return a.a.getBoolean(b.d("user")+"enableProfileShowAnimatedCover", false);
    }
    public static boolean j(){
       return a.a.getBoolean("EnableShowIdCardVerify", false);
    }
    public static IntimateRelationConfig k(Type p0){
       String str = a.a.getString("intimateRelation", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static NewsSlidePlayConfig l(Type p0){
       String str = a.a.getString(b.d("user")+"newsSlideConfig", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static NotifyMixConfig m(Type p0){
       String str = a.a.getString(b.d("user")+"notifyMixConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean n(){
       return a.a.getBoolean("onlyUnreadSessionOfBigR", false);
    }
    public static ProfileYiTianConfig o(Type p0){
       String str = a.a.getString("profileConfig", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static ProfileLastSeenConfig p(Type p0){
       String str = a.a.getString("profileJustWatchConfig", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static List q(Type p0){
       String str = a.a.getString("PymkAutoRefreshConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int r(){
       return a.a.getInt(b.d("user")+"pymkBigCardDisplayStyle", 0);
    }
    public static PymkConfig s(Type p0){
       String str = a.a.getString("pymkConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static String t(){
       return a.a.getString("RealNameAuthenticationUrl", "");
    }
    public static LoginDialogPojo u(Type p0){
       String str = a.a.getString("registerGuide", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int v(){
       return a.a.getInt(b.d("user")+"remindNewFriendsCount", 0);
    }
    public static ShareToFollowConfig w(Type p0){
       String str = a.a.getString("ShareToFollowConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static SocialRelationConfig x(Type p0){
       String str = a.a.getString("socialRelationConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static SocialShakeConfig y(Type p0){
       String str = a.a.getString("socialShakeConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int z(){
       return a.a.getInt("validSessionPeriodOfBigR", 0);
    }
}
