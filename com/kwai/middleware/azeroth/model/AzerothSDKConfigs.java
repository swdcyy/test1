package com.kwai.middleware.azeroth.model.AzerothSDKConfigs;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.model.AzerothSDKConfigs$b;
import nsd.u;
import com.kwai.middleware.azeroth.model.AzerothSDKConfigs$a;
import com.kwai.middleware.azeroth.model.AzerothHosts;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ClassLoader;
import java.lang.Class;

public final class AzerothSDKConfigs implements Parcelable	// class@000f02
{
    public AzerothHosts config;
    public static final Parcelable$Creator CREATOR;
    public static final AzerothSDKConfigs$b b;

    static {
       AzerothSDKConfigs.b = new AzerothSDKConfigs$b(null);
       AzerothSDKConfigs.CREATOR = new AzerothSDKConfigs$a();
    }
    public void AzerothSDKConfigs(){
       super(null);
    }
    public void AzerothSDKConfigs(Parcel p0){
       a.q(p0, "source");
       super(p0.readParcelable(AzerothHosts.class.getClassLoader()));
    }
    public void AzerothSDKConfigs(AzerothHosts p0){
       super();
       this.config = p0;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       a.q(p0, "dest");
       p0.writeParcelable(this.config, 0);
    }
}
