package com.kuaishou.android.model.mix.DetailStrongButtonConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class DetailStrongButtonConfig implements Serializable	// class@000c5b
{
    public int mAnimationShowAfterXSeconds;
    public int mBizType;
    public String mExtraParams;
    public String mRightIconUrl;
    public String mText;
    public String mUrl;

    public void DetailStrongButtonConfig(){
       super();
    }
    public boolean isValidate(){
       Object obj = PatchProxy.apply(null, this, DetailStrongButtonConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mText) && !TextUtils.isEmpty(this.mUrl))? true: false;
       return b;
    }
}
