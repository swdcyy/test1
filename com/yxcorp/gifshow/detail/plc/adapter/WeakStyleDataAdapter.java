package com.yxcorp.gifshow.detail.plc.adapter.WeakStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.BasePlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import g4a.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Map;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import java.lang.CharSequence;
import java.lang.Number;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import v3a.f;

public class WeakStyleDataAdapter extends BasePlcEntryDataAdapter	// class@001660
{
    public final PlcEntryStyleInfo$WeakStyleInfo mWeakStyleInfo;
    public static final long serialVersionUID = 0xf7272cd68efdaf9;

    public void WeakStyleDataAdapter(QPhoto p0,PlcEntryStyleInfo p1){
       super(p0, p1);
       this.mWeakStyleInfo = this.mPlcEntryStyleInfo.mStyleInfo.mWeakStyleTemplateInfo;
    }
    public final PlcEntryStyleInfo$ActionInfo a(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       PlcEntryStyleInfo$ActionInfo uActionInfo = (tmWeakStyleI == null)? null: tmWeakStyleI.mActionInfo;
       return uActionInfo;
    }
    public boolean enableForceClose(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       boolean b = (tmWeakStyleI != null && tmWeakStyleI.mEnableForceClose != null)? true: false;
       return b;
    }
    public String getActionIconUrl(){
       String str;
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$WeakStyleInfo mActionInfo = obj.mActionInfo;
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
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$WeakStyleInfo mActionInfo = obj.mActionInfo;
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
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$WeakStyleInfo mActionInfo = obj.mActionInfo;
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
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       if (tmWeakStyleI != null) {
          PlcEntryStyleInfo$WeakStyleInfo mActionInfo = tmWeakStyleI.mActionInfo;
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
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       this.appendBizRequiredParams(str);
       return c.b(this, this.mPhoto, this.mPlcEntryStyleInfo);
    }
    public String getBizCustomEntryTag(){
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$WeakStyleInfo mTagPackage = obj.mTagPackage;
          if (mTagPackage != null) {
             return TextUtils.I(mTagPackage.mBizEntryTag);
          }
       }
       return "";
    }
    public Map getBizRequiredParams(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, WeakStyleDataAdapter.class, "12");
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
       PlcEntryStyleInfo$WeakStyleInfo mActionInfo = this.mWeakStyleInfo.mActionInfo;
       PlcEntryStyleInfo$ActionInfo mDownloadInf = (mActionInfo != null)? mActionInfo.mDownloadInfoMap: null;
       return mDownloadInf;
    }
    public String getDownloadUrl(){
       String str;
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$WeakStyleInfo mActionInfo = obj.mActionInfo;
          if (mActionInfo != null) {
             str = TextUtils.I(mActionInfo.mActionUrl);
          label_0021 :
             return str;
          }
       }
       str = "";
       goto label_0021 ;
    }
    public String getHighLightLabel(){
       return null;
    }
    public String getHighlightLabelColor(){
       return null;
    }
    public String getIconUrl(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       PlcEntryStyleInfo$WeakStyleInfo mIconUrl = (tmWeakStyleI != null)? tmWeakStyleI.mIconUrl: "";
       return mIconUrl;
    }
    public List getIconUrls(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       List list = (tmWeakStyleI == null)? null: tmWeakStyleI.mCDNUrls;
       return list;
    }
    public List getLabels(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       PlcEntryStyleInfo$WeakStyleInfo mLabels = (tmWeakStyleI != null)? tmWeakStyleI.mLabels: null;
       return mLabels;
    }
    public int getStyleSubType(){
       return 0;
    }
    public int getStyleType(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       PlcEntryStyleInfo$WeakStyleInfo mStyleType = (tmWeakStyleI != null)? tmWeakStyleI.mStyleType: 0;
       return mStyleType;
    }
    public String getTKBundleId(){
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$WeakStyleInfo mTKBundleInf = obj.mTKBundleInfo;
          if (mTKBundleInf != null && !TextUtils.x(mTKBundleInf.mTKBundleId)) {
             return this.mWeakStyleInfo.mTKBundleInfo.mTKBundleId;
          }
       }
       return "";
    }
    public String getTitle(){
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       String str = (obj != null)? TextUtils.I(obj.mTitle): "";
       return str;
    }
    public int getViewStyle(){
       return 1;
    }
    public int getWeakCategoryMaxLen(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       if (tmWeakStyleI != null) {
          return tmWeakStyleI.mCategoryMaxLength;
       }
       return 0;
    }
    public String getWeakCategoryText(){
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null && !TextUtils.x(obj.mCategoryText)) {
          return this.mWeakStyleInfo.mCategoryText;
       }
       return "";
    }
    public int getWeakStyleSubType(){
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mWeakStyleInfo;
       if (obj != null) {
          return obj.mWeakStyleSubType;
       }
       return f.p(this);
    }
    public String getWeakTagInfoText(){
       WeakStyleDataAdapter obj = PatchProxy.apply(null, this, WeakStyleDataAdapter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWeakStyleInfo;
       if (obj != null && !TextUtils.x(obj.mTagInfoText)) {
          return this.mWeakStyleInfo.mTagInfoText;
       }
       return "";
    }
    public boolean haveStyleTransition(){
       BasePlcEntryDataAdapter tmPlcEntrySt = this.mPlcEntryStyleInfo;
       boolean b = false;
       if (tmPlcEntrySt != null) {
          PlcEntryStyleInfo mStyleInfo = tmPlcEntrySt.mStyleInfo;
          if (mStyleInfo != null && mStyleInfo.mDoWeakTransitionMillis > 0) {
             b = true;
          }
       }
       return b;
    }
    public boolean isHideAdTag(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       PlcEntryStyleInfo$WeakStyleInfo mHideAdTag = (tmWeakStyleI != null)? tmWeakStyleI.mHideAdTag: true;
       return mHideAdTag;
    }
    public boolean isRoundCornerIcon(){
       WeakStyleDataAdapter tmWeakStyleI = this.mWeakStyleInfo;
       boolean b = (tmWeakStyleI != null && tmWeakStyleI.mIsRoundCornerIcon != null)? true: false;
       return b;
    }
}
