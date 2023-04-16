package com.yxcorp.gifshow.detail.startup.f;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.startup.e;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y95.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import i8c.a;

public class f extends ConfigAutoParseJsonConsumer	// class@001a10
{

    public void f(){
       super(e.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("device_bit", p0.mDeviceBit);
          uEditor.putLong("user_reco_bit", p0.mUserRecoBit);
          g.a(uEditor);
          RxBus.f.c(new a());
       }
       return;
    }
}
