package com.kwai.feature.api.corona.util.CostReportWriterToDownload;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload$a;
import nsd.u;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload$SAVE_DIR$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import java.io.Closeable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.IOException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.util.List;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload$b;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.os.Build$VERSION;
import java.io.File;
import java.io.FileWriter;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.MediaStore$Downloads;
import android.database.Cursor;
import android.content.ContentUris;
import android.content.ContentValues;
import qrd.l1;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.lang.Iterable;
import cq9.a;
import java.lang.Exception;
import q87.c;

public final class CostReportWriterToDownload	// class@000e3b
{
    public final Context a;
    public final p b;
    public final List c;
    public boolean d;
    public final String e;
    public final String f;
    public static final CostReportWriterToDownload$a g;

    static {
       CostReportWriterToDownload.g = new CostReportWriterToDownload$a(null);
    }
    public void CostReportWriterToDownload(Context p0,String p1,String p2){
       a.p(p0, "ctx");
       a.p(p1, "reportFileName");
       a.p(p2, "newHeader");
       super();
       this.e = p1;
       this.f = p2;
       p0 = p0.getApplicationContext();
       a.o(p0, "ctx.applicationContext");
       this.a = p0;
       this.b = s.c(CostReportWriterToDownload$SAVE_DIR$2.INSTANCE);
       this.c = new ArrayList();
    }
    public final void a(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostReportWriterToDownload.class, "3")) {
          return;
       }
       try{
          p0.close();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, CostReportWriterToDownload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void c(String p0,boolean p1){
       CostReportWriterToDownload uCostReportW = CostReportWriterToDownload.class;
       if (PatchProxy.isSupport(uCostReportW) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uCostReportW, "4")) {
          return;
       }
       a.p(p0, "content");
       if (this.d != null) {
          return;
       }
       this.c.add(p0+10);
       if (p1) {
          this.d = true;
          c.a(new CostReportWriterToDownload$b(this));
       }
       return;
    }
    public final void d(){
       boolean columnIndexO;
       Uri uri;
       String str = "_display_name";
       String str1 = "_id";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CostReportWriterToDownload.class, "2")) {
          return;
       }
       if (!PermissionUtils.a(this.a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
          return;
       }
       CostReportWriterToDownload te = this.e;
       int i = 0;
       try{
          boolean b = true;
          if (Build$VERSION.SDK_INT < 29) {
             File uFile = new File(this.b()+'/'+te);
             CostReportWriterToDownload uCostReportW = (!uFile.exists())? 1: null;
             objArray = new FileWriter(uFile, b);
          }else {
             ContentResolver contentResol = this.a.getContentResolver();
             Uri contentUri = MediaStore$Downloads.getContentUri("external");
             a.o(contentUri, "MediaStore.Downloads.get¡­diaStore.VOLUME_EXTERNAL\)");
             String[] stringArray = new String[]{str1,str};
             String[] stringArray1 = new String[b];
             stringArray1[i] = te;
             Cursor uCursor = contentResol.query(contentUri, stringArray, "_display_name = ?", stringArray1, null);
             if (uCursor != null) {
                columnIndexO = uCursor.getColumnIndexOrThrow(str1);
                if (uCursor.moveToNext()) {
                   uri = ContentUris.withAppendedId(contentUri, uCursor.getLong(columnIndexO));
                   b = 0;
                }else {
                   uri = objArray;
                }
                uCursor.close();
             }else {
                uri = objArray;
             }
             if (uri == null) {
                ContentValues uContentValu = new ContentValues();
                uContentValu.put(str, te);
                uri = contentResol.insert(contentUri, uContentValu);
             }
             a.m(uri);
             ParcelFileDescriptor parcelFileDe = contentResol.openFileDescriptor(uri, "wa");
             if (parcelFileDe != null) {
                FileDescriptor fileDescript = parcelFileDe.getFileDescriptor();
                if (fileDescript != null) {
                   objArray = new FileWriter(fileDescript);
                }
             }
             columnIndexO = b;
          }
          if (objArray == null) {
             if (objArray != null) {
                this.a(objArray);
             }
             return;
          }else if(uCostReportW){
             objArray.write(this.f+10);
          }
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             objArray.write(iterator.next());
          }
          objArray.flush();
          objArray.close();
       }catch(java.lang.Exception e0){
          Object[] objArray1 = new Object[i];
          a.C().w("CostReportWriterToDownload", "---------writeInternal: exception "+e0.getMessage(), objArray1);
          if (objArray) {
          }else {
          label_011e :
             return;
          }
       }
       this.a(objArray);
       goto label_011e ;
    }
}
