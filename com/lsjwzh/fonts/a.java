package com.lsjwzh.fonts.a;
import com.kwai.performance.component.manager.provider.a;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.net.Uri;
import android.content.ContentValues;
import android.os.ParcelFileDescriptor;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import java.lang.Long;
import com.lsjwzh.fonts.IFontsDownloader;
import java.lang.Integer;
import java.io.FileNotFoundException;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.lsjwzh.fonts.IFontsDownloader$DownloadStatus;

public class a extends a	// class@001478
{
    public static IFontsDownloader a;

    public void a(){
       super();
    }
    public static int a(String p0){
       int i;
       if (("r").equals(p0)) {
          i = 0x10000000;
       }else if(("w").equals(p0) || ("wt").equals(p0)){
          i = 0x2c000000;
       }else if(("wa").equals(p0)){
          i = 0x2a000000;
       }else if(("rw").equals(p0)){
          i = 0x38000000;
       }else if(("rwt").equals(p0)){
          i = 0x3c000000;
       }else {
          throw new IllegalArgumentException("Invalid mode: "+p0);
       }
       return i;
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
       boolean b = (a.a != null)? true: false;
       return b;
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       p1 = p0.getLastPathSegment();
       if (!TextUtils.isEmpty(p1) && (TextUtils.equals(this.getCallingPackage(), this.getContext().getPackageName()) && !Long.parseLong(p1) - a.a.d(""))) {
          return ParcelFileDescriptor.fromFd(Integer.parseInt(p1));
       }
       throw new FileNotFoundException(p0.toString());
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       Object[] objArray;
       int i3;
       int i = 1;
       MatrixCursor matrixCursor = new MatrixCursor(p1, i);
       int i1 = 7;
       int i2 = 0;
       Integer integer = Integer.valueOf(i2);
       if (p3 != null && p3.length) {
          objArray = (p1 != null && (p1.length == i1 && (("_id").equals(p1[i2]) && (("file_id").equals(p1[i]) && (("font_ttc_index").equals(p1[2]) && (("font_variation_settings").equals(p1[3]) && (("font_weight").equals(p1[4]) && (("font_italic").equals(p1[5]) && ("result_code").equals(p1[6])))))))))? 1: null;
          if (objArray) {
             object oobject = p3[i2];
             if (a.a.b(oobject)) {
                IFontsDownloader$DownloadStatus uDownloadSta = a.a.e(oobject);
                if (uDownloadSta == IFontsDownloader$DownloadStatus.DOWNLOADED) {
                   i3 = 0;
                }else if(uDownloadSta == IFontsDownloader$DownloadStatus.DOWNLOADING){
                   a.a.g(oobject);
                }
                i3 = 2;
             }else {
                i3 = 1;
             }
             Object[] objArray1 = new Object[i1];
             objArray1[i2] = Integer.valueOf(a.a.c(oobject));
             objArray1[i] = Long.valueOf(a.a.d(oobject));
             objArray1[2] = Integer.valueOf(a.a.i(oobject));
             objArray1[3] = a.a.f(oobject);
             objArray1[4] = Integer.valueOf(a.a.a(oobject));
             objArray1[5] = Integer.valueOf(a.a.h(oobject));
             objArray1[6] = Integer.valueOf(i3);
             matrixCursor.addRow(objArray1);
             return matrixCursor;
          }
       }
    label_00da :
       objArray = new Object[i1];
       objArray[i2] = integer;
       objArray[i] = Long.valueOf(0);
       objArray[2] = integer;
       objArray[3] = "";
       objArray[4] = Integer.valueOf(-1);
       objArray[5] = Integer.valueOf(-1);
       objArray[6] = Integer.valueOf(3);
       matrixCursor.addRow(objArray);
       return matrixCursor;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
