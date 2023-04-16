package ac4.o;
import z1.a;
import android.net.Uri;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;

public final class o implements a	// class@000081
{
    public final Uri a;

    public void o(Uri p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.putParcelable("uri_data", this.a);
    }
}
