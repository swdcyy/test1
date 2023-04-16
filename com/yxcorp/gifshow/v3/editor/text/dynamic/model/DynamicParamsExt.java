package com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicParamsExt;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class DynamicParamsExt implements Serializable	// class@0013c5
{
    public List abTestIcon1Urls;
    public List abTestIcon2Urls;
    public int controlType;
    public String defaultAlignment;
    public String defaultFontId;
    public String defaultText;
    public List detailCoverIconUrls;
    public boolean enableFontChange;
    public List mFileMd5CheckList;
    public int maxLine;
    public boolean needLogin;
    public int showWhere;
    public String textId;

    public void DynamicParamsExt(){
       super();
       this.defaultText = "";
       this.enableFontChange = true;
       this.maxLine = Integer.MAX_VALUE;
    }
    public final List getAbTestIcon1Urls(){
       return this.abTestIcon1Urls;
    }
    public final List getAbTestIcon2Urls(){
       return this.abTestIcon2Urls;
    }
    public final int getControlType(){
       return this.controlType;
    }
    public final String getDefaultAlignment(){
       return this.defaultAlignment;
    }
    public final String getDefaultFontId(){
       return this.defaultFontId;
    }
    public final String getDefaultText(){
       return this.defaultText;
    }
    public final List getDetailCoverIconUrls(){
       return this.detailCoverIconUrls;
    }
    public final boolean getEnableFontChange(){
       return this.enableFontChange;
    }
    public final List getMFileMd5CheckList(){
       return this.mFileMd5CheckList;
    }
    public final int getMaxLine(){
       return this.maxLine;
    }
    public final boolean getNeedLogin(){
       return this.needLogin;
    }
    public final int getShowWhere(){
       return this.showWhere;
    }
    public final String getTextId(){
       return this.textId;
    }
    public final void setAbTestIcon1Urls(List p0){
       this.abTestIcon1Urls = p0;
    }
    public final void setAbTestIcon2Urls(List p0){
       this.abTestIcon2Urls = p0;
    }
    public final void setControlType(int p0){
       this.controlType = p0;
    }
    public final void setDefaultAlignment(String p0){
       this.defaultAlignment = p0;
    }
    public final void setDefaultFontId(String p0){
       this.defaultFontId = p0;
    }
    public final void setDefaultText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicParamsExt.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.defaultText = p0;
       return;
    }
    public final void setDetailCoverIconUrls(List p0){
       this.detailCoverIconUrls = p0;
    }
    public final void setEnableFontChange(boolean p0){
       this.enableFontChange = p0;
    }
    public final void setMFileMd5CheckList(List p0){
       this.mFileMd5CheckList = p0;
    }
    public final void setMaxLine(int p0){
       this.maxLine = p0;
    }
    public final void setNeedLogin(boolean p0){
       this.needLogin = p0;
    }
    public final void setShowWhere(int p0){
       this.showWhere = p0;
    }
    public final void setTextId(String p0){
       this.textId = p0;
    }
}
