package com.kuaishou.growth.pendant.model.CompleteTipConfigV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.CompleteTipConfigV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CompleteTipConfigV2 implements Serializable	// class@000663
{
    public String mBubbleLinkUrl;
    public int mBubbleSecond;
    public String mBubbleText;
    public JsonObject mReport;
    public boolean mShowNow;
    public String mTipStyle;
    public String mToastIcon;
    public String mToastSubtitle;
    public String mToastSubtitleColor;
    public String mToastText;
    public String mToastTitle;
    public String mToastTitleColor;
    public String mUserType;
    public static final CompleteTipConfigV2$a Companion;
    public static final long serialVersionUID;

    static {
       CompleteTipConfigV2.Companion = new CompleteTipConfigV2$a(null);
    }
    public void CompleteTipConfigV2(){
       super();
       this.mBubbleLinkUrl = "";
       this.mBubbleSecond = 3;
    }
    public static void getMTipStyle$annotations(){
    }
    public final String getMBubbleLinkUrl(){
       return this.mBubbleLinkUrl;
    }
    public final int getMBubbleSecond(){
       return this.mBubbleSecond;
    }
    public final String getMBubbleText(){
       return this.mBubbleText;
    }
    public final JsonObject getMReport(){
       return this.mReport;
    }
    public final boolean getMShowNow(){
       return this.mShowNow;
    }
    public final String getMTipStyle(){
       return this.mTipStyle;
    }
    public final String getMToastIcon(){
       return this.mToastIcon;
    }
    public final String getMToastSubtitle(){
       return this.mToastSubtitle;
    }
    public final String getMToastSubtitleColor(){
       return this.mToastSubtitleColor;
    }
    public final String getMToastText(){
       return this.mToastText;
    }
    public final String getMToastTitle(){
       return this.mToastTitle;
    }
    public final String getMToastTitleColor(){
       return this.mToastTitleColor;
    }
    public final String getMUserType(){
       return this.mUserType;
    }
    public final void setMBubbleLinkUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompleteTipConfigV2.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBubbleLinkUrl = p0;
       return;
    }
    public final void setMBubbleSecond(int p0){
       this.mBubbleSecond = p0;
    }
    public final void setMBubbleText(String p0){
       this.mBubbleText = p0;
    }
    public final void setMReport(JsonObject p0){
       this.mReport = p0;
    }
    public final void setMShowNow(boolean p0){
       this.mShowNow = p0;
    }
    public final void setMTipStyle(String p0){
       this.mTipStyle = p0;
    }
    public final void setMToastIcon(String p0){
       this.mToastIcon = p0;
    }
    public final void setMToastSubtitle(String p0){
       this.mToastSubtitle = p0;
    }
    public final void setMToastSubtitleColor(String p0){
       this.mToastSubtitleColor = p0;
    }
    public final void setMToastText(String p0){
       this.mToastText = p0;
    }
    public final void setMToastTitle(String p0){
       this.mToastTitle = p0;
    }
    public final void setMToastTitleColor(String p0){
       this.mToastTitleColor = p0;
    }
    public final void setMUserType(String p0){
       this.mUserType = p0;
    }
}
