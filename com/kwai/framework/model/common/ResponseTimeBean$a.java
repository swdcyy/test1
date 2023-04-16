package com.kwai.framework.model.common.ResponseTimeBean$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import nsd.u;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.common.ResponseTimeBean;
import kotlin.jvm.internal.a;

public final class ResponseTimeBean$a implements Parcelable$Creator	// class@00168f
{

    public void ResponseTimeBean$a(){
       super();
    }
    public void ResponseTimeBean$a(u p0){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ResponseTimeBean responseTime = PatchProxy.applyOneRefs(p0, this, ResponseTimeBean$a.class, "1");
       if (responseTime != PatchProxyResult.class) {
       }else {
          a.p(p0, "parcel");
          responseTime = new ResponseTimeBean(p0);
       }
       return responseTime;
    }
    public Object[] newArray(int p0){
       ResponseTimeBean[] responseTime = new ResponseTimeBean[p0];
       return responseTime;
    }
}
