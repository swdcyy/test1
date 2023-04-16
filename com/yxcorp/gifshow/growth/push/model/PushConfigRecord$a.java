package com.yxcorp.gifshow.growth.push.model.PushConfigRecord$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.push.model.PushConfigRecord;

public class PushConfigRecord$a implements Parcelable$Creator	// class@0014a0
{

    public void PushConfigRecord$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       PushConfigRecord pushConfigRe = PatchProxy.applyOneRefs(p0, this, PushConfigRecord$a.class, "1");
       if (pushConfigRe != PatchProxyResult.class) {
       }else {
          pushConfigRe = new PushConfigRecord(p0);
       }
       return pushConfigRe;
    }
    public Object[] newArray(int p0){
       PushConfigRecord[] pushConfigRe = new PushConfigRecord[p0];
       return pushConfigRe;
    }
}
