package com.yxcorp.gifshow.util.resource.MagicModel;
import boc.b;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import com.kwai.sdk.switchconfig.a;
import boc.a;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.util.Map;
import java.io.File;
import qfc.a;
import boc.b0;
import java.io.FileReader;
import fg6.a;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$MagicResourceCheckConfig;
import java.io.Reader;
import java.lang.Class;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper$CheckItem;
import java.lang.Long;
import q87.c;
import java.lang.Throwable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.nio.charset.Charset;
import doc.a;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig;
import java.lang.System;
import java.util.Random;
import lnc.s6;
import com.yxcorp.gifshow.util.resource.e;
import java.util.Set;
import java.util.Collection;
import ekd.q;

public class MagicModel implements b, Serializable	// class@000cd2
{
    public final String mEventUrl;
    public int mInitUrlIndex;
    public final String mResource;
    public int mRetryTimes;
    public long mStartDownloadTime;

    public void MagicModel(String p0){
       super();
       this.mResource = p0;
       this.mEventUrl = "ks://download_"+p0;
    }
    public static boolean isEnableMagicResCheckFileLengthFirst(){
       return a.t().d("cpu_perf_magic_model_res_check", false);
    }
    public void a(){
       a.a(this);
    }
    public MagicModel addToMagicModelsResourceList(){
       MagicModel tmResource = this.mResource;
       if (tmResource != null) {
          MagicEmojiResourceHelper.a.put(tmResource, this);
       }
       return this;
    }
    public boolean b(File p0){
       return a.d(this, p0);
    }
    public void c(boolean p0){
       a.g(this, p0);
    }
    public boolean checkFileValid(){
       String str1;
       Object[] objArray;
       if (MagicModel.isEnableMagicResCheckFileLengthFirst()) {
          String resourceName = this.getResourceName();
          String unzipDir = this.getUnzipDir();
          String str = "[yModel][keypath][check] ";
          str1 = 1;
          if (!new File(unzipDir).exists()) {
             objArray = new Object[0];
             a.C().D("MagicEmojiResourceHelper", str, "md5 check failed.  "+unzipDir+"is not exist!", objArray);
          }else {
             File uFile = new File(unzipDir, "check.json");
             if (!uFile.exists()) {
                if (b0.a(resourceName)) {
                   Object[] objArray1 = new Object[0];
                   a.C().D("MagicEmojiResourceHelper", str, "md5 check failed. check.json missing "+unzipDir, objArray1);
                   MagicEmojiResourceHelper.s(resourceName, null, 0);
                }else {
                   objArray = new Object[0];
                   a.C().D("MagicEmojiResourceHelper", str, "md5 check skip: "+unzipDir, objArray);
                }
             }else {
                FileReader uFileReader = new FileReader(uFile);
                MagicEmojiResourceHelper$MagicResourceCheckConfig magicResourc = a.a.f(uFileReader, MagicEmojiResourceHelper$MagicResourceCheckConfig.class);
                if (magicResourc == null || magicResourc.mCheckList == null) {
                   objArray = new Object[0];
                   a.C().t("MagicEmojiResourceHelper", "MagicResourceCheckConfig is null or checkList is null!", objArray);
                }else {
                   File uFile1 = new File(unzipDir, "checkLength.json");
                   Map map = MagicEmojiResourceHelper.t(uFile1);
                   Iterator iterator = magicResourc.mCheckList.iterator();
                   MagicEmojiResourceHelper$CheckItem uCheckItem = null;
                   int i = 0;
                   while (true) {
                      if (iterator.hasNext()) {
                         MagicEmojiResourceHelper$CheckItem uCheckItem1 = iterator.next();
                         File uFile2 = new File(unzipDir, uCheckItem1.mFilePath);
                         if (!MagicEmojiResourceHelper.a(uFile2, uCheckItem1, map)) {
                            if (!MagicEmojiResourceHelper.b(uFile2, uCheckItem1)) {
                               if (uFile1.exists()) {
                                  MagicEmojiResourceHelper.s(resourceName, uFile2, 3);
                               }else {
                                  MagicEmojiResourceHelper.s(resourceName, uFile2, str1);
                               }
                            }else if(uFile2.length() > 0){
                               map.put(uCheckItem1.mFilePath, Long.valueOf(uFile2.length()));
                               uCheckItem = 1;
                            }
                            if (uFile1.exists() && !i) {
                               MagicEmojiResourceHelper.s(resourceName, uFile2, 2);
                               i = 1;
                            }
                         }
                      }else if(uCheckItem != null){
                         MagicEmojiResourceHelper.x(uFile1, map);
                      }
                      uFileReader.close();
                   }
                }
                uFileReader.close();
             }
          }
          str1 = null;
       }else {
          str1 = MagicEmojiResourceHelper.r(this);
       }
       if (!str1) {
          this.a();
       }
       return str1;
    }
    public String d(String p0){
       return a.c(this, p0);
    }
    public void e(boolean p0){
       a.i(this, p0);
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof MagicModel) {
          return b;
       }
       return TextUtils.n(this.mResource, p0.mResource);
    }
    public boolean f(){
       return a.f(this);
    }
    public Charset getCharset(){
       return Charset.defaultCharset();
    }
    public String getDownloadId(){
       return this.getResourceName()+"_"+this.mStartDownloadTime;
    }
    public String getEventUrl(){
       return this.mEventUrl;
    }
    public YlabModelConfigResponse$ModelConfig$DiffInfo getIncrementalInfo(a p0){
       if (!this.supportIncrementalDownload(p0)) {
          return null;
       }
       return p0.getModelConfigByKey(this.getResourceName()).mDiffInfo;
    }
    public String getInitDownloadUrl(a p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       this.mStartDownloadTime = System.currentTimeMillis();
       this.mRetryTimes = 0;
       int cdnCount = p0.getCdnCount(this.mResource);
       if (!cdnCount) {
          return str;
       }
       int i = new Random().nextInt(cdnCount);
       this.mInitUrlIndex = i;
       return p0.getDownloadUrlSuffix(this.mResource, i);
    }
    public String getResourceDir(){
       return this.getUnzipDir();
    }
    public String getResourceName(){
       return this.mResource;
    }
    public String getRetryDownloadUrl(a p0){
       if (p0 == null) {
          return "";
       }
       int i = this.mRetryTimes + 1;
       int cdnCount = p0.getCdnCount(this.mResource);
       if (i >= cdnCount) {
          return null;
       }
       i = (i + this.mInitUrlIndex) % cdnCount;
       if (i > p0.getCdnCount(this.mResource)) {
          return null;
       }
       this.mRetryTimes = this.mRetryTimes + 1;
       return p0.getDownloadUrlSuffix(this.mResource, i);
    }
    public int getRetryTimes(){
       return this.mRetryTimes;
    }
    public String getUnzipDir(){
       return MagicEmojiResourceHelper.h(this.mResource);
    }
    public boolean isNeedUnzip(){
       return a.e(this);
    }
    public void markHaveDownloaded(String p0){
       a.h(this, p0);
    }
    public boolean needAddNoMediaFile(){
       return true;
    }
    public boolean needDownload(a p0){
       Object[] objArray1;
       String str = this.d(this.getInitDownloadUrl(p0));
       String str1 = b0.d(this.mResource);
       boolean b = true;
       if (!TextUtils.x(str) && !str.equals(str1)) {
          Object[] objArray = new Object[0];
          a.C().t("YCNN2_CONFIG", this.mResource+" newUniqueId: "+str, objArray);
          objArray1 = new Object[0];
          a.C().t("YCNN2_CONFIG", this.mResource+" oldUniqueId: "+str1, objArray1);
          return b;
       }else if(this.b(new File(this.getResourceDir()))){
          objArray1 = new Object[0];
          a.C().t("YCNN2_CONFIG", this.mResource+" resourceLose", objArray1);
          return b;
       }else {
          objArray1 = new Object[0];
          a.C().t("YCNN2_CONFIG", this.mResource+" newUniqueId == oldUniqueId: "+str, objArray1);
          return 0;
       }
    }
    public boolean needRename(){
       return false;
    }
    public void removeOutdatedFiles(){
       this.checkFileValid();
    }
    public boolean supportIncrementalDownload(a p0){
       if (!s6.g()) {
          return false;
       }
       if (!p0 instanceof YlabModelConfigResponse) {
          return false;
       }
       if (!e.a.contains(this.getResourceName())) {
          return false;
       }
       if (!this.isNeedUnzip()) {
          return false;
       }
       if (this.needRename()) {
          return false;
       }
       YlabModelConfigResponse$ModelConfig modelConfigB = p0.getModelConfigByKey(this.getResourceName());
       if (modelConfigB != null && !q.f(modelConfigB.mModelUrls)) {
          YlabModelConfigResponse$ModelConfig mDiffInfo = modelConfigB.mDiffInfo;
          if (mDiffInfo == null || (!TextUtils.x(mDiffInfo.mOriginalRawKey) && modelConfigB.mDiffInfo.a())) {
             if (!new File(this.getResourceDir()).exists() && !new File(e.e(this)).exists()) {
                return false;
             }else if(!TextUtils.n(b0.d(this.mResource), this.getResourceDir()+modelConfigB.mDiffInfo.mOriginalRawKey)){
                return false;
             }else {
                return true;
             }
          }
       }
       return false;
    }
    public String toString(){
       return this.mResource;
    }
    public boolean useYcnnModelConfig(){
       return true;
    }
}
