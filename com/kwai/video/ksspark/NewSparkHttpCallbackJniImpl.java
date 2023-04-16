package com.kwai.video.ksspark.NewSparkHttpCallbackJniImpl;
import com.kwai.video.ksspark.NewSparkHttpCallback;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class NewSparkHttpCallbackJniImpl implements NewSparkHttpCallback	// class@00092a
{
    public long nativeAddress;

    public void NewSparkHttpCallbackJniImpl(){
       super();
       this.nativeAddress = 0;
    }
    public native void onNativeResponse(long p0,int p1,String p2);
    public void onResponse(int p0,String p1){
       NewSparkHttpCallbackJniImpl newSparkHttp = NewSparkHttpCallbackJniImpl.class;
       if (PatchProxy.isSupport(newSparkHttp) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, newSparkHttp, "1")) {
          return;
       }
       newSparkHttp = this.nativeAddress;
       if (newSparkHttp) {
          this.onNativeResponse(newSparkHttp, p0, p1);
          this.nativeAddress = 0;
       }
       return;
    }
}
