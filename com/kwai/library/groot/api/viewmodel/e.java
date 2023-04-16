package com.kwai.library.groot.api.viewmodel.e;
import tl8.g;
import java.lang.Object;
import h3.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cw6.b;
import cw6.c;
import cw6.d;
import java.util.List;
import java.util.Iterator;
import cw6.d$e;
import cw6.d$a;
import iw6.a;
import androidx.fragment.app.c;
import java.lang.StringBuilder;
import java.lang.String;
import lw6.a;
import java.util.Collection;
import ow6.a;
import java.util.LinkedList;
import androidx.fragment.app.Fragment;

public final class e implements g	// class@00082c
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void apply(Object p0){
       Iterator iterator;
       if (p0.l.b()) {
          c l = p0.l;
          if (!l.f.isEmpty()) {
             iterator = l.f.iterator();
             while (iterator.hasNext()) {
                d$e uoe = iterator.next();
                if (uoe instanceof d$a) {
                   uoe.e = false;
                }
             }
          }
       }
       p0 = p0.j;
       List fragments = p0.a.getFragments();
       a.b("NotifyLazyFragmentActiveHelper", "fragmentSize = "+fragments.size());
       if (!a.c(fragments)) {
          iterator = new LinkedList(fragments).iterator();
          while (iterator.hasNext()) {
             p0.b(iterator.next());
          }
       }
       return;
    }
}
