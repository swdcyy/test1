package com.facebook.common.references.SharedReference;
import java.util.IdentityHashMap;
import java.lang.Object;
import fb.c;
import ab.e;
import com.facebook.common.references.a;
import android.graphics.Bitmap;
import fb.a;
import java.util.Map;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import cb.a;
import com.facebook.common.references.SharedReference$NullReferenceException;

public class SharedReference	// class@001066
{
    public Object a;
    public int b;
    public final c c;
    public static final Map d;

    static {
       SharedReference.d = new IdentityHashMap();
    }
    public void SharedReference(Object p0,c p1){
       super();
       e.d(p0);
       this.a = p0;
       e.d(p1);
       this.c = p1;
       int i = 1;
       this.b = i;
       Map map = (a.g == 3)? 1: null;
       if (!map || (!p0 instanceof Bitmap && !p0 instanceof a)) {
          map = SharedReference.d;
          _monitor_enter(map);
          Integer integer = map.get(p0);
          if (integer == null) {
             map.put(p0, Integer.valueOf(i));
          }else {
             map.put(p0, Integer.valueOf((integer.intValue() + i)));
          }
          _monitor_exit(map);
       }
       return;
    }
    public void a(){
       _monitor_enter(this);
       this.b();
       int i = 0;
       int i1 = 1;
       int b = (this.b > null)? true: false;
       e.a(Boolean.valueOf(b));
       b = this.b - i1;
       this.b = b;
       _monitor_exit(this);
       if (!b) {
          _monitor_enter(this);
          SharedReference ta = this.a;
          this.a = 0;
          _monitor_exit(this);
          if (ta != null) {
             this.c.a(ta);
             Map d = SharedReference.d;
             _monitor_enter(d);
             Integer integer = d.get(ta);
             if (integer == null) {
                Object[] objArray = new Object[i1];
                objArray[i] = ta.getClass();
                a.B("SharedReference", "No entry in sLiveObjects for value of type %s", objArray);
             }else if(integer.intValue() == i1){
                d.remove(ta);
             }else {
                d.put(ta, Integer.valueOf((integer.intValue() - i1)));
             }
             _monitor_exit(d);
          }
       }
       return;
    }
    public final void b(){
       _monitor_enter(this);
       int i = 0;
       SharedReference$NullReferenceException nullReferenc = (this.b > null)? 1: null;
       _monitor_exit(this);
       if (nullReferenc) {
          i = 1;
       }
       if (i) {
          return;
       }else {
          throw new SharedReference$NullReferenceException();
       }
    }
    public synchronized Object c(){
       return this.a;
    }
}
