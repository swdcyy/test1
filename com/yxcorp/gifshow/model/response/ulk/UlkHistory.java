package com.yxcorp.gifshow.model.response.ulk.UlkHistory;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class UlkHistory implements Serializable	// class@001f9b
{
    public String mAndroidId;
    public String mDid;
    public String mImei;
    public String mOaid;
    public static final long serialVersionUID = 0xab1bc9f54e7b03af;

    public void UlkHistory(){
       super();
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, UlkHistory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mDid) && !TextUtils.isEmpty(this.mOaid))? true: false;
       return b;
    }
    public void update(UlkHistory p0){
       if (p0 == null) {
          return;
       }
       this.mDid = p0.mDid;
       this.mOaid = p0.mOaid;
       this.mImei = p0.mImei;
       this.mAndroidId = p0.mAndroidId;
       return;
    }
}
