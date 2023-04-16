package com.kuaishou.android.model.mix.ImageMeta$Atlas$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$$Parcelable$a;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$$Parcelable;

public class ImageMeta$Atlas$$Parcelable implements Parcelable, d	// class@000cbd
{
    public ImageMeta$Atlas atlas$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ImageMeta$Atlas$$Parcelable.CREATOR = new ImageMeta$Atlas$$Parcelable$a();
    }
    public void ImageMeta$Atlas$$Parcelable(ImageMeta$Atlas p0){
       super();
       this.atlas$$0 = p0;
    }
    public static ImageMeta$Atlas read(Parcel p0,a p1){
       String[] stringArray1;
       int[] ointArray;
       ImageMeta$CDNInfo[] uCDNInfoArra;
       ImageMeta$AtlasCoverSize[] uAtlasCoverS;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ImageMeta$Atlas uAtlas = new ImageMeta$Atlas();
          p1.f(p1.g(), uAtlas);
          uAtlas.mVolume = p0.readFloat();
          int i1 = p0.readInt();
          String[] stringArray = null;
          int i2 = 0;
          if (i1 < 0) {
             stringArray1 = stringArray;
          }else {
             stringArray1 = new String[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                stringArray1[i3] = p0.readString();
             }
          }
          uAtlas.mThumbList = stringArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             stringArray1 = stringArray;
          }else {
             stringArray1 = new String[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                stringArray1[i3] = p0.readString();
             }
          }
          uAtlas.mCdn = stringArray1;
          i1 = p0.readInt();
          if (i1 < 0) {
             ointArray = stringArray;
          }else {
             ointArray = new int[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                ointArray[i3] = p0.readInt();
             }
          }
          uAtlas.mIndices = ointArray;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNInfoArra = stringArray;
          }else {
             uCDNInfoArra = new ImageMeta$CDNInfo[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNInfoArra[i3] = ImageMeta$CDNInfo$$Parcelable.read(p0, p1);
             }
          }
          uAtlas.mCdnList = uCDNInfoArra;
          uAtlas.mLastSelectedPos = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNInfoArra = stringArray;
          }else {
             uCDNInfoArra = new ImageMeta$CDNInfo[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNInfoArra[i3] = ImageMeta$CDNInfo$$Parcelable.read(p0, p1);
             }
          }
          uAtlas.mMusicCdnList = uCDNInfoArra;
          i1 = p0.readInt();
          if (i1 < 0) {
             uAtlasCoverS = stringArray;
          }else {
             uAtlasCoverS = new ImageMeta$AtlasCoverSize[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uAtlasCoverS[i3] = ImageMeta$AtlasCoverSize$$Parcelable.read(p0, p1);
             }
          }
          uAtlas.mSize = uAtlasCoverS;
          uAtlas.mMusic = p0.readString();
          uAtlas.mType = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             stringArray = new String[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                stringArray[i2] = p0.readString();
             }
          }
          uAtlas.mList = stringArray;
          p1.f(i, uAtlas);
          return uAtlas;
       }
    }
    public static void write(ImageMeta$Atlas p0,Parcel p1,int p2,a p3){
       int len;
       int i2;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mVolume);
          ImageMeta$Atlas mThumbList = p0.mThumbList;
          int i1 = 0;
          if (mThumbList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mThumbList.length);
             mThumbList = p0.mThumbList;
             len = mThumbList.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                p1.writeString(mThumbList[i2]);
             }
          }
          mThumbList = p0.mCdn;
          if (mThumbList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mThumbList.length);
             mThumbList = p0.mCdn;
             len = mThumbList.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                p1.writeString(mThumbList[i2]);
             }
          }
          mThumbList = p0.mIndices;
          if (mThumbList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mThumbList.length);
             mThumbList = p0.mIndices;
             len = mThumbList.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                p1.writeInt(mThumbList[i2]);
             }
          }
          mThumbList = p0.mCdnList;
          if (mThumbList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mThumbList.length);
             mThumbList = p0.mCdnList;
             len = mThumbList.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                ImageMeta$CDNInfo$$Parcelable.write(mThumbList[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mLastSelectedPos);
          mThumbList = p0.mMusicCdnList;
          if (mThumbList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mThumbList.length);
             mThumbList = p0.mMusicCdnList;
             len = mThumbList.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                ImageMeta$CDNInfo$$Parcelable.write(mThumbList[i2], p1, p2, p3);
             }
          }
          mThumbList = p0.mSize;
          if (mThumbList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mThumbList.length);
             mThumbList = p0.mSize;
             len = mThumbList.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                ImageMeta$AtlasCoverSize$$Parcelable.write(mThumbList[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mMusic);
          p1.writeInt(p0.mType);
          ImageMeta$Atlas mList = p0.mList;
          if (mList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mList.length);
             p0 = p0.mList;
             mList = p0.length;
             for (; i1 < mList; i1 = i1 + 1) {
                p1.writeString(p0[i1]);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ImageMeta$Atlas getParcel(){
       return this.atlas$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ImageMeta$Atlas$$Parcelable.write(this.atlas$$0, p0, p1, new a());
    }
}
