package ekd.l1;
import java.lang.String;
import android.content.Context;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import android.content.pm.PackageManager;
import java.lang.Object;
import java.lang.Integer;
import ukd.a;
import android.os.Build;

public class l1	// class@000d5b
{
    public static final String[] a;
    public static Boolean b;

    static {
       String[] stringArray = new String[]{"ONEPLUS A6000","ONEPLUS A6003","IN2010"};
       l1.a = stringArray;
    }
    public static boolean a(Context p0){
       Object[] objArray;
       Boolean uBoolean;
       Boolean uBoolean1;
       Object[] objArray1;
       Integer integer;
       String[] a;
       String str = "android.util.FtFeature";
       Boolean b = l1.b;
       if (b != null) {
          return b.booleanValue();
       }
       boolean b1 = false;
       if (RomUtils.s()) {
          try{
             b1 = p0.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
             l1.b = Boolean.valueOf(b1);
          }catch(java.lang.Exception e0){
          }
       }else {
          String str1 = "isFeatureSupport";
          if (RomUtils.w()) {
             try{
                objArray = new Object[]{Integer.valueOf(32)};
                uBoolean = a.b(str, str1, objArray);
             }catch(java.lang.Exception e0){
                uBoolean = null;
             }
             objArray = (uBoolean != null && uBoolean.booleanValue())? 1: null;
             if (!objArray) {
                try{
                   objArray = new Object[]{"vivo.hardware.holescreen"};
                   uBoolean1 = a.b(e0, str1, objArray);
                }catch(java.lang.Exception e0){
                }
                uBoolean = (uBoolean1 != null && uBoolean1.booleanValue())? 1: null;
                if (!uBoolean) {
                label_006a :
                   l1.b = Boolean.valueOf(b1);
                }
             }
             b1 = true;
             goto label_006a ;
          }else if(RomUtils.n()){
             try{
                objArray1 = new Object[b1];
                uBoolean1 = a.b("com.huawei.android.util.HwNotchSizeUtil", "hasNotchInScreen", objArray1);
             }catch(java.lang.Exception e0){
             }
             if (uBoolean1 != null && uBoolean1.booleanValue()) {
                b1 = true;
             }
             l1.b = Boolean.valueOf(b1);
          }else if(RomUtils.q()){
             try{
                objArray1 = new Object[]{"ro.miui.notch",Integer.valueOf(b1)};
                integer = a.b("android.os.SystemProperties", "getInt", objArray1);
             }catch(java.lang.Exception e0){
             }
             if (integer != null && integer.intValue() == 1) {
                b1 = true;
             }
             l1.b = Boolean.valueOf(b1);
          }else if(RomUtils.v()){
             try{
                Object[] objArray2 = new Object[]{Integer.valueOf(1)};
                uBoolean1 = a.b("smartisanos.api.DisplayUtilsSmt", str1, objArray2);
             }catch(java.lang.Exception e0){
             }
             if (uBoolean1 != null && uBoolean1.booleanValue()) {
                b1 = true;
             }
             l1.b = Boolean.valueOf(b1);
          }else {
             a = l1.a;
             int len = a.length;
             int i = 0;
             while (i < len) {
                if ((a[i]).equalsIgnoreCase(Build.MODEL)) {
                   b1 = true;
                   break ;
                }
                i = i + 1;
             }
             l1.b = Boolean.valueOf(b1);
          }
       }
    }
}
