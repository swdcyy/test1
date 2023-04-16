package com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import doc.a;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.String;
import qfc.a;
import q87.c;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.q;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$a;
import com.yxcorp.gifshow.util.resource.response.a;
import java.util.Comparator;
import java.util.Collections;

public class YlabModelConfigResponse implements a, Serializable, Cloneable	// class@000cfc
{
    public List mModelConfigs;

    public void YlabModelConfigResponse(){
       super();
    }
    public YlabModelConfigResponse clone(){
       try{
          YlabModelConfigResponse ylabModelCon = super.clone();
          ylabModelCon.mModelConfigs = (this.mModelConfigs != null)? new ArrayList(this.mModelConfigs): new ArrayList();
          return ylabModelCon;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public int getCdnCount(String p0){
       YlabModelConfigResponse$ModelConfig modelConfig;
       YlabModelConfigResponse tmModelConfi = this.mModelConfigs;
       if (tmModelConfi == null) {
          Object[] objArray = new Object[0];
          a.C().t("YcnnConfigResponse", "getCdnCount mModelConfigs null", objArray);
          return 0;
       }else {
          Iterator iterator = tmModelConfi.iterator();
          while (true) {
             if (iterator.hasNext()) {
                modelConfig = iterator.next();
                if (TextUtils.n(modelConfig.mResourceKey, p0) && !q.f(modelConfig.mModelUrls)) {
                   break ;
                }
             }else {
                Object[] objArray1 = new Object[0];
                a.C().t("YcnnConfigResponse", p0+"getCdnCount getModelConfig null", objArray1);
                return 0;
             }
          }
          return modelConfig.mModelUrls.size();
       }
    }
    public String getDownloadUrlSuffix(String p0,int p1){
       YlabModelConfigResponse$ModelConfig modelConfig;
       YlabModelConfigResponse tmModelConfi = this.mModelConfigs;
       if (tmModelConfi == null) {
          Object[] objArray = new Object[0];
          a.C().w("YcnnConfigResponse", "getDownloadUrlSuffix mModelConfigs null", objArray);
          return null;
       }else {
          Iterator iterator = tmModelConfi.iterator();
          while (true) {
             if (iterator.hasNext()) {
                modelConfig = iterator.next();
                if (TextUtils.n(modelConfig.mResourceKey, p0) && (!q.f(modelConfig.mModelUrls) && p1 < modelConfig.mModelUrls.size())) {
                   break ;
                }
             }else {
                Object[] objArray1 = new Object[0];
                a.C().w("YcnnConfigResponse", p0+"getDownloadUrlSuffix null", objArray1);
                return null;
             }
          }
          return modelConfig.mModelUrls.get(p1).mUrl;
       }
    }
    public YlabModelConfigResponse$ModelConfig getModelConfigByKey(String p0){
       YlabModelConfigResponse$ModelConfig modelConfig;
       if (q.f(this.mModelConfigs)) {
          return null;
       }
       Iterator iterator = this.mModelConfigs.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          modelConfig = iterator.next();
          if (TextUtils.n(modelConfig.mResourceKey, p0)) {
             break ;
          }
       }
       return modelConfig;
    }
    public List getModelList(){
       ArrayList uArrayList = new ArrayList();
       YlabModelConfigResponse tmModelConfi = this.mModelConfigs;
       if (tmModelConfi != null) {
          Iterator iterator = tmModelConfi.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().mResourceKey);
          }
       }
       return uArrayList;
    }
    public List getPriorityPreDownloadList(){
       Object[] objArray;
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       if (q.f(this.mModelConfigs)) {
          objArray = new Object[i];
          a.C().t("YCNN2_CONFIG", "modelConfigs isEmpty", objArray);
          return uArrayList;
       }else {
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = this.mModelConfigs.iterator();
          while (iterator.hasNext()) {
             YlabModelConfigResponse$ModelConfig modelConfig = iterator.next();
             if (modelConfig.mNeedPreDownload != null) {
                uArrayList1.add(modelConfig);
             }
          }
          Collections.sort(uArrayList1, a.b);
          Iterator iterator1 = uArrayList1.iterator();
          while (iterator1.hasNext()) {
             uArrayList.add(iterator1.next().mResourceKey);
          }
          objArray = new Object[i];
          a.C().t("YCNN2_CONFIG", "getOrderPreDownloadList "+uArrayList.toString(), objArray);
          return uArrayList;
       }
    }
    public String toString(){
       if (this.mModelConfigs == null) {
          return "ycnnConfig null";
       }
       StringBuilder str = "ycnnConfig size :  "+this.mModelConfigs.size()+" \n";
       Iterator iterator = this.mModelConfigs.iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next().toString()+"\n";
       }
       return str;
    }
}
