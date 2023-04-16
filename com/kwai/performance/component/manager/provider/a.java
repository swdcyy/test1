package com.kwai.performance.component.manager.provider.a;
import ke7.a;
import java.lang.Object;
import android.content.Context;
import android.net.Uri;
import java.lang.String;
import android.content.ContentValues;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import android.database.Cursor;

public abstract class a implements a	// class@001047
{
    public Context mContext;

    public void a(){
       super();
    }
    public final void create(Context p0){
       this.mContext = p0;
       this.onCreate();
    }
    public int delete(Uri p0,String p1,String[] p2){
       return 0;
    }
    public final Context getContext(){
       return this.mContext;
    }
    public String getType(Uri p0){
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       return null;
    }
    public abstract boolean onCreate();
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       throw new FileNotFoundException("No files supported by provider at "+p0);
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
