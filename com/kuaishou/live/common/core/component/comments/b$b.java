package com.kuaishou.live.common.core.component.comments.b$b;
import k81.h;
import com.kuaishou.live.common.core.component.comments.b;
import com.kuaishou.live.common.core.component.comments.LiveCommentDynamicBackgroundView;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import d61.g;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import r81.c;
import o81.g;
import java.util.Map;
import o81.d;
import ne1.j;
import ne1.i;
import crd.b;
import lnc.b9;
import k51.a;
import msd.a;
import msd.l;
import k51.b;

public class b$b extends h	// class@00105d
{
    public b f;
    public final b g;

    public void b$b(b p0,LiveCommentDynamicBackgroundView p1){
       this.g = p0;
       super(p1);
       g.b(p1, b$b.class.getCanonicalName());
    }
    public void a(View p0,QLiveMessage p1,int p2){
       if (!PatchProxy.isSupport(b$b.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b$b.class, "1")) {
          p0.setTextSize(this.g.b.d().h());
          d uod = this.g.a.get(p1.getClass());
          j oj = new j(this, p0, p1);
          if (uod != null) {
             b9.a(this.f);
             this.f = b.e(new i(this, uod, p1), oj, a.d());
          }else {
             oj.invoke("");
          }
       }
       return;
    }
    public void b(View p0,QLiveMessage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "3")) {
       }else {
          p0.a();
          b9.a(this.f);
       }
       return;
    }
}
