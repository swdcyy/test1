package ojd.h;
import ojd.g;
import ojd.f;
import android.content.Context;
import android.net.Uri;
import okhttp3.MediaType;
import java.lang.Object;
import android.content.ContentResolver;
import java.io.InputStream;
import java.lang.String;
import java.io.File;
import android.os.ParcelFileDescriptor;
import java.lang.StringBuilder;
import mjd.a;

public class h extends g	// class@001f25
{
    public final ContentResolver f;
    public final Uri g;

    public void h(f p0,Context p1,Uri p2,MediaType p3,long p4){
       super(p0, p2, p4, -1, p3);
       this.f = p1.getContentResolver();
       this.g = p2;
    }
    public InputStream a(){
       return this.f.openInputStream(this.g);
    }
    public long contentLength(){
       long l = -1;
       if (("file").equals(this.g.getScheme())) {
          if (this.g.getPath() != null) {
             l = new File(this.g.getPath()).length();
          }
          return l;
       }else {
          try{
             ParcelFileDescriptor parcelFileDe = this.f.openFileDescriptor(this.g, "r");
             if (parcelFileDe != null) {
                l = parcelFileDe.getStatSize();
             }
             return l;
          }catch(java.io.FileNotFoundException e0){
             a.b("UriRequestBody", "Couldn\'t get the length of content. uri: "+this.g+", error: "+e0);
             return l;
          }
       }
    }
}
