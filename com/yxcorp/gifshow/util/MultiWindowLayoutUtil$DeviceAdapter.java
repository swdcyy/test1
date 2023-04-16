package com.yxcorp.gifshow.util.MultiWindowLayoutUtil$DeviceAdapter;
import java.lang.Enum;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil$DeviceAdapter$1;
import java.lang.String;
import lnc.z4;
import android.view.View;
import java.lang.Class;
import java.lang.Object;

public class MultiWindowLayoutUtil$DeviceAdapter extends Enum	// class@001efd
{
    public static final MultiWindowLayoutUtil$DeviceAdapter[] $VALUES;
    public static final MultiWindowLayoutUtil$DeviceAdapter HUA_WEI;

    static {
       MultiWindowLayoutUtil$DeviceAdapter$1 uDeviceAdapt = new MultiWindowLayoutUtil$DeviceAdapter$1("HUA_WEI", 0);
       MultiWindowLayoutUtil$DeviceAdapter.HUA_WEI = uDeviceAdapt;
       MultiWindowLayoutUtil$DeviceAdapter[] uDeviceAdapt1 = new MultiWindowLayoutUtil$DeviceAdapter[]{uDeviceAdapt};
       MultiWindowLayoutUtil$DeviceAdapter.$VALUES = uDeviceAdapt1;
    }
    public void MultiWindowLayoutUtil$DeviceAdapter(String p0,int p1){
       super(p0, p1);
    }
    public void MultiWindowLayoutUtil$DeviceAdapter(String p0,int p1,z4 p2){
       super(p0, p1);
    }
    public static int adaptDeviceOffset(View p0){
       object oobject;
       MultiWindowLayoutUtil$DeviceAdapter[] uDeviceAdapt = MultiWindowLayoutUtil$DeviceAdapter.values();
       int len = uDeviceAdapt.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return 0;
          }
          oobject = uDeviceAdapt[i];
          if (oobject.isAvailable(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject.getOffset();
    }
    public static MultiWindowLayoutUtil$DeviceAdapter valueOf(String p0){
       return Enum.valueOf(MultiWindowLayoutUtil$DeviceAdapter.class, p0);
    }
    public static MultiWindowLayoutUtil$DeviceAdapter[] values(){
       return MultiWindowLayoutUtil$DeviceAdapter.$VALUES.clone();
    }
    public int getOffset(){
       return 0;
    }
    public boolean isAvailable(View p0){
       return false;
    }
}
