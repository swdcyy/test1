package com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModelInternal;
import com.kwai.yoda.model.LaunchModel$a;
import hy7.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ky7.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import ky7.a;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import az7.a;
import yz7.c;
import java.lang.Long;

public class LaunchModel extends LaunchModelInternal	// class@0012bf
{
    public int mAutoFocusGrade;
    public int mBounceStyleGrade;
    public int mDarkModeTypeGrade;
    public int mDefaultLoadingColorGrade;
    public int mEnableDarkModeGrade;
    public int mEnableErrorPageGrade;
    public int mEnableLoadingGrade;
    public int mEnableProgressGrade;
    public int mHyIdGrade;
    public int mLayoutTypeGrade;
    public int mLoadingBgColorGrade;
    public int mLoadingHeightGrade;
    public int mLoadingOffsetTopGrade;
    public int mLoadingTextColorGrade;
    public int mLoadingTextGrade;
    public int mLoadingTimeoutGrade;
    public int mLoadingTypeGrade;
    public int mLoadingWidthGrade;
    public int mPhysicalBackBehaviorGrade;
    public int mProgressBarColorGrade;
    public int mSlideBackBehaviorGrade;
    public int mStatusBarColorTypeGrade;
    public int mTitleColorGrade;
    public int mTitleGrade;
    public int mTopBarBgColorGrade;
    public int mTopBarBorderColorGrade;
    public int mTopBarPositionGrade;
    public int mWebViewBgColorGrade;
    public static final long serialVersionUID = 0x1;

    public void LaunchModel(LaunchModel$a p0){
       super(p0);
       if (PatchProxy.applyVoidOneRefs(this, null, n.class, "3")) {
       }else {
          b a = n.a;
          Objects.requireNonNull(a);
          if (PatchProxy.applyOneRefs(this, a, b.class, "2") != PatchProxyResult.class) {
          }else {
             Iterator iterator = a.a.iterator();
             LaunchModelInternal launchModelI = this;
             while (iterator.hasNext()) {
                LaunchModel launchModel = iterator.next().a(launchModelI);
             }
          }
       }
       this.setHyId(p0.j);
       this.setTitle(p0.k);
       this.setTopBarPosition(p0.l);
       this.setStatusBarColorType(p0.m);
       this.setSlideBackBehavior(p0.n);
       this.setPhysicalBackBehavior(p0.o);
       this.setBounceStyle(p0.p);
       this.setLoadingType(p0.q);
       this.setDarkModeType(p0.r);
       this.setTitleColor(p0.s);
       this.setTopBarBgColor(p0.t);
       this.setTopBarBorderColor(p0.u);
       this.setWebViewBgColor(p0.v);
       this.setProgressBarColor(p0.w);
       this.setDefaultLoadingColor(p0.x);
       this.setEnableLoading(p0.y);
       this.setLoadingText(p0.z, 20);
       this.setLoadingBgColor(p0.A, 20);
       this.setLoadingTimeout(p0.B, 20);
       this.setLoadingWidth(p0.C, 20);
       this.setLoadingHeight(p0.D, 20);
       this.setLoadingOffsetTop(p0.E, 20);
       this.setLoadingTextColor(p0.F, 20);
       this.setEnableErrorPage(p0.G);
       this.setEnableProgress(p0.H);
       this.setEnableDarkMode(p0.I);
       this.setAutoFocus(p0.J);
       this.setLayoutType(p0.q);
       return;
    }
    public int getAutoFocusGrade(){
       return this.mAutoFocusGrade;
    }
    public String getBounceStyle(){
       LaunchModelInternal tmBounceStyl = this.mBounceStyle;
       if (tmBounceStyl != null) {
       }else {
          tmBounceStyl = "";
       }
       return tmBounceStyl;
    }
    public String getBounceStyle(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getBounceStyleGrade() >= p0) {
          return this.getBounceStyle();
       }else {
          return "";
       }
    }
    public int getBounceStyleGrade(){
       return this.mBounceStyleGrade;
    }
    public String getDarkModeType(){
       LaunchModelInternal tmDarkModeTy = this.mDarkModeType;
       if (tmDarkModeTy != null) {
       }else {
          tmDarkModeTy = "";
       }
       return tmDarkModeTy;
    }
    public String getDarkModeType(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getDarkModeTypeGrade() >= p0) {
          return this.getDarkModeType();
       }else {
          return "";
       }
    }
    public int getDarkModeTypeGrade(){
       return this.mDarkModeTypeGrade;
    }
    public String getDefaultLoadingColor(){
       LaunchModelInternal tmDefaultLoa = this.mDefaultLoadingColor;
       if (tmDefaultLoa != null) {
       }else {
          tmDefaultLoa = "";
       }
       return tmDefaultLoa;
    }
    public String getDefaultLoadingColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "49");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getDefaultLoadingColorGrade() >= p0) {
          return this.getDefaultLoadingColor();
       }else {
          return "";
       }
    }
    public int getDefaultLoadingColorGrade(){
       return this.mDefaultLoadingColorGrade;
    }
    public int getEnableDarkModeGrade(){
       return this.mEnableDarkModeGrade;
    }
    public int getEnableErrorPageGrade(){
       return this.mEnableErrorPageGrade;
    }
    public int getEnableLoadingGrade(){
       return this.mEnableLoadingGrade;
    }
    public int getEnableProgressGrade(){
       return this.mEnableProgressGrade;
    }
    public String getHyId(){
       LaunchModelInternal tmHyIdStr = this.mHyIdStr;
       if (tmHyIdStr != null) {
       }else {
          tmHyIdStr = "";
       }
       return tmHyIdStr;
    }
    public int getHyIdGrade(){
       return this.mHyIdGrade;
    }
    public int getLayoutTypeGrade(){
       return this.mLayoutTypeGrade;
    }
    public String getLoadingBgColor(){
       return this.mLoadingBgColor;
    }
    public int getLoadingBgColorGrade(){
       return this.mLoadingBgColorGrade;
    }
    public int getLoadingHeight(){
       return this.mLoadingHeight;
    }
    public int getLoadingHeightGrade(){
       return this.mLoadingHeightGrade;
    }
    public int getLoadingOffsetTop(){
       return this.mLoadingOffsetTop;
    }
    public int getLoadingOffsetTopGrade(){
       return this.mLoadingOffsetTopGrade;
    }
    public String getLoadingText(){
       LaunchModelInternal tmLoadingTex = this.mLoadingText;
       if (tmLoadingTex != null) {
       }else {
          tmLoadingTex = "";
       }
       return tmLoadingTex;
    }
    public String getLoadingTextColor(){
       return this.mLoadingTextColor;
    }
    public int getLoadingTextColorGrade(){
       return this.mLoadingTextColorGrade;
    }
    public int getLoadingTextGrade(){
       return this.mLoadingTextGrade;
    }
    public long getLoadingTimeout(){
       return this.mLoadingTimeout;
    }
    public int getLoadingTimeoutGrade(){
       return this.mLoadingTimeoutGrade;
    }
    public String getLoadingType(){
       LaunchModelInternal tmLoadingTyp = this.mLoadingType;
       if (tmLoadingTyp != null) {
       }else {
          tmLoadingTyp = "";
       }
       return tmLoadingTyp;
    }
    public String getLoadingType(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getLoadingTypeGrade() >= p0) {
          return this.getLoadingType();
       }else {
          return "";
       }
    }
    public int getLoadingTypeGrade(){
       return this.mLoadingTypeGrade;
    }
    public int getLoadingWidth(){
       return this.mLoadingWidth;
    }
    public int getLoadingWidthGrade(){
       return this.mLoadingWidthGrade;
    }
    public String getPhysicalBackBehavior(){
       LaunchModelInternal tmPhysicalBa = this.mPhysicalBackBehavior;
       if (tmPhysicalBa != null) {
       }else {
          tmPhysicalBa = "";
       }
       return tmPhysicalBa;
    }
    public String getPhysicalBackBehavior(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getPhysicalBackBehaviorGrade() >= p0) {
          return this.getPhysicalBackBehavior();
       }else {
          return "";
       }
    }
    public int getPhysicalBackBehaviorGrade(){
       return this.mPhysicalBackBehaviorGrade;
    }
    public String getProgressBarColor(){
       LaunchModelInternal tmProgressBa = this.mProgressBarColor;
       if (tmProgressBa != null) {
       }else {
          tmProgressBa = "";
       }
       return tmProgressBa;
    }
    public String getProgressBarColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getProgressBarColorGrade() >= p0) {
          return this.getProgressBarColor();
       }else {
          return "";
       }
    }
    public int getProgressBarColorGrade(){
       return this.mProgressBarColorGrade;
    }
    public String getSlideBackBehavior(){
       LaunchModelInternal tmSlideBackB = this.mSlideBackBehavior;
       if (tmSlideBackB != null) {
       }else {
          tmSlideBackB = "";
       }
       return tmSlideBackB;
    }
    public String getSlideBackBehavior(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getSlideBackBehaviorGrade() >= p0) {
          return this.getSlideBackBehavior();
       }else {
          return "";
       }
    }
    public int getSlideBackBehaviorGrade(){
       return this.mSlideBackBehaviorGrade;
    }
    public String getStatusBarColorType(){
       LaunchModelInternal tmStatusBarC = this.mStatusBarColorType;
       if (tmStatusBarC != null) {
       }else {
          tmStatusBarC = "";
       }
       return tmStatusBarC;
    }
    public String getStatusBarColorType(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getStatusBarColorTypeGrade() >= p0) {
          return this.getStatusBarColorType();
       }else {
          return "";
       }
    }
    public int getStatusBarColorTypeGrade(){
       return this.mStatusBarColorTypeGrade;
    }
    public String getTitle(){
       LaunchModelInternal tmTitle = this.mTitle;
       if (tmTitle != null) {
       }else {
          tmTitle = "";
       }
       return tmTitle;
    }
    public String getTitle(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getTitleGrade() >= p0) {
          return this.getTitle();
       }else {
          return "";
       }
    }
    public String getTitleColor(){
       LaunchModelInternal tmTitleColor = this.mTitleColor;
       if (tmTitleColor != null) {
       }else {
          tmTitleColor = "";
       }
       return tmTitleColor;
    }
    public String getTitleColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getTitleColorGrade() >= p0) {
          return this.getTitleColor();
       }else {
          return "";
       }
    }
    public int getTitleColorGrade(){
       return this.mTitleColorGrade;
    }
    public int getTitleGrade(){
       return this.mTitleGrade;
    }
    public String getTopBarBgColor(){
       LaunchModelInternal tmTopBarBgCo = this.mTopBarBgColor;
       if (tmTopBarBgCo != null) {
       }else {
          tmTopBarBgCo = "";
       }
       return tmTopBarBgCo;
    }
    public String getTopBarBgColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getTopBarBgColorGrade() >= p0) {
          return this.getTopBarBgColor();
       }else {
          return "";
       }
    }
    public int getTopBarBgColorGrade(){
       return this.mTopBarBgColorGrade;
    }
    public String getTopBarBorderColor(){
       LaunchModelInternal tmTopBarBord = this.mTopBarBorderColor;
       if (tmTopBarBord != null) {
       }else {
          tmTopBarBord = "";
       }
       return tmTopBarBord;
    }
    public String getTopBarBorderColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getTopBarBorderColorGrade() >= p0) {
          return this.getTopBarBorderColor();
       }else {
          return "";
       }
    }
    public int getTopBarBorderColorGrade(){
       return this.mTopBarBorderColorGrade;
    }
    public String getTopBarPosition(){
       LaunchModelInternal tmTopBarPosi = this.mTopBarPosition;
       if (tmTopBarPosi != null) {
       }else {
          tmTopBarPosi = "";
       }
       return tmTopBarPosi;
    }
    public String getTopBarPosition(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getTopBarPositionGrade() >= p0) {
          return this.getTopBarPosition();
       }else {
          return "";
       }
    }
    public int getTopBarPositionGrade(){
       return this.mTopBarPositionGrade;
    }
    public String getWebViewBgColor(){
       LaunchModelInternal tmWebViewBgC = this.mWebViewBgColor;
       if (tmWebViewBgC != null) {
       }else {
          tmWebViewBgC = "";
       }
       return tmWebViewBgC;
    }
    public String getWebViewBgColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getWebViewBgColorGrade() >= p0) {
          return this.getWebViewBgColor();
       }else {
          return "";
       }
    }
    public int getWebViewBgColorGrade(){
       return this.mWebViewBgColorGrade;
    }
    public Boolean isAutoFocus(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "76");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getAutoFocusGrade() >= p0) {
          return Boolean.valueOf(this.isAutoFocus());
       }else {
          return null;
       }
    }
    public boolean isAutoFocus(){
       LaunchModelInternal obj = PatchProxy.apply(null, this, LaunchModel.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAutoFocus;
       boolean b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public Boolean isEnableDarkMode(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "72");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getEnableDarkModeGrade() >= p0) {
          return Boolean.valueOf(this.isEnableDarkMode());
       }else {
          return null;
       }
    }
    public boolean isEnableDarkMode(){
       LaunchModelInternal tmEnableDark = this.mEnableDarkMode;
       boolean b = (tmEnableDark != null && tmEnableDark.booleanValue())? true: false;
       return b;
    }
    public Boolean isEnableErrorPage(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "65");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getEnableErrorPageGrade() >= p0) {
          return Boolean.valueOf(this.isEnableErrorPage());
       }else {
          return null;
       }
    }
    public boolean isEnableErrorPage(){
       LaunchModelInternal obj = PatchProxy.apply(null, this, LaunchModel.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEnableErrorPage;
       boolean b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public Boolean isEnableLoading(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getEnableLoadingGrade() >= p0) {
          return Boolean.valueOf(this.isEnableLoading());
       }else {
          return null;
       }
    }
    public boolean isEnableLoading(){
       LaunchModelInternal obj = PatchProxy.apply(null, this, LaunchModel.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEnableLoading;
       boolean b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public Boolean isEnableProgress(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "69");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getEnableProgressGrade() >= p0) {
          return Boolean.valueOf(this.isEnableProgress());
       }else {
          return null;
       }
    }
    public boolean isEnableProgress(){
       LaunchModelInternal obj = PatchProxy.apply(null, this, LaunchModel.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEnableProgress;
       boolean b = (obj != null && (obj.booleanValue() && TextUtils.isEmpty(this.getLoadingType())))? true: false;
       return b;
    }
    public LaunchModel setAutoFocus(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getAutoFocusGrade() <= 20) {
          this.setAutoFocus(p0, 20);
       }
       return this;
    }
    public LaunchModel setAutoFocus(boolean p0){
       if (this.getAutoFocusGrade() <= 20) {
          this.setAutoFocus(p0, 20);
       }
       return this;
    }
    public void setAutoFocus(Boolean p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "77")) {
          return;
       }
       if (this.getAutoFocusGrade() <= p1 && p0 != null) {
          this.setAutoFocusGrade(p1);
          this.mAutoFocus = p0;
       }
       return;
    }
    public void setAutoFocus(boolean p0,int p1){
       if (this.getAutoFocusGrade() <= p1) {
          this.setAutoFocusGrade(p1);
          this.mAutoFocus = Boolean.valueOf(p0);
       }
       return;
    }
    public void setAutoFocusGrade(int p0){
       this.mAutoFocusGrade = p0;
    }
    public LaunchModel setBounceStyle(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getBounceStyleGrade() <= 20) {
          this.setBounceStyle(p0, 20);
       }
       return this;
    }
    public void setBounceStyle(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "21")) {
          return;
       }
       if (this.getBounceStyleGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setBounceStyleGrade(p1);
          this.mBounceStyle = p0;
       }
       return;
    }
    public void setBounceStyleGrade(int p0){
       this.mBounceStyleGrade = p0;
    }
    public LaunchModel setDarkModeType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getDarkModeTypeGrade() <= 20) {
          this.setDarkModeType(p0, 20);
       }
       return this;
    }
    public void setDarkModeType(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "27")) {
          return;
       }
       if (this.getDarkModeTypeGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setDarkModeTypeGrade(p1);
          this.mDarkModeType = p0;
       }
       return;
    }
    public void setDarkModeTypeGrade(int p0){
       this.mDarkModeTypeGrade = p0;
    }
    public LaunchModel setDefaultLoadingColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mDefaultLoadingColor = a.b(p0);
       return this;
    }
    public LaunchModel setDefaultLoadingColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getDefaultLoadingColorGrade() <= 20) {
          this.setDefaultLoadingColor(p0, 20);
       }
       return this;
    }
    public void setDefaultLoadingColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "51")) {
          return;
       }
       if (this.getDefaultLoadingColorGrade() <= p1 && (a.a(p0) || c.a(p0))) {
          this.setDefaultLoadingColorGrade(p1);
          this.mDefaultLoadingColor = p0;
       }
       return;
    }
    public void setDefaultLoadingColorGrade(int p0){
       this.mDefaultLoadingColorGrade = p0;
    }
    public LaunchModel setEnableDarkMode(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getEnableDarkModeGrade() <= 20) {
          this.setEnableDarkMode(p0, 20);
       }
       return this;
    }
    public LaunchModel setEnableDarkMode(boolean p0){
       if (this.getEnableDarkModeGrade() <= 20) {
          this.setEnableDarkMode(p0, 20);
       }
       return this;
    }
    public void setEnableDarkMode(Boolean p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "73")) {
          return;
       }
       if (this.getEnableDarkModeGrade() <= p1 && p0 != null) {
          this.setEnableDarkModeGrade(p1);
          this.mEnableDarkMode = p0;
       }
       return;
    }
    public void setEnableDarkMode(boolean p0,int p1){
       if (this.getEnableDarkModeGrade() <= p1) {
          this.setEnableDarkModeGrade(p1);
          this.mEnableDarkMode = Boolean.valueOf(p0);
       }
       return;
    }
    public void setEnableDarkModeGrade(int p0){
       this.mEnableDarkModeGrade = p0;
    }
    public LaunchModel setEnableErrorPage(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getEnableErrorPageGrade() <= 20) {
          this.setEnableErrorPage(p0, 20);
       }
       return this;
    }
    public LaunchModel setEnableErrorPage(boolean p0){
       if (this.getEnableErrorPageGrade() <= 20) {
          this.setEnableErrorPage(p0, 20);
       }
       return this;
    }
    public void setEnableErrorPage(Boolean p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "66")) {
          return;
       }
       if (this.getEnableErrorPageGrade() <= p1 && p0 != null) {
          this.setEnableErrorPageGrade(p1);
          this.mEnableErrorPage = p0;
       }
       return;
    }
    public void setEnableErrorPage(boolean p0,int p1){
       if (this.getEnableErrorPageGrade() <= p1) {
          this.setEnableErrorPageGrade(p1);
          this.mEnableErrorPage = Boolean.valueOf(p0);
       }
       return;
    }
    public void setEnableErrorPageGrade(int p0){
       this.mEnableErrorPageGrade = p0;
    }
    public LaunchModel setEnableLoading(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getEnableLoadingGrade() <= 20) {
          this.setEnableLoading(p0, 20);
       }
       return this;
    }
    public LaunchModel setEnableLoading(boolean p0){
       if (this.getEnableLoadingGrade() <= 20) {
          this.setEnableLoading(p0, 20);
       }
       return this;
    }
    public void setEnableLoading(Boolean p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "55")) {
          return;
       }
       if (this.getEnableLoadingGrade() <= p1 && p0 != null) {
          this.setEnableLoadingGrade(p1);
          this.mEnableLoading = p0;
       }
       return;
    }
    public void setEnableLoading(boolean p0,int p1){
       if (this.getEnableLoadingGrade() <= p1) {
          this.setEnableLoadingGrade(p1);
          this.mEnableLoading = Boolean.valueOf(p0);
       }
       return;
    }
    public void setEnableLoadingGrade(int p0){
       this.mEnableLoadingGrade = p0;
    }
    public LaunchModel setEnableProgress(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getEnableProgressGrade() <= 20) {
          this.setEnableProgress(p0, 20);
       }
       return this;
    }
    public LaunchModel setEnableProgress(boolean p0){
       if (this.getEnableProgressGrade() <= 20) {
          this.setEnableProgress(p0, 20);
       }
       return this;
    }
    public void setEnableProgress(Boolean p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "70")) {
          return;
       }
       if (this.getEnableProgressGrade() <= p1 && p0 != null) {
          this.setEnableProgressGrade(p1);
          this.mEnableProgress = p0;
       }
       return;
    }
    public void setEnableProgress(boolean p0,int p1){
       if (this.getEnableProgressGrade() <= p1) {
          this.setEnableProgressGrade(p1);
          this.mEnableProgress = Boolean.valueOf(p0);
       }
       return;
    }
    public void setEnableProgressGrade(int p0){
       this.mEnableProgressGrade = p0;
    }
    public LaunchModel setHyId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getHyIdGrade() <= 20) {
          this.setHyId(p0, 20);
       }
       return this;
    }
    public void setHyId(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "1")) {
          return;
       }
       if (this.getHyIdGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setHyIdGrade(p1);
          this.mHyIdStr = p0;
       }
       return;
    }
    public void setHyIdGrade(int p0){
       this.mHyIdGrade = p0;
    }
    public LaunchModel setLayoutType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getLayoutTypeGrade() <= 20) {
          this.setLayoutType(p0, 20);
       }
       return this;
    }
    public void setLayoutType(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "3")) {
          return;
       }
       if (this.getLayoutTypeGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setLayoutTypeGrade(p1);
          this.mLayoutType = p0;
       }
       return;
    }
    public void setLayoutTypeGrade(int p0){
       this.mLayoutTypeGrade = p0;
    }
    public void setLoadingBgColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "58")) {
          return;
       }
       if (this.getLoadingBgColorGrade() <= p1 && a.a(p0)) {
          this.setLoadingBgColorGrade(p1);
          this.mLoadingBgColor = p0;
       }
       return;
    }
    public void setLoadingBgColorGrade(int p0){
       this.mLoadingBgColorGrade = p0;
    }
    public void setLoadingHeight(int p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LaunchModel.class, "61")) {
          return;
       }
       if (this.getLoadingHeightGrade() <= p1 && p0 > 0) {
          this.setLoadingHeightGrade(p1);
          this.mLoadingHeight = p0;
       }
       return;
    }
    public void setLoadingHeightGrade(int p0){
       this.mLoadingHeightGrade = p0;
    }
    public void setLoadingOffsetTop(int p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LaunchModel.class, "62")) {
          return;
       }
       if (this.getLoadingOffsetTopGrade() <= p1 && p0 > 0) {
          this.setLoadingOffsetTopGrade(p1);
          this.mLoadingOffsetTop = p0;
       }
       return;
    }
    public void setLoadingOffsetTopGrade(int p0){
       this.mLoadingOffsetTopGrade = p0;
    }
    public void setLoadingText(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "57")) {
          return;
       }
       if (this.getLoadingTextGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setLoadingTextGrade(p1);
          this.mLoadingText = p0;
       }
       return;
    }
    public void setLoadingTextColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "63")) {
          return;
       }
       if (this.getLoadingTextColorGrade() <= p1 && a.a(p0)) {
          this.setLoadingTextColorGrade(p1);
          this.mLoadingTextColor = p0;
       }
       return;
    }
    public void setLoadingTextColorGrade(int p0){
       this.mLoadingTextColorGrade = p0;
    }
    public void setLoadingTextGrade(int p0){
       this.mLoadingTextGrade = p0;
    }
    public void setLoadingTimeout(long p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, LaunchModel.class, "59")) {
          return;
       }
       if (this.getLoadingTimeoutGrade() <= p1 && p0 > 0) {
          this.setLoadingTimeoutGrade(p1);
          this.mLoadingTimeout = p0;
       }
       return;
    }
    public void setLoadingTimeoutGrade(int p0){
       this.mLoadingTimeoutGrade = p0;
    }
    public LaunchModel setLoadingType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getLoadingTypeGrade() <= 20) {
          this.setLoadingType(p0, 20);
       }
       return this;
    }
    public void setLoadingType(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "24")) {
          return;
       }
       if (this.getLoadingTypeGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setLoadingTypeGrade(p1);
          this.mLoadingType = p0;
       }
       return;
    }
    public void setLoadingTypeGrade(int p0){
       this.mLoadingTypeGrade = p0;
    }
    public void setLoadingWidth(int p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LaunchModel.class, "60")) {
          return;
       }
       if (this.getLoadingWidthGrade() <= p1 && p0 > 0) {
          this.setLoadingWidthGrade(p1);
          this.mLoadingWidth = p0;
       }
       return;
    }
    public void setLoadingWidthGrade(int p0){
       this.mLoadingWidthGrade = p0;
    }
    public LaunchModel setPhysicalBackBehavior(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getPhysicalBackBehaviorGrade() <= 20) {
          this.setPhysicalBackBehavior(p0, 20);
       }
       return this;
    }
    public void setPhysicalBackBehavior(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "18")) {
          return;
       }
       if (this.getPhysicalBackBehaviorGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setPhysicalBackBehaviorGrade(p1);
          this.mPhysicalBackBehavior = p0;
       }
       return;
    }
    public void setPhysicalBackBehaviorGrade(int p0){
       this.mPhysicalBackBehaviorGrade = p0;
    }
    public LaunchModel setProgressBarColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mProgressBarColor = a.b(p0);
       return this;
    }
    public LaunchModel setProgressBarColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getProgressBarColorGrade() <= 20) {
          this.setProgressBarColor(p0, 20);
       }
       return this;
    }
    public void setProgressBarColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "47")) {
          return;
       }
       if (this.getProgressBarColorGrade() <= p1 && (a.a(p0) || c.a(p0))) {
          this.setProgressBarColorGrade(p1);
          this.mProgressBarColor = p0;
       }
       return;
    }
    public void setProgressBarColorGrade(int p0){
       this.mProgressBarColorGrade = p0;
    }
    public LaunchModel setSlideBackBehavior(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getSlideBackBehaviorGrade() <= 20) {
          this.setSlideBackBehavior(p0, 20);
       }
       return this;
    }
    public void setSlideBackBehavior(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "15")) {
          return;
       }
       if (this.getSlideBackBehaviorGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setSlideBackBehaviorGrade(p1);
          this.mSlideBackBehavior = p0;
       }
       return;
    }
    public void setSlideBackBehaviorGrade(int p0){
       this.mSlideBackBehaviorGrade = p0;
    }
    public LaunchModel setStatusBarColorType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getStatusBarColorTypeGrade() <= 20) {
          this.setStatusBarColorType(p0, 20);
       }
       return this;
    }
    public void setStatusBarColorType(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "12")) {
          return;
       }
       if (this.getStatusBarColorTypeGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setStatusBarColorTypeGrade(p1);
          this.mStatusBarColorType = p0;
       }
       return;
    }
    public void setStatusBarColorTypeGrade(int p0){
       this.mStatusBarColorTypeGrade = p0;
    }
    public LaunchModel setTitle(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getTitleGrade() <= 20) {
          this.setTitle(p0, 20);
       }
       return this;
    }
    public void setTitle(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "6")) {
          return;
       }
       if (this.getTitleGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setTitleGrade(p1);
          this.mTitle = p0;
       }
       return;
    }
    public LaunchModel setTitleColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mTitleColor = a.b(p0);
       return this;
    }
    public LaunchModel setTitleColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getTitleColorGrade() <= 20) {
          this.setTitleColor(p0, 20);
       }
       return this;
    }
    public void setTitleColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "31")) {
          return;
       }
       if (this.getTitleColorGrade() <= p1 && (a.a(p0) || c.a(p0))) {
          this.setTitleColorGrade(p1);
          this.mTitleColor = p0;
       }
       return;
    }
    public void setTitleColorGrade(int p0){
       this.mTitleColorGrade = p0;
    }
    public void setTitleGrade(int p0){
       this.mTitleGrade = p0;
    }
    public LaunchModel setTopBarBgColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mTopBarBgColor = a.b(p0);
       return this;
    }
    public LaunchModel setTopBarBgColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getTopBarBgColorGrade() <= 20) {
          this.setTopBarBgColor(p0, 20);
       }
       return this;
    }
    public void setTopBarBgColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "35")) {
          return;
       }
       if (this.getTopBarBgColorGrade() <= p1 && (a.a(p0) || c.a(p0))) {
          this.setTopBarBgColorGrade(p1);
          this.mTopBarBgColor = p0;
       }
       return;
    }
    public void setTopBarBgColorGrade(int p0){
       this.mTopBarBgColorGrade = p0;
    }
    public LaunchModel setTopBarBorderColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "38");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mTopBarBorderColor = a.b(p0);
       return this;
    }
    public LaunchModel setTopBarBorderColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getTopBarBorderColorGrade() <= 20) {
          this.setTopBarBorderColor(p0, 20);
       }
       return this;
    }
    public void setTopBarBorderColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "39")) {
          return;
       }
       if (this.getTopBarBorderColorGrade() <= p1 && (a.a(p0) || c.a(p0))) {
          this.setTopBarBorderColorGrade(p1);
          this.mTopBarBorderColor = p0;
       }
       return;
    }
    public void setTopBarBorderColorGrade(int p0){
       this.mTopBarBorderColorGrade = p0;
    }
    public LaunchModel setTopBarPosition(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getTopBarPositionGrade() <= 20) {
          this.setTopBarPosition(p0, 20);
       }
       return this;
    }
    public void setTopBarPosition(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "9")) {
          return;
       }
       if (this.getTopBarPositionGrade() <= p1 && !TextUtils.isEmpty(p0)) {
          this.setTopBarPositionGrade(p1);
          this.mTopBarPosition = p0;
       }
       return;
    }
    public void setTopBarPositionGrade(int p0){
       this.mTopBarPositionGrade = p0;
    }
    public LaunchModel setWebViewBgColor(int p0){
       if (PatchProxy.isSupport(LaunchModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LaunchModel.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mWebViewBgColor = a.b(p0);
       return this;
    }
    public LaunchModel setWebViewBgColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchModel.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getWebViewBgColorGrade() <= 20) {
          this.setWebViewBgColor(p0, 20);
       }
       return this;
    }
    public void setWebViewBgColor(String p0,int p1){
       if (PatchProxy.isSupport(LaunchModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LaunchModel.class, "41")) {
          return;
       }
       if (this.getWebViewBgColorGrade() <= p1 && (a.a(p0) || c.a(p0))) {
          this.setWebViewBgColorGrade(p1);
          this.mWebViewBgColor = p0;
       }
       return;
    }
    public void setWebViewBgColorGrade(int p0){
       this.mWebViewBgColorGrade = p0;
    }
}
