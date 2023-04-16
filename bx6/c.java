package bx6.c;
import com.kwai.library.slide.base.widget.a$a;
import bx6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import bx6.e;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import yw6.g;
import yw6.h;
import uw6.e;

public class c implements a$a	// class@0004a9
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       u1.R("slide_up_load_more", "loadMore", 14);
       d g = this.b.g;
       if (g != null) {
          g.b();
       }
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "5")) {
          Iterator iterator = tb.h.iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
       }
       g og = this.b.d.e();
       if (og.isLoading()) {
          return;
       }else if(og.hasMore()){
          this.b.e.P0(4);
       }else {
          this.b.c();
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       d g = this.b.g;
       if (g != null) {
          Objects.requireNonNull(g);
       }
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "4")) {
          Iterator iterator = tb.h.iterator();
          while (iterator.hasNext()) {
             iterator.next().c();
          }
       }
       return;
    }
}
