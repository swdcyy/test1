package com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.io.File;
import g26.d;
import com.kuaishou.gifshow.kuaishan.logic.p0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import java.lang.Iterable;
import java.lang.Boolean;
import u80.e;
import q87.c;
import java.util.Collection;
import zsd.u;
import android.content.SharedPreferences;
import fg6.a;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class KSDownloadHelperX$a	// class@0019ef
{

    public void KSDownloadHelperX$a(){
       super();
    }
    public void KSDownloadHelperX$a(u p0){
       super();
    }
    public final KSDownloadHelperX a(){
       Object obj = PatchProxy.apply(null, this, KSDownloadHelperX$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSDownloadHelperX.m.getValue();
    }
    public final String b(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDownloadHelperX$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "info");
       File uFile = d.a();
       a.o(uFile, "KuaiShanUtils.getTemplateLibraryDataFolder\(\)");
       String separator = File.separator;
       return uFile.getAbsolutePath()+separator+p0.mGroupId+separator;
    }
    public final String c(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDownloadHelperX$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "info");
       return p0.k(p0)+".zip";
    }
    public final String d(KSTemplateDetailInfo p0){
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDownloadHelperX$a uoa = KSDownloadHelperX$a.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uoa, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "info";
       a.p(p0, obj);
       if (!TextUtils.x(p0.mExternalTemplateFolderPath)) {
          p0 = p0.mExternalTemplateFolderPath;
          a.m(p0);
          return p0;
       }else {
          String str = PatchProxy.applyOneRefs(p0, this, uoa, "5");
          if (str != patchProxyRe) {
          }else {
             a.p(p0, obj);
             ArrayList uArrayList = PatchProxy.applyOneRefs(p0, null, e.class, "59");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                iterator = KSDataManager.B0().z0().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (uEntry.getValue().g(p0.mTemplateId) == null) {
                      continue ;
                   }
                   uArrayList.add(uEntry.getValue().d());
                }
             }
             uArrayList.add("0");
             a.o(uArrayList, "groupIdList");
             iterator = uArrayList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   File uFile = d.a();
                   a.o(uFile, "KuaiShanUtils.getTemplateLibraryDataFolder\(\)");
                   String separator = File.separator;
                   str = uFile.getAbsolutePath()+separator+iterator.next()+separator+p0.k(p0)+separator;
                   File uFile1 = new File(str);
                   String[] stringArray = uFile1.list();
                   if (uFile1.exists()) {
                      StringBuilder str1 = 1;
                      if (stringArray != null) {
                         uFile = (!stringArray.length)? 1: null;
                         if (!uFile) {
                            str1 = null;
                         }
                      }
                      if (str1) {
                         continue ;
                      }
                   }
                }else {
                   str = null;
                }
             }
          }
          if (str == null) {
             str = this.b(p0)+p0.k(p0)+File.separator;
          }
          return str;
       }
    }
    public final boolean e(KSTemplateDetailInfo p0){
       File obj = PatchProxy.applyOneRefs(p0, this, KSDownloadHelperX$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "info");
       obj = new File(this.d(p0));
       String[] stringArray = obj.list();
       boolean b = false;
       if (obj.exists() && stringArray != null) {
          int i = (!stringArray.length)? 1: 0;
          if (i ^ 1) {
             b = true;
          }
       }
    label_0039 :
       return b;
    }
    public final boolean f(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDownloadHelperX$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "templateInfo");
       p0 = p0.mTemplateType;
       if (p0 != 10 && p0 != 11) {
          e.w("Not spark template, no need to download");
          return false;
       }else {
          String str = this.a().j(false);
          if (TextUtils.x(str) || !new File(str).exists()) {
             return true;
          }
          e.w("Has local cache, no need to download");
          return false;
       }
    }
    public final void g(List p0,String p1){
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDownloadHelperX$a.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KS_Hodor", "saveCheckList\(\) called with: checkList = "+p0+", key = "+p1, objArray);
       String str = 1;
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       if (b) {
          objArray1 = new Object[i];
          e.D().w("KS_Hodor", "saveCheckList: checkList is null or empty", objArray1);
          return;
       }else if(p1 == null || u.S1(p1)){
          str = null;
       }
       if (str != null) {
          objArray1 = new Object[i];
          e.D().w("KS_Hodor", "saveCheckList: key is null or empty", objArray1);
          return;
       }else {
          SharedPreferences n = KSDownloadHelperX.n;
          if (n.contains(p1)) {
             objArray1 = new Object[i];
             e.D().w("KS_Hodor", "saveCheckList: key already exist", objArray1);
             return;
          }else {
             String str1 = a.a.q(p0);
             a.o(str1, "Gsons.KWAI_GSON.toJson\(checkList\)");
             Object[] objArray2 = new Object[i];
             e.D().w("KS_Hodor", "saveCheckList: add new checkListKey key="+p1+" checkList="+str1, objArray2);
             g.a(n.edit().putString(p1, str1));
             return;
          }
       }
    }
}
