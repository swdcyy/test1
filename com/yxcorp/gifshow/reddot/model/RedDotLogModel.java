package com.yxcorp.gifshow.reddot.model.RedDotLogModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;

public class RedDotLogModel implements Serializable	// class@0017cf
{
    public String mCombineType;
    public RedDotLogModelExtParams mExtraParams;
    public boolean mIsAnimation;
    public String mIsCombine;
    public int mLevel;
    public String mLocation;
    public int mShowNum;
    public int mStyle;
    public static final long serialVersionUID = 0x69869887346b3c17;

    public void RedDotLogModel(){
       super();
       this.mStyle = 1;
    }
    public void RedDotLogModel(String p0,int p1,int p2,boolean p3){
       super();
       int i = 1;
       this.mStyle = i;
       this.mLocation = p0;
       this.mLevel = p1;
       this.mShowNum = p2;
       if (p3) {
       }else {
          i = 2;
       }
       this.mStyle = i;
       return;
    }
    public void RedDotLogModel(String p0,int p1,int p2,boolean p3,boolean p4,String p5){
       super();
       int i = 1;
       this.mStyle = i;
       this.mLocation = p0;
       this.mLevel = p1;
       this.mShowNum = p2;
       if (p3) {
       }else {
          i = 2;
       }
       this.mStyle = i;
       p0 = (p4)? "TRUE": "FALSE";
       this.mIsCombine = p0;
       this.mCombineType = p5;
       return;
    }
    public void RedDotLogModel(String p0,int p1,boolean p2){
       super();
       int i = 1;
       this.mStyle = i;
       this.mLocation = p0;
       this.mShowNum = p1;
       if (p2) {
       }else {
          i = 2;
       }
       this.mStyle = i;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotLogModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mStyle != p0.mStyle || (this.mShowNum != p0.mShowNum || (this.mLevel != p0.mLevel || (!k.a(this.mLocation, p0.mLocation) || !k.a(this.mExtraParams, p0.mExtraParams))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, RedDotLogModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mStyle),Integer.valueOf(this.mShowNum),this.mLocation,this.mExtraParams,Integer.valueOf(this.mLevel)};
       return k.b(obj);
    }
    public boolean isDot(){
       boolean b = true;
       if (this.mStyle == b) {
       }else {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedDotLogModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
