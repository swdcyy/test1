package com.xiaomi.mipush.sdk.help.HelpContentProvider;
import android.content.ContentProvider;
import android.net.Uri;
import java.lang.String;
import android.content.Context;
import android.content.Intent;
import vs8.r0;
import android.content.ContentValues;
import android.database.Cursor;

public class HelpContentProvider extends ContentProvider	// class@0010f2
{

    public void HelpContentProvider(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       return 0;
    }
    public String getType(Uri p0){
       r0.a(this.getContext(), null, p0);
       return "success";
    }
    public Uri insert(Uri p0,ContentValues p1){
       return null;
    }
    public boolean onCreate(){
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
