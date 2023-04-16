package com.kwai.emotionsdk.bean.EmotionPackage;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionAuthor;
import com.kwai.emotionsdk.bean.EmotionExtraInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;

public class EmotionPackage implements Serializable	// class@000d7e
{
    public String mDescription;
    public EmotionAuthor mEmotionAuthor;
    public int mEmotionPackageVersion;
    public List mEmotions;
    public EmotionExtraInfo mExtraInfo;
    public String mId;
    public String mIntroduction;
    public String mName;
    public List mPackageBannerUrl;
    public List mPackageDownloadUrl;
    public List mPackageImageBigUrl;
    public List mPackageImageMiddleUrl;
    public List mPackageImageSmallUrl;
    public List mPackageImageSmallUrlDarkMode;
    public String mStyle;
    public int mType;
    public static final EmotionPackage EMPTY_PKG;
    public static final long serialVersionUID;

    static {
       EmotionPackage.EMPTY_PKG = new EmotionPackage("empty");
    }
    public void EmotionPackage(){
       super();
    }
    public void EmotionPackage(String p0){
       super();
       this.mId = p0;
    }
    public void EmotionPackage(String p0,String p1,String p2,String p3,int p4,String p5,List p6,List p7,List p8,List p9,List p10,List p11,EmotionAuthor p12,List p13,EmotionExtraInfo p14,int p15){
       int i = this;
       super();
       i.mId = p0;
       i.mName = p1;
       i.mIntroduction = p2;
       i.mDescription = p3;
       i.mType = p4;
       i.mStyle = p5;
       i.mPackageImageSmallUrl = p6;
       i.mPackageImageSmallUrlDarkMode = p7;
       i.mPackageImageMiddleUrl = p8;
       i.mPackageBannerUrl = p9;
       i.mPackageImageBigUrl = p10;
       i.mPackageDownloadUrl = p11;
       i.mEmotionAuthor = p12;
       i.mEmotions = p13;
       i.mExtraInfo = p14;
       i.mEmotionPackageVersion = p15;
    }
    public void copyFrom(EmotionPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionPackage.class, "1")) {
          return;
       }
       this.mId = p0.mId;
       this.mName = p0.mName;
       this.mIntroduction = p0.mIntroduction;
       this.mDescription = p0.mDescription;
       this.mType = p0.mType;
       this.mStyle = p0.mStyle;
       this.mPackageImageSmallUrl = p0.mPackageImageSmallUrl;
       this.mPackageImageMiddleUrl = p0.mPackageImageMiddleUrl;
       this.mPackageBannerUrl = p0.mPackageBannerUrl;
       this.mPackageImageBigUrl = p0.mPackageImageBigUrl;
       this.mPackageDownloadUrl = p0.mPackageDownloadUrl;
       this.mEmotionAuthor = p0.mEmotionAuthor;
       this.mEmotions = new ArrayList(p0.mEmotions);
       this.mExtraInfo = p0.mExtraInfo;
       return;
    }
    public String getMDescription(){
       return this.mDescription;
    }
    public EmotionAuthor getMEmotionAuthor(){
       return this.mEmotionAuthor;
    }
    public int getMEmotionPackageVersion(){
       return this.mEmotionPackageVersion;
    }
    public List getMEmotions(){
       return this.mEmotions;
    }
    public EmotionExtraInfo getMExtraInfo(){
       return this.mExtraInfo;
    }
    public String getMId(){
       return this.mId;
    }
    public String getMIntroduction(){
       return this.mIntroduction;
    }
    public String getMName(){
       return this.mName;
    }
    public List getMPackageBannerUrl(){
       return this.mPackageBannerUrl;
    }
    public List getMPackageDownloadUrl(){
       return this.mPackageDownloadUrl;
    }
    public List getMPackageImageBigUrl(){
       return this.mPackageImageBigUrl;
    }
    public List getMPackageImageMiddleUrl(){
       return this.mPackageImageMiddleUrl;
    }
    public List getMPackageImageSmallUrl(){
       return this.mPackageImageSmallUrl;
    }
    public List getMPackageImageSmallUrlDarkMode(){
       return this.mPackageImageSmallUrlDarkMode;
    }
    public String getMStyle(){
       return this.mStyle;
    }
    public int getMType(){
       return this.mType;
    }
    public void setMDescription(String p0){
       this.mDescription = p0;
    }
    public void setMEmotionAuthor(EmotionAuthor p0){
       this.mEmotionAuthor = p0;
    }
    public void setMEmotionPackageVersion(int p0){
       this.mEmotionPackageVersion = p0;
    }
    public void setMEmotions(List p0){
       this.mEmotions = p0;
    }
    public void setMExtraInfo(EmotionExtraInfo p0){
       this.mExtraInfo = p0;
    }
    public void setMId(String p0){
       this.mId = p0;
    }
    public void setMIntroduction(String p0){
       this.mIntroduction = p0;
    }
    public void setMName(String p0){
       this.mName = p0;
    }
    public void setMPackageBannerUrl(List p0){
       this.mPackageBannerUrl = p0;
    }
    public void setMPackageDownloadUrl(List p0){
       this.mPackageDownloadUrl = p0;
    }
    public void setMPackageImageBigUrl(List p0){
       this.mPackageImageBigUrl = p0;
    }
    public void setMPackageImageMiddleUrl(List p0){
       this.mPackageImageMiddleUrl = p0;
    }
    public void setMPackageImageSmallUrl(List p0){
       this.mPackageImageSmallUrl = p0;
    }
    public void setMPackageImageSmallUrlDarkMode(List p0){
       this.mPackageImageSmallUrlDarkMode = p0;
    }
    public void setMStyle(String p0){
       this.mStyle = p0;
    }
    public void setMType(int p0){
       this.mType = p0;
    }
}
