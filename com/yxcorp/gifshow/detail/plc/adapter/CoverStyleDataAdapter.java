package com.yxcorp.gifshow.detail.plc.adapter.CoverStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.BasePlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.lang.Number;
import g4a.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Map;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import v3a.f;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;

public class CoverStyleDataAdapter extends BasePlcEntryDataAdapter	// class@00165c
{
    public PlcEntryStyleInfo$CoverStyleInfo mCoverStyleInfo;
    public static final long serialVersionUID = 0x50f40a6712179d07;

    public void CoverStyleDataAdapter(QPhoto p0,PlcEntryStyleInfo p1){
       super(p0, p1);
       this.mCoverStyleInfo = this.getCoverStyleInfo();
    }
    public final PlcEntryStyleInfo$ActionInfo a(){
       CoverStyleDataAdapter tmCoverStyle = this.mCoverStyleInfo;
       PlcEntryStyleInfo$ActionInfo uActionInfo = (tmCoverStyle == null)? null: tmCoverStyle.mActionInfo;
       return uActionInfo;
    }
    public boolean enableForceClose(){
       return false;
    }
    public String getActionIconUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionIconUrl);
       return str;
    }
    public String getActionLabel(){
       CoverStyleDataAdapter obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoverStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$CoverStyleInfo mActionInfo = obj.mActionInfo;
          if (mActionInfo != null && !TextUtils.x(mActionInfo.mActionLabel)) {
             obj = 1;
          label_0023 :
             PlcEntryStyleInfo$ActionInfo mActionLabel = (obj)? this.mCoverStyleInfo.mActionInfo.mActionLabel: "";
             return mActionLabel;
          }
       }
       obj = null;
       goto label_0023 ;
    }
    public String getActionSubUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionSubUrl);
       return str;
    }
    public int getActionType(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a();
       int i = (obj == null)? 0: obj.mActionType;
       return i;
    }
    public String getActionUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       this.appendBizRequiredParams(str);
       return c.b(this, this.mPhoto, this.mPlcEntryStyleInfo);
    }
    public String getBizCustomEntryTag(){
       CoverStyleDataAdapter obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoverStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$CoverStyleInfo mTagPackage = obj.mTagPackage;
          if (mTagPackage != null) {
             return TextUtils.I(mTagPackage.mBizEntryTag);
          }
       }
       return "";
    }
    public Map getBizRequiredParams(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, CoverStyleDataAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj != null) {
          objArray = obj.mRequiredParams;
       }
       return objArray;
    }
    public int getCoverCategoryMaxLen(){
       CoverStyleDataAdapter tmCoverStyle = this.mCoverStyleInfo;
       if (tmCoverStyle != null) {
          PlcEntryStyleInfo$CoverStyleInfo mCategoryMax = tmCoverStyle.mCategoryMaxLength;
          if (mCategoryMax > null) {
             return mCategoryMax;
          }
       }
       return 4;
    }
    public String getCoverCategoryText(){
       CoverStyleDataAdapter obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoverStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mCategory);
       return str;
    }
    public int getCoverStyleSubType(){
       CoverStyleDataAdapter obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCoverStyleInfo;
       int i = (obj == null)? f.g(this): obj.mCoverStyleSubType;
       return i;
    }
    public Map getDownloadInfoMap(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, CoverStyleDataAdapter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj != null) {
          objArray = obj.mDownloadInfoMap;
       }
       return objArray;
    }
    public String getDownloadUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       return str;
    }
    public String getHighLightLabel(){
       return "";
    }
    public String getHighlightLabelColor(){
       return "";
    }
    public String getIconUrl(){
       return "";
    }
    public List getLabels(){
       CoverStyleDataAdapter tmCoverStyle = this.mCoverStyleInfo;
       List list = (tmCoverStyle == null)? null: tmCoverStyle.mLabels;
       return list;
    }
    public int getStyleSubType(){
       CoverStyleDataAdapter tmCoverStyle = this.mCoverStyleInfo;
       int i = (tmCoverStyle == null)? 0: tmCoverStyle.mCoverStyleSubType;
       return i;
    }
    public int getStyleType(){
       CoverStyleDataAdapter tmCoverStyle = this.mCoverStyleInfo;
       int i = (tmCoverStyle == null)? 0: tmCoverStyle.mStyleType;
       return i;
    }
    public String getTKBundleId(){
       CoverStyleDataAdapter obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoverStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$CoverStyleInfo mTKBundleInf = obj.mTKBundleInfo;
          if (mTKBundleInf != null) {
             return TextUtils.I(mTKBundleInf.mTKBundleId);
          }
       }
       return "";
    }
    public String getTitle(){
       CoverStyleDataAdapter obj = PatchProxy.apply(null, this, CoverStyleDataAdapter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoverStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mTitle);
       return str;
    }
    public int getViewStyle(){
       return 4;
    }
    public boolean isHideAdTag(){
       return true;
    }
}
