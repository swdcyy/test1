package com.yxcorp.gifshow.v3.mixed.model.PlayStatus;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import yl8.b;

public class PlayStatus extends DefaultObservableAndSyncable	// class@001555
{
    public double mCurrentPosition;

    public void PlayStatus(){
       super();
    }
    public void onPlayTo(double p0){
       if (PatchProxy.isSupport(PlayStatus.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, PlayStatus.class, "1")) {
          return;
       }
       this.mCurrentPosition = p0;
       this.notifyChanged();
       return;
    }
    public void sync(PlayStatus p0){
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
