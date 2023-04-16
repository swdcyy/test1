package com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import crd.b;
import lnc.b9;

public class LiveNewNoticeEntryDataModel$1 implements DefaultLifecycleObserver	// class@000b62
{
    public final LiveNewNoticeEntryDataModel b;

    public void LiveNewNoticeEntryDataModel$1(LiveNewNoticeEntryDataModel p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewNoticeEntryDataModel$1.class, "2")) {
          return;
       }
       b.Z(LiveLiteLogTag.SQUARE, "model on pause");
       LiveNewNoticeEntryDataModel$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LiveNewNoticeEntryDataModel.class, "3")) {
          b9.a(tb.d);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewNoticeEntryDataModel$1.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.SQUARE, "model on resume");
       LiveNewNoticeEntryDataModel d = this.b.d;
       if (d == null || d.isDisposed()) {
          this.b.a();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
