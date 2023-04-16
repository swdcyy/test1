package com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PlcEntryStyleInfo$CommentStyleInfo$$Parcelable implements Parcelable, d	// class@000d7e
{
    public PlcEntryStyleInfo$CommentStyleInfo commentStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$CommentStyleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$CommentStyleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$CommentStyleInfo$$Parcelable(PlcEntryStyleInfo$CommentStyleInfo p0){
       super();
       this.commentStyleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$CommentStyleInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$CommentStyleInfo uCommentStyl = new PlcEntryStyleInfo$CommentStyleInfo();
          p1.f(p1.g(), uCommentStyl);
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          uCommentStyl.mLabels = list;
          uCommentStyl.mCategoryText = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uCommentStyl.mEnableLabelArrow = b;
          uCommentStyl.mTagPackage = PlcEntryStyleInfo$TagPackage$$Parcelable.read(p0, p1);
          uCommentStyl.mTagInfoText = p0.readString();
          uCommentStyl.mTitle = p0.readString();
          uCommentStyl.mStyleType = p0.readInt();
          uCommentStyl.mIconUrl = p0.readString();
          uCommentStyl.mActionInfo = PlcEntryStyleInfo$ActionInfo$$Parcelable.read(p0, p1);
          p1.f(i, uCommentStyl);
          return uCommentStyl;
       }
    }
    public static void write(PlcEntryStyleInfo$CommentStyleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PlcEntryStyleInfo$CommentStyleInfo mLabels = p0.mLabels;
          if (mLabels == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLabels.size());
             Iterator iterator = p0.mLabels.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mCategoryText);
          p1.writeInt(p0.mEnableLabelArrow);
          PlcEntryStyleInfo$TagPackage$$Parcelable.write(p0.mTagPackage, p1, p2, p3);
          p1.writeString(p0.mTagInfoText);
          p1.writeString(p0.mTitle);
          p1.writeInt(p0.mStyleType);
          p1.writeString(p0.mIconUrl);
          PlcEntryStyleInfo$ActionInfo$$Parcelable.write(p0.mActionInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$CommentStyleInfo getParcel(){
       return this.commentStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$CommentStyleInfo$$Parcelable.write(this.commentStyleInfo$$0, p0, p1, new a());
    }
}
