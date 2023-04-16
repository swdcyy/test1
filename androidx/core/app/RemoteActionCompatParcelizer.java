package androidx.core.app.RemoteActionCompatParcelizer;
import java.lang.Object;
import androidx.versionedparcelable.a;
import androidx.core.app.RemoteActionCompat;
import g3.c;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.CharSequence;
import android.os.Parcelable;
import android.app.PendingIntent;
import java.util.Objects;

public class RemoteActionCompatParcelizer	// class@0006f3
{

    public void RemoteActionCompatParcelizer(){
       super();
    }
    public static RemoteActionCompat read(a p0){
       RemoteActionCompat remoteAction = new RemoteActionCompat();
       remoteAction.a = p0.z(remoteAction.a, 1);
       remoteAction.b = p0.l(remoteAction.b, 2);
       remoteAction.c = p0.l(remoteAction.c, 3);
       remoteAction.d = p0.u(remoteAction.d, 4);
       remoteAction.e = p0.g(remoteAction.e, 5);
       remoteAction.f = p0.g(remoteAction.f, 6);
       return remoteAction;
    }
    public static void write(RemoteActionCompat p0,a p1){
       Objects.requireNonNull(p1);
       p1.W(p0.a, 1);
       p1.I(p0.b, 2);
       p1.I(p0.c, 3);
       p1.P(p0.d, 4);
       p1.C(p0.e, 5);
       p1.C(p0.f, 6);
    }
}
