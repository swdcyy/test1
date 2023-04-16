package com.kuaishou.android.model.ads.MagicVideoInfo$VideoInteractive$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoInteractive$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.MagicVideoInfo$VideoInteractive;

public class MagicVideoInfo$VideoInteractive$$Parcelable$a implements Parcelable$Creator	// class@00086b
{

    public void MagicVideoInfo$VideoInteractive$$Parcelable$a(){
       super();
    }
    public MagicVideoInfo$VideoInteractive$$Parcelable a(Parcel p0){
       return new MagicVideoInfo$VideoInteractive$$Parcelable(MagicVideoInfo$VideoInteractive$$Parcelable.read(p0, new a()));
    }
    public MagicVideoInfo$VideoInteractive$$Parcelable[] b(int p0){
       MagicVideoInfo$VideoInteractive$$Parcelable[] videoInterac = new MagicVideoInfo$VideoInteractive$$Parcelable[p0];
       return videoInterac;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
