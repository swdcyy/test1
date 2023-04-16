package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$m;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import com.kuaishou.live.core.show.gift.GiftMessage;
import android.os.Handler;

public class GiftAnimContainerView$k implements GiftAnimContainerView$j, Runnable	// class@001123
{
    public GiftAnimItemView b;
    public Animator c;
    public d d;
    public String e;
    public GiftAnimContainerView$l f;
    public String g;
    public int h;
    public int i;
    public final GiftAnimContainerView j;

    public void GiftAnimContainerView$k(GiftAnimContainerView p0,GiftAnimItemView p1){
       this.j = p0;
       super();
       this.c = null;
       this.h = 0;
       this.b = p1;
       GiftAnimContainerView p = p0.p;
       GiftAnimContainerView$m c = p.c;
       int i = 1 << c;
       p.c = c + 1;
       p.d = p.d | i;
       this.i = i;
       p0.q.put(p1, this);
    }
    public void a(){
       GiftAnimContainerView p;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GiftAnimContainerView$k.class, "3")) {
          return;
       }
       GiftAnimContainerView$k th = this.h;
       if (th == 2) {
          this.h = 3;
          p = this.j.p;
          p.d = p.d | this.i;
          p.a();
       }else if(th == 4){
          this.h = 0;
          this.f = objArray;
          p = this.j.c;
          if (p != null && !p.isEmpty()) {
             this.j.p.a();
          }
       }
       return;
    }
    public void b(GiftAnimContainerView$l p0){
       GiftAnimContainerView p = this.j.p;
       p.d = p.d & (~ this.i);
       this.f = p0;
       this.h = 1;
    }
    public void c(){
       this.h = 4;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GiftAnimContainerView$k.class, "2")) {
          return;
       }
       this.h = 2;
       if (!PatchProxy.applyVoid(objArray, this, GiftAnimContainerView$k.class, "5")) {
          GiftAnimContainerView$k tf = this.f;
          if (tf != null) {
             this.g = tf.a.mMergeKey;
             this.j.p.postDelayed(this, 200);
          }
       }
       return;
    }
    public void run(){
       GiftAnimContainerView p;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GiftAnimContainerView$k.class, "4")) {
          return;
       }
       if (this.f != null) {
          GiftAnimContainerView$l ol = (this.j.getCandidateMergeKeys().contains(this.f.a.mMergeKey))? this.j.o(this.f.a.mMergeKey): objArray;
          if (ol != null) {
             this.j.c(this.b, ol, this);
             this.j.k(ol);
          }else {
             p = this.j.p;
             p.d = p.d | this.i;
             this.g = objArray;
          }
       }else {
          p = this.j.p;
          p.d = p.d | this.i;
          this.g = objArray;
       }
       return;
    }
}
