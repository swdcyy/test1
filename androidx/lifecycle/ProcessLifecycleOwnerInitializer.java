package androidx.lifecycle.ProcessLifecycleOwnerInitializer;
import com.kwai.performance.component.manager.provider.a;
import android.net.Uri;
import java.lang.String;
import android.content.ContentValues;
import android.content.Context;
import androidx.lifecycle.LifecycleDispatcher;
import androidx.lifecycle.ProcessLifecycleOwner;
import android.database.Cursor;

public class ProcessLifecycleOwnerInitializer extends a	// class@0007ee
{

    public void ProcessLifecycleOwnerInitializer(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       return 0;
    }
    public String getType(Uri p0){
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       return null;
    }
    public boolean onCreate(){
       LifecycleDispatcher.init(this.getContext());
       ProcessLifecycleOwner.init(this.getContext());
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
