package com.yxcorp.gifshow.camera.record.album.z;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.PostStartUpResponse;
import com.yxcorp.gifshow.camera.record.album.RecordAlbumActivity;
import lq.i;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$PostStartUpData;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$UserPhotoAlbumSelectModeInfo;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;

public final class z implements g	// class@001ce5
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final void accept(Object p0){
       if (i.h()) {
          i.m().Q("SHOOT_STARTUP_REQUESTED", Boolean.TRUE);
       }
       if (p0 != null && p0.a() != null) {
          p0 = p0.a();
          if (p0.h() != null) {
             p0 = p0.h();
             n.b().edit().putBoolean("isLowActiveUser", p0.isLowActiveUser);
             n.b().edit().putBoolean("isLastPhotoMultiSelectMode", p0.isLastPhotoMultiSelectMode);
             n.b().edit().putBoolean("isLastPhotoSingleSelectMode", p0.isLastPhotoSingleSelectMode);
          }
       }
       return;
    }
}
