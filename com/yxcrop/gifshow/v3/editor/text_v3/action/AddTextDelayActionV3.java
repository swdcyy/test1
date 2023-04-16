package com.yxcrop.gifshow.v3.editor.text_v3.action.AddTextDelayActionV3;
import xvc.b;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class AddTextDelayActionV3 extends b	// class@000bf9
{
    public final int assetSize;
    public final double currentTime;
    public final String defaultText;
    public final double duration;
    public final boolean isAddFirstText;
    public final boolean isCommit;
    public final boolean isDesignTemplateFromSp;
    public final boolean isOriginPhotoMovie;
    public final Integer lastAlignType;
    public final Integer lastColor;
    public final String lastFontFileName;
    public final String lastMaterialId;

    public void AddTextDelayActionV3(boolean p0,int p1,boolean p2,double p3,double p4,String p5,boolean p6,boolean p7,String p8,String p9,Integer p10,Integer p11){
       a.p(p5, "defaultText");
       super();
       this.isOriginPhotoMovie = p0;
       this.assetSize = p1;
       this.isDesignTemplateFromSp = p2;
       this.currentTime = p3;
       this.duration = p4;
       this.defaultText = p5;
       this.isAddFirstText = p6;
       this.isCommit = p7;
       this.lastMaterialId = p8;
       this.lastFontFileName = p9;
       this.lastColor = p10;
       this.lastAlignType = p11;
    }
    public void AddTextDelayActionV3(boolean p0,int p1,boolean p2,double p3,double p4,String p5,boolean p6,boolean p7,String p8,String p9,Integer p10,Integer p11,int p12,u p13){
       int i = p12;
       boolean b = (i & 0x01)? false: p0;
       String str = (i & 0x20)? "": p5;
       boolean b1 = (i & 0x40)? false: p6;
       boolean b2 = (i & 0x0080)? true: p7;
       String str1 = (i & 0x0100)? null: p8;
       super(b, p1, p2, p3, p4, str, b1, b2, str1, p9, p10, p11);
       return;
    }
    public final int getAssetSize(){
       return this.assetSize;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final String getDefaultText(){
       return this.defaultText;
    }
    public final double getDuration(){
       return this.duration;
    }
    public final Integer getLastAlignType(){
       return this.lastAlignType;
    }
    public final Integer getLastColor(){
       return this.lastColor;
    }
    public final String getLastFontFileName(){
       return this.lastFontFileName;
    }
    public final String getLastMaterialId(){
       return this.lastMaterialId;
    }
    public final boolean isAddFirstText(){
       return this.isAddFirstText;
    }
    public final boolean isCommit(){
       return this.isCommit;
    }
    public final boolean isDesignTemplateFromSp(){
       return this.isDesignTemplateFromSp;
    }
    public final boolean isOriginPhotoMovie(){
       return this.isOriginPhotoMovie;
    }
}
