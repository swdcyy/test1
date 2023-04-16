package com.kuaishou.android.model.mix.QRecoTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.QRecoTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.QRecoTag;

public class QRecoTag$$Parcelable$a implements Parcelable$Creator	// class@000dd1
{

    public void QRecoTag$$Parcelable$a(){
       super();
    }
    public QRecoTag$$Parcelable a(Parcel p0){
       return new QRecoTag$$Parcelable(QRecoTag$$Parcelable.read(p0, new a()));
    }
    public QRecoTag$$Parcelable[] b(int p0){
       QRecoTag$$Parcelable[] $ParcelableA = new QRecoTag$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
