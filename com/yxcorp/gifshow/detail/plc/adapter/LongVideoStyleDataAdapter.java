package com.yxcorp.gifshow.detail.plc.adapter.LongVideoStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.BasePlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zf6.k;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import g4a.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Map;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;

public class LongVideoStyleDataAdapter extends BasePlcEntryDataAdapter	// class@00165d
{
    public PlcEntryStyleInfo$LongVideoStyleInfo mLongVideoStyleInfo;

    public void LongVideoStyleDataAdapter(QPhoto p0,PlcEntryStyleInfo p1){
       super(p0, p1);
       this.mLongVideoStyleInfo = this.getLongVideoStyleInfo();
    }
    public final PlcEntryStyleInfo$ActionInfo a(){
       LongVideoStyleDataAdapter tmLongVideoS = this.mLongVideoStyleInfo;
       PlcEntryStyleInfo$ActionInfo uActionInfo = (tmLongVideoS == null)? null: tmLongVideoS.mActionInfo;
       return uActionInfo;
    }
    public boolean enableForceClose(){
       return false;
    }
    public String getActionIconUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj == null) {
          return "";
       }
       String str = (k.d())? TextUtils.I(obj.mActionDarkIconUrl): TextUtils.I(obj.mActionIconUrl);
       return str;
    }
    public String getActionLabel(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": obj.mActionLabel;
       return TextUtils.I(str);
    }
    public String getActionSubUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionSubUrl);
       return str;
    }
    public int getActionType(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a();
       int i = (obj == null)? 0: obj.mActionType;
       return i;
    }
    public String getActionUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       this.appendBizRequiredParams(str);
       return c.b(this, this.mPhoto, this.mPlcEntryStyleInfo);
    }
    public String getBizCustomEntryTag(){
       LongVideoStyleDataAdapter obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLongVideoStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$LongVideoStyleInfo mTagPackage = obj.mTagPackage;
          if (mTagPackage != null) {
             return TextUtils.I(mTagPackage.mBizEntryTag);
          }
       }
       return "";
    }
    public Map getBizRequiredParams(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, LongVideoStyleDataAdapter.class, "7");
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
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, LongVideoStyleDataAdapter.class, "11");
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
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       return str;
    }
    public String getHighLightLabel(){
       LongVideoStyleDataAdapter obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLongVideoStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mHighlightLabel);
       return str;
    }
    public String getHighlightLabelColor(){
       return "";
    }
    public String getIconUrl(){
       LongVideoStyleDataAdapter obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLongVideoStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mIconUrl);
       return str;
    }
    public List getLabels(){
       LongVideoStyleDataAdapter tmLongVideoS = this.mLongVideoStyleInfo;
       List list = (tmLongVideoS == null)? null: tmLongVideoS.mLabels;
       return list;
    }
    public int getStyleSubType(){
       return 0;
    }
    public int getStyleType(){
       LongVideoStyleDataAdapter tmLongVideoS = this.mLongVideoStyleInfo;
       int i = (tmLongVideoS == null)? 0: tmLongVideoS.mStyleType;
       return i;
    }
    public String getTKBundleId(){
       Object[] objArray = null;
       LongVideoStyleDataAdapter obj = PatchProxy.apply(objArray, this, LongVideoStyleDataAdapter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLongVideoStyleInfo;
       if (obj != null) {
          objArray = obj.mTKBundleInfo;
       }
       String str = (objArray == null)? "": TextUtils.I(objArray.mTKBundleId);
       return str;
    }
    public String getTitle(){
       LongVideoStyleDataAdapter obj = PatchProxy.apply(null, this, LongVideoStyleDataAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLongVideoStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mTitle);
       return str;
    }
    public int getViewStyle(){
       return 3;
    }
    public boolean haveStyleTransition(){
       return false;
    }
    public boolean isHideAdTag(){
       return true;
    }
}
