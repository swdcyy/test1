package com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class ReplaceTemplateData$ReplacePlayEndInfo implements Serializable	// class@000a78
{
    public String mMixLottieData;
    public boolean mShowEndOption;
    public String mTemplateId;
    public static final long serialVersionUID = 0x99a121841cea294e;

    public void ReplaceTemplateData$ReplacePlayEndInfo(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, ReplaceTemplateData$ReplacePlayEndInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mTemplateId) || !TextUtils.isEmpty(this.mMixLottieData))? true: false;
       return b;
    }
}
