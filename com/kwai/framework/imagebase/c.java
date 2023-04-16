package com.kwai.framework.imagebase.c;
import l0d.c;
import java.lang.Object;
import android.content.Context;
import android.net.Uri;
import zc.a;
import com.kwai.library.widget.icon.b;
import java.util.Map;
import java.lang.String;
import android.content.res.Resources;
import java.lang.CharSequence;
import java.lang.Integer;
import android.util.Pair;
import java.lang.ref.WeakReference;
import uz6.a;

public final class c implements c	// class@000b5a
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final a a(Context p0,Uri p1){
       Application e;
       a uoa = null;
       if (p1 == null) {
       }else if(p0 == null){
          e = b.e;
       }
       if (e != null) {
          Map g = b.g;
          if (g == null || (!g.isEmpty() && ("res").equals(p1.getScheme()))) {
             Resources resources = e.getResources();
             if (resources != null && b.i(resources)) {
                try{
                   Pair pair = b.g.get(Integer.valueOf((p1.getPath()).replace("/", "")));
                   if (pair != null) {
                      uoa = new a(resources, uoa, new WeakReference(e), pair);
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
    label_0056 :
       return uoa;
    }
}
