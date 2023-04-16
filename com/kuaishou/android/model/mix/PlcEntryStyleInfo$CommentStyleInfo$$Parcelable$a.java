package com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;

public class PlcEntryStyleInfo$CommentStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d7d
{

    public void PlcEntryStyleInfo$CommentStyleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$CommentStyleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$CommentStyleInfo$$Parcelable(PlcEntryStyleInfo$CommentStyleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$CommentStyleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$CommentStyleInfo$$Parcelable[] uCommentStyl = new PlcEntryStyleInfo$CommentStyleInfo$$Parcelable[p0];
       return uCommentStyl;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
