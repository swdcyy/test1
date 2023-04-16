package com.yxcorp.gifshow.util.resource.CommonCategory;
import boc.b;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import boc.a;
import java.io.File;
import qfc.a;
import q87.c;
import com.yxcorp.gifshow.model.CDNUrl;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import doc.a;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import java.util.Random;
import java.lang.System;

public abstract class CommonCategory implements b, Serializable	// class@000cc7
{
    public String mEventUrl;
    public int mInitUrlIndex;
    public boolean mIsNeedUnzip;
    public String mResource;
    public String mResourcePath;
    public int mRetryTimes;
    public long mStartDownloadTime;
    public List mUrlList;

    public void CommonCategory(String p0,String p1,List p2,boolean p3){
       super();
       this.mResource = p0;
       this.mEventUrl = p1;
       this.mUrlList = p2;
       this.mIsNeedUnzip = p3;
    }
    public void a(){
       a.a(this);
    }
    public boolean b(File p0){
       return a.d(this, p0);
    }
    public void c(boolean p0){
       a.g(this, p0);
    }
    public boolean checkFileValid(){
       return true;
    }
    public String d(String p0){
       return a.c(this, p0);
    }
    public void e(boolean p0){
       a.i(this, p0);
    }
    public boolean f(){
       return a.f(this);
    }
    public final String g(int p0){
       if (p0 >= this.mUrlList.size()) {
          Object[] objArray = new Object[0];
          a.C().s("CommonCategory", "getDownloadUrl index out of size", objArray);
          return null;
       }else {
          CDNUrl uCDNUrl = this.mUrlList.get(p0);
          if (uCDNUrl != null) {
             return uCDNUrl.mUrl;
          }
          return null;
       }
    }
    public abstract String generateResourcePath();
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
       return a.b(this, p0);
    }
    public String getInitDownloadUrl(a p0){
       this.mRetryTimes = 0;
       this.mInitUrlIndex = new Random().nextInt(this.mUrlList.size());
       this.mStartDownloadTime = System.currentTimeMillis();
       return this.g(this.mInitUrlIndex);
    }
    public String getResourceDir(){
       return this.generateResourcePath();
    }
    public String getResourceName(){
       return this.mResource;
    }
    public String getRetryDownloadUrl(a p0){
       int i = this.mRetryTimes + 1;
       int i1 = this.mUrlList.size();
       if (i >= i1) {
          return null;
       }
       this.mRetryTimes = this.mRetryTimes + 1;
       return this.g(((i + this.mInitUrlIndex) % i1));
    }
    public int getRetryTimes(){
       return this.mRetryTimes;
    }
    public String getUnzipDir(){
       return this.getResourceDir();
    }
    public boolean isNeedUnzip(){
       return this.mIsNeedUnzip;
    }
    public void markHaveDownloaded(String p0){
       a.h(this, p0);
    }
    public boolean needAddNoMediaFile(){
       return true;
    }
    public boolean needRename(){
       return false;
    }
    public boolean supportIncrementalDownload(a p0){
       return a.j(this, p0);
    }
    public boolean useYcnnModelConfig(){
       return a.k(this);
    }
}
