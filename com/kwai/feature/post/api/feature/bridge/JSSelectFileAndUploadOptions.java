package com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.net.FileNameMap;
import java.net.URLConnection;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import zsd.u;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$FileInfo;
import java.io.File;
import android.media.MediaMetadataRetriever;
import java.lang.Long;
import java.lang.Number;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$UploadConfig;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$JSMediaFormat;
import nsd.r0;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.lang.Boolean;

public final class JSSelectFileAndUploadOptions implements Serializable	// class@001329
{
    public String failEventName;
    public String progressEventName;
    public String selectFileEventName;
    public String successEventName;
    public String taskID;
    public JSSelectFileAndUploadOptions$UploadConfig uploadConfig;
    public static final JSSelectFileAndUploadOptions$a Companion;

    static {
       JSSelectFileAndUploadOptions.Companion = new JSSelectFileAndUploadOptions$a(null);
    }
    public void JSSelectFileAndUploadOptions(){
       super();
    }
    public final String a(String p0){
       FileNameMap obj = PatchProxy.applyOneRefs(p0, this, JSSelectFileAndUploadOptions.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       obj = URLConnection.getFileNameMap();
       try{
          String contentTypeF = obj.getContentTypeFor(p0);
          a.o(contentTypeF, "fileNameMap.getContentTypeFor\(path\)");
          str = contentTypeF;
       }catch(java.lang.Exception e4){
          Log.e("JSSelectFileAndUploadOp", "getContentType: path="+p0, e4);
       }
       if (TextUtils.isEmpty(str)) {
          try{
             String contentTypeF1 = obj.getContentTypeFor(u.g2(p0, "#", "", false, 4, null));
             a.o(contentTypeF1, "fileNameMap.getContentTy¡­or\(path.replace\(\"#\", \"\"\)\)");
             str = contentTypeF1;
          }catch(java.lang.Exception e2){
             Log.e("JSSelectFileAndUploadOp", "getContentType: path="+p0, e2);
          }
       }
    }
    public final String getFailEventName(){
       return this.failEventName;
    }
    public final JSSelectFileAndUploadOptions$FileInfo getFileInfo(String p0){
       JSSelectFileAndUploadOptions$FileInfo obj = PatchProxy.applyOneRefs(p0, this, JSSelectFileAndUploadOptions.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return new JSSelectFileAndUploadOptions$FileInfo();
       }
       obj = new JSSelectFileAndUploadOptions$FileInfo();
       File uFile = new File(p0);
       obj.setName(uFile.getName());
       String str = (p0 != null)? p0: "";
       obj.setMime(this.a(str));
       obj.setSize(uFile.length());
       if (a.g(obj.getMime(), "video/mp4")) {
          try{
             MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
             mediaMetadat.setDataSource(p0);
             String str1 = mediaMetadat.extractMetadata(9);
             a.m(str1);
             a.o(str1, "retriever.extractMetadat¡­.METADATA_KEY_DURATION\)!!");
             obj.setDuration(Long.parseLong(str1));
          }catch(java.lang.Exception e1){
             Log.e("JSSelectFileAndUploadOp", "getDuration: path="+p0, e1);
          }
       }
    }
    public final int getLimitDurationInSeconds(){
       int i;
       JSSelectFileAndUploadOptions obj = PatchProxy.apply(null, this, JSSelectFileAndUploadOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.uploadConfig;
       if (obj != null) {
          a.m(obj);
          if (obj.getMaxDuration()) {
             obj = this.uploadConfig;
             a.m(obj);
             i = obj.getMaxDuration() * 1000;
          label_0031 :
             return i;
          }
       }
       i = Integer.MAX_VALUE;
       goto label_0031 ;
    }
    public final List getLimitPattern(){
       Object[] objArray = null;
       JSSelectFileAndUploadOptions obj = PatchProxy.apply(objArray, this, JSSelectFileAndUploadOptions.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.uploadConfig;
       if (obj != null) {
          a.m(obj);
          if (obj.getSupportFormats() != null) {
             obj = this.uploadConfig;
             a.m(obj);
             List supportForma = obj.getSupportFormats();
             a.m(supportForma);
             if (!supportForma.isEmpty()) {
                ArrayList uArrayList = new ArrayList();
                JSSelectFileAndUploadOptions tuploadConfi = this.uploadConfig;
                a.m(tuploadConfi);
                List supportForma1 = tuploadConfi.getSupportFormats();
                a.m(supportForma1);
                Iterator iterator = supportForma1.iterator();
                while (iterator.hasNext()) {
                   JSSelectFileAndUploadOptions$JSMediaFormat jSMediaForma = iterator.next();
                   if (!TextUtils.isEmpty(jSMediaForma.getSuffix())) {
                      Object[] objArray1 = new Object[]{jSMediaForma.getSuffix()};
                      String str = String.format(".*\\.%s$", Arrays.copyOf(objArray1, 1));
                      a.o(str, "java.lang.String.format\(format, *args\)");
                      Pattern pattern = Pattern.compile(str);
                      a.o(pattern, "Pattern.compile\(String.f¡­*\\\\.%s$\", format.suffix\)\)");
                      uArrayList.add(pattern);
                   }
                }
                return uArrayList;
             }
          }
       }
       return objArray;
    }
    public final long getLimitSize(){
       long l;
       JSSelectFileAndUploadOptions obj = PatchProxy.apply(null, this, JSSelectFileAndUploadOptions.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.uploadConfig;
       if (obj != null) {
          a.m(obj);
          if (obj.getMaxSize()) {
             obj = this.uploadConfig;
             a.m(obj);
             l = obj.getMaxSize();
          label_0035 :
             return l;
          }
       }
       l = Long.MAX_VALUE;
       goto label_0035 ;
    }
    public final String getProgressEventName(){
       return this.progressEventName;
    }
    public final String getSelectFileEventName(){
       return this.selectFileEventName;
    }
    public final String getSuccessEventName(){
       return this.successEventName;
    }
    public final String getTaskID(){
       return this.taskID;
    }
    public final JSSelectFileAndUploadOptions$UploadConfig getUploadConfig(){
       return this.uploadConfig;
    }
    public final boolean isFitMineType(String p0){
       JSSelectFileAndUploadOptions obj = PatchProxy.applyOneRefs(p0, this, JSSelectFileAndUploadOptions.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.uploadConfig;
       if (obj != null) {
          a.m(obj);
          if (obj.getSupportFormats() != null) {
             obj = this.uploadConfig;
             a.m(obj);
             List supportForma = obj.getSupportFormats();
             a.m(supportForma);
             if (!supportForma.isEmpty()) {
                URLConnection.getFileNameMap();
                if (p0 == null) {
                   p0 = "";
                }
                p0 = this.a(p0);
                if (TextUtils.isEmpty(p0)) {
                   return false;
                }else {
                   obj = this.uploadConfig;
                   a.m(obj);
                   supportForma = obj.getSupportFormats();
                   a.m(supportForma);
                   Iterator iterator = supportForma.iterator();
                   while (true) {
                      if (!iterator.hasNext()) {
                         return false;
                      }
                      JSSelectFileAndUploadOptions$JSMediaFormat jSMediaForma = iterator.next();
                      if (!TextUtils.isEmpty(jSMediaForma.getMime()) && a.g(p0, jSMediaForma.getMime())) {
                         break ;
                      }
                   }
                   return true;
                }
             }
          }
       }
       return true;
    }
    public final void setFailEventName(String p0){
       this.failEventName = p0;
    }
    public final void setProgressEventName(String p0){
       this.progressEventName = p0;
    }
    public final void setSelectFileEventName(String p0){
       this.selectFileEventName = p0;
    }
    public final void setSuccessEventName(String p0){
       this.successEventName = p0;
    }
    public final void setTaskID(String p0){
       this.taskID = p0;
    }
    public final void setUploadConfig(JSSelectFileAndUploadOptions$UploadConfig p0){
       this.uploadConfig = p0;
    }
}
