package f2.a$a;
import android.database.ContentObserver;
import f2.a;
import android.os.Handler;

public class a$a extends ContentObserver	// class@001faf
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super(new Handler());
    }
    public boolean deliverSelfNotifications(){
       return true;
    }
    public void onChange(boolean p0){
       this.a.h();
    }
}
