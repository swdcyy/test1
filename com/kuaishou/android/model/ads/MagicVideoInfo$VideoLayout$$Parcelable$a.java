package com.kuaishou.android.model.ads.MagicVideoInfo$VideoLayout$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoLayout$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoLayout;

public class MagicVideoInfo$VideoLayout$$Parcelable$a implements Parcelable$Creator	// class@00086e
{

    public void MagicVideoInfo$VideoLayout$$Parcelable$a(){
       super();
    }
    public MagicVideoInfo$VideoLayout$$Parcelable a(Parcel p0){
       return new MagicVideoInfo$VideoLayout$$Parcelable(MagicVideoInfo$VideoLayout$$Parcelable.read(p0, new a()));
    }
    public MagicVideoInfo$VideoLayout$$Parcelable[] b(int p0){
       MagicVideoInfo$VideoLayout$$Parcelable[] videoLayout$ = new MagicVideoInfo$VideoLayout$$Parcelable[p0];
       return videoLayout$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
