package com.yxcorp.gifshow.growth.model.GrowthWidgetBean$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.model.GrowthWidgetBean;

public class GrowthWidgetBean$a implements Parcelable$Creator	// class@001437
{

    public void GrowthWidgetBean$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       GrowthWidgetBean growthWidget = PatchProxy.applyOneRefs(p0, this, GrowthWidgetBean$a.class, "1");
       if (growthWidget != PatchProxyResult.class) {
       }else {
          growthWidget = new GrowthWidgetBean(p0);
       }
       return growthWidget;
    }
    public Object[] newArray(int p0){
       GrowthWidgetBean[] growthWidget = new GrowthWidgetBean[p0];
       return growthWidget;
    }
}
