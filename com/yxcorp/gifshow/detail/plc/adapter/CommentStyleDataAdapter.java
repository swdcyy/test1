package com.yxcorp.gifshow.detail.plc.adapter.CommentStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.BasePlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import g4a.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Map;
import java.util.List;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import v3a.f;

public class CommentStyleDataAdapter extends BasePlcEntryDataAdapter	// class@00165b
{
    public PlcEntryStyleInfo$CommentStyleInfo mCommentStyleInfo;

    public void CommentStyleDataAdapter(QPhoto p0,PlcEntryStyleInfo p1){
       super(p0, p1);
       this.mCommentStyleInfo = this.getCommentStyleInfo();
    }
    public final PlcEntryStyleInfo$ActionInfo a(){
       CommentStyleDataAdapter tmCommentSty = this.mCommentStyleInfo;
       PlcEntryStyleInfo$ActionInfo uActionInfo = (tmCommentSty == null)? null: tmCommentSty.mActionInfo;
       return uActionInfo;
    }
    public boolean enableForceClose(){
       return false;
    }
    public String getActionIconUrl(){
       return "";
    }
    public String getActionLabel(){
       return "";
    }
    public String getActionSubUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionSubUrl);
       return str;
    }
    public int getActionType(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a();
       int i = (obj == null)? 0: obj.mActionType;
       return i;
    }
    public String getActionUrl(){
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       String str = (obj == null)? "": TextUtils.I(obj.mActionUrl);
       this.appendBizRequiredParams(str);
       return c.b(this, this.mPhoto, this.mPlcEntryStyleInfo);
    }
    public String getBizCustomEntryTag(){
       CommentStyleDataAdapter obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCommentStyleInfo;
       if (obj != null) {
          PlcEntryStyleInfo$CommentStyleInfo mTagPackage = obj.mTagPackage;
          if (mTagPackage != null) {
             return TextUtils.I(mTagPackage.mBizEntryTag);
          }
       }
       return "";
    }
    public Map getBizRequiredParams(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, CommentStyleDataAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj != null) {
          objArray = obj.mRequiredParams;
       }
       return objArray;
    }
    public String getCommentCategoryText(){
       CommentStyleDataAdapter obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCommentStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mCategoryText);
       return str;
    }
    public String getCommentTagInfoText(){
       CommentStyleDataAdapter obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCommentStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mTagInfoText);
       return str;
    }
    public Map getDownloadInfoMap(){
       Object[] objArray = null;
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(objArray, this, CommentStyleDataAdapter.class, "11");
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
       PlcEntryStyleInfo$ActionInfo obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "4");
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
       CommentStyleDataAdapter obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCommentStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mIconUrl);
       return str;
    }
    public List getLabels(){
       CommentStyleDataAdapter tmCommentSty = this.mCommentStyleInfo;
       List list = (tmCommentSty == null)? null: tmCommentSty.mLabels;
       return list;
    }
    public int getStyleSubType(){
       return 0;
    }
    public int getStyleType(){
       return this.mCommentStyleInfo.mStyleType;
    }
    public String getTKBundleId(){
       return "";
    }
    public String getTitle(){
       CommentStyleDataAdapter obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCommentStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mTitle);
       return str;
    }
    public int getViewStyle(){
       return 6;
    }
    public boolean isEnableCommentLabelArrow(){
       CommentStyleDataAdapter obj = PatchProxy.apply(null, this, CommentStyleDataAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mCommentStyleInfo;
       if (obj == null) {
          return f.s(this);
       }
       return obj.mEnableLabelArrow;
    }
    public boolean isHideAdTag(){
       return true;
    }
}
