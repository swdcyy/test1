package com.tencent.mm.opensdk.openapi.MMSharedPreferences;
import android.content.SharedPreferences;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import android.content.ContentResolver;
import android.content.SharedPreferences$Editor;
import com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor;
import java.util.Map;
import com.tencent.mm.opensdk.utils.a;
import android.net.Uri;
import android.database.Cursor;
import com.tencent.mm.opensdk.channel.a.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.util.Set;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public class MMSharedPreferences implements SharedPreferences	// class@000f1a
{
    public final String[] columns;
    public final ContentResolver cr;
    public MMSharedPreferences$REditor editor;
    public final HashMap values;

    public void MMSharedPreferences(Context p0){
       super();
       String[] stringArray = new String[]{"_id","key","type","value"};
       this.columns = stringArray;
       this.values = new HashMap();
       this.editor = null;
       this.cr = p0.getContentResolver();
    }
    public boolean contains(String p0){
       boolean b = (this.getValue(p0) != null)? true: false;
       return b;
    }
    public SharedPreferences$Editor edit(){
       if (this.editor == null) {
          this.editor = new MMSharedPreferences$REditor(this.cr);
       }
       return this.editor;
    }
    public Map getAll(){
       try{
          Cursor uCursor = this.cr.query(a.a, this.columns, null, null, null);
          if (uCursor == null) {
             return null;
          }
          int columnIndex = uCursor.getColumnIndex("key");
          int columnIndex1 = uCursor.getColumnIndex("type");
          int columnIndex2 = uCursor.getColumnIndex("value");
          while (uCursor.moveToNext()) {
             this.values.put(uCursor.getString(columnIndex), a.a(uCursor.getInt(columnIndex1), uCursor.getString(columnIndex2)));
          }
          uCursor.close();
          return this.values;
       }catch(java.lang.Exception e0){
          Log.e("MicroMsg.SDK.SharedPreferences", "getAll exception:"+e0.getMessage());
          return this.values;
       }
    }
    public boolean getBoolean(String p0,boolean p1){
       p0 = this.getValue(p0);
       if (p0 != null && p0 instanceof Boolean) {
          p1 = p0.booleanValue();
       }
       return p1;
    }
    public float getFloat(String p0,float p1){
       p0 = this.getValue(p0);
       if (p0 != null && p0 instanceof Float) {
          p1 = p0.floatValue();
       }
       return p1;
    }
    public int getInt(String p0,int p1){
       p0 = this.getValue(p0);
       if (p0 != null && p0 instanceof Integer) {
          p1 = p0.intValue();
       }
       return p1;
    }
    public long getLong(String p0,long p1){
       p0 = this.getValue(p0);
       if (p0 != null && p0 instanceof Long) {
          p1 = p0.longValue();
       }
       return p1;
    }
    public String getString(String p0,String p1){
       p0 = this.getValue(p0);
       if (p0 != null && p0 instanceof String) {
          p1 = p0;
       }
       return p1;
    }
    public Set getStringSet(String p0,Set p1){
       return null;
    }
    public final Object getValue(String p0){
       Object obj = null;
       try{
          String[] stringArray = new String[]{p0};
          Cursor uCursor = this.cr.query(a.a, this.columns, "key = ?", stringArray, null);
          if (uCursor == null) {
             return obj;
          }
          int columnIndex = uCursor.getColumnIndex("type");
          int columnIndex1 = uCursor.getColumnIndex("value");
          Object obj1 = (uCursor.moveToFirst())? a.a(uCursor.getInt(columnIndex), uCursor.getString(columnIndex1)): obj;
          uCursor.close();
          return obj1;
       }catch(java.lang.Exception e8){
          Log.e("MicroMsg.SDK.SharedPreferences", "getValue exception:"+e8.getMessage());
          return obj;
       }
    }
    public void registerOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
    }
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
    }
}
