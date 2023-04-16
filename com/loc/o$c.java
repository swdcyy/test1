package com.loc.o$c;
import android.content.ServiceConnection;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.loc.x;
import java.security.MessageDigest;
import java.lang.StringBuffer;
import java.lang.Integer;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.Parcel;
import com.loc.o;
import java.lang.Throwable;
import com.loc.ak;

public final class o$c implements ServiceConnection	// class@00145d
{
    public Context b;
    public int c;
    public static String a;

    public void o$c(Context p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final String a(){
       if (!TextUtils.isEmpty(o$c.a)) {
          return o$c.a;
       }
       int i = 0;
       byte[] uobyteArray = MessageDigest.getInstance(x.c("IU0hBMQ")).digest(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64).signatures[i].toByteArray());
       StringBuffer str = "";
       for (; i < uobyteArray.length; i = i + 1) {
          int i1 = uobyteArray[i] & 0x00ff;
          i1 = i1 | 0x0100;
          str = str+(Integer.toHexString(i1)).substring(1, 3);
       }
       String str1 = str;
       if (!TextUtils.isEmpty(str1)) {
          o$c.a = str1;
       }
       return str1;
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       String str;
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       o$c tc = this.c;
       if (tc != 2) {
          if (tc != 4) {
             if (tc != 5) {
                tc = 0;
             label_004c :
                if (tc) {
                   p1.transact(1, parcel, parcel1, 0);
                   parcel1.readException();
                   o.b(parcel1.readString());
                }
                parcel1.recycle();
                parcel.recycle();
                return;
             }else {
                parcel.writeInterfaceToken(x.c("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                parcel.writeString(this.b.getPackageName());
                parcel.writeString(this.a());
                parcel.writeString(x.c("IT1VJRA"));
             label_004b :
                tc = 1;
                goto label_004c ;
             }
          }else {
             str = x.c("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ");
          }
       }else {
          str = x.c("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U");
       }
       parcel.writeInterfaceToken(str);
       goto label_004b ;
    }
    public final void onServiceDisconnected(ComponentName p0){
    }
}
