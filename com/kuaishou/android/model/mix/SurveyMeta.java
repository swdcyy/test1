package com.kuaishou.android.model.mix.SurveyMeta;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zp.b0;
import java.util.Map;
import java.util.HashMap;

public class SurveyMeta implements Serializable, g	// class@000e0c
{
    public String mAction;
    public String mBackgroundImage;
    public String mButtonText;
    public String mCheckedSurveyId;
    public List mCheckedSurveyIds;
    public int mCoverHeight;
    public long mCreateTime;
    public String mDescription;
    public String mIconUrl;
    public String mLinkUrl;
    public String mMultipleSelectToast;
    public String mSubAction;
    public String mSubTitle;
    public int mSurveyCoverStatus;
    public String mSurveyId;
    public List mSurveyReasons;
    public int mSurveyType;
    public String mTitle;
    public User mUser;
    public static final long serialVersionUID = 0xf175443c33490349;

    public void SurveyMeta(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SurveyMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SurveyMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SurveyMeta.class, new b0());
       }else {
          obj.put(SurveyMeta.class, null);
       }
       return obj;
    }
}
