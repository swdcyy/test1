package com.hpplay.sdk.source.browse.data.LelinkServiceInfoWrapper$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.data.LelinkServiceInfoWrapper;
import java.util.concurrent.ConcurrentHashMap;
import com.hpplay.sdk.source.browse.data.BrowserInfo;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public final class LelinkServiceInfoWrapper$1 implements Parcelable$Creator	// class@000662
{

    public void LelinkServiceInfoWrapper$1(){
       super();
    }
    public LelinkServiceInfoWrapper createFromParcel(Parcel p0){
       LelinkServiceInfoWrapper lelinkServic;
       try{
          lelinkServic = new LelinkServiceInfoWrapper(p0);
          ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
          int i = p0.readInt();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             uConcurrentH.put(Integer.valueOf(p0.readInt()), p0.readParcelable(BrowserInfo.class.getClassLoader()));
          }
          lelinkServic.mBrowserInfos = uConcurrentH;
       }catch(java.lang.Exception e7){
          a.b("LelinkServiceInfoWrapper", e7);
       }
       return lelinkServic;
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public LelinkServiceInfoWrapper[] newArray(int p0){
       LelinkServiceInfoWrapper[] lelinkServic = new LelinkServiceInfoWrapper[p0];
       return lelinkServic;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
