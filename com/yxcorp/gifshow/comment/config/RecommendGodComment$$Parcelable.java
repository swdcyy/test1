package com.yxcorp.gifshow.comment.config.RecommendGodComment$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.comment.config.RecommendGodComment$$Parcelable$a;
import com.yxcorp.gifshow.comment.config.RecommendGodComment;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RecommendGodComment$$Parcelable implements Parcelable, d	// class@0010af
{
    public RecommendGodComment recommendGodComment$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RecommendGodComment$$Parcelable.CREATOR = new RecommendGodComment$$Parcelable$a();
    }
    public void RecommendGodComment$$Parcelable(RecommendGodComment p0){
       super();
       this.recommendGodComment$$0 = p0;
    }
    public static RecommendGodComment read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RecommendGodComment recommendGod = new RecommendGodComment();
          p1.f(p1.g(), recommendGod);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          recommendGod.oneClickRecommendGodComment = b;
          p1.f(i, recommendGod);
          return recommendGod;
       }
    }
    public static void write(RecommendGodComment p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.oneClickRecommendGodComment);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RecommendGodComment getParcel(){
       return this.recommendGodComment$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RecommendGodComment$$Parcelable.write(this.recommendGodComment$$0, p0, p1, new a());
    }
}
