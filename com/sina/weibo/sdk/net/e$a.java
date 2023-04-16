package com.sina.weibo.sdk.net.e$a;
import java.lang.Object;
import android.os.Bundle;
import java.util.HashMap;
import java.lang.String;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Character;
import java.lang.Byte;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import java.util.Map;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.IllegalArgumentException;
import com.sina.weibo.sdk.net.e;

public final class e$a	// class@000bc3
{
    public String i;
    public Bundle j;
    public Bundle k;
    public Map l;
    public Map m;
    public int n;
    public int o;

    public void e$a(){
       super();
       this.j = new Bundle();
       this.k = new Bundle();
       this.l = new HashMap();
       this.m = new HashMap();
       this.n = 0x7530;
       this.o = 0xea60;
    }
    public final e$a a(String p0,Object p1){
       this.a(this.j, p0, p1);
       return this;
    }
    public final void a(Bundle p0,String p1,Object p2){
       if (p2 == null) {
          return;
       }
       if (p2 instanceof String) {
          p0.putString(p1, String.valueOf(p2));
          return;
       }else if(p2 instanceof Integer){
          p0.putInt(p1, p2.intValue());
          return;
       }else if(p2 instanceof Short){
          p0.putShort(p1, p2.shortValue());
          return;
       }else if(p2 instanceof Character){
          p0.putChar(p1, p2.charValue());
          return;
       }else if(p2 instanceof Byte){
          p0.putByte(p1, p2.byteValue());
          return;
       }else if(p2 instanceof Long){
          p0.putLong(p1, p2.longValue());
          return;
       }else if(p2 instanceof Float){
          p0.putFloat(p1, p2.floatValue());
          return;
       }else if(p2 instanceof Double){
          p0.putDouble(p1, p2.doubleValue());
          return;
       }else if(p2 instanceof Boolean){
          p0.putBoolean(p1, p2.booleanValue());
          return;
       }else if(p2 instanceof byte[]){
          this.m.put(p1, p2);
          return;
       }else if(p2 instanceof Serializable){
          SerializableHook.putSerializable(p0, p1, p2);
          return;
       }else {
          throw new IllegalArgumentException("Unsupported params type!");
       }
    }
    public final e$a b(String p0,Object p1){
       this.a(this.k, p0, p1);
       return this;
    }
    public final e e(){
       return new e(this);
    }
}
