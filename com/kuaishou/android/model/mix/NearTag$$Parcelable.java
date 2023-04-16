package com.kuaishou.android.model.mix.NearTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.NearTag$$Parcelable$a;
import com.kuaishou.android.model.mix.NearTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class NearTag$$Parcelable implements Parcelable, d	// class@000d28
{
    public NearTag nearTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearTag$$Parcelable.CREATOR = new NearTag$$Parcelable$a();
    }
    public void NearTag$$Parcelable(NearTag p0){
       super();
       this.nearTag$$0 = p0;
    }
    public static NearTag read(Parcel p0,a p1){
       String[] stringArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NearTag nearTag = new NearTag();
          p1.f(p1.g(), nearTag);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             stringArray = uCDNUrlArray;
          }else {
             stringArray = new String[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                stringArray[i3] = p0.readString();
             }
          }
          nearTag.mTagBackgroundColors = stringArray;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          nearTag.mIconUrls = uCDNUrlArray;
          nearTag.mText = p0.readString();
          p1.f(i, nearTag);
          return nearTag;
       }
    }
    public static void write(NearTag p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          NearTag mTagBackgrou = p0.mTagBackgroundColors;
          int i2 = 0;
          if (mTagBackgrou == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTagBackgrou.length);
             mTagBackgrou = p0.mTagBackgroundColors;
             int len = mTagBackgrou.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                p1.writeString(mTagBackgrou[i3]);
             }
          }
          mTagBackgrou = p0.mIconUrls;
          if (mTagBackgrou == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTagBackgrou.length);
             mTagBackgrou = p0.mIconUrls;
             i1 = mTagBackgrou.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTagBackgrou[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearTag getParcel(){
       return this.nearTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearTag$$Parcelable.write(this.nearTag$$0, p0, p1, new a());
    }
}
