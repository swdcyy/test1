package ac4.n;
import z1.a;
import android.net.Uri;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;

public final class n implements a	// class@000080
{
    public final Uri a;

    public void n(Uri p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.putParcelable("uri_data", this.a);
    }
}
