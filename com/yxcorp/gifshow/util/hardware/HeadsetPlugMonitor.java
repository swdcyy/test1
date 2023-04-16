package com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import brd.t;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$a;
import erd.a;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$3;
import io.reactivex.g;
import java.lang.Boolean;
import o56.d;
import android.app.Application;
import o56.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.util.hardware.b;
import erd.g;
import com.yxcorp.gifshow.util.hardware.a;
import crd.b;

public class HeadsetPlugMonitor	// class@00133d
{
    public static Boolean a;
    public static b b;

    public static boolean a(){
       BluetoothAdapter defaultAdapt = BluetoothAdapter.getDefaultAdapter();
       boolean b = false;
       if (defaultAdapt != null && defaultAdapt.isEnabled()) {
          if (defaultAdapt.getState() != 12) {
             return b;
          }else if(defaultAdapt.getProfileConnectionState(2) != 2 && (defaultAdapt.getProfileConnectionState(1) == 2 || defaultAdapt.getProfileConnectionState(3) == 2)){
             b = true;
          }
       }
       return b;
    }
    public static t b(Context p0){
       return HeadsetPlugMonitor.c(p0, false);
    }
    public static t c(Context p0,boolean p1){
       AtomicReference uAtomicRefer = new AtomicReference();
       return HeadsetPlugMonitor.d(p0, p1, uAtomicRefer).doOnDispose(new HeadsetPlugMonitor$a(p0, uAtomicRefer));
    }
    public static t d(Context p0,boolean p1,AtomicReference p2){
       return t.create(new HeadsetPlugMonitor$3(p2, p1, p0));
    }
    public static Boolean e(){
       if (HeadsetPlugMonitor.b == null && d.a) {
          Context applicationC = a.b().getApplicationContext();
          if (applicationC != null) {
             HeadsetPlugMonitor.b = HeadsetPlugMonitor.c(applicationC, true).subscribeOn(d.c).doOnSubscribe(b.b).subscribe(a.b);
          }
       }
       return HeadsetPlugMonitor.a;
    }
}
