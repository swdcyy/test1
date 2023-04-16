package com.kwai.framework.model.tuna.button.JumpUrlModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.framework.model.tuna.button.ActionParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class JumpUrlModel implements Serializable	// class@0016cb
{
    public boolean mAllowH5Download;
    public HashMap mExtMap;
    public String mHalfScreenMaskState;
    public float mHeightRatio;
    public String mKrnUrl;
    public String mLiteKrnUrl;
    public boolean mNeedLoadingView;
    public int mOpenType;
    public List mThirdPartyWhiteList;
    public String mTkUrl;
    public String mUrl;
    public String mWebThemeType;
    public static final long serialVersionUID = 0xa31f083e7df029ce;

    public void JumpUrlModel(){
       super();
       this.mAllowH5Download = false;
       this.mNeedLoadingView = false;
       this.mHalfScreenMaskState = null;
       this.mExtMap = new HashMap();
    }
    public static void setNeedLoadingView(ActionParams p0,boolean p1){
       if (PatchProxy.isSupport(JumpUrlModel.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, JumpUrlModel.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.mJumpUrlModel;
          if (p0 != null) {
             p0.setNeedLoadingView(p1);
          }
       }
       return;
    }
    public static void setWebThemType(ActionParams p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JumpUrlModel.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.mJumpUrlModel;
          if (p0 != null) {
             p0.setWebThemeType(p1);
          }
       }
       return;
    }
    public boolean checkValid(){
       Object obj = PatchProxy.apply(null, this, JumpUrlModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mUrl) ^ 0x01);
    }
    public boolean getIsHiddenHalfScreenMask(boolean p0){
       JumpUrlModel obj;
       if (PatchProxy.isSupport(JumpUrlModel.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, JumpUrlModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mHalfScreenMaskState;
       if (obj != null) {
          p0 = obj.equals("visible");
       }
       return p0;
    }
    public void setHideHalfScreenMask(boolean p0){
       String str = (p0)? "visible": "invisible";
       this.mHalfScreenMaskState = str;
       return;
    }
    public void setNeedLoadingView(boolean p0){
       this.mNeedLoadingView = p0;
    }
    public void setWebThemeType(String p0){
       this.mWebThemeType = p0;
    }
}
