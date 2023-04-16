package com.yxcorp.gifshow.reddot.model.RedDot;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import xr4.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import ok.j$b;
import ok.j$a;
import java.util.Collection;
import ekd.q;

public class RedDot implements Serializable, a	// class@0017cd
{
    public List mChildren;
    public String mData;
    public String mExtParams;
    public int mLevel;
    public int mMenuBarShownCount;
    public boolean mMenuShow;
    public RedDot mParent;
    public int mPriority;
    public boolean mRealShow;
    public int mRedDotType;
    public RedDot mRoot;
    public boolean mShownInMenuBar;
    public boolean mSpecial;
    public long mTotal;
    public int mTypeValue;
    public long mUpdateTime;
    public long mUserId;
    public long mWaterline;
    public static final long serialVersionUID = 0xe126b827332e475f;

    public void RedDot(int p0,long p1){
       super();
       this.mPriority = Integer.MAX_VALUE;
       this.mTypeValue = p0;
       this.mUserId = p1;
    }
    public static RedDot copyFromProto(a$a p0){
       Object obj = null;
       RedDot obj1 = PatchProxy.applyOneRefs(p0, obj, RedDot.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new RedDot(p0.b, p0.a);
       obj1.mUserId = p0.a;
       obj1.mRedDotType = p0.b;
       obj1.mTypeValue = p0.g;
       obj1.mSpecial = p0.j;
       obj1.mUpdateTime = p0.h;
       obj1.mTotal = p0.c;
       obj1.mWaterline = p0.d;
       obj1.mData = p0.e;
       obj1.mExtParams = p0.f;
       obj1.mShownInMenuBar = p0.i;
       obj1.mMenuBarShownCount = p0.k;
       return obj1;
    }
    public static a$a from(RedDot p0){
       a$a obj = PatchProxy.applyOneRefs(p0, null, RedDot.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.a = p0.mUserId;
       obj.d = p0.mWaterline;
       obj.c = p0.mTotal;
       obj.b = p0.mRedDotType;
       obj.g = p0.mTypeValue;
       obj.h = p0.mUpdateTime;
       obj.k = p0.mMenuBarShownCount;
       obj.j = p0.mSpecial;
       obj.i = p0.mShownInMenuBar;
       obj.e = p0.mData;
       obj.f = p0.mExtParams;
       return obj;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RedDot.class, "3")) {
          return;
       }
       if (this.mSpecial != null) {
          this.mPriority = 0;
       }
       if (this.mMenuBarShownCount < null) {
          this.mMenuBarShownCount = 0;
       }
       if (this.mChildren == null) {
          this.mChildren = new ArrayList();
       }
       return;
    }
    public RedDot cloneWithDotData(){
       RedDot obj = PatchProxy.apply(null, this, RedDot.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RedDot(this.mTypeValue, this.mUserId);
       obj.mRedDotType = this.mRedDotType;
       obj.mUpdateTime = this.mUpdateTime;
       obj.mTotal = this.mTotal;
       obj.mWaterline = this.mWaterline;
       obj.mData = this.mData;
       obj.mExtParams = this.mExtParams;
       obj.mShownInMenuBar = this.mShownInMenuBar;
       obj.mMenuBarShownCount = this.mMenuBarShownCount;
       obj.mRealShow = this.mRealShow;
       obj.mMenuShow = this.mMenuShow;
       obj.mPriority = this.mPriority;
       obj.mLevel = this.mLevel;
       return obj;
    }
    public void hide(){
       this.mRealShow = false;
    }
    public boolean isShown(){
       if (this.mRealShow == null) {
          return false;
       }
       RedDot tmParent = this.mParent;
       while (true) {
          if (tmParent == null) {
             return true;
          }
          if (tmParent.mRealShow == null) {
             break ;
          }else {
             tmParent = tmParent.mParent;
          }
       }
       return false;
    }
    public boolean isSpecial(){
       boolean b = (this.mSpecial != null || this.mPriority == null)? true: false;
       return b;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, RedDot.class, "1")) {
          return;
       }
       this.reset(this.mUserId);
       return;
    }
    public void reset(long p0){
       this.mUpdateTime = 0;
       this.mData = "";
       this.mExtParams = "";
       this.mShownInMenuBar = false;
       this.mMenuShow = false;
       this.mSpecial = false;
       this.mMenuBarShownCount = 0;
       this.mWaterline = 0;
       this.mTotal = 0;
       this.mPriority = Integer.MAX_VALUE;
       this.mUserId = p0;
    }
    public String toString(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RedDot.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       j$b uob = new j$b(this.getClass().getSimpleName(), objArray);
       uob.a("type", this.mTypeValue);
       uob.a("level", this.mLevel);
       uob.d("v", this.mRealShow);
       uob.a("pri", this.mPriority);
       uob.b("count", (this.mTotal - this.mWaterline));
       uob.d("menu", this.mShownInMenuBar);
       uob.a("mc", this.mMenuBarShownCount);
       uob.b("t", this.mUpdateTime);
       int i = 1;
       if (this.mLevel == i) {
          uob.d("ms", this.mMenuShow);
       }
       if (this.isSpecial()) {
          uob.a("s", i);
       }
       if (!q.f(this.mChildren)) {
          uob.c("cls", this.mChildren.toString());
       }
       return uob.toString();
    }
}
