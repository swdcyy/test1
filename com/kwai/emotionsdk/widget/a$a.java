package com.kwai.emotionsdk.widget.a$a;
import android.text.TextWatcher;
import android.text.SpanWatcher;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import dk5.f;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.lang.Integer;
import android.text.Spannable;

public class a$a implements TextWatcher, SpanWatcher	// class@000dc7
{
    public final Object b;
    public final AtomicInteger c;

    public void a$a(Object p0){
       super();
       this.c = new AtomicInteger(0);
       this.b = p0;
    }
    public final boolean a(Object p0){
       return p0 instanceof f;
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.b.afterTextChanged(p0);
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a$a.class, "1")) {
          return;
       }
       this.b.beforeTextChanged(p0, p1, p2, p3);
       return;
    }
    public void onSpanAdded(Spannable p0,Object p1,int p2,int p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a$a.class, "4")) {
          return;
       }
       if (this.c.get() > 0 && this.a(p1)) {
          return;
       }
       this.b.onSpanAdded(p0, p1, p2, p3);
       return;
    }
    public void onSpanChanged(Spannable p0,Object p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(a$a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, a$a.class, "6")) {
             return;
          }
       }
       if (this.c.get() > 0 && this.a(p1)) {
          return;
       }else {
          this.b.onSpanChanged(p0, p1, p2, p3, p4, p5);
          return;
       }
    }
    public void onSpanRemoved(Spannable p0,Object p1,int p2,int p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a$a.class, "5")) {
          return;
       }
       if (this.c.get() > 0 && this.a(p1)) {
          return;
       }
       this.b.onSpanRemoved(p0, p1, p2, p3);
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a$a.class, "2")) {
          return;
       }
       this.b.onTextChanged(p0, p1, p2, p3);
       return;
    }
}
