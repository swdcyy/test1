package com.kwai.library.widget.popup.common.a;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import java.lang.Object;
import java.util.WeakHashMap;
import android.app.Activity;
import java.util.List;
import java.util.Iterator;
import com.kwai.library.widget.popup.common.c;
import java.util.ArrayList;
import java.util.Collections;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a implements PopupInterface$i	// class@00098c
{
    public final WeakHashMap a;

    public void a(){
       super();
       this.a = new WeakHashMap();
    }
    public void a(Activity p0){
       List list = this.a.remove(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (uoc.K()) {
                uoc.q(0);
             }else {
                uoc.n();
             }
          }
       }
       return;
    }
    public void b(Activity p0){
       List list = this.i(p0);
       c uoc = null;
       if (!list.isEmpty()) {
          Iterator iterator = list.iterator();
          do {
             if (iterator.hasNext()) {
             }else {
             label_0022 :
                list = this.a.get(p0);
                if (list == null || (!list.isEmpty() && !p0.isFinishing())) {
                   Iterator iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      c uoc1 = iterator1.next();
                   }
                }
             }
          } while (!c.E(iterator.next()));
       }else {
          goto label_0022 ;
       }
       if (uoc != null) {
          uoc.Z();
       }
       return;
    }
    public void c(Activity p0,c p1){
       this.l(p0, p1);
       this.b(p0);
    }
    public List d(Activity p0){
       List list = this.a.get(p0);
       if (list == null) {
          list = new ArrayList();
       }
       return Collections.unmodifiableList(list);
    }
    public void e(Activity p0,c p1){
       this.l(p0, p1);
    }
    public boolean f(Activity p0,c p1){
       if (this.j(p0) || p1.v() == PopupInterface$Excluded.NOT_AGAINST) {
          return true;
       }
       boolean b = false;
       if (p1.v() == PopupInterface$Excluded.ALL_TYPE) {
          return b;
       }
       Iterator iterator = this.d(p0).iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (p1 != uoc && TextUtils.equals(uoc.y(), p1.y())) {
             b = 1;
             break ;
          }
       }
       return (b ^ 0x01);
    }
    public void g(Activity p0,c p1){
       this.k(p0, p1);
    }
    public void h(Activity p0,c p1){
       this.k(p0, p1);
    }
    public List i(Activity p0){
       ArrayList uArrayList = new ArrayList();
       if (this.j(p0)) {
          return uArrayList;
       }
       Iterator iterator = this.d(p0).iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc.K()) {
             uArrayList.add(uoc);
          }
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public boolean j(Activity p0){
       List list = this.a.get(p0);
       boolean b = (list == null || list.isEmpty())? true: false;
       return b;
    }
    public final void k(Activity p0,c p1){
       List list = this.a.get(p0);
       if (list == null) {
          list = new ArrayList();
          this.a.put(p0, list);
       }
       if (!list.contains(p1)) {
          list.add(p1);
       }
       return;
    }
    public final void l(Activity p0,c p1){
       List list = this.a.get(p0);
       if (list != null) {
          list.remove(p1);
       }
       return;
    }
}
