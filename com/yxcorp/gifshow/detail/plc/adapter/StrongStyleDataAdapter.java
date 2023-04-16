package com.yxcorp.gifshow.detail.plc.adapter.StrongStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.BasePlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import g4a.c;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Map;
import java.lang.CharSequence;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;

public class StrongStyleDataAdapter extends BasePlcEntryDataAdapter	// class@00165f
{
    public final PlcEntryStyleInfo$StrongStyleInfo mStrongStyleInfo;
    public static final long serialVersionUID = 0xa065f3a68988d5d3;

    public void StrongStyleDataAdapter(QPhoto p0,PlcEntryStyleInfo p1){
       super(p0, p1);
       this.mStrongStyleInfo = this.mPlcEntryStyleInfo.mStyleInfo.mStrongStyleTemplateInfo;
    }
    public final PlcEntryStyleInfo$ActionInfo a(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$ActionInfo uActionInfo = (tmStrongStyl == null)? null: tmStrongStyl.mActionInfo;
       return uActionInfo;
    }
    public boolean enableForceClose(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       boolean b = (tmStrongStyl != null && tmStrongStyl.mEnableForceClose != null)? true: false;
       return b;
    }
    public String getActionIconUrl(){
       String str;
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$StrongStyleInfo mActionInfo = obj.mActionInfo;
          if (mActionInfo != null) {
             str = TextUtils.I(mActionInfo.mActionIconUrl);
          label_0021 :
             return str;
          }
       }
       str = "";
       goto label_0021 ;
    }
    public String getActionLabel(){
       String str;
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$StrongStyleInfo mActionInfo = obj.mActionInfo;
          if (mActionInfo != null) {
             str = TextUtils.I(mActionInfo.mActionLabel);
          label_0021 :
             return str;
          }
       }
       str = "";
       goto label_0021 ;
    }
    public String getActionSubUrl(){
       String str;
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$StrongStyleInfo mActionInfo = obj.mActionInfo;
          if (mActionInfo != null) {
             str = TextUtils.I(mActionInfo.mActionSubUrl);
          label_0021 :
             return str;
          }
       }
       str = "";
       goto label_0021 ;
    }
    public int getActionType(){
       PlcEntryStyleInfo$ActionInfo mActionType;
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       if (tmStrongStyl != null) {
          PlcEntryStyleInfo$StrongStyleInfo mActionInfo = tmStrongStyl.mActionInfo;
          if (mActionInfo != null) {
             mActionType = mActionInfo.mActionType;
          label_000c :
             return mActionType;
          }
       }
       mActionType = 0;
       goto label_000c ;
    }
    public String getActionUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       this.appendBizRequiredParams(str);
       return c.b(this, this.mPhoto, this.mPlcEntryStyleInfo);
    }
    public List getAtmosphereBarImage(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       List list = (tmStrongStyl == null)? null: tmStrongStyl.mAtmosphereBar;
       return list;
    }
    public String getBizCustomEntryTag(){
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$StrongStyleInfo mTagPackage = obj.mTagPackage;
          if (mTagPackage != null) {
             return TextUtils.I(mTagPackage.mBizEntryTag);
          }
       }
       return "";
    }
    public Map getBizRequiredParams(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, StrongStyleDataAdapter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj != null) {
          objArray = obj.mRequiredParams;
       }
       return objArray;
    }
    public Map getDownloadInfoMap(){
       PlcEntryStyleInfo$ActionInfo mDownloadInf;
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       if (tmStrongStyl != null) {
          PlcEntryStyleInfo$StrongStyleInfo mActionInfo = tmStrongStyl.mActionInfo;
          if (mActionInfo != null) {
             mDownloadInf = mActionInfo.mDownloadInfoMap;
          label_000c :
             return mDownloadInf;
          }
       }
       mDownloadInf = null;
       goto label_000c ;
    }
    public String getDownloadUrl(){
       PlcEntryStyleInfo$StrongStyleInfo obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo.mActionInfo;
       String str = (obj != null)? TextUtils.I(obj.mActionUrl): "";
       return str;
    }
    public String getHighLightLabel(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mHighlightLa = (tmStrongStyl != null)? tmStrongStyl.mHighlightLabel: "";
       return mHighlightLa;
    }
    public String getHighlightLabelColor(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mHighlightLa = (tmStrongStyl != null)? tmStrongStyl.mHighlightLabelColor: "";
       return mHighlightLa;
    }
    public String getIconLeftLabel(){
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null && !TextUtils.x(obj.mIconLeftLabel)) {
          return this.mStrongStyleInfo.mIconLeftLabel;
       }
       return "";
    }
    public String getIconUrl(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mIconUrl = (tmStrongStyl != null)? tmStrongStyl.mIconUrl: "";
       return mIconUrl;
    }
    public List getIconUrls(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       List list = (tmStrongStyl == null)? null: tmStrongStyl.mCDNUrls;
       return list;
    }
    public List getLabels(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mLabels = (tmStrongStyl != null)? tmStrongStyl.mLabels: null;
       return mLabels;
    }
    public int getStrongCategoryMaxLen(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       if (tmStrongStyl != null) {
          return tmStrongStyl.mCategoryMaxLength;
       }
       return 0;
    }
    public String getStrongCategoryText(){
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null && !TextUtils.x(obj.mCategoryText)) {
          return this.mStrongStyleInfo.mCategoryText;
       }
       return "";
    }
    public String getStrongHighLightIcon(){
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null && !TextUtils.x(obj.mHighlightIcon)) {
          return this.mStrongStyleInfo.mHighlightIcon;
       }
       return "";
    }
    public List getStrongMultiHighLightLabel(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       if (tmStrongStyl != null) {
          return tmStrongStyl.mMultiHighlightLabels;
       }
       return null;
    }
    public List getStrongStyleItems(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mStrongStyle = (tmStrongStyl != null)? tmStrongStyl.mStrongStyleItems: null;
       return mStrongStyle;
    }
    public String getStrongTagInfoText(){
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       if (obj != null && !TextUtils.x(obj.mTagInfoText)) {
          return this.mStrongStyleInfo.mTagInfoText;
       }
       return "";
    }
    public int getStyleSubType(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mStrongStyle = (tmStrongStyl != null)? tmStrongStyl.mStrongStyleSubType: 0;
       return mStrongStyle;
    }
    public int getStyleType(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       PlcEntryStyleInfo$StrongStyleInfo mStyleType = (tmStrongStyl != null)? tmStrongStyl.mStyleType: 0;
       return mStyleType;
    }
    public String getTKBundleId(){
       PlcEntryStyleInfo$StrongStyleInfo obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo.mTKBundleInfo;
       if (obj != null) {
          return TextUtils.I(obj.mTKBundleId);
       }
       return "";
    }
    public String getTitle(){
       StrongStyleDataAdapter obj = PatchProxy.apply(null, this, StrongStyleDataAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStrongStyleInfo;
       String str = (obj != null)? TextUtils.I(obj.mTitle): "";
       return str;
    }
    public int getViewStyle(){
       return 2;
    }
    public boolean isHideAdTag(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       boolean b = (tmStrongStyl == null || tmStrongStyl.mHideAdTag != null)? true: false;
       return b;
    }
    public boolean isRoundCornerIcon(){
       StrongStyleDataAdapter tmStrongStyl = this.mStrongStyleInfo;
       boolean b = (tmStrongStyl != null && tmStrongStyl.mIsRoundCornerIcon != null)? true: false;
       return b;
    }
}
