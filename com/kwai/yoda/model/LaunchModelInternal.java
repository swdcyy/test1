package com.kwai.yoda.model.LaunchModelInternal;
import java.io.Serializable;
import java.lang.String;
import yz7.c;
import com.kwai.yoda.model.LaunchModel$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Arrays;

public class LaunchModelInternal implements Serializable	// class@0012c1
{
    public Boolean mAutoFocus;
    public String mBizId;
    public String mBounceStyle;
    public String mDarkModeType;
    public Map mDataParams;
    public String mDataStr;
    public String mDefaultLoadingColor;
    public Boolean mEnableDarkMode;
    public Boolean mEnableErrorPage;
    public Boolean mEnableLoading;
    public Boolean mEnableProgress;
    public Map mExtraQueries;
    public final Map mExtras;
    public String mHyIdStr;
    public List mHyIds;
    public String mLayoutType;
    public Map mLoadHeaders;
    public String mLoadingBgColor;
    public int mLoadingHeight;
    public int mLoadingOffsetTop;
    public String mLoadingText;
    public String mLoadingTextColor;
    public long mLoadingTimeout;
    public String mLoadingType;
    public int mLoadingWidth;
    public String mName;
    public String mPhysicalBackBehavior;
    public String mProgressBarColor;
    public String mProjectId;
    public String mSlideBackBehavior;
    public String mStatusBarColorType;
    public String mTitle;
    public String mTitleColor;
    public String mTopBarBgColor;
    public String mTopBarBorderColor;
    public String mTopBarPosition;
    public String mUrl;
    public String mWebViewBgColor;
    public static final String DEFAULT_BG_COLOR;
    public static final long serialVersionUID;

    static {
       LaunchModelInternal.DEFAULT_BG_COLOR = c.d(-1);
    }
    public void LaunchModelInternal(LaunchModel$a p0){
       super();
       this.mBizId = "";
       this.mHyIdStr = "";
       this.mTitle = "";
       this.mTitleColor = c.d(0xff000000);
       this.mTopBarBgColor = c.d(-1);
       this.mTopBarBorderColor = "transparent";
       this.mStatusBarColorType = "dark";
       Boolean tRUE = Boolean.TRUE;
       this.mEnableProgress = tRUE;
       this.mLoadingType = "";
       this.mEnableLoading = Boolean.FALSE;
       this.mDefaultLoadingColor = "#e6e6e6";
       this.mWebViewBgColor = c.d(-1);
       this.mDarkModeType = "2";
       this.mSlideBackBehavior = "default";
       this.mBounceStyle = "disable";
       this.mPhysicalBackBehavior = "backOrClose";
       this.mAutoFocus = tRUE;
       this.mTopBarPosition = "default";
       this.mExtras = new HashMap();
       if (p0 != null) {
          this.mUrl = p0.a;
          this.mBizId = p0.b;
          this.setName(p0.d);
          this.mDataParams = p0.e;
          this.mDataStr = p0.f;
          this.mExtraQueries = p0.h;
          this.mLoadHeaders = p0.g;
       }
       return;
    }
    public String getBizId(){
       return this.mBizId;
    }
    public Map getDataParams(){
       return this.mDataParams;
    }
    public String getDataStr(){
       return this.mDataStr;
    }
    public Map getExtraQueries(){
       LaunchModelInternal obj = PatchProxy.apply(null, this, LaunchModelInternal.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraQueries;
       if (obj != null) {
          return obj;
       }
       return Collections.emptyMap();
    }
    public Map getExtras(){
       return this.mExtras;
    }
    public String getFirstHyId(){
       return this.getHyIds().iterator().next();
    }
    public List getHyIds(){
       Object obj = PatchProxy.apply(null, this, LaunchModelInternal.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mHyIdStr)) {
          return Collections.emptyList();
       }
       if (this.mHyIds == null) {
          this.mHyIds = Arrays.asList((this.mHyIdStr).split(","));
       }
       return this.mHyIds;
    }
    public String getLayoutType(){
       return this.mLayoutType;
    }
    public Map getLoadHeaders(){
       return this.mLoadHeaders;
    }
    public String getName(){
       return this.mName;
    }
    public String getProjectId(){
       return this.mProjectId;
    }
    public String getUrl(){
       return this.mUrl;
    }
    public void setBizId(String p0){
       this.mBizId = p0;
    }
    public void setDataParams(Map p0){
       this.mDataParams = p0;
    }
    public void setDataStr(String p0){
       this.mDataStr = p0;
    }
    public void setHyIdStr(String p0){
       this.mHyIdStr = p0;
    }
    public void setHyIds(String[] p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, LaunchModelInternal.class, "3")) {
          return;
       }
       String str = "";
       if (!p0.length) {
          this.mHyIdStr = str;
       }else {
          int i = 0;
          int i1 = p0.length - 1;
          while (i < i1) {
             int i2 = p0.length - 1;
             i1 = 2;
             if (i == i2) {
                objArray = new Object[i1];
                objArray[0] = this.mHyIdStr;
                objArray[1] = p0[i];
                str = String.format("%s%s", objArray);
             }else {
                objArray = new Object[i1];
                objArray[0] = this.mHyIdStr;
                objArray[1] = p0[i];
                str = String.format("%s%s,", objArray);
             }
             i = i + 1;
          }
          this.mHyIdStr = str;
       }
       return;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LaunchModelInternal.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.mName = p0;
       }
       return;
    }
    public void setProjectId(String p0){
       this.mProjectId = p0;
    }
    public void setUrl(String p0){
       this.mUrl = p0;
    }
}
