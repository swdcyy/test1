package com.RNFetchBlob.RNFetchBlob$c;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.RNFetchBlob.b;
import android.os.StatFs;
import java.io.File;
import android.os.Environment;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class RNFetchBlob$c implements Runnable	// class@000d4c
{
    public final Callback b;
    public final RNFetchBlob c;

    public void RNFetchBlob$c(RNFetchBlob p0,Callback p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
       writableMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
       statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
       writableMap.putString("external_free", String.valueOf(statFs.getFreeBytes()));
       writableMap.putString("external_total", String.valueOf(statFs.getTotalBytes()));
       Object[] objArray = new Object[]{null,writableMap};
       this.b.invoke(objArray);
    }
}
