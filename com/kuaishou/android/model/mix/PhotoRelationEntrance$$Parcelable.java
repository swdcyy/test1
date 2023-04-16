package com.kuaishou.android.model.mix.PhotoRelationEntrance$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoRelationEntrance;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.framework.model.user.RichTextMeta$$Parcelable;

public class PhotoRelationEntrance$$Parcelable implements Parcelable, d	// class@000d5f
{
    public PhotoRelationEntrance photoRelationEntrance$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoRelationEntrance$$Parcelable.CREATOR = new PhotoRelationEntrance$$Parcelable$a();
    }
    public void PhotoRelationEntrance$$Parcelable(PhotoRelationEntrance p0){
       super();
       this.photoRelationEntrance$$0 = p0;
    }
    public static PhotoRelationEntrance read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoRelationEntrance photoRelatio = new PhotoRelationEntrance();
          p1.f(p1.g(), photoRelatio);
          photoRelatio.mDarkIconUrl = p0.readString();
          photoRelatio.mExtParams = PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable.read(p0, p1);
          photoRelatio.mText = RichTextMeta$$Parcelable.read(p0, p1);
          photoRelatio.mLinkUrl = p0.readString();
          photoRelatio.mIconUrl = p0.readString();
          p1.f(i, photoRelatio);
          return photoRelatio;
       }
    }
    public static void write(PhotoRelationEntrance p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDarkIconUrl);
          PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable.write(p0.mExtParams, p1, p2, p3);
          RichTextMeta$$Parcelable.write(p0.mText, p1, p2, p3);
          p1.writeString(p0.mLinkUrl);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoRelationEntrance getParcel(){
       return this.photoRelationEntrance$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoRelationEntrance$$Parcelable.write(this.photoRelationEntrance$$0, p0, p1, new a());
    }
}
