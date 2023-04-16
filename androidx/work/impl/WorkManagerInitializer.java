package androidx.work.impl.WorkManagerInitializer;
import android.content.ContentProvider;
import android.net.Uri;
import java.lang.String;
import android.content.ContentValues;
import android.content.Context;
import k3.a$a;
import k3.a;
import k3.m;
import android.database.Cursor;

public class WorkManagerInitializer extends ContentProvider	// class@000a67
{

    public void WorkManagerInitializer(){
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
       m.w(this.getContext(), new a$a().a());
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
