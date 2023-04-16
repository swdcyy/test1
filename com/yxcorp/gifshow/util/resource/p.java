package com.yxcorp.gifshow.util.resource.p;
import doc.a;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import java.util.List;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.gifshow.util.resource.Category;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.Collection;
import boc.b;
import com.yxcorp.gifshow.util.resource.e;
import java.io.File;
import qkd.b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Build;
import java.lang.Throwable;
import java.lang.Exception;
import boc.e;
import lnc.s6;
import brd.t;
import com.yxcorp.gifshow.util.resource.n;
import t45.d;
import brd.z;
import boc.a0;
import erd.o;
import qe6.b;

public class p	// class@000cf8
{
    public static String a;
    public static boolean b;

    public static void a(a p0){
       Iterator iterator;
       int b1;
       boolean b = p0 instanceof YlabModelConfigResponse;
       if (b) {
          if (p.b) {
             return;
          }else {
             p.b = true;
          }
       }
       if (b) {
          iterator = MagicEmojiResourceHelper.j().iterator();
          while (iterator.hasNext()) {
             iterator.next().removeOutdatedFiles();
          }
       }else {
          Category[] uCategoryArr = Category.values();
          int len = uCategoryArr.length;
          for (b1 = 0; b1 < len; b1 = b1 + 1) {
             uCategoryArr[b1].removeOutdatedFiles();
          }
       }
       Object[] objArray = new Object[0];
       a.C().t("YCNN2_CONFIG", "deleteOutdatedPostResource YCNN:"+b, objArray);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2);
       uArrayList.add(Category.MAGIC_YCNN_SCENE);
       uArrayList.add(Category.MAGIC_YCNN_RICKON_DRL_CC);
       uArrayList.add(Category.MAGIC_YCNN_RICKON_DUGU);
       uArrayList.add(Category.MAGIC_YCNN_ARYA_DRL_CC);
       uArrayList.addAll(MagicEmojiResourceHelper.j());
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (p.g(p0, uob) && (!uob.supportIncrementalDownload(p0) || !e.a(uob))) {
             Object[] objArray1 = new Object[0];
             a.C().t("YCNN2_CONFIG", "del:"+uob.getResourceName(), objArray1);
             b.q(new File(uob.getResourceDir()));
             b1 = true;
          }else {
             b1 = false;
          }
          if (b && uob.useYcnnModelConfig()) {
             objArray = new Object[0];
             a.C().D("YCNN2_CONFIG", "[yModel][keypath][check] ", uob.getResourceName()+" del: "+b1, objArray);
          }
       }
       if (b) {
          MagicEmojiResourceHelper.u();
       }
       return;
    }
    public static String b(){
       String str = ";";
       String a = p.a;
       if (a != null) {
          return a;
       }
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/cpuinfo"));
          HashMap hashMap = new HashMap();
          String str1 = uBufferedRea.readLine();
          while (str1 != null) {
             String[] stringArray = str1.split(":");
             int i = 1;
             if (stringArray.length > i) {
                hashMap.put(((stringArray[0]).trim()).replace(" ", "_"), (stringArray[i]).trim());
             }
          }
          str1 = hashMap.get("Hardware");
          StringBuilder str2 = TextUtils.k(hashMap.get("CPU_implementer"))+str+TextUtils.k(hashMap.get("CPU_part"))+str;
          if (TextUtils.x(str1)) {
             str1 = Build.HARDWARE;
          }
          str = str2+str1;
          p.a = str;
          uBufferedRea.close();
          return str;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return "";
       }
    }
    public static List c(){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(e.a);
       if (s6.f()) {
          uArrayList.add(e.B);
          uArrayList.add(e.L);
          uArrayList.add(e.M);
       }else {
          uArrayList.add(e.B);
       }
       uArrayList.add(e.C);
       uArrayList.add(e.D);
       uArrayList.add(e.E);
       uArrayList.add(e.K);
       uArrayList.add(e.F);
       uArrayList.add(e.G);
       uArrayList.add(e.e);
       uArrayList.add(e.c);
       uArrayList.add(e.H);
       uArrayList.add(e.l);
       uArrayList.add(e.m);
       if (!s6.f()) {
          uArrayList.add(Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2);
       }
       uArrayList.add(e.A);
       return uArrayList;
    }
    public static File d(b p0,String p1){
       return new File(p0.getResourceDir(), p1);
    }
    public static List e(a p0){
       ArrayList uArrayList = new ArrayList();
       if (!p0 instanceof YlabModelConfigResponse) {
          return uArrayList;
       }
       Iterator iterator = p0.getPriorityPreDownloadList().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          MagicModel magicModel = MagicEmojiResourceHelper.i(str);
          if (!uArrayList.contains(magicModel)) {
             uArrayList.add(magicModel);
             Object[] objArray = new Object[0];
             a.C().t("YCNN2_CONFIG", "add "+str, objArray);
          }
       }
       return uArrayList;
    }
    public static t f(b p0){
       return n.z(p0).observeOn(d.c).map(new a0(p0));
    }
    public static boolean g(a p0,b p1){
       if (p0 == null) {
          return false;
       }
       if (!b.b()) {
          Category uCategory = (p1 == Category.MESSAGE_EMOJI || p1 == Category.EMOJI_TTF)? 1: null;
          if (!uCategory) {
             return false;
          }
       }
       if (p1 == Category.HUAWEI_HIAI || p1 == Category.HIAI_MAGIC_EMOJI_TRACK_DATA) {
          return false;
       }else if(TextUtils.x(p1.getInitDownloadUrl(p0))){
          return false;
       }else {
          return p1.needDownload(p0);
       }
    }
    public static boolean h(b p0){
       return p.d(p0, "").exists();
    }
    public static void onEvent(String p0,String p1,Object[] p2){
       p0 = " , ";
       StringBuilder str = p0+p0+p1;
       int i = 0;
       if (p2 != null && p2.length > 0) {
          int len = p2.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             str = str+p0+p2[i1];
          }
       }
       Object[] objArray = new Object[i];
       a.C().y("resourcemanager", str, objArray);
       return;
    }
}
