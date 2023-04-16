package com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;
import android.os.Parcelable;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class StoryTextDataManager$TextColors implements Parcelable	// class@000adb
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryTextDataManager$TextColors.CREATOR = new StoryTextDataManager$TextColors$a();
    }
    public void StoryTextDataManager$TextColors(){
       super();
    }
    public void StoryTextDataManager$TextColors(int p0,int p1,int p2,int p3,int p4,int p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public void StoryTextDataManager$TextColors(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
       this.d = p0.readInt();
       this.f = p0.readInt();
       this.e = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof StoryTextDataManager$TextColors) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.f != p0.f) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((((((((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.e);
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryTextDataManager$TextColors.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryTextDataManager$TextColors.class, "1")) {
          return;
       }
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
       p0.writeInt(this.f);
       p0.writeInt(this.e);
       return;
    }
}
