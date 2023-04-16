package com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.tuna.button.ActionParams;
import java.lang.Integer;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import ma6.a;

public class TunaButtonModel implements Serializable	// class@0016cf
{
    public a b;
    public ActionParams mActionParams;
    public int mActionType;
    public String mIcon;
    public CDNUrl[] mIconUrls;
    public boolean mNeedLogin;
    public TunaStatisticModel mStatisticModel;
    public String mText;
    public static final long serialVersionUID = 0xd6cadddf1e7725df;

    public void TunaButtonModel(){
       super();
       this.b = null;
    }
    public static TunaButtonModel simplePhoneInfo(PhoneInfoModel p0){
       ActionParams obj = PatchProxy.applyOneRefs(p0, null, TunaButtonModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ActionParams();
       obj.mPhoneInfoModel = p0;
       TunaButtonModel tunaButtonMo = new TunaButtonModel();
       tunaButtonMo.mActionType = 2;
       tunaButtonMo.mActionParams = obj;
       return tunaButtonMo;
    }
    public static TunaButtonModel simpleUrl(String p0,int p1){
       JumpUrlModel obj;
       if (PatchProxy.isSupport(TunaButtonModel.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, TunaButtonModel.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new JumpUrlModel();
       obj.mUrl = p0;
       obj.mOpenType = p1;
       ActionParams uActionParam = new ActionParams();
       uActionParam.mJumpUrlModel = obj;
       TunaButtonModel tunaButtonMo = new TunaButtonModel();
       tunaButtonMo.mActionType = 1;
       tunaButtonMo.mActionParams = uActionParam;
       return tunaButtonMo;
    }
    public static TunaButtonModel url(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TunaButtonModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TunaButtonModel.simpleUrl(p0, 2);
    }
    public String getJumpUrl(){
       TunaButtonModel tmActionPara = this.mActionParams;
       if (tmActionPara != null) {
          ActionParams mJumpUrlMode = tmActionPara.mJumpUrlModel;
          if (mJumpUrlMode != null) {
             return mJumpUrlMode.mUrl;
          }
       }
       return null;
    }
    public a getTrackModel(){
       Object obj = PatchProxy.apply(null, this, TunaButtonModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.resetTrackModel();
       }
       return this.b;
    }
    public void resetTrackModel(){
       if (PatchProxy.applyVoid(null, this, TunaButtonModel.class, "5")) {
          return;
       }
       a uoa = new a();
       this.b = uoa;
       uoa.mActionType = this.mActionType;
       uoa.mNeedLogin = this.mNeedLogin;
       return;
    }
}
