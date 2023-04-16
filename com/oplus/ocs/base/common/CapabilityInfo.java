package com.oplus.ocs.base.common.CapabilityInfo;
import android.os.Parcelable;
import com.oplus.ocs.base.common.CapabilityInfo$1;
import android.os.Parcel;
import java.lang.Object;
import com.oplus.ocs.base.common.Feature;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.ArrayList;
import com.oplus.ocs.base.common.AuthResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import com.oplus.ocs.base.utils.c;
import android.os.IBinder;
import java.util.List;

public class CapabilityInfo implements Parcelable	// class@000ab5
{
    public List a;
    public int b;
    public AuthResult c;
    public IBinder d;
    public String mClassName;
    public static final Parcelable$Creator CREATOR;

    static {
       CapabilityInfo.CREATOR = new CapabilityInfo$1();
    }
    public void CapabilityInfo(Parcel p0){
       super();
       this.a = p0.readArrayList(Feature.class.getClassLoader());
       this.b = p0.readInt();
       ClassLoader classLoader = AuthResult.class.getClassLoader();
       String name = (TextUtils.isEmpty(this.mClassName))? AuthResult.class.getName(): this.mClassName;
       this.c = c.a(p0, classLoader, name);
       this.d = p0.readStrongBinder();
       return;
    }
    public void CapabilityInfo(List p0,int p1,AuthResult p2){
       super(p0, p1, p2, null);
    }
    public void CapabilityInfo(List p0,int p1,AuthResult p2,IBinder p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public int describeContents(){
       return 0;
    }
    public AuthResult getAuthResult(){
       return this.c;
    }
    public IBinder getBinder(){
       return this.d;
    }
    public String getClassName(){
       return this.mClassName;
    }
    public List getFeatures(){
       return this.a;
    }
    public int getVersion(){
       return this.b;
    }
    public void setBinder(IBinder p0){
       this.d = p0;
    }
    public void setClassName(String p0){
       this.mClassName = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeList(this.a);
       p0.writeInt(this.b);
       CapabilityInfo tc = this.c;
       String name = (TextUtils.isEmpty(this.mClassName))? AuthResult.class.getName(): this.mClassName;
       c.a(p0, tc, name);
       p0.writeStrongBinder(this.d);
       return;
    }
}
