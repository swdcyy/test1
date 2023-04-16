package com.kwai.chat.kwailink.utils.Utils;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.base.b;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import s75.a;
import java.util.List;
import java.util.Iterator;

public class Utils	// class@000a76
{

    public void Utils(){
       super();
    }
    public static boolean dataSizeValid(Parcel p0,int p1){
       Utils utils = Utils.class;
       if (PatchProxy.isSupport(utils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, utils, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean i = p0.dataSize();
       i = (i >= 0 && i < p1)? true: false;
       return i;
    }
    public static String getLinkLocale(){
       Object obj = PatchProxy.apply(null, null, Utils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a() != null && Utils.isValidStr(b.a().l())) {
          return b.a().l();
       }
       if ((Locale.getDefault().toString()).startsWith("zh_CN")) {
          return "zh_CN";
       }
       String str = "zh";
       if ((Locale.getDefault().toString()).startsWith(str)) {
          return str;
       }
       str = "en";
       if ((Locale.getDefault().toString()).startsWith(str)) {
          return str;
       }
       str = "ja";
       if ((Locale.getDefault().toString()).startsWith(str)) {
          return str;
       }
       if ((Locale.getDefault().toString()).startsWith("ru")) {
          return "ru";
       }
       return "zh_CN";
    }
    public static String getStringNotNull(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static boolean isEqualStr(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Utils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null || (p1 == null || (p0 != null && p0.equals(p1))))? true: false;
       return b;
    }
    public static boolean isInvalidStr(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(p0) || ("N/A").equals(p0))? true: false;
       return b;
    }
    public static boolean isValidStr(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Utils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(p0) && !("N/A").equals(p0))? true: false;
       return b;
    }
    public static byte[] readByteArray(Parcel p0,int p1){
       Utils utils = Utils.class;
       if (PatchProxy.isSupport(utils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, utils, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p0.readInt();
       if (i < 0 || i >= p1) {
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }else {
          byte[] uobyteArray1 = new byte[i];
          p0.readByteArray(uobyteArray1);
          return uobyteArray1;
       }
    }
    public static a[] readHttpHeaderArray(Parcel p0,int p1){
       Utils utils = Utils.class;
       if (PatchProxy.isSupport(utils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, utils, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p0.readInt();
       int i1 = 0;
       if (i < 0 || i >= p1) {
          a[] uoaArray = new a[i1];
          return uoaArray;
       }else {
          a[] uoaArray1 = new a[i];
          for (; i1 < i; i1 = i1 + 1) {
             a uoa = new a();
             uoa.a = p0.readString();
             uoa.b = p0.readString();
             uoaArray1[i1] = uoa;
          }
          return uoaArray1;
       }
    }
    public static int[] readIntArray(Parcel p0,int p1){
       Utils utils = Utils.class;
       if (PatchProxy.isSupport(utils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, utils, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p0.readInt();
       if (i < 0 || i >= p1) {
          int[] ointArray = new int[0];
          return ointArray;
       }else {
          int[] ointArray1 = new int[i];
          p0.readIntArray(ointArray1);
          return ointArray1;
       }
    }
    public static void readStringList(Parcel p0,List p1,int p2,int p3){
       if (PatchProxy.isSupport(Utils.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, Utils.class, "9")) {
          return;
       }
       p1.clear();
       int i = p0.readInt();
       if (i >= 0 && i < p2) {
          p2 = 0;
          while (p2 < i) {
             String str = p0.readString();
             if (str == null || str.length() < p3) {
                p1.add(str);
             }
             p2++;
          }
       }
       return;
    }
    public static void writeByteArray(Parcel p0,byte[] p1,int p2){
       if (PatchProxy.isSupport(Utils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, Utils.class, "2")) {
          return;
       }
       if (p1 == null || p1.length >= p2) {
          p0.writeInt(-1);
          return;
       }else {
          p0.writeInt(p1.length);
          p0.writeByteArray(p1);
          return;
       }
    }
    public static void writeHttpHeaderArray(Parcel p0,a[] p1,int p2){
       if (PatchProxy.isSupport(Utils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, Utils.class, "6")) {
          return;
       }
       if (p1 == null || p1.length >= p2) {
          p0.writeInt(-1);
       }else {
          p0.writeInt(p1.length);
          p2 = p1.length;
          for (int i = 0; i < p2; i = i + 1) {
             object oobject = p1[i];
             p0.writeString(oobject.a);
             p0.writeString(oobject.b);
          }
       }
       return;
    }
    public static void writeIntArray(Parcel p0,int[] p1,int p2){
       if (PatchProxy.isSupport(Utils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, Utils.class, "4")) {
          return;
       }
       if (p1 == null || p1.length >= p2) {
          p0.writeInt(-1);
          return;
       }else {
          p0.writeInt(p1.length);
          p0.writeIntArray(p1);
          return;
       }
    }
    public static void writeStringList(Parcel p0,List p1,int p2,int p3){
       if (PatchProxy.isSupport(Utils.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, Utils.class, "8")) {
          return;
       }
       if (p1 == null || p1.size() >= p2) {
          p0.writeInt(-1);
          return;
       }else {
          p2 = 0;
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str != null && str.length() >= p3) {
                continue ;
             }else {
                p2++;
             }
          }
          p0.writeInt(p2);
          Iterator iterator1 = p1.iterator();
          while (iterator1.hasNext()) {
             String str1 = iterator1.next();
             if (str1 != null && str1.length() >= p3) {
                continue ;
             }else {
                p0.writeString(str1);
             }
          }
          return;
       }
    }
}
