package com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeConfigExtra;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectDataModel$DisplayConfig;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class HighlightTimeConfigExtra implements Serializable	// class@000f4b
{
    public final String defaultText;
    public final EffectDataModel$DisplayConfig displayConfig;
    public final int highlightType;
    public final String statisticsName;
    public final int type;
    public final int uploadImageMaxWidthLimit;

    public void HighlightTimeConfigExtra(){
       super(0, null, null, null, 0, 0, 63, null);
    }
    public void HighlightTimeConfigExtra(int p0,String p1,EffectDataModel$DisplayConfig p2,String p3,int p4,int p5){
       a.p(p1, "statisticsName");
       a.p(p2, "displayConfig");
       a.p(p3, "defaultText");
       super();
       this.type = p0;
       this.statisticsName = p1;
       this.displayConfig = p2;
       this.defaultText = p3;
       this.uploadImageMaxWidthLimit = p4;
       this.highlightType = p5;
    }
    public void HighlightTimeConfigExtra(int p0,String p1,EffectDataModel$DisplayConfig p2,String p3,int p4,int p5,int p6,u p7){
       if (p6 & 0x01) {
          p0 = 4;
       }
       String str = "";
       String str1 = (p6 & 0x02)? str: p1;
       if (p6 & 0x04) {
          p2 = new EffectDataModel$DisplayConfig();
       }
       EffectDataModel$DisplayConfig uDisplayConf = p2;
       if (!(p6 & 0x08)) {
          str = p3;
       }
       int i = (p6 & 0x10)? 1080: p4;
       int i1 = (p6 & 0x20)? 0: p5;
       super(p0, str1, uDisplayConf, str, i, i1);
       return;
    }
    public final String getDefaultText(){
       return this.defaultText;
    }
    public final EffectDataModel$DisplayConfig getDisplayConfig(){
       return this.displayConfig;
    }
    public final int getHighlightType(){
       return this.highlightType;
    }
    public final String getStatisticsName(){
       return this.statisticsName;
    }
    public final int getType(){
       return this.type;
    }
    public final int getUploadImageMaxWidthLimit(){
       return this.uploadImageMaxWidthLimit;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeConfigExtra.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HighlightTimeConfigExtra\(type="+this.type+", statisticsName=\'"+this.statisticsName+"\', "+"displayConfig="+this.displayConfig+", defaultText=\'"+this.defaultText+"\', "+"uploadImageMaxWidthLimit="+this.uploadImageMaxWidthLimit+", highlightType="+this.highlightType+')';
    }
}
