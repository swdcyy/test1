package com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontDelayChangeActionV3;
import xvc.b;
import ood.d;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class TextDesignFontDelayChangeActionV3 extends b	// class@000c02
{
    public final boolean commit;
    public final boolean isSubtitle;
    public final Integer lastAlignType;
    public final String lastFontFileName;
    public final int layerIndex;
    public final int textLayerIndex;
    public final d textTemplateItem;

    public void TextDesignFontDelayChangeActionV3(int p0,boolean p1,d p2,String p3,Integer p4,int p5,boolean p6){
       a.p(p2, "textTemplateItem");
       super();
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.textTemplateItem = p2;
       this.lastFontFileName = p3;
       this.lastAlignType = p4;
       this.textLayerIndex = p5;
       this.commit = p6;
    }
    public void TextDesignFontDelayChangeActionV3(int p0,boolean p1,d p2,String p3,Integer p4,int p5,boolean p6,int p7,u p8){
       int i = (p7 & 0x20)? 0: p5;
       super(p0, p1, p2, p3, p4, i, p6);
       return;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final Integer getLastAlignType(){
       return this.lastAlignType;
    }
    public final String getLastFontFileName(){
       return this.lastFontFileName;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
    public final int getTextLayerIndex(){
       return this.textLayerIndex;
    }
    public final d getTextTemplateItem(){
       return this.textTemplateItem;
    }
    public final boolean isSubtitle(){
       return this.isSubtitle;
    }
}
