package android.support.v4.media.RatingCompat;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat$a;
import java.lang.Object;
import android.media.Rating;
import java.lang.String;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class RatingCompat implements Parcelable	// class@0003dd
{
    public final int b;
    public final float c;
    public Object d;
    public static final Parcelable$Creator CREATOR;

    static {
       RatingCompat.CREATOR = new RatingCompat$a();
    }
    public void RatingCompat(int p0,float p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public static RatingCompat a(Object p0){
       boolean b = false;
       if (p0 != null) {
          Rating rating = p0;
          int ratingStyle = rating.getRatingStyle();
          if (rating.isRated()) {
             switch (ratingStyle){
                 case 1:
                   b = RatingCompat.h(rating.hasHeart());
                   break;
                 case 2:
                   b = RatingCompat.k(rating.isThumbUp());
                   break;
                 case 3:
                 case 5:
                 case 4:
                   b = RatingCompat.j(ratingStyle, rating.getStarRating());
                   break;
                 case 6:
                   b = RatingCompat.i(rating.getPercentRating());
                   break;
                 default:
                   return b;
             }
          }else {
             b = RatingCompat.l(ratingStyle);
          }
          b.d = p0;
       }
       return b;
    }
    public static RatingCompat h(boolean p0){
       float f = (p0)? 0x3f800000: 0;
       return new RatingCompat(1, f);
    }
    public static RatingCompat i(float p0){
       if (p0 < 0 || p0 - 0x42c80000 > 0) {
          return null;
       }
       return new RatingCompat(6, p0);
    }
    public static RatingCompat j(int p0,float p1){
       int i;
       if (p0 != 3) {
          if (p0 != 4) {
             if (p0 != 5) {
                return null;
             }else {
                i = 0x40a00000;
             }
          }else {
             i = 0x40800000;
          }
       }else {
          i = 0x40400000;
       }
       if (p1 < 0 || p1 - i > 0) {
          return null;
       }else {
          return new RatingCompat(p0, p1);
       }
    }
    public static RatingCompat k(boolean p0){
       float f = (p0)? 0x3f800000: 0;
       return new RatingCompat(2, f);
    }
    public static RatingCompat l(int p0){
       switch (p0){
           case 1:
           case 3:
           case 4:
           case 5:
           case 6:
           case 2:
           default:
             return null;
       }
       return new RatingCompat(p0, 0xbf800000);
    }
    public float b(){
       if (this.b != 6 || !this.f()) {
          return 0xbf800000;
       }
       return this.c;
    }
    public Object c(){
       if (this.d == null) {
          if (this.f()) {
             RatingCompat tb = this.b;
             switch (tb){
                 case 1:
                   this.d = Rating.newHeartRating(this.e());
                   break;
                 case 2:
                   this.d = Rating.newThumbRating(this.g());
                   break;
                 case 3:
                 case 5:
                 case 4:
                   this.d = Rating.newStarRating(tb, this.d());
                   break;
                 case 6:
                   this.d = Rating.newPercentageRating(this.b());
                   break;
                 default:
                   return null;
             }
          }else {
             this.d = Rating.newUnratedRating(this.b);
          }
       }
       return this.d;
    }
    public float d(){
       RatingCompat tb = this.b;
       if (tb != 3 && (tb != 4 && (tb == 5 && this.f()))) {
          return this.c;
       }
       return 0xbf800000;
    }
    public int describeContents(){
       return this.b;
    }
    public boolean e(){
       boolean b = false;
       if (this.b != 1) {
          return b;
       }
       if (!this.c - 0x3f800000) {
          b = true;
       }
       return b;
    }
    public boolean f(){
       boolean b = (this.c >= 0)? true: false;
       return b;
    }
    public boolean g(){
       boolean b = false;
       if (this.b != 2) {
          return b;
       }
       if (!this.c - 0x3f800000) {
          b = true;
       }
       return b;
    }
    public String toString(){
       StringBuilder str = "Rating:style="+this.b+" rating=";
       RatingCompat tc = this.c;
       String str1 = (tc < 0)? "unrated": String.valueOf(tc);
       return str+str1;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeFloat(this.c);
    }
}
