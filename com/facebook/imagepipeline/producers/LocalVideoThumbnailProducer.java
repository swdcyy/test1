package com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import id.b0;
import java.util.concurrent.Executor;
import android.content.ContentResolver;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import android.graphics.Bitmap;
import java.lang.String;
import android.os.ParcelFileDescriptor;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;
import ib.c;
import java.io.File;
import android.provider.DocumentsContract;
import android.provider.MediaStore$Video$Media;
import android.database.Cursor;
import id.i;
import id.c0;
import id.e0;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer$a;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer$b;
import id.i0;
import id.d0;
import java.lang.Runnable;

public class LocalVideoThumbnailProducer implements b0	// class@001124
{
    public final ContentResolver mContentResolver;
    public final Executor mExecutor;

    public void LocalVideoThumbnailProducer(Executor p0,ContentResolver p1){
       super();
       this.mExecutor = p0;
       this.mContentResolver = p1;
    }
    public static int calculateKind(ImageRequest p0){
       if (p0.l() > 96 || p0.k() > 96) {
          return 1;
       }
       return 3;
    }
    public static Bitmap createThumbnailFromContentProvider(ContentResolver p0,Uri p1){
       try{
          MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
          mediaMetadat.setDataSource(p0.openFileDescriptor(p1, "r").getFileDescriptor());
          return mediaMetadat.getFrameAtTime(-1);
       }catch(java.io.FileNotFoundException e0){
          return null;
       }
    }
    public String getLocalFilePath(ImageRequest p0){
       String str;
       Uri uri1;
       String[] stringArray1;
       Uri uri = p0.s();
       if (c.i(uri)) {
          return p0.r().getPath();
       }
       if (c.h(uri)) {
          if (("com.android.providers.media.documents").equals(uri.getAuthority())) {
             int i = 1;
             String[] stringArray = new String[i];
             stringArray[0] = (DocumentsContract.getDocumentId(uri)).split(":")[i];
             str = "_id=?";
             uri1 = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
             stringArray1 = stringArray;
          }else {
             uri1 = uri;
             str = null;
             stringArray1 = str;
          }
          String str1 = "_data";
          String[] stringArray2 = new String[]{str1};
          Cursor uCursor = this.mContentResolver.query(uri1, stringArray2, str, stringArray1, null);
          if (uCursor != null && uCursor.moveToFirst()) {
             uCursor.close();
             return uCursor.getString(uCursor.getColumnIndexOrThrow(str1));
          }else if(uCursor != null){
             uCursor.close();
          }
       }
       return null;
    }
    public void produceResults(i p0,c0 p1){
       e0 uoe0 = p1.l();
       p1.n("local", "video");
       LocalVideoThumbnailProducer$a uoa = new LocalVideoThumbnailProducer$a(this, p0, uoe0, p1, "VideoThumbnailProducer", uoe0, p1, p1.b());
       p1.k(new LocalVideoThumbnailProducer$b(this, v9));
       this.mExecutor.execute(v9);
    }
}
