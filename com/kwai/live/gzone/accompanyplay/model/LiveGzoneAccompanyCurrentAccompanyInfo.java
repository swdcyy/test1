package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCurrentAccompanyInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveGzoneAccompanyCurrentAccompanyInfo implements Serializable	// class@000c2c
{
    public String mAccompanyId;
    public int mAccompanyStatus;
    public static final long serialVersionUID = 0x223d94cdd6e6fe4;

    public void LiveGzoneAccompanyCurrentAccompanyInfo(){
       super();
    }
    public boolean isCreatingState(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyCurrentAccompanyInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mAccompanyId) && (!("0").equals(this.mAccompanyId) && this.mAccompanyStatus == null))? true: false;
       return b;
    }
    public boolean isInitState(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyCurrentAccompanyInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.x(this.mAccompanyId) || ("0").equals(this.mAccompanyId))? true: false;
       return b;
    }
}
