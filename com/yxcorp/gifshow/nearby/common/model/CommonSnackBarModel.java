package com.yxcorp.gifshow.nearby.common.model.CommonSnackBarModel;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.common.model.CommonSnackBarModel$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CommonSnackBarModel implements Serializable	// class@002121
{
    public final List mButtons;
    public final long mDisplayTimeMs;
    public final int mId;
    public final String mMessage;
    public final int mType;
    public static final CommonSnackBarModel$a Companion;
    public static final long serialVersionUID;

    static {
       CommonSnackBarModel.Companion = new CommonSnackBarModel$a(null);
    }
    public void CommonSnackBarModel(){
       super(null, 0, null, 0, 0, 31, null);
    }
    public void CommonSnackBarModel(List p0,int p1,String p2,int p3,long p4){
       super();
       this.mButtons = p0;
       this.mId = p1;
       this.mMessage = p2;
       this.mType = p3;
       this.mDisplayTimeMs = p4;
    }
    public void CommonSnackBarModel(List p0,int p1,String p2,int p3,long p4,int p5,u p6){
       int i = 0;
       int i1 = (p5 & 0x01)? i: p0;
       int i2 = -1;
       int i3 = (p5 & 0x02)? -1: p1;
       if (!(p5 & 0x04)) {
          i = p2;
       }
       if (!(p5 & 0x08)) {
          i2 = p3;
       }
       if (p5 & 0x10) {
          p4 = -1;
       }
       super(i1, i3, i, i2, p4);
       return;
    }
    public static CommonSnackBarModel copy$default(CommonSnackBarModel p0,List p1,int p2,String p3,int p4,long p5,int p6,Object p7){
       CommonSnackBarModel mButtons;
       CommonSnackBarModel mId;
       CommonSnackBarModel mMessage;
       CommonSnackBarModel mType;
       CommonSnackBarModel mDisplayTime;
       if (p6 & 0x01) {
          mButtons = p0.mButtons;
       }
       if (p6 & 0x02) {
          mId = p0.mId;
       }
       p7 = mId;
       if (p6 & 0x04) {
          mMessage = p0.mMessage;
       }
       CommonSnackBarModel uCommonSnack = mMessage;
       if (p6 & 0x08) {
          mType = p0.mType;
       }
       CommonSnackBarModel uCommonSnack1 = mType;
       if (p6 & 0x10) {
          mDisplayTime = p0.mDisplayTimeMs;
       }
       return p0.copy(mButtons, p7, uCommonSnack, uCommonSnack1, mDisplayTime);
    }
    public final List component1(){
       return this.mButtons;
    }
    public final int component2(){
       return this.mId;
    }
    public final String component3(){
       return this.mMessage;
    }
    public final int component4(){
       return this.mType;
    }
    public final long component5(){
       return this.mDisplayTimeMs;
    }
    public final CommonSnackBarModel copy(List p0,int p1,String p2,int p3,long p4){
       Object obj;
       if (PatchProxy.isSupport(CommonSnackBarModel.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Integer.valueOf(p3),Long.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, CommonSnackBarModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CommonSnackBarModel uCommonSnack = new CommonSnackBarModel(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonSnackBarModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CommonSnackBarModel && (a.g(this.mButtons, p0.mButtons) && (this.mId == p0.mId && (a.g(this.mMessage, p0.mMessage) && (this.mType == p0.mType && !this.mDisplayTimeMs - p0.mDisplayTimeMs)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CommonSnackBarModel obj = PatchProxy.apply(null, this, CommonSnackBarModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mButtons;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.mId) * 31;
       CommonSnackBarModel tmMessage = this.mMessage;
       if (tmMessage != null) {
          i = tmMessage.hashCode();
       }
       CommonSnackBarModel tmDisplayTim = this.mDisplayTimeMs;
       return (((((i1 + i) * 31) + this.mType) * 31) + (int)(tmDisplayTim ^ (tmDisplayTim >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CommonSnackBarModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommonSnackBarModel\(mButtons="+this.mButtons+", mId="+this.mId+", mMessage="+this.mMessage+", mType="+this.mType+", mDisplayTimeMs="+this.mDisplayTimeMs+"\)";
    }
}
