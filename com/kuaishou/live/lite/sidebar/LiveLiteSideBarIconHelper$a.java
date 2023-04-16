package com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$a;
import ub.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.System;
import com.kuaishou.live.lite.sidebar.d;
import android.graphics.drawable.Animatable;
import bd.f;
import msd.a;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;

public final class LiveLiteSideBarIconHelper$a extends a	// class@000b34
{
    public String b;
    public long c;
    public final LiveLiteSideBarIconHelper$Request d;

    public void LiveLiteSideBarIconHelper$a(LiveLiteSideBarIconHelper$Request p0){
       this.d = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteSideBarIconHelper$a.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       this.d.b().invoke(p1);
       this.d.d().setVisibility(8);
       this.d.a().setVisibility(0);
       LiveLiteSideBarIconHelper$a tb = this.b;
       a.m(tb);
       d.b(this.d.c(), "FAIL", this.d.e(), tb, p1.toString(), (System.currentTimeMillis() - this.c));
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteSideBarIconHelper$a.class, "2")) {
       }else {
          a.p(p0, "id");
          int i = 0;
          String str = null;
          if (p1 != null) {
             this.d.a.invoke();
             this.d.d().setVisibility(i);
             this.d.a().setVisibility(8);
             i = "SUCCESS";
          }else {
             this.d.b().invoke(str);
             this.d.d().setVisibility(8);
             this.d.a().setVisibility(i);
             str = "load Success, but ImageInfo is null";
             i = "FAIL";
          }
          LiveLiteSideBarIconHelper$a tb = this.b;
          a.m(tb);
          d.b(this.d.c(), i, this.d.e(), tb, str, (System.currentTimeMillis() - this.c));
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteSideBarIconHelper$a.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "callerContext");
       p1 = QCurrentUser.ME;
       a.o(p1, "QCurrentUser.ME");
       this.b = p1.getId()+"_"+System.currentTimeMillis();
       this.c = System.currentTimeMillis();
       LiveLiteSideBarIconHelper$a tb = this.b;
       a.m(tb);
       d.b(this.d.c(), "START", this.d.e(), tb, null, -1);
       return;
    }
}
