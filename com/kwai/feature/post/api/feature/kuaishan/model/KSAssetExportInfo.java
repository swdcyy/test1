package com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import java.io.Serializable;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class KSAssetExportInfo implements Serializable	// class@0013a2
{
    public List mAssetExportSizeList;
    public String mRefId;
    public float mScale;
    public String mServerEffect;
    public int mTemplateGrade;
    public String mTemplateId;
    public int mVideoHeight;
    public int mVideoWidth;
    public List mVisibleTimeList;
    public static final long serialVersionUID = 0xaddd6e54e171f030;

    public void KSAssetExportInfo(int p0,int p1,List p2,List p3,String p4,float p5,String p6,String p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, 0);
    }
    public void KSAssetExportInfo(int p0,int p1,List p2,List p3,String p4,float p5,String p6,String p7,int p8){
       super();
       this.mScale = 0x3f800000;
       this.mVideoWidth = p0;
       this.mVideoHeight = p1;
       this.mVisibleTimeList = p2;
       this.mAssetExportSizeList = p3;
       this.mRefId = p4;
       this.mScale = p5;
       this.mServerEffect = p6;
       this.mTemplateId = p7;
       this.mTemplateGrade = p8;
    }
    public int infoNum(){
       Object obj = PatchProxy.apply(null, this, KSAssetExportInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.isValid()) {
          return 0;
       }
       return this.mAssetExportSizeList.size();
    }
    public boolean isValid(){
       KSAssetExportInfo obj = PatchProxy.apply(null, this, KSAssetExportInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAssetExportSizeList;
       boolean b = (obj != null && (this.mVisibleTimeList != null && obj.size() == this.mVisibleTimeList.size()))? true: false;
       return b;
    }
    public boolean needServerSupport(){
       KSAssetExportInfo obj = PatchProxy.apply(null, this, KSAssetExportInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mServerEffect;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
}
