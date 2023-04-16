package com.yxcorp.gifshow.growth.model.EncourageBean$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.model.EncourageBean;

public class EncourageBean$a implements Parcelable$Creator	// class@001431
{

    public void EncourageBean$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       EncourageBean uEncourageBe = PatchProxy.applyOneRefs(p0, this, EncourageBean$a.class, "1");
       if (uEncourageBe != PatchProxyResult.class) {
       }else {
          uEncourageBe = new EncourageBean(p0);
       }
       return uEncourageBe;
    }
    public Object[] newArray(int p0){
       EncourageBean[] uEncourageBe = new EncourageBean[p0];
       return uEncourageBe;
    }
}
