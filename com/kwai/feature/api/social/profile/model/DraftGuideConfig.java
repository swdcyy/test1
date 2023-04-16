package com.kwai.feature.api.social.profile.model.DraftGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class DraftGuideConfig implements Serializable	// class@000af7
{
    public String mIcon;
    public String mTitlePrefix;
    public String mTitleSuffix;
    public static final long serialVersionUID = 0x8d39634822848faa;

    public void DraftGuideConfig(){
       super();
    }
    public boolean isIconValid(){
       Object obj = PatchProxy.apply(null, this, DraftGuideConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.mIcon) ^ 0x01);
    }
    public boolean isTitleValid(){
       Object obj = PatchProxy.apply(null, this, DraftGuideConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mTitleSuffix) && !TextUtils.isEmpty(this.mTitlePrefix))? true: false;
       return b;
    }
}
