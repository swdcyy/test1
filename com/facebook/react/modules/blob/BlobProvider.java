package com.facebook.react.modules.blob.BlobProvider;
import android.content.ContentProvider;
import android.net.Uri;
import java.lang.String;
import android.content.ContentValues;
import android.os.ParcelFileDescriptor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import rd.m;
import rd.b0;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.bridge.NativeModule;
import android.os.ParcelFileDescriptor$AutoCloseOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import android.database.Cursor;

public final class BlobProvider extends ContentProvider	// class@00127a
{

    public void BlobProvider(){
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
       return true;
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BlobProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "Cannot open ";
       if (!p1.equals("r")) {
          throw new FileNotFoundException(str+p0.toString()+" in mode \'"+p1+"\'");
       }
       Context applicationC = this.getContext().getApplicationContext();
       BlobModule nativeModule = (applicationC instanceof m)? applicationC.a().b().n().getNativeModule(BlobModule.class): null;
       if (nativeModule != null) {
          byte[] uobyteArray = nativeModule.resolve(p0);
          if (uobyteArray != null) {
             try{
                ParcelFileDescriptor[] parcelFileDe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor$AutoCloseOutputStream uAutoCloseOu = new ParcelFileDescriptor$AutoCloseOutputStream(parcelFileDe[1]);
                uAutoCloseOu.write(uobyteArray);
                uAutoCloseOu.close();
                return parcelFileDe[0];
             }catch(java.io.IOException e0){
                return v2;
             }
          }else {
             throw new FileNotFoundException(str+p0.toString()+", blob not found.");
          }
       }else {
          throw new RuntimeException("No blob module associated with BlobProvider");
       }
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
