package com.facebook.imagepipeline.producers.i;
import id.o0;
import com.facebook.imagepipeline.producers.j;
import java.lang.String;
import android.graphics.Rect;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import android.content.ContentResolver;
import uc.d;
import id.p0;
import com.facebook.imagepipeline.request.ImageRequest;
import bd.d;
import android.net.Uri;
import ib.c;
import android.database.Cursor;
import android.media.ExifInterface;
import nd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.Throwable;
import cb.a;
import android.provider.MediaStore$Images$Thumbnails;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class i extends j implements o0	// class@001136
{
    public final ContentResolver c;
    public static final Class d;
    public static final String[] e;
    public static final String[] f;
    public static final Rect g;
    public static final Rect h;

    static {
       i.d = i.class;
       String[] stringArray = new String[]{"_id","_data"};
       i.e = stringArray;
       stringArray = new String[]{"_data"};
       i.f = stringArray;
       i.g = new Rect(0, 0, 512, 384);
       i.h = new Rect(0, 0, 96, 96);
    }
    public void i(Executor p0,b p1,ContentResolver p2){
       super(p0, p1);
       this.c = p2;
    }
    public boolean a(d p0){
       int i;
       Rect g = i.g;
       i = g.width();
       return p0.b(i, g.height(), p0);
    }
    public d c(ImageRequest p0){
       int i;
       Uri uri = p0.s();
       d uod = null;
       if (!c.g(uri)) {
          return uod;
       }
       d uod1 = p0.p();
       if (uod1 != null) {
          Cursor uCursor = this.c.query(uri, i.e, null, null, null);
          if (uCursor != null) {
             if (uCursor.moveToFirst()) {
                uod1 = this.f(uod1, uCursor.getLong(uCursor.getColumnIndex("_id")));
                if (uod1 != null) {
                   String str = uCursor.getString(uCursor.getColumnIndex("_data"));
                   i = 0;
                   if (str != null) {
                      int i1 = 1;
                      try{
                         i = c.a(new ExifInterface(str).getAttributeInt("Orientation", i1));
                      }catch(java.io.IOException e4){
                         Object[] objArray = new Object[i1];
                         objArray[i] = str;
                         a.f(i.d, e4, "Unable to retrieve thumbnail rotation for %s", objArray);
                      }
                   }
                }
             }
             uCursor.close();
          }
       }
       return uod;
    }
    public String e(){
       return "LocalContentUriThumbnailFetchProducer";
    }
    public final d f(d p0,long p1){
       int i;
       int i1;
       Rect h = i.h;
       i = h.width();
       if (p0.b(i, h.height(), p0)) {
          i1 = 3;
       }else {
          h = i.g;
          i = h.width();
          i1 = (p0.b(i, h.height(), p0))? 1: 0;
       }
       d uod = null;
       if (!i1) {
          return uod;
       }else {
          Cursor uCursor = MediaStore$Images$Thumbnails.queryMiniThumbnail(this.c, p1, i1, i.f);
          if (uCursor == null) {
             return uod;
          }else if(uCursor.moveToFirst()){
             String str = uCursor.getString(uCursor.getColumnIndex("_data"));
             if (new File(str).exists()) {
                FileInputStream uFileInputSt = new FileInputStream(str);
                int i2 = (str == null)? -1: (int)new File(str).length();
                uCursor.close();
                return this.d(uFileInputSt, i2);
             }
          }
          uCursor.close();
          return uod;
       }
    }
}
