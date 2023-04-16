package com.yxcorp.gifshow.ad.dislike.DislikeHelper$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import cda.i;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import e17.i;

public final class DislikeHelper$a implements Runnable	// class@001737
{
    public final QPhoto b;

    public void DislikeHelper$a(QPhoto p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DislikeHelper$a.class, "1")) {
          return;
       }
       if (this.b.isLiveStream()) {
          a.d().k(new i(true, this.b.getLiveStreamId()));
          i.d(R.style.arg_RES_7f11066a, a.B.getString(R.string.arg_RES_7f100a66));
       }else {
          a.d().k(new i(false, this.b.getPhotoId()));
          i.d(R.style.arg_RES_7f11066a, a.B.getString(R.string.arg_RES_7f100a61));
       }
       return;
    }
}
