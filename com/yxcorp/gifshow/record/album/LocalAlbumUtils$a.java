package com.yxcorp.gifshow.record.album.LocalAlbumUtils$a;
import brd.v;
import java.lang.Object;
import crd.a;
import java.util.TreeMap;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Map;
import m8c.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import brd.g;
import ok.n;

public class LocalAlbumUtils$a	// class@001708
{
    public Map a;
    public v b;
    public a c;

    public void LocalAlbumUtils$a(v p0){
       super();
       this.b = p0;
       this.c = new a();
       this.a = new TreeMap();
       for (int i = 0; i <= 2; i++) {
          this.a.put(Integer.valueOf(i), new ArrayList());
       }
       return;
    }
    public final void a(int p0,e p1){
       LocalAlbumUtils$a uoa = LocalAlbumUtils$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       this.a.get(Integer.valueOf(p0)).add(p1);
       this.b();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumUtils$a.class, "4")) {
          return;
       }
       while (true) {
          if (this.b.isDisposed()) {
          }else {
             Iterator iterator = this.a.entrySet().iterator();
             Integer integer = -1;
             boolean b = true;
             Object[] objArray = null;
             e uoe = 1;
             int i = -1;
             while (true) {
                if (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   List value = uEntry.getValue();
                   if (value.isEmpty()) {
                      return;
                   }else if(value.get(0) != null){
                      if (objArray == null || value.get(0).e() - objArray.e() > 0) {
                         objArray = value.get(0);
                         i = uEntry.getKey().intValue();
                      }
                      uoe = null;
                   }
                }else if(uoe != null){
                }else if(objArray != null && i != integer){
                   b = false;
                }
                n.b(b);
                this.a.get(Integer.valueOf(i)).remove(0);
                this.b.onNext(objArray);
             }
             return;
          }
       }
       this.b.onComplete();
       return;
    }
    public final void c(int p0){
       LocalAlbumUtils$a uoa = LocalAlbumUtils$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.get(Integer.valueOf(p0)).add(null);
       this.b();
       return;
    }
}
