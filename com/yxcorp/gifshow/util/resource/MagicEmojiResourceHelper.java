package com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import boc.b0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$MagicModelConfig;
import java.lang.Class;
import java.lang.Object;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.resource.MagicModel;
import java.util.Map;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$CheckItem;
import java.lang.Long;
import java.util.Objects;
import ekd.a0;
import boc.e;
import wkd.b;
import j80.c;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import o56.c;
import o56.a;
import boc.g;
import java.lang.Runnable;
import ekd.k1;
import java.util.HashMap;
import boc.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import qkd.b;
import java.io.FileReader;
import fg6.a;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$MagicResourceCheckConfig;
import java.io.Reader;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;

public class MagicEmojiResourceHelper	// class@000cd1
{
    public static Map a;
    public static Map b;

    static {
       MagicEmojiResourceHelper.a = new ConcurrentHashMap();
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       try{
          MagicEmojiResourceHelper.b = uConcurrentH;
          String str = b0.b();
          if (!TextUtils.x(str)) {
             MagicEmojiResourceHelper$MagicModelConfig magicModelCo = new Gson().h(str, MagicEmojiResourceHelper$MagicModelConfig.class);
             if (magicModelCo != null) {
                magicModelCo = magicModelCo.mModels;
                if (magicModelCo != null) {
                   Iterator iterator = magicModelCo.iterator();
                   while (iterator.hasNext()) {
                      String str1 = iterator.next();
                      MagicEmojiResourceHelper.a.put(str1, new MagicModel(str1));
                   }
                }
             }
          }
          Object[] objArray = new Object[0];
          a.C().t("MagicEmojiResourceHelper", "setMagicModelList from preference "+MagicEmojiResourceHelper.a.size(), objArray);
       }catch(com.google.gson.JsonSyntaxException e1){
       }catch(java.lang.NullPointerException e1){
       }
       e1.printStackTrace();
       PostUtils.D("MagicEmojiResourceHelper", "static init Gson\(\).fromJson exception", e1);
       goto label_0053 ;
    }
    public static boolean a(File p0,MagicEmojiResourceHelper$CheckItem p1,Map p2){
       if (!p2.containsKey(p1.mFilePath)) {
          return false;
       }
       if (Objects.equals(p2.get(p1.mFilePath), Long.valueOf(p0.length())) && p0.length() - null) {
          return true;
       }
       Object[] objArray = new Object[false];
       a.C().D("MagicEmojiResourceHelper", "[yModel][keypath][check] ", p0.getAbsolutePath()+p1.mFilePath+"file size check failed! file size: "+p0.length()+"size in checkLengthFile: "+p2.get(p1.mFilePath), objArray);
       return false;
    }
    public static boolean b(File p0,MagicEmojiResourceHelper$CheckItem p1){
       String str = a0.b(p0);
       MagicEmojiResourceHelper$CheckItem mMd5Value = p1.mMd5Value;
       if (mMd5Value == null || mMd5Value.equalsIgnoreCase(str)) {
          return true;
       }
       Object[] objArray = new Object[0];
       a.C().D("MagicEmojiResourceHelper", "[yModel][keypath][check] ", "md5 check failed. file: "+p0.getAbsolutePath()+p1.mFilePath+" , the md5 in checklist: "+p1.mMd5Value+" , the md5 from file: "+str, objArray);
       return 0;
    }
    public static String c(){
       return MagicEmojiResourceHelper.h(e.c.mResource)+"/aideformParams.json";
    }
    public static String d(){
       return MagicEmojiResourceHelper.h(e.c.mResource)+"/deformParams.json";
    }
    public static String e(){
       return MagicEmojiResourceHelper.h(e.a.mResource);
    }
    public static File f(String p0){
       return b.a(-1504323719).g(p0);
    }
    public static String g(){
       return b.a(-1504323719).k()+"/magic_emoji_resource/";
    }
    public static String h(String p0){
       return MagicEmojiResourceHelper.g()+p0;
    }
    public static MagicModel i(String p0){
       if (TextUtils.x(p0)) {
          return null;
       }
       return MagicEmojiResourceHelper.a.get(p0);
    }
    public static List j(){
       return new ArrayList(MagicEmojiResourceHelper.a.values());
    }
    public static List k(List p0){
       MagicModel a;
       if (q.f(p0)) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!MagicEmojiResourceHelper.p(str)) {
             MagicModel magicModel = MagicEmojiResourceHelper.i(str);
             if (magicModel == null && a.a().c()) {
                k1.o(new g(str));
             }
             if (magicModel == null) {
                magicModel = new MagicModel(str);
             }
             uArrayList.add(magicModel);
          }
          if ((e.c.mResource).equals(str)) {
             a = e.a;
             if (!MagicEmojiResourceHelper.p(a.mResource)) {
                uArrayList.add(a);
             }
          }
       }
       return uArrayList;
    }
    public static String l(){
       return b.a(-1504323719).d("/magic_emoji_resource/ykitAttrLocal/").getAbsolutePath()+File.separator;
    }
    public static Map m(){
       HashMap hashMap = new HashMap();
       Iterator iterator = MagicEmojiResourceHelper.a.values().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob.f()) {
             hashMap.put(uob.getResourceName(), uob.getResourceDir());
          }
       }
       return hashMap;
    }
    public static boolean n(){
       return a.t().d("enableLogModelMissing", false);
    }
    public static boolean o(b p0){
       if (p0 != null && !TextUtils.x(p0.getResourceName())) {
          return MagicEmojiResourceHelper.a.containsKey(p0.getResourceName());
       }
       return false;
    }
    public static boolean p(String p0){
       Boolean uBoolean = MagicEmojiResourceHelper.b.get(p0);
       if (uBoolean == null) {
          uBoolean = Boolean.valueOf(new File(MagicEmojiResourceHelper.h(p0)).exists());
          MagicEmojiResourceHelper.b.put(p0, uBoolean);
       }
       return uBoolean.booleanValue();
    }
    public static boolean q(List p0){
       if (q.f(p0)) {
          return false;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          String str = iterator.next();
          if (!MagicEmojiResourceHelper.p(str)) {
             break ;
          }else if((e.c.mResource).equals(str) && !MagicEmojiResourceHelper.p(e.a.mResource)){
             return true;
          }
       }
       return true;
    }
    public static boolean r(b p0){
       Object[] objArray;
       File uFile2;
       String resourceName = p0.getResourceName();
       String unzipDir = p0.getUnzipDir();
       String str = "[yModel][keypath][check] ";
       if (!new File(unzipDir).exists()) {
          objArray = new Object[0];
          a.C().D("MagicEmojiResourceHelper", str, "md5 check failed.  "+unzipDir+"is not exist!", objArray);
          return 0;
       }else {
          File uFile = new File(unzipDir, "check.json");
          File uFile1 = new File(unzipDir, "checkLength.json");
          if (uFile1.exists()) {
             b.q(uFile1);
          }
          String str1 = 1;
          if (!uFile.exists()) {
             if (b0.a(resourceName)) {
                Object[] objArray1 = new Object[0];
                a.C().D("MagicEmojiResourceHelper", str, "md5 check failed. check.json missing "+unzipDir, objArray1);
                MagicEmojiResourceHelper.s(resourceName, null, 0);
                return 0;
             }else {
                objArray = new Object[0];
                a.C().D("MagicEmojiResourceHelper", str, "md5 check skip: "+unzipDir, objArray);
                return str1;
             }
          }else {
             FileReader uFileReader = new FileReader(uFile);
             MagicEmojiResourceHelper$MagicResourceCheckConfig magicResourc = a.a.f(uFileReader, MagicEmojiResourceHelper$MagicResourceCheckConfig.class);
             if (magicResourc != null) {
                magicResourc = magicResourc.mCheckList;
                if (magicResourc != null) {
                   Iterator iterator = magicResourc.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         MagicEmojiResourceHelper$CheckItem uCheckItem = iterator.next();
                         uFile2 = new File(unzipDir, uCheckItem.mFilePath);
                         if (!MagicEmojiResourceHelper.b(uFile2, uCheckItem)) {
                            break ;
                         }
                      }else {
                         uFileReader.close();
                         return str1;
                      }
                   }
                   MagicEmojiResourceHelper.s(resourceName, uFile2, str1);
                   uFileReader.close();
                   return 0;
                }
             }
             uFileReader.close();
             return 0;
          }
       }
    }
    public static void s(String p0,File p1,int p2){
       if (!MagicEmojiResourceHelper.n()) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("modelName", p0);
       p0 = (p1 == null)? "": p1.getPath();
       oi3.d("filePath", p0);
       oi3.c("checkFailType", Integer.valueOf(p2));
       u1.R("MAGIC_RESOURCE_CHECK_FAIL", oi3.e(), 2);
       return;
    }
    public static Map t(File p0){
       if (p0.exists()) {
          return a.a.i(b.f0(p0), new MagicEmojiResourceHelper$1().getType());
       }
       return new HashMap();
    }
    public static void u(){
       MagicEmojiResourceHelper.b.clear();
    }
    public static void v(String p0,boolean p1){
       MagicEmojiResourceHelper.b.put(p0, Boolean.valueOf(p1));
    }
    public static List w(List p0){
       if (q.f(p0)) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          MagicModel magicModel = MagicEmojiResourceHelper.i(str);
          if (magicModel != null) {
             uArrayList.add(magicModel);
          }else {
             Object[] objArray = new Object[0];
             a.C().t("MagicEmojiResourceHelper", str+" toCategory error!!!", objArray);
          }
       }
       return uArrayList;
    }
    public static void x(File p0,Map p1){
       if (p1.isEmpty()) {
          return;
       }
       b.v0(p0, a.a.q(p1));
       return;
    }
}
