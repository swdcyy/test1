package androidx.core.content.FileProvider$b;
import androidx.core.content.FileProvider$a;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.io.File;
import android.net.Uri;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import android.net.Uri$Builder;
import java.lang.IllegalArgumentException;
import java.lang.SecurityException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;

public class FileProvider$b implements FileProvider$a	// class@00070d
{
    public final String a;
    public final HashMap b;

    public void FileProvider$b(String p0){
       super();
       this.b = new HashMap();
       this.a = p0;
    }
    public Uri a(File p0){
       String canonicalPat;
       String path;
       try{
          canonicalPat = p0.getCanonicalPath();
          Map$Entry uEntry = null;
          Iterator iterator = this.b.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry1 = iterator.next();
             path = uEntry1.getValue().getPath();
             if (canonicalPat.startsWith(path) && (uEntry == null || path.length() > (uEntry.getValue().getPath()).length())) {
                uEntry = uEntry1;
             }
          }
          if (uEntry == null) {
             throw new IllegalArgumentException("Failed to find configured root that contains "+canonicalPat);
          }
          String path1 = uEntry.getValue().getPath();
          canonicalPat = (path1.endsWith("/"))? canonicalPat.substring(path1.length()): canonicalPat.substring((path1.length() + 1));
          return new Uri$Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(uEntry.getKey())+'/'+Uri.encode(canonicalPat, "/")).build();
       }catch(java.io.IOException e0){
          throw new IllegalArgumentException("Failed to resolve canonical path for "+canonicalPat);
       }
    }
    public File b(Uri p0){
       File uFile1;
       String encodedPath = p0.getEncodedPath();
       int i = 1;
       int i1 = encodedPath.indexOf(47, i);
       encodedPath = Uri.decode(encodedPath.substring((i1 + i)));
       File uFile = this.b.get(Uri.decode(encodedPath.substring(i, i1)));
       if (uFile == null) {
          throw new IllegalArgumentException("Unable to find configured root for "+p0);
       }
       try{
          uFile1 = new File(uFile, encodedPath);
          uFile1 = uFile1.getCanonicalFile();
          if ((uFile1.getPath()).startsWith(uFile.getPath())) {
             return uFile1;
          }
          throw new SecurityException("Resolved path jumped beyond configured root");
       }catch(java.io.IOException e0){
          throw new IllegalArgumentException("Failed to resolve canonical path for "+uFile1);
       }
    }
    public void c(String p0,File p1){
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("Name must not be empty");
       }
       try{
          this.b.put(p0, p1.getCanonicalFile());
          return;
       }catch(java.io.IOException e4){
          throw new IllegalArgumentException("Failed to resolve canonical path for "+p1, e4);
       }
    }
}
