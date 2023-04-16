package com.yxcorp.gifshow.v3.editor.cover.a;
import im8.b;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.cover.j$a;
import java.lang.String;
import im8.e;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import wwc.n0;
import java.util.Set;
import java.util.HashSet;

public final class a implements b	// class@000e3d
{
    public Set a;
    public Set b;

    public void a(){
       super();
    }
    public void a(Object p0,Object p1){
       String str = "GENERATE_COVER_RESPONSE";
       if (e.e(p1, str)) {
          p0.d = e.c(p1, str);
       }
       str = "LISTENERS_MAP";
       if (e.e(p1, str)) {
          p0.e = e.c(p1, str);
       }
       if (e.e(p1, "EDIT_MONITOR_MANAGER")) {
          p0.f = e.c(p1, "EDIT_MONITOR_MANAGER");
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          this.a = new HashSet();
       }
       return this.a;
    }
    public void c(Object p0){
       p0.d = null;
       p0.e = null;
       p0.f = null;
    }
    public final Set d(){
       if (this.b == null) {
          this.b = new HashSet();
       }
       return this.b;
    }
}
