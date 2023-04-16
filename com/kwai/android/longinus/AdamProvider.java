package com.kwai.android.longinus.AdamProvider;
import android.content.ContentProvider;
import c45.d;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.ContentValues;
import android.content.Context;
import com.kwai.android.longinus.TreeOfLiveIns;
import java.lang.Class;
import java.lang.reflect.Method;
import c45.g;
import java.lang.Boolean;
import java.lang.Throwable;
import android.database.Cursor;

public final class AdamProvider extends ContentProvider	// class@0009ba
{
    public static final d b;
    public static Instrumentation c;

    static {
       AdamProvider.b = new d();
    }
    public void AdamProvider(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       a.p(p0, "uri");
       return 0;
    }
    public String getType(Uri p0){
       a.p(p0, "uri");
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       a.p(p0, "uri");
       return null;
    }
    public boolean onCreate(){
       String str = "LonginusSpears";
       Context context = this.getContext();
       if (context == null) {
       }else if(AdamProvider.c instanceof TreeOfLiveIns){
          d.a(AdamProvider.b, context, true);
       }else {
          Class uClass = Class.forName("android.app.ActivityThread");
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          Class[] uClassArray1 = new Class[0];
          Object[] objArray1 = new Object[0];
          boolean b = uClass.getDeclaredMethod("getInstrumentation", uClassArray1).invoke(uClass.getDeclaredMethod("currentActivityThread", uClassArray).invoke(null, objArray), objArray1) instanceof TreeOfLiveIns;
          d.a(AdamProvider.b, context, b);
          g.a(str, a.C("flagOriginInstrumentation instrumentation=", Boolean.valueOf(b)));
       }
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       a.p(p0, "uri");
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       a.p(p0, "uri");
       return 0;
    }
}
