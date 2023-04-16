package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;

public class PlcEntryStyleInfo$TKBundleInfo$$Parcelable$a implements Parcelable$Creator	// class@000d9c
{

    public void PlcEntryStyleInfo$TKBundleInfo$$Parcelable$a(){
       super();
    }
    public PlcEntryStyleInfo$TKBundleInfo$$Parcelable a(Parcel p0){
       return new PlcEntryStyleInfo$TKBundleInfo$$Parcelable(PlcEntryStyleInfo$TKBundleInfo$$Parcelable.read(p0, new a()));
    }
    public PlcEntryStyleInfo$TKBundleInfo$$Parcelable[] b(int p0){
       PlcEntryStyleInfo$TKBundleInfo$$Parcelable[] tKBundleInfo = new PlcEntryStyleInfo$TKBundleInfo$$Parcelable[p0];
       return tKBundleInfo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
