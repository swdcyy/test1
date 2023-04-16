package com.yxcorp.gifshow.share.model.guide.ShareGuide;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import com.kuaishou.android.model.mix.PhotoGuide;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;
import com.yxcorp.gifshow.share.model.guide.ShareFloatGuide;
import com.yxcorp.gifshow.share.model.guide.ShareFinishGuide;
import com.kwai.robust.PatchProxyResult;
import mic.a;
import lnc.c3$b;
import lnc.c3;

public class ShareGuide implements Serializable	// class@001be8
{
    public Map mGuides;
    public int mMinPlayDurationInSeconds;
    public boolean mPhotoShareGuide;
    public int mPlayTimes;
    public ShareFloatGuide mShareFloatGuide;
    public int mTextDisplayDurationInSeconds;
    public static final long serialVersionUID = 0x873ee27e6571b8b7;

    public void ShareGuide(){
       super();
       this.mPlayTimes = 3;
       this.mMinPlayDurationInSeconds = 15;
       this.mTextDisplayDurationInSeconds = 4;
       this.mPhotoShareGuide = true;
       this.mGuides = new HashMap();
    }
    public static PhotoGuide lambda$getShareGuidePlatform$0(String p0,Map p1){
       if (!TextUtils.isEmpty(p0)) {
          PhotoGuide photoGuide = p1.get(p0);
          if (photoGuide != null) {
             return photoGuide;
          }
       }
       return p1.get("default");
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, ShareGuide.class, "1")) {
          return;
       }
       e uoe = new e(ShareGuide.class, "shareGuide", "shareGuide");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
    public int getFinishShareGuideType(){
       ShareGuide tmShareFloat = this.mShareFloatGuide;
       if (tmShareFloat != null) {
          ShareFloatGuide mShareFinish = tmShareFloat.mShareFinishGuide;
          if (mShareFinish != null) {
             return mShareFinish.panelType;
          }
       }
       return 0;
    }
    public PhotoGuide getShareGuidePlatform(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareGuide.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c3.a(this.mGuides, new a(p0));
    }
}
