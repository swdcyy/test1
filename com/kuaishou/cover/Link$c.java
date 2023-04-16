package com.kuaishou.cover.Link$c;
import java.lang.Runnable;
import com.kuaishou.cover.Link;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import android.util.LongSparseArray;
import a30.d;

public class Link$c implements Runnable	// class@0016cf
{
    public final long b;
    public final Link c;

    public void Link$c(Link p0,long p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, Link$c.class, "1")) {
          return;
       }
       try{
          String str = this.c.l();
          if (!TextUtils.isEmpty(str)) {
             LongSparseArray longSparseAr = this.c.d.get(str);
             if (longSparseAr != null && longSparseAr.size() > 0) {
                d uod = longSparseAr.get(this.b);
                if (uod != null) {
                   longSparseAr.remove(this.b);
                   uod.a(false);
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
