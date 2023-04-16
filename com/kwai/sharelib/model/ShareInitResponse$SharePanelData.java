package com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ip7.d;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.kwai.sharelib.tools.Gsons;
import com.google.gson.Gson;
import ip7.c;
import java.lang.reflect.Type;
import el.a;
import zk.g;
import java.lang.StringBuilder;

public class ShareInitResponse$SharePanelData implements Serializable, a	// class@0016f2
{
    public ShareInitResponse$ShareInitArea mBlackList;
    public ArrayList mBundle;
    public ArrayList mBundlePrime;
    public JsonObject mCustomPanelParams;
    public JsonElement mExtParams;
    public String mKpn;
    public List mShareElementDecors;
    public String mShareObjectId;
    public String mShareResourceType;
    public String mSubBiz;
    public ShareInitResponse$ShareTheme mTheme;
    public String mTitle;
    public String mZtShareSDKExtParams;
    public static final long serialVersionUID = 0x8e6591e340c28a97;

    public void ShareInitResponse$SharePanelData(){
       super();
    }
    public void afterDeserialize(){
       Object[] objArray1;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, ShareInitResponse$SharePanelData.class, str)) {
          return;
       }
       try{
          ShareInitResponse$SharePanelData tmExtParams = this.mExtParams;
          objArray1 = PatchProxy.applyOneRefs(tmExtParams, objArray, d.class, str);
          if (objArray1 != PatchProxyResult.class) {
          }else if(!tmExtParams instanceof JsonObject){
             tmExtParams = objArray;
          }
          JsonElement jsonElement = (tmExtParams != null)? tmExtParams.e0("elementDecor"): objArray;
          if (!jsonElement instanceof JsonArray) {
             jsonElement = objArray;
          }
          if (jsonElement != null) {
             objArray = Gsons.b.a().d(jsonElement, new c().getType());
          }
          objArray1 = objArray;
       }catch(java.lang.Exception e0){
       }
          this.mShareElementDecors = objArray1;
          return;
    }
    public g getExtParam(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareInitResponse$SharePanelData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(this.mExtParams, p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse$SharePanelData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SharePanelData{mKpn=\'"+this.mKpn+'''+", mSubBiz=\'"+this.mSubBiz+'''+", mShareObjectId=\'"+this.mShareObjectId+'''+", mShareResourceType=\'"+this.mShareResourceType+'''+", mExtParams="+this.mExtParams+", mBundle="+this.mBundle+", mBundlePrime="+this.mBundlePrime+", mTheme="+this.mTheme+", mTitle=\'"+this.mTitle+'''+", mBlackList="+this.mBlackList+", mZtShareSDKExtParams=\'"+this.mZtShareSDKExtParams+'''+", mCustomPanelParams="+this.mCustomPanelParams+", mShareElementDecors="+this.mShareElementDecors+'}';
    }
}
