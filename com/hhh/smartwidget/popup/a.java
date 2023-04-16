package com.hhh.smartwidget.popup.a;
import com.hhh.smartwidget.popup.PopupInterface$g;
import java.lang.Object;
import java.util.WeakHashMap;
import android.app.Activity;
import java.util.List;
import java.util.Iterator;
import com.hhh.smartwidget.popup.c;
import com.hhh.smartwidget.popup.PopupInterface$Excluded;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;

public class a implements PopupInterface$g	// class@000594
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
             if (uoc.l()) {
                uoc.d(0);
             }else {
                uoc.c();
             }
          }
       }
       return;
    }
    public void b(Activity p0,c p1){
       this.j(p0, p1);
       List list = this.g(p0);
       c uoc = null;
       if (!list.isEmpty()) {
          Iterator iterator = list.iterator();
          do {
             if (iterator.hasNext()) {
             }else {
             label_0025 :
                list = this.a.get(p0);
                if (list == null || (!list.isEmpty() && !p0.isFinishing())) {
                   Iterator iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      c uoc1 = iterator1.next();
                   }
                }
             }
          } while (!c.k(iterator.next()));
       }else {
          goto label_0025 ;
       }
       if (uoc != null) {
          uoc.q();
       }
       return;
    }
    public void c(Activity p0,c p1){
       this.i(p0, p1);
    }
    public void d(Activity p0,c p1){
       this.i(p0, p1);
    }
    public boolean e(Activity p0,c p1){
       if (this.h(p0) || p1.g() == PopupInterface$Excluded.NOT_AGAINST) {
          return true;
       }
       boolean b = false;
       if (p1.g() == PopupInterface$Excluded.ALL_TYPE) {
          return b;
       }
       Iterator iterator = this.g(p0).iterator();
       while (iterator.hasNext()) {
          if (TextUtils.equals(iterator.next().i(), p1.i())) {
             b = 1;
             break ;
          }
       }
       return (b ^ 0x01);
    }
    public void f(Activity p0,c p1){
       this.j(p0, p1);
    }
    public final List g(Activity p0){
       ArrayList uArrayList = new ArrayList();
       if (this.h(p0)) {
          return uArrayList;
       }
       List list = this.a.get(p0);
       if (list == null) {
          list = new ArrayList();
       }
       Iterator iterator = Collections.unmodifiableList(list).iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc.l()) {
             uArrayList.add(uoc);
          }
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public boolean h(Activity p0){
       List list = this.a.get(p0);
       boolean b = (list == null || list.isEmpty())? true: false;
       return b;
    }
    public final void i(Activity p0,c p1){
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
    public final void j(Activity p0,c p1){
       List list = this.a.get(p0);
       if (list != null) {
          list.remove(p1);
       }
       return;
    }
}
