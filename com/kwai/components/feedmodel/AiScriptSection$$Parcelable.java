package com.kwai.components.feedmodel.AiScriptSection$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.AiScriptSection$$Parcelable$a;
import com.kwai.components.feedmodel.AiScriptSection;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.components.feedmodel.AiScriptSection$SearchAiInfo;
import java.util.List;
import java.util.Iterator;

public class AiScriptSection$$Parcelable implements Parcelable, d	// class@000c0c
{
    public AiScriptSection aiScriptSection$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AiScriptSection$$Parcelable.CREATOR = new AiScriptSection$$Parcelable$a();
    }
    public void AiScriptSection$$Parcelable(AiScriptSection p0){
       super();
       this.aiScriptSection$$0 = p0;
    }
    public static AiScriptSection read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          AiScriptSection uAiScriptSec = new AiScriptSection();
          p1.f(p1.g(), uAiScriptSec);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
             list = uArrayList;
          }
          uAiScriptSec.mAiInfos = list;
          p1.f(i, uAiScriptSec);
          return uAiScriptSec;
       }
    }
    public static void write(AiScriptSection p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          AiScriptSection mAiInfos = p0.mAiInfos;
          if (mAiInfos == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAiInfos.size());
             Iterator iterator = p0.mAiInfos.iterator();
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
    public AiScriptSection getParcel(){
       return this.aiScriptSection$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AiScriptSection$$Parcelable.write(this.aiScriptSection$$0, p0, p1, new a());
    }
}
