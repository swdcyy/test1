package com.tencent.mm.opensdk.openapi.MMSharedPreferences$REditor;
import android.content.SharedPreferences$Editor;
import android.content.ContentResolver;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import android.content.ContentValues;
import com.tencent.mm.opensdk.utils.a;
import android.net.Uri;
import java.lang.String;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import com.tencent.mm.opensdk.utils.Log;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import java.lang.StringBuilder;
import java.lang.Class;

public class MMSharedPreferences$REditor implements SharedPreferences$Editor	// class@000f19
{
    public boolean clear;
    public ContentResolver cr;
    public Set remove;
    public Map values;

    public void MMSharedPreferences$REditor(ContentResolver p0){
       super();
       this.values = new HashMap();
       this.remove = new HashSet();
       this.clear = false;
       this.cr = p0;
    }
    public void apply(){
    }
    public SharedPreferences$Editor clear(){
       this.clear = true;
       return this;
    }
    public boolean commit(){
       String str1;
       Uri uri;
       ContentValues uContentValu = new ContentValues();
       if (this.clear != null) {
          this.cr.delete(a.a, null, null);
          this.clear = false;
       }
       Iterator iterator = this.remove.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          String[] stringArray = new String[i];
          stringArray[0] = iterator.next();
          this.cr.delete(a.a, "key = ?", stringArray);
       }
       iterator = this.values.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          MMSharedPreferences$REditor value = uEntry.getValue();
          String str = "MicroMsg.SDK.PluginProvider.Resolver";
          if (value == null) {
             str1 = "unresolve failed, null value";
          label_0055 :
             Log.e(str, str1);
             uri = null;
          }else if(value instanceof Integer){
             uri = 1;
          }else if(value instanceof Long){
             uri = 2;
          }else if(value instanceof String){
             uri = 3;
          }else if(value instanceof Boolean){
             uri = 4;
          }else if(value instanceof Float){
             uri = 5;
          }else if(value instanceof Double){
             uri = 6;
          }else {
             str1 = "unresolve failed, unknown type="+value.getClass().toString();
             goto label_0055 ;
          }
          if (!uri) {
             value = null;
          }else {
             uContentValu.put("type", Integer.valueOf(uri));
             uContentValu.put("value", value.toString());
             value = 1;
          }
          if (value) {
             String[] stringArray1 = new String[i];
             stringArray1[0] = uEntry.getKey();
             this.cr.update(a.a, uContentValu, "key = ?", stringArray1);
          }
       }
       return i;
    }
    public SharedPreferences$Editor putBoolean(String p0,boolean p1){
       this.values.put(p0, Boolean.valueOf(p1));
       this.remove.remove(p0);
       return this;
    }
    public SharedPreferences$Editor putFloat(String p0,float p1){
       this.values.put(p0, Float.valueOf(p1));
       this.remove.remove(p0);
       return this;
    }
    public SharedPreferences$Editor putInt(String p0,int p1){
       this.values.put(p0, Integer.valueOf(p1));
       this.remove.remove(p0);
       return this;
    }
    public SharedPreferences$Editor putLong(String p0,long p1){
       this.values.put(p0, Long.valueOf(p1));
       this.remove.remove(p0);
       return this;
    }
    public SharedPreferences$Editor putString(String p0,String p1){
       this.values.put(p0, p1);
       this.remove.remove(p0);
       return this;
    }
    public SharedPreferences$Editor putStringSet(String p0,Set p1){
       return null;
    }
    public SharedPreferences$Editor remove(String p0){
       this.remove.add(p0);
       return this;
    }
}
