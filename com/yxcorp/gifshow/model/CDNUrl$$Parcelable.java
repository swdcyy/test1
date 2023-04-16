package com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable$a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashSet;
import java.lang.Integer;
import java.util.HashMap;
import xwd.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;

public class CDNUrl$$Parcelable implements Parcelable, d	// class@001df1
{
    public CDNUrl cDNUrl$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CDNUrl$$Parcelable.CREATOR = new CDNUrl$$Parcelable$a();
    }
    public void CDNUrl$$Parcelable(CDNUrl p0){
       super();
       this.cDNUrl$$0 = p0;
    }
    public static CDNUrl read(Parcel p0,a p1){
       int i5;
       a uoa = p1;
       int i = p0.readInt();
       if (uoa.a(i)) {
          if (!uoa.d(i)) {
             return uoa.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          int i1 = p1.g();
          String str = p0.readString();
          String str1 = p0.readString();
          String str2 = p0.readString();
          String str3 = p0.readString();
          int i2 = 0;
          int i3 = 1;
          if (p0.readInt() != i3) {
             i3 = 0;
          }
          int i4 = p0.readInt();
          HashMap hashMap = null;
          if (i4 < 0) {
             i5 = hashMap;
          }else {
             i5 = new HashSet(i4);
             for (int i6 = 0; i6 < i4; i6 = i6 + 1) {
                HashMap hashMap2 = (p0.readInt() < 0)? hashMap: Integer.valueOf(p0.readInt());
                i5.add(hashMap2);
             }
          }
          String str4 = p0.readString();
          String str5 = p0.readString();
          i4 = p0.readInt();
          if (i4 >= 0) {
             hashMap = new HashMap(b.a(i4));
             for (; i2 < i4; i2 = i2 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
          }
          HashMap hashMap1 = hashMap;
          CDNUrl uCDNUrl = new CDNUrl(str, str1, str2, str3, i3, i5, str4, str5, hashMap1);
          uoa.f(i1, v15);
          uoa.f(i, v15);
          return v15;
       }
    }
    public static void write(CDNUrl p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.getCdn());
          p1.writeString(p0.getUrl());
          p1.writeString(p0.getIp());
          p1.writeString(p0.getUrlPattern());
          p1.writeInt(p0.isFreeTrafficCdn());
          if (p0.getFeature() == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(p0.getFeature().size());
             Iterator iterator1 = p0.getFeature().iterator();
             while (iterator1.hasNext()) {
                Integer integer = iterator1.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          p1.writeString(p0.getUrlType());
          p1.writeString(p0.getPushCdn());
          if (p0.getHeaders() == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(p0.getHeaders().size());
             Iterator iterator = p0.getHeaders().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CDNUrl getParcel(){
       return this.cDNUrl$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CDNUrl$$Parcelable.write(this.cDNUrl$$0, p0, p1, new a());
    }
}
