package android.support.v4.content.FileProvider;
import android.content.ContentProvider;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.ContentValues;
import android.database.Cursor;

public final class FileProvider extends ContentProvider	// class@0003b3
{

    public void FileProvider(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       a.p(p0, "uri");
       return 0;
    }
    public String getType(Uri p0){
       a.p(p0, "uri");
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       a.p(p0, "uri");
       return null;
    }
    public boolean onCreate(){
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       a.p(p0, "uri");
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       a.p(p0, "uri");
       return 0;
    }
}
