package com.yxcorp.gifshow.util.resource.e;
import java.util.HashSet;
import lnc.s6;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.lang.Throwable;
import boc.b;
import java.io.File;
import qkd.b;
import lnc.i3;
import y56.a;
import java.lang.Long;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Map;
import ekd.a0;
import java.io.FileReader;
import java.util.HashMap;
import fg6.a;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$MagicResourceCheckConfig;
import java.io.Reader;
import java.lang.Class;
import com.google.gson.Gson;
import java.util.Iterator;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$CheckItem;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import boc.b0;

public class e	// class@000ce2
{
    public static final Set a;

    static {
       HashSet hashSet = new HashSet();
       e.a = hashSet;
       if (s6.g()) {
          String str = a.t().c("supportIncrementalModelList", "");
          Object[] objArray = new Object[0];
          a.C().w("IncrementalUtils", "supportList: "+str, objArray);
          if (!TextUtils.x(str) && (str.startsWith("[") && str.endsWith("]"))) {
             String[] stringArray = (str.substring(1, (str.length() - 1))).split(",");
             if (stringArray.length > 0) {
                hashSet.addAll(Arrays.asList(stringArray));
             }
          }
       }
    }
    public static boolean a(b p0){
       File uFile = new File(e.e(p0));
       File uFile1 = new File(p0.getResourceDir());
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().t("IncrementalUtils", "origin: "+uFile1.getAbsolutePath()+", "+uFile1.exists()+" , tmp : "+uFile.getAbsolutePath()+" , "+uFile.exists(), objArray);
       if (!uFile1.exists()) {
          return uFile.exists();
       }
       if (uFile.exists()) {
          Object[] objArray1 = new Object[i];
          a.C().t("IncrementalUtils", "TmpFileAlreadyExits", objArray1);
          b.q(uFile);
       }
       uFile1.renameTo(uFile);
       i3 oi3 = i3.f();
       oi3.d("category", p0.getResourceName());
       oi3.c("tmpFileSize", Long.valueOf(a.c(uFile)));
       String str = oi3.e();
       PostUtils.x("IncrementalPrepare", str);
       return uFile.exists();
    }
    public static boolean b(File[] p0,Map p1,Set p2){
       object oobject;
       Object[] objArray;
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          oobject = p0[i];
          if (oobject.isDirectory()) {
             File[] uFileArray = oobject.listFiles();
             if (uFileArray == null || !uFileArray.length) {
                objArray = new Object[0];
                a.C().w("IncrementalUtils", "directory is empty : "+oobject, objArray);
                b.q(oobject);
             }else {
                e.b(uFileArray, p1, p2);
                uFileArray = oobject.listFiles();
                if (uFileArray == null || !uFileArray.length) {
                   objArray = new Object[0];
                   a.C().w("IncrementalUtils", "check finish directory is empty : "+oobject, objArray);
                   b.q(oobject);
                }
             }
          }else if(p2.contains(oobject)){
             Object[] objArray1 = new Object[0];
             a.C().w("IncrementalUtils", "skip file : "+oobject, objArray1);
          }else {
             String str = p1.get(oobject.getAbsolutePath());
             if (TextUtils.x(str)) {
                objArray = new Object[0];
                a.C().t("IncrementalUtils", "file not in checklist : "+oobject, objArray);
                b.q(oobject);
             }else if(!str.equalsIgnoreCase(a0.b(oobject))){
                break ;
             }else {
                objArray = new Object[0];
                a.C().t("IncrementalUtils", "checkMD5Success : "+oobject.getPath(), objArray);
                p1.remove(oobject.getAbsolutePath());
             }
          }
          i = i + 1;
       }
       Object[] objArray2 = new Object[0];
       a.C().t("IncrementalUtils", "checkMD5Failed : "+oobject.getPath(), objArray2);
       return 0;
    }
    public static boolean c(String p0){
       File uFile = new File(p0);
       File uFile1 = new File(uFile, "check.json");
       if (!uFile1.exists()) {
          return false;
       }
       File[] uFileArray = uFile.listFiles();
       if (uFileArray != null && uFileArray.length) {
          HashSet hashSet = new HashSet();
          hashSet.add(uFile1);
          FileReader uFileReader = new FileReader(uFile1);
          HashMap hashMap = new HashMap();
          MagicEmojiResourceHelper$MagicResourceCheckConfig magicResourc = a.a.f(uFileReader, MagicEmojiResourceHelper$MagicResourceCheckConfig.class);
          if (magicResourc != null && magicResourc.mCheckList != null) {
             HashMap hashMap1 = new HashMap();
             Iterator iterator = magicResourc.mCheckList.iterator();
             while (iterator.hasNext()) {
                MagicEmojiResourceHelper$CheckItem uCheckItem = iterator.next();
                hashMap1.put(uFile.getAbsolutePath()+File.separator+uCheckItem.mFilePath, uCheckItem.mMd5Value);
                long l = new File(uFile, uCheckItem.mFilePath).length();
                if (MagicModel.isEnableMagicResCheckFileLengthFirst() && l - false > 0) {
                   hashMap.put(uCheckItem.mFilePath, Long.valueOf(l));
                }
             }
             if (!e.b(uFileArray, hashMap1, hashSet)) {
                uFileReader.close();
                return false;
             }else if(MagicModel.isEnableMagicResCheckFileLengthFirst()){
                MagicEmojiResourceHelper.x(new File(uFile, "checkLength.json"), hashMap);
             }
             uFileReader.close();
             return hashMap1.isEmpty();
          }else {
             uFileReader.close();
          }
       }
       return false;
    }
    public static void d(b p0){
       b.q(new File(e.e(p0)));
    }
    public static String e(b p0){
       return b0.d(p0.getResourceName())+".origin";
    }
}
