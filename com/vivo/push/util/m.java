package com.vivo.push.util.m;
import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;

public final class m	// class@0010bb
{

    public static Map a(JSONObject p0){
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.keys();
       while (iterator.hasNext()) {
          String str = iterator.next();
          hashMap.put(str, p0.getString(str));
       }
       return hashMap;
    }
}
