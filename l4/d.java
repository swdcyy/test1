package l4.d;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import com.RNFetchBlob.b;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.lang.Boolean;

public class d implements MediaScannerConnection$OnScanCompletedListener	// class@002511
{
    public final Callback a;
    public final b b;

    public void d(b p0,Callback p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onScanCompleted(String p0,Uri p1){
       Object[] objArray = new Object[]{null,Boolean.TRUE};
       this.a.invoke(objArray);
    }
}
