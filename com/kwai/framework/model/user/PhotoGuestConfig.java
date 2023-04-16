package com.kwai.framework.model.user.PhotoGuestConfig;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;

public class PhotoGuestConfig	// class@00170c
{
    public boolean mEnablePhotoViewerSwitch;
    public int mTimeRangeDays;

    public void PhotoGuestConfig(){
       super();
    }
    public boolean a(long p0){
       PhotoGuestConfig photoGuestCo = PhotoGuestConfig.class;
       if (PatchProxy.isSupport(photoGuestCo)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, photoGuestCo, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((System.currentTimeMillis() - p0) - TimeUnit.DAYS.toMillis((long)this.mTimeRangeDays) > 0)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoGuestConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PhotoGuestConfig{mEnablePhotoViewerSwitch="+this.mEnablePhotoViewerSwitch+", mTimeRangeDays="+this.mTimeRangeDays+'}';
    }
}
