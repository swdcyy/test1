package com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Boolean;

public class AICutStyle implements Serializable	// class@00194a
{
    public String mCheckSum;
    public String mColor;
    public List mCoverUrls;
    public boolean mIsNew;
    public String mLocalDir;
    public double mLyricPositionX;
    public double mLyricPositionY;
    public String mLyricStyleId;
    public String mMetaData;
    public final List mMusics;
    public String mName;
    public List mResourceUrls;
    public String mStyleId;
    public int mVersion;
    public static final long serialVersionUID = 0x900ba98c7f4c5220;

    public void AICutStyle(){
       super();
       this.mStyleId = "-1";
       this.mName = "";
       this.mCheckSum = "";
       this.mColor = "000000";
       this.mMusics = new ArrayList();
       this.mLyricStyleId = "";
       this.mLyricPositionX = 0x3fe0000000000000;
       this.mLyricPositionY = 0x3fe6666666666666;
       this.mLocalDir = "";
    }
    public static boolean isOriginStyleId(String p0){
       boolean b = (p0 == "-1" || p0 == "-3")? true: false;
       return b;
    }
    public static AICutStyle newEmptyStyle(){
       AICutStyle obj = PatchProxy.apply(null, null, AICutStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AICutStyle();
       obj.mStyleId = "-1";
       return obj;
    }
    public String getId(){
       return this.mStyleId;
    }
    public double getLyricPositionX(){
       AICutStyle tmLyricPosit = this.mLyricPositionX;
       if (!tmLyricPosit) {
          tmLyricPosit = 0x3fe0000000000000;
       }
       return tmLyricPosit;
    }
    public double getLyricPositionY(){
       AICutStyle tmLyricPosit = this.mLyricPositionY;
       if (!tmLyricPosit) {
          tmLyricPosit = 0x3fe6666666666666;
       }
       return tmLyricPosit;
    }
    public String getMetaData(){
       return this.mMetaData;
    }
    public List getResourceUrls(){
       return this.mResourceUrls;
    }
    public String getUniqueIdentifier(){
       Object obj = PatchProxy.apply(null, this, AICutStyle.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mStyleId+"+"+this.mCheckSum;
    }
    public boolean isBad(){
       boolean b;
       AICutStyle obj = PatchProxy.apply(null, this, AICutStyle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!(this.mStyleId).isEmpty()) {
          obj = this.mCheckSum;
          if (obj != null && !obj.isEmpty()) {
             b = false;
          label_002a :
             return b;
          }
       }
       b = true;
       goto label_002a ;
    }
    public boolean isOriginId(){
       AICutStyle tmStyleId = this.mStyleId;
       boolean b = (tmStyleId == "-1" || tmStyleId == "-3")? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AICutStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "style [styleId="+this.mStyleId+", mName="+this.mName+", mCheckSum="+this.mCheckSum+"]";
    }
}
