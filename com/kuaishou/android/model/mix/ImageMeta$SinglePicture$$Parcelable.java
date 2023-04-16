package com.kuaishou.android.model.mix.ImageMeta$SinglePicture$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$$Parcelable$a;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$$Parcelable;

public class ImageMeta$SinglePicture$$Parcelable implements Parcelable, d	// class@000cd5
{
    public ImageMeta$SinglePicture singlePicture$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ImageMeta$SinglePicture$$Parcelable.CREATOR = new ImageMeta$SinglePicture$$Parcelable$a();
    }
    public void ImageMeta$SinglePicture$$Parcelable(ImageMeta$SinglePicture p0){
       super();
       this.singlePicture$$0 = p0;
    }
    public static ImageMeta$SinglePicture read(Parcel p0,a p1){
       ImageMeta$CDNInfo[] uCDNInfoArra;
       ImageMeta$AtlasCoverSize[] uAtlasCoverS;
       String[] stringArray1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ImageMeta$SinglePicture singlePictur = new ImageMeta$SinglePicture();
          p1.f(p1.g(), singlePictur);
          singlePictur.mVolume = p0.readFloat();
          int i1 = p0.readInt();
          String[] stringArray = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNInfoArra = stringArray;
          }else {
             uCDNInfoArra = new ImageMeta$CDNInfo[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNInfoArra[i3] = ImageMeta$CDNInfo$$Parcelable.read(p0, p1);
             }
          }
          singlePictur.mCdnList = uCDNInfoArra;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNInfoArra = stringArray;
          }else {
             uCDNInfoArra = new ImageMeta$CDNInfo[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNInfoArra[i3] = ImageMeta$CDNInfo$$Parcelable.read(p0, p1);
             }
          }
          singlePictur.mMusicCdnList = uCDNInfoArra;
          i1 = p0.readInt();
          if (i1 < 0) {
             uAtlasCoverS = stringArray;
          }else {
             uAtlasCoverS = new ImageMeta$AtlasCoverSize[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uAtlasCoverS[i3] = ImageMeta$AtlasCoverSize$$Parcelable.read(p0, p1);
             }
          }
          singlePictur.mSize = uAtlasCoverS;
          i1 = p0.readInt();
          if (i1 < 0) {
             stringArray1 = stringArray;
          }else {
             stringArray1 = new String[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                stringArray1[i3] = p0.readString();
             }
          }
          singlePictur.mLocalUrlList = stringArray1;
          singlePictur.mMusic = p0.readString();
          singlePictur.mType = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             stringArray = new String[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                stringArray[i2] = p0.readString();
             }
          }
          singlePictur.mList = stringArray;
          p1.f(i, singlePictur);
          return singlePictur;
       }
    }
    public static void write(ImageMeta$SinglePicture p0,Parcel p1,int p2,a p3){
       int len1;
       int i2;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mVolume);
          ImageMeta$SinglePicture mCdnList = p0.mCdnList;
          int i1 = 0;
          if (mCdnList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCdnList.length);
             mCdnList = p0.mCdnList;
             len1 = mCdnList.length;
             for (i2 = 0; i2 < len1; i2 = i2 + 1) {
                ImageMeta$CDNInfo$$Parcelable.write(mCdnList[i2], p1, p2, p3);
             }
          }
          mCdnList = p0.mMusicCdnList;
          if (mCdnList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCdnList.length);
             mCdnList = p0.mMusicCdnList;
             len1 = mCdnList.length;
             for (i2 = 0; i2 < len1; i2 = i2 + 1) {
                ImageMeta$CDNInfo$$Parcelable.write(mCdnList[i2], p1, p2, p3);
             }
          }
          mCdnList = p0.mSize;
          if (mCdnList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCdnList.length);
             mCdnList = p0.mSize;
             len1 = mCdnList.length;
             for (i2 = 0; i2 < len1; i2 = i2 + 1) {
                ImageMeta$AtlasCoverSize$$Parcelable.write(mCdnList[i2], p1, p2, p3);
             }
          }
          ImageMeta$SinglePicture mLocalUrlLis = p0.mLocalUrlList;
          if (mLocalUrlLis == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLocalUrlLis.length);
             mLocalUrlLis = p0.mLocalUrlList;
             int len = mLocalUrlLis.length;
             for (i = 0; i < len; i = i + 1) {
                p1.writeString(mLocalUrlLis[i]);
             }
          }
          p1.writeString(p0.mMusic);
          p1.writeInt(p0.mType);
          mLocalUrlLis = p0.mList;
          if (mLocalUrlLis == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLocalUrlLis.length);
             p0 = p0.mList;
             mLocalUrlLis = p0.length;
             for (; i1 < mLocalUrlLis; i1 = i1 + 1) {
                p1.writeString(p0[i1]);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ImageMeta$SinglePicture getParcel(){
       return this.singlePicture$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ImageMeta$SinglePicture$$Parcelable.write(this.singlePicture$$0, p0, p1, new a());
    }
}
