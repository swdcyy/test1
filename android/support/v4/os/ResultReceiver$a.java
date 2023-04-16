package android.support.v4.os.ResultReceiver$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

public class ResultReceiver$a implements Parcelable$Creator	// class@000408
{

    public void ResultReceiver$a(){
       super();
    }
    public ResultReceiver a(Parcel p0){
       return new ResultReceiver(p0);
    }
    public ResultReceiver[] b(int p0){
       ResultReceiver[] resultReceiv = new ResultReceiver[p0];
       return resultReceiv;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
