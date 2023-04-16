package com.kuaishou.android.model.ads.MagicVideoInfo$VideoTouchStage$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoTouchStage$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoTouchStage;

public class MagicVideoInfo$VideoTouchStage$$Parcelable$a implements Parcelable$Creator	// class@000871
{

    public void MagicVideoInfo$VideoTouchStage$$Parcelable$a(){
       super();
    }
    public MagicVideoInfo$VideoTouchStage$$Parcelable a(Parcel p0){
       return new MagicVideoInfo$VideoTouchStage$$Parcelable(MagicVideoInfo$VideoTouchStage$$Parcelable.read(p0, new a()));
    }
    public MagicVideoInfo$VideoTouchStage$$Parcelable[] b(int p0){
       MagicVideoInfo$VideoTouchStage$$Parcelable[] videoTouchSt = new MagicVideoInfo$VideoTouchStage$$Parcelable[p0];
       return videoTouchSt;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
