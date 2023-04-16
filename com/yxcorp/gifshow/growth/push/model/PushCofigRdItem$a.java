package com.yxcorp.gifshow.growth.push.model.PushCofigRdItem$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.push.model.PushCofigRdItem;

public class PushCofigRdItem$a implements Parcelable$Creator	// class@00149e
{

    public void PushCofigRdItem$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       PushCofigRdItem pushCofigRdI = PatchProxy.applyOneRefs(p0, this, PushCofigRdItem$a.class, "1");
       if (pushCofigRdI != PatchProxyResult.class) {
       }else {
          pushCofigRdI = new PushCofigRdItem(p0);
       }
       return pushCofigRdI;
    }
    public Object[] newArray(int p0){
       PushCofigRdItem[] pushCofigRdI = new PushCofigRdItem[p0];
       return pushCofigRdI;
    }
}
