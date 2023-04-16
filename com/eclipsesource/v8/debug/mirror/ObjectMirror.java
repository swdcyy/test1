package com.eclipsesource.v8.debug.mirror.ObjectMirror;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind;
import com.eclipsesource.v8.debug.mirror.PropertiesArray;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Value;
import java.lang.String;

public class ObjectMirror extends ValueMirror	// class@001005
{

    public void ObjectMirror(V8Object p0){
       super(p0);
    }
    public PropertiesArray getProperties(ObjectMirror$PropertyKind p0,int p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0.index);
       v8Array.push(p1);
       V8Array v8Array1 = this.v8Object.executeArrayFunction("properties", v8Array);
       PropertiesArray propertiesAr = new PropertiesArray(v8Array1);
       v8Array.close();
       if (v8Array1 != null && !v8Array1.isReleased()) {
          v8Array1.close();
       }
       return propertiesAr;
    }
    public String[] getPropertyNames(ObjectMirror$PropertyKind p0,int p1){
       V8Array v8Array = new V8Array(this.v8Object.getRuntime());
       v8Array.push(p0.index);
       v8Array.push(p1);
       V8Array v8Array1 = this.v8Object.executeArrayFunction("propertyNames", v8Array);
       p1 = v8Array1.length();
       String[] stringArray = new String[p1];
       for (int i = 0; i < p1; i = i + 1) {
          stringArray[i] = v8Array1.getString(i);
       }
       v8Array.close();
       v8Array1.close();
       return stringArray;
    }
    public boolean isObject(){
       return true;
    }
    public String toString(){
       return this.v8Object.toString();
    }
}
