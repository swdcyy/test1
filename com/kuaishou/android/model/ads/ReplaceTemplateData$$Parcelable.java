package com.kuaishou.android.model.ads.ReplaceTemplateData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.ReplaceTemplateData$$Parcelable$a;
import com.kuaishou.android.model.ads.ReplaceTemplateData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplaceCardInfo;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplaceCardInfo$$Parcelable;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import java.util.List;
import java.util.Iterator;

public class ReplaceTemplateData$$Parcelable implements Parcelable, d	// class@000a72
{
    public ReplaceTemplateData replaceTemplateData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ReplaceTemplateData$$Parcelable.CREATOR = new ReplaceTemplateData$$Parcelable$a();
    }
    public void ReplaceTemplateData$$Parcelable(ReplaceTemplateData p0){
       super();
       this.replaceTemplateData$$0 = p0;
    }
    public static ReplaceTemplateData read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ReplaceTemplateData replaceTempl = new ReplaceTemplateData();
          p1.f(p1.g(), replaceTempl);
          replaceTempl.mTemplateStyleInfos = p0.readString();
          replaceTempl.mPlayEndInfo = ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable.read(p0, p1);
          replaceTempl.mAdCardTemplateInfo = ReplaceTemplateData$ReplaceCardInfo$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(PhotoAdvertisement$TkTemplateData$$Parcelable.read(p0, p1));
             }
          }
          replaceTempl.mTkTemplateDatas = list1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readSerializable());
             }
          }
          replaceTempl.mTemplates = list;
          p1.f(i, replaceTempl);
          return replaceTempl;
       }
    }
    public static void write(ReplaceTemplateData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTemplateStyleInfos);
          ReplaceTemplateData$ReplacePlayEndInfo$$Parcelable.write(p0.mPlayEndInfo, p1, p2, p3);
          ReplaceTemplateData$ReplaceCardInfo$$Parcelable.write(p0.mAdCardTemplateInfo, p1, p2, p3);
          ReplaceTemplateData mTkTemplateD = p0.mTkTemplateDatas;
          if (mTkTemplateD == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTkTemplateD.size());
             Iterator iterator1 = p0.mTkTemplateDatas.iterator();
             while (iterator1.hasNext()) {
                PhotoAdvertisement$TkTemplateData$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          ReplaceTemplateData mTemplates = p0.mTemplates;
          if (mTemplates == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTemplates.size());
             Iterator iterator = p0.mTemplates.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ReplaceTemplateData getParcel(){
       return this.replaceTemplateData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ReplaceTemplateData$$Parcelable.write(this.replaceTemplateData$$0, p0, p1, new a());
    }
}
