package com.kuaishou.android.model.mix.AppletsMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.AppletsMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.AppletsMeta;

public class AppletsMeta$$Parcelable$a implements Parcelable$Creator	// class@000bc1
{

    public void AppletsMeta$$Parcelable$a(){
       super();
    }
    public AppletsMeta$$Parcelable a(Parcel p0){
       return new AppletsMeta$$Parcelable(AppletsMeta$$Parcelable.read(p0, new a()));
    }
    public AppletsMeta$$Parcelable[] b(int p0){
       AppletsMeta$$Parcelable[] $ParcelableA = new AppletsMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
