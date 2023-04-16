package com.sina.weibo.sdk.content.FileProvider$b;
import com.sina.weibo.sdk.content.FileProvider$a;
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

public final class FileProvider$b implements FileProvider$a	// class@000bbc
{
    public final String g;
    public final HashMap h;

    public void FileProvider$b(String p0){
       super();
       this.h = new HashMap();
       this.g = p0;
    }
    public final Uri a(File p0){
       String canonicalPat;
       String path;
       try{
          canonicalPat = p0.getCanonicalPath();
          Map$Entry uEntry = null;
          Iterator iterator = this.h.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry1 = iterator.next();
             path = uEntry1.getValue().getPath();
             if (canonicalPat.startsWith(path) && (uEntry == null || path.length() > (uEntry.getValue().getPath()).length())) {
                uEntry = uEntry1;
             }
          }
          if (uEntry == null) {
             throw new IllegalArgumentException(("Failed to find configured root that contains ").concat(String.valueOf(canonicalPat)));
          }
          String path1 = uEntry.getValue().getPath();
          canonicalPat = (path1.endsWith("/"))? canonicalPat.substring(path1.length()): canonicalPat.substring((path1.length() + 1));
          return new Uri$Builder().scheme("content").authority(this.g).encodedPath(Uri.encode(uEntry.getKey())+'/'+Uri.encode(canonicalPat, "/")).build();
       }catch(java.io.IOException e0){
          throw new IllegalArgumentException(("Failed to resolve canonical path for ").concat(String.valueOf(canonicalPat)));
       }
    }
    public final File a(Uri p0){
       File uFile1;
       String encodedPath = p0.getEncodedPath();
       int i = encodedPath.indexOf(47, 1);
       encodedPath = Uri.decode(encodedPath.substring((i + 1)));
       File uFile = this.h.get(Uri.decode(encodedPath.substring(1, i)));
       if (uFile == null) {
          throw new IllegalArgumentException(("Unable to find configured root for ").concat(String.valueOf(p0)));
       }
       try{
          uFile1 = new File(uFile, encodedPath);
          uFile1 = uFile1.getCanonicalFile();
          if ((uFile1.getPath()).startsWith(uFile.getPath())) {
             return uFile1;
          }
          throw new SecurityException("Resolved path jumped beyond configured root");
       }catch(java.io.IOException e0){
          throw new IllegalArgumentException(("Failed to resolve canonical path for ").concat(String.valueOf(uFile1)));
       }
    }
}
