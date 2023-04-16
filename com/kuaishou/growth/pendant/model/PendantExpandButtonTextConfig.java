package com.kuaishou.growth.pendant.model.PendantExpandButtonTextConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantExpandButtonTextConfig$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;

public final class PendantExpandButtonTextConfig implements Serializable	// class@000678
{
    public final String buttonAbsorbText;
    public final String buttonText;
    public final String buttonTextColor;
    public final int buttonTextSize;
    public final String expandClickLinkUrl;
    public final int expandClickType;
    public final boolean isFakeBold;
    public final int maxPlayAnimCount;
    public int measureTextHeight;
    public int measureTextWidth;
    public final List scaleAnimProperties;
    public final int viewAnimType;
    public final int viewHeight;
    public final int viewWidth;
    public static final PendantExpandButtonTextConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PendantExpandButtonTextConfig.Companion = new PendantExpandButtonTextConfig$a(null);
    }
    public void PendantExpandButtonTextConfig(String p0,String p1,String p2,int p3,boolean p4,int p5,int p6,int p7,int p8,List p9,int p10,String p11){
       super();
       this.buttonText = p0;
       this.buttonAbsorbText = p1;
       this.buttonTextColor = p2;
       this.buttonTextSize = p3;
       this.isFakeBold = p4;
       this.viewWidth = p5;
       this.viewHeight = p6;
       this.viewAnimType = p7;
       this.maxPlayAnimCount = p8;
       this.scaleAnimProperties = p9;
       this.expandClickType = p10;
       this.expandClickLinkUrl = p11;
    }
    public void PendantExpandButtonTextConfig(String p0,String p1,String p2,int p3,boolean p4,int p5,int p6,int p7,int p8,List p9,int p10,String p11,int p12,u p13){
       int i = p12;
       int i1 = (i & 0x0400)? 0: p10;
       String str = (i & 0x0800)? null: p11;
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, i1, str);
       return;
    }
    public final String getButtonAbsorbText(){
       return this.buttonAbsorbText;
    }
    public final String getButtonText(){
       return this.buttonText;
    }
    public final String getButtonTextColor(){
       return this.buttonTextColor;
    }
    public final int getButtonTextSize(){
       return this.buttonTextSize;
    }
    public final String getExpandClickLinkUrl(){
       return this.expandClickLinkUrl;
    }
    public final int getExpandClickType(){
       return this.expandClickType;
    }
    public final int getMaxPlayAnimCount(){
       return this.maxPlayAnimCount;
    }
    public final int getMeasureTextHeight(){
       return this.measureTextHeight;
    }
    public final int getMeasureTextWidth(){
       return this.measureTextWidth;
    }
    public final List getScaleAnimProperties(){
       return this.scaleAnimProperties;
    }
    public final int getViewAnimType(){
       return this.viewAnimType;
    }
    public final int getViewHeight(){
       return this.viewHeight;
    }
    public final int getViewWidth(){
       return this.viewWidth;
    }
    public final boolean isFakeBold(){
       return this.isFakeBold;
    }
    public final void setMeasureTextHeight(int p0){
       this.measureTextHeight = p0;
    }
    public final void setMeasureTextWidth(int p0){
       this.measureTextWidth = p0;
    }
}
