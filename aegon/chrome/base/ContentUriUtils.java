package aegon.chrome.base.ContentUriUtils;
import java.lang.Object;
import java.lang.String;
import android.content.res.AssetFileDescriptor;
import android.content.Context;
import a0.f;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import java.lang.SecurityException;
import android.os.ParcelFileDescriptor;
import a0.n;
import android.database.Cursor;
import com.kuaishou.webkit.MimeTypeMap;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.os.Build$VERSION;
import android.provider.DocumentsContract;
import java.io.File;
import aegon.chrome.base.ContentUriUtils$a;
import java.lang.CharSequence;
import android.text.TextUtils;

public abstract class ContentUriUtils	// class@000134
{
    public static ContentUriUtils$a a;
    public static final Object b;
    public static final boolean c;

    static {
       ContentUriUtils.b = new Object();
    }
    public void ContentUriUtils(){
       super();
    }
    public static AssetFileDescriptor a(String p0){
       int i;
       ContentResolver contentResol = f.a().getContentResolver();
       Uri uri = Uri.parse(p0);
       try{
          i = 0;
          if (ContentUriUtils.d(uri)) {
             String[] streamTypes = contentResol.getStreamTypes(uri, "*/*");
             if (streamTypes != null && streamTypes.length > 0) {
                AssetFileDescriptor uAssetFileDe = contentResol.openTypedAssetFileDescriptor(uri, streamTypes[i], null);
                if (uAssetFileDe == null || !uAssetFileDe.getStartOffset()) {
                   return uAssetFileDe;
                }else {
                   try{
                      uAssetFileDe.close();
                      throw new SecurityException("Cannot open files with non-zero offset type.");
                   }catch(java.io.IOException e0){
                   }
                }
             }
          }else {
             ParcelFileDescriptor parcelFileDe = contentResol.openFileDescriptor(uri, "r");
             if (parcelFileDe != null) {
                AssetFileDescriptor uAssetFileDe1 = new AssetFileDescriptor(parcelFileDe, 0, -1);
                return contentResol;
             }
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[2];
          objArray[i] = p0;
          objArray[1] = e0;
          n.h("ContentUriUtils", "Cannot open content uri: %s", objArray);
       }
       return null;
    }
    public static String b(Uri p0,Context p1,String p2){
       if (p0 == null) {
          return "";
       }
       ContentResolver contentResol = p1.getContentResolver();
       String[] stringArray = null;
       ContentResolver uContentReso = contentResol;
       try{
          int i = p0;
          Cursor uCursor = uContentReso.query(i, stringArray, null, null, null);
          if (uCursor != null && uCursor.getCount() >= 1) {
             uCursor.moveToFirst();
             int columnIndex = uCursor.getColumnIndex(p2);
             if (columnIndex == -1) {
                uCursor.close();
                return "";
             }else {
                columnIndex = uCursor.getString(columnIndex);
                if (ContentUriUtils.c(uCursor)) {
                   String[] streamTypes = contentResol.getStreamTypes(p0, "*/*");
                   if (streamTypes != null && streamTypes.length > 0) {
                      String extensionFro = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0]);
                      if (extensionFro != null) {
                         columnIndex = columnIndex+"."+extensionFro;
                      }
                   }
                }
                uCursor.close();
                return columnIndex;
             }
          }else if(uCursor != null){
             uCursor.close();
          }
          return e0;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static boolean c(Cursor p0){
       boolean b = false;
       if (Build$VERSION.SDK_INT < 24) {
          return b;
       }
       int columnIndex = p0.getColumnIndex("flags");
       if (columnIndex > -1 && (p0.getLong(columnIndex) & 512)) {
          b = true;
       }
       return b;
    }
    public static boolean contentUriExists(String p0){
       AssetFileDescriptor uAssetFileDe = ContentUriUtils.a(p0);
       boolean b = (uAssetFileDe != null)? true: false;
       try{
          if (uAssetFileDe != null) {
             uAssetFileDe.close();
          }
          return e0;
       }catch(java.io.IOException e0){
       }
    }
    public static boolean d(Uri p0){
       if (p0 == null) {
          return false;
       }
       if (!DocumentsContract.isDocumentUri(f.a(), p0)) {
          return false;
       }
       ContentResolver contentResol = f.a().getContentResolver();
       try{
          int i = p0;
          Cursor uCursor = contentResol.query(i, null, null, null, null);
          if (uCursor != null && uCursor.getCount() >= 1) {
             uCursor.moveToFirst();
             uCursor.close();
             return ContentUriUtils.c(uCursor);
          }else if(uCursor != null){
             uCursor.close();
          }
          return e0;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static boolean delete(String p0){
       boolean b = (f.a().getContentResolver().delete(Uri.parse(p0), null, null) > 0)? true: false;
       return b;
    }
    public static String getContentUriFromFilePath(String p0){
       Uri uri;
       String str = null;
       try{
          File uFile = new File(p0);
          Object b = ContentUriUtils.b;
          _monitor_enter(b);
          ContentUriUtils$a a = ContentUriUtils.a;
          if (a != null) {
             uri = a.a(uFile);
             _monitor_exit(b);
          }else {
             _monitor_exit(b);
             uri = str;
          }
          if (uri != null) {
             return uri.toString();
          }
       }catch(java.lang.IllegalArgumentException e1){
          Object[] objArray = new Object[]{p0,e1};
          n.a("ContentUriUtils", "Cannot retrieve content uri from file: %s", objArray);
       }
       return str;
    }
    public static String getMimeType(String p0){
       ContentResolver contentResol = f.a().getContentResolver();
       Uri uri = Uri.parse(p0);
       if (!ContentUriUtils.d(uri)) {
          return contentResol.getType(uri);
       }
       String[] streamTypes = contentResol.getStreamTypes(uri, "*/*");
       object oobject = (streamTypes != null && streamTypes.length > 0)? streamTypes[0]: null;
       return oobject;
    }
    public static String maybeGetDisplayName(String p0){
       int i;
       String str;
       Uri uri = Uri.parse(p0);
       try{
          i = 0;
          str = ContentUriUtils.b(uri, f.a(), "_display_name");
          if (!TextUtils.isEmpty(str)) {
             String str1 = str;
          }
          return i;
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{TextUtils.isEmpty(str),e0};
          n.h("ContentUriUtils", "Cannot open content uri: %s", objArray);
          return i;
       }
    }
    public static int openContentUriForRead(String p0){
       AssetFileDescriptor uAssetFileDe = ContentUriUtils.a(p0);
       if (uAssetFileDe != null) {
          return uAssetFileDe.getParcelFileDescriptor().detachFd();
       }
       return -1;
    }
}
