package com.kuaishou.android.model.mix.QComment$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.QComment$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.QComment;

public class QComment$$Parcelable$a implements Parcelable$Creator	// class@000dc2
{

    public void QComment$$Parcelable$a(){
       super();
    }
    public QComment$$Parcelable a(Parcel p0){
       return new QComment$$Parcelable(QComment$$Parcelable.read(p0, new a()));
    }
    public QComment$$Parcelable[] b(int p0){
       QComment$$Parcelable[] $ParcelableA = new QComment$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
