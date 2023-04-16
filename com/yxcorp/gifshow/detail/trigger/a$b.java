package com.yxcorp.gifshow.detail.trigger.a$b;
import d6a.a;
import com.yxcorp.gifshow.detail.trigger.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.helper.f;
import java.util.Iterator;
import java.util.List;
import crd.b;
import brd.t;
import l9a.b;
import io.reactivex.internal.functions.Functions;
import erd.g;

public class a$b extends a	// class@001a1c
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "2")) {
          return;
       }
       a$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "3")) {
          tb.s.getPlayer().removeOnInfoListener(tb.x);
          a w = tb.w;
          if (w != null) {
             w.b();
             tb.w = objArray;
          }
          Iterator iterator = tb.t.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!uob.isDisposed()) {
                uob.dispose();
             }
          }
          tb.t.clear();
       }
       this.b.v = 0;
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "2")) {
          tb.s.getPlayer().addOnInfoListener(tb.x);
          f uof = new f();
          tb.w = uof;
          uof.d(tb.s.getPlayer());
          b uob = new b(tb);
          tb.t.add(tb.w.a().subscribe(uob, Functions.e));
       }
       return;
    }
}
