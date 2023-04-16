package com.tencent.open.b.c;
import java.io.Serializable;
import android.os.Bundle;
import java.lang.Object;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import java.util.Map;
import java.lang.StringBuilder;

public class c implements Serializable	// class@000f46
{
    public final HashMap a;

    public void c(Bundle p0){
       super();
       this.a = new HashMap();
       if (p0 != null) {
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this.a.put(str, p0.getString(str));
          }
       }
       return;
    }
    public void c(HashMap p0){
       super();
       this.a = new HashMap(p0);
    }
    public String toString(){
       return "BaseData{time="+this.a.get("time")+", name="+this.a.get("interface_name")+'}';
    }
}
