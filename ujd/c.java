package ujd.c;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.String;
import java.util.Collections;
import java.lang.Exception;
import com.yxcorp.retrofit.model.LocationConfigModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import ekd.q;
import com.yxcorp.retrofit.model.ConfigModel;
import java.lang.Boolean;

public class c	// class@0025ee
{

    public static List a(Map p0,Map p1){
       ArrayList uArrayList = new ArrayList((p0.size() + p1.size()));
       Iterator iterator = p0.entrySet().iterator();
       String str = "";
       String str1 = "=";
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str1 = (uEntry.getKey()).concat(str1);
          if (uEntry.getValue() != null) {
             str = uEntry.getValue();
          }
          uArrayList.add(str1.concat(str));
       }
       iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry1 = iterator.next();
          String str2 = (uEntry1.getKey()).concat(str1);
          String str3 = (uEntry1.getValue() == null)? str: uEntry1.getValue();
          uArrayList.add(str2.concat(str3));
       }
       try{
          Collections.sort(uArrayList);
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return uArrayList;
    }
    public static void b(Map p0,String p1,LocationConfigModel p2){
       int i2;
       Iterator iterator1;
       String str = "lon";
       String str1 = "lat";
       if (TextUtils.isEmpty(p1) || p2 == null) {
          p0.remove(str1);
          p0.remove(str);
          return;
       }else {
          int i = 0;
          int i1 = 1;
          if (p2.mAllowLatLonSwitch == null) {
             if (!q.f(p2.mConfigModelList) && p2.mBizTypeModelMap != null) {
                iterator1 = p2.mConfigModelList.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      ConfigModel uConfigModel1 = iterator1.next();
                      if (q.f(uConfigModel1.mLatlonBlackList) || !uConfigModel1.mLatlonBlackList.contains(p1)) {
                         if (c.d(p1, uConfigModel1.mLatlonWhiteList) && c.c(uConfigModel1, p2)) {
                            iterator1 = 1;
                            break ;
                         }
                      }
                   }
                }
                if (!i2) {
                   p0.remove(str1);
                   p0.remove(str);
                }
             }
             i2 = 0;
             goto label_0056 ;
          }else {
             iterator1 = 1;
          }
          if (p2.mAllowLLSwitch == null) {
             if (!q.f(p2.mConfigModelList) && p2.mBizTypeModelMap != null) {
                Iterator iterator = p2.mConfigModelList.iterator();
                while (iterator.hasNext()) {
                   ConfigModel uConfigModel = iterator.next();
                   if (q.f(uConfigModel.mLLBlackList) || !uConfigModel.mLLBlackList.contains(p1)) {
                      if (c.d(p1, uConfigModel.mLLWhiteList) && c.c(uConfigModel, p2)) {
                         i = 1;
                         break ;
                      }
                   }
                }
             }
             if (!i) {
                p0.remove("ll");
                p0.remove("lkvr");
             }
             i1 = i;
          }
          if (!i2 && !i1) {
             p0.remove("ll_client_time");
          }
          return;
       }
    }
    public static boolean c(ConfigModel p0,LocationConfigModel p1){
       if (TextUtils.isEmpty(p0.mBizCode)) {
          return false;
       }
       if (p1.mBizTypeModelMap.containsKey(p0.mBizCode)) {
          return p1.mBizTypeModelMap.get(p0.mBizCode).booleanValue();
       }
       return false;
    }
    public static boolean d(String p0,List p1){
       if (q.f(p1)) {
          return false;
       }
       if (p1.contains(p0)) {
          return true;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          String str = iterator.next();
          if (!TextUtils.isEmpty(str) && str.contains("*")) {
             int i = str.length() - true;
             if (p0.contains(str.subSequence(false, i))) {
                break ;
             }
          }
       }
       return true;
    }
}
