package com.facebook.imagepipeline.producers.h;
import com.facebook.imagepipeline.producers.j;
import java.lang.String;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import bd.d;
import android.net.Uri;
import ib.c;
import java.lang.Object;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.StringBuilder;
import android.provider.ContactsContract$Contacts;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.File;

public class h extends j	// class@001135
{
    public final ContentResolver c;
    public static final String[] d;

    static {
       String[] stringArray = new String[]{"_id","_data"};
       h.d = stringArray;
    }
    public void h(Executor p0,b p1,ContentResolver p2){
       super(p0, p1);
       this.c = p2;
    }
    public d c(ImageRequest p0){
       InputStream inputStream;
       Uri uri = p0.s();
       String str = null;
       if (uri.getPath() == null) {
       }else if(c.h(uri) && (("com.android.contacts").equals(uri.getAuthority()) && !(uri.getPath()).startsWith(c.a.getPath()))){
          str = 1;
       }
       if (str) {
          if ((uri.toString()).endsWith("/photo")) {
             inputStream = this.c.openInputStream(uri);
          }else if((uri.toString()).endsWith("/display_photo")){
             try{
                inputStream = this.c.openAssetFileDescriptor(uri, "r").createInputStream();
             }catch(java.io.IOException e0){
                throw new IOException("Contact photo does not exist: "+inputStream);
             }
          }else {
             InputStream inputStream1 = ContactsContract$Contacts.openContactPhotoInputStream(this.c, uri);
             if (inputStream1 != null) {
                inputStream = inputStream1;
             }else {
                throw new IOException("Contact photo does not exist: "+uri);
             }
          }
          return this.d(inputStream, -1);
       }else if(c.g(uri)){
          Cursor uCursor = this.c.query(uri, h.d, null, null, null);
          d uod = null;
          if (uCursor != null) {
             if (uCursor.getCount()) {
                uCursor.moveToFirst();
                String str1 = uCursor.getString(uCursor.getColumnIndex("_data"));
                if (str1 != null) {
                   uod = this.d(new FileInputStream(this.c.openFileDescriptor(uri, "r").getFileDescriptor()), (int)new File(str1).length());
                }
             }
             uCursor.close();
          }
          if (uod != null) {
             return uod;
          }
       }
       return this.d(this.c.openInputStream(uri), -1);
    }
    public String e(){
       return "LocalContentUriFetchProducer";
    }
}
