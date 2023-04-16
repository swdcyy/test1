package com.kwai.chat.kwailink.data.ZtCommonInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.data.ZtCommonInfo;

public class ZtCommonInfo$a implements Parcelable$Creator	// class@000a4c
{

    public void ZtCommonInfo$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ZtCommonInfo ztCommonInfo = PatchProxy.applyOneRefs(p0, this, ZtCommonInfo$a.class, "1");
       if (ztCommonInfo != PatchProxyResult.class) {
       }else {
          ztCommonInfo = new ZtCommonInfo(p0);
       }
       return ztCommonInfo;
    }
    public Object[] newArray(int p0){
       ZtCommonInfo[] ztCommonInfo = new ZtCommonInfo[p0];
       return ztCommonInfo;
    }
}
