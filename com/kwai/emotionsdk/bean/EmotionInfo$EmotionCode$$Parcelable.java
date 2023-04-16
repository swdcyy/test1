package com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode$$Parcelable$a;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EmotionInfo$EmotionCode$$Parcelable implements Parcelable, d	// class@000d7b
{
    public EmotionInfo$EmotionCode emotionCode$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       EmotionInfo$EmotionCode$$Parcelable.CREATOR = new EmotionInfo$EmotionCode$$Parcelable$a();
    }
    public void EmotionInfo$EmotionCode$$Parcelable(EmotionInfo$EmotionCode p0){
       super();
       this.emotionCode$$0 = p0;
    }
    public static EmotionInfo$EmotionCode read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          EmotionInfo$EmotionCode uEmotionCode = new EmotionInfo$EmotionCode();
          p1.f(p1.g(), uEmotionCode);
          uEmotionCode.mLanguage = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          uEmotionCode.mCode = list;
          p1.f(i, uEmotionCode);
          return uEmotionCode;
       }
    }
    public static void write(EmotionInfo$EmotionCode p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLanguage);
          EmotionInfo$EmotionCode mCode = p0.mCode;
          if (mCode == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCode.size());
             Iterator iterator = p0.mCode.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public EmotionInfo$EmotionCode getParcel(){
       return this.emotionCode$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       EmotionInfo$EmotionCode$$Parcelable.write(this.emotionCode$$0, p0, p1, new a());
    }
}
