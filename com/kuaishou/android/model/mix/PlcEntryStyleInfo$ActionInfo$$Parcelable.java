package com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import java.io.Serializable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class PlcEntryStyleInfo$ActionInfo$$Parcelable implements Parcelable, d	// class@000d70
{
    public PlcEntryStyleInfo$ActionInfo actionInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$ActionInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$ActionInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$ActionInfo$$Parcelable(PlcEntryStyleInfo$ActionInfo p0){
       super();
       this.actionInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$ActionInfo read(Parcel p0,a p1){
       Map map1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$ActionInfo uActionInfo = new PlcEntryStyleInfo$ActionInfo();
          p1.f(p1.g(), uActionInfo);
          uActionInfo.mActionEndIconUrl = p0.readString();
          uActionInfo.mActionUrl = p0.readString();
          int i1 = p0.readInt();
          Map map = null;
          int i2 = 0;
          if (i1 < 0) {
             map1 = map;
          }else {
             map1 = new HashMap(b.a(i1));
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                map1.put(p0.readString(), p0.readString());
             }
          }
          uActionInfo.mRequiredParams = map1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             map = new HashMap(b.a(i1));
             for (; i2 < i1; i2 = i2 + 1) {
                map.put(p0.readString(), p0.readSerializable());
             }
          }
          uActionInfo.mDownloadInfoMap = map;
          uActionInfo.mActionIconUrl = p0.readString();
          uActionInfo.mActionDarkIconUrl = p0.readString();
          uActionInfo.mActionSubUrl = p0.readString();
          uActionInfo.mActionType = p0.readInt();
          uActionInfo.mActionLabel = p0.readString();
          p1.f(i, uActionInfo);
          return uActionInfo;
       }
    }
    public static void write(PlcEntryStyleInfo$ActionInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       Map$Entry uEntry;
       p2 = p3.c(p0);
       int i = -1;
       if (p2 != i) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mActionEndIconUrl);
          p1.writeString(p0.mActionUrl);
          PlcEntryStyleInfo$ActionInfo mRequiredPar = p0.mRequiredParams;
          if (mRequiredPar == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mRequiredPar.size());
             iterator = p0.mRequiredParams.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          mRequiredPar = p0.mDownloadInfoMap;
          if (mRequiredPar == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mRequiredPar.size());
             iterator = p0.mDownloadInfoMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeSerializable(uEntry.getValue());
             }
          }
          p1.writeString(p0.mActionIconUrl);
          p1.writeString(p0.mActionDarkIconUrl);
          p1.writeString(p0.mActionSubUrl);
          p1.writeInt(p0.mActionType);
          p1.writeString(p0.mActionLabel);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$ActionInfo getParcel(){
       return this.actionInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$ActionInfo$$Parcelable.write(this.actionInfo$$0, p0, p1, new a());
    }
}
