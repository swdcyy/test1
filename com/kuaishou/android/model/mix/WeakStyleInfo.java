package com.kuaishou.android.model.mix.WeakStyleInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.ActionInfo;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.model.mix.LabelPackage;

public final class WeakStyleInfo implements Serializable	// class@000e36
{
    public ActionInfo mActionInfo;
    public List mCDNUrls;
    public String mCategoryText;
    public String mIconUrl;
    public LabelPackage mLabelPackage;
    public String mTagText;
    public String mTitle;

    public void WeakStyleInfo(){
       super();
    }
    public final ActionInfo getMActionInfo(){
       return this.mActionInfo;
    }
    public final List getMCDNUrls(){
       return this.mCDNUrls;
    }
    public final String getMCategoryText(){
       return this.mCategoryText;
    }
    public final String getMIconUrl(){
       return this.mIconUrl;
    }
    public final LabelPackage getMLabelPackage(){
       return this.mLabelPackage;
    }
    public final String getMTagText(){
       return this.mTagText;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final void setMActionInfo(ActionInfo p0){
       this.mActionInfo = p0;
    }
    public final void setMCDNUrls(List p0){
       this.mCDNUrls = p0;
    }
    public final void setMCategoryText(String p0){
       this.mCategoryText = p0;
    }
    public final void setMIconUrl(String p0){
       this.mIconUrl = p0;
    }
    public final void setMLabelPackage(LabelPackage p0){
       this.mLabelPackage = p0;
    }
    public final void setMTagText(String p0){
       this.mTagText = p0;
    }
    public final void setMTitle(String p0){
       this.mTitle = p0;
    }
}
