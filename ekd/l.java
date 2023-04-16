package ekd.l;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.util.Date;
import java.util.Calendar;
import java.lang.Object;
import android.content.Context;
import android.content.res.Resources;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Double;

public class l	// class@000d5c
{
    public static final SimpleDateFormat a;

    static {
       l.a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }
    public static int a(String p0){
       int i = 0;
       if (!TextUtils.isEmpty(p0) && TextUtils.isDigitsOnly(p0)) {
          long l = Long.valueOf(p0).longValue() * 1000;
          try{
             Date uDate = new Date(l);
             Calendar instance = Calendar.getInstance();
             instance.setTime(new Date());
             Calendar instance1 = Calendar.getInstance();
             instance1.setTime(uDate);
             if (!instance1.after(instance)) {
                int i1 = instance.get(1) - instance1.get(1);
                i = (instance.get(6) > instance1.get(6))? i1 + 1: i1;
             }
          }catch(java.lang.Exception e0){
          }
       }
    label_0052 :
       return i;
    }
    public static String b(Context p0,long p1){
       String str;
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis(p1);
       int i = 2;
       int i1 = 1;
       int i2 = instance.get(i) + i1;
       int i3 = instance.get(5);
       String[] stringArray = p0.getResources().getStringArray(R.array.arg_RES_7f030003);
       if (stringArray == null || stringArray.length <= 0) {
          str = "";
       }else {
          StringBuilder str1 = i2+".";
          i2 = 9;
          Integer integer = (i3 > i2)? Integer.valueOf(i3): "0"+i3;
          Double uDouble = Double.valueOf(Double.parseDouble(str1+integer));
          if (0x4009ae147ae147ae - uDouble.doubleValue() <= 0 && 0x4010c28f5c28f5c3 - uDouble.doubleValue() >= 0) {
             str = stringArray[0];
          }else if(0x4010cccccccccccd - uDouble.doubleValue() <= 0 && 0x4014cccccccccccd - uDouble.doubleValue() >= 0){
             str = stringArray[i1];
          }else if(0x4014d70a3d70a3d7 - uDouble.doubleValue() <= 0 && 0x4018d70a3d70a3d7 - uDouble.doubleValue() >= 0){
             str = stringArray[i];
          }else if(0x4018e147ae147ae1 - uDouble.doubleValue() <= 0 && 0x401ce147ae147ae1 - uDouble.doubleValue() >= 0){
             str = stringArray[3];
          }else if(0x401ceb851eb851ec - uDouble.doubleValue() <= 0 && 0x402070a3d70a3d71 - uDouble.doubleValue() >= 0){
             str = stringArray[4];
          }else if(0x402075c28f5c28f6 - uDouble.doubleValue() <= 0 && 9.22f - uDouble.doubleValue() >= 0){
             str = stringArray[5];
          }else if(0x402275c28f5c28f6 - uDouble.doubleValue() <= 0 && 0x402475c28f5c28f6 - uDouble.doubleValue() >= 0){
             str = stringArray[6];
          }else if(0x40247ae147ae147b - uDouble.doubleValue() <= 0 && 0x402670a3d70a3d71 - uDouble.doubleValue() >= 0){
             str = stringArray[7];
          }else if(0x402675c28f5c28f6 - uDouble.doubleValue() <= 0 && 0x40286b851eb851ec - uDouble.doubleValue() >= 0){
             str = stringArray[8];
          }else if(0x402870a3d70a3d71 - uDouble.doubleValue() <= 0 && 0x40289eb851eb851f - uDouble.doubleValue() >= 0){
             str = stringArray[i2];
          }else if(0x3ff028f5c28f5c29 - uDouble.doubleValue() <= 0 && 0x3ff30a3d70a3d70a - uDouble.doubleValue() >= 0){
             str = stringArray[i2];
          }else if(0x3ff3333333333333 - uDouble.doubleValue() <= 0 && 0x400170a3d70a3d71 - uDouble.doubleValue() >= 0){
             str = stringArray[10];
          }else if(0x4001851eb851eb85 - uDouble.doubleValue() <= 0 && 0x400999999999999a - uDouble.doubleValue() >= 0){
             str = stringArray[11];
          }else {
             str = stringArray[i];
          }
       }
       return str;
    }
}
