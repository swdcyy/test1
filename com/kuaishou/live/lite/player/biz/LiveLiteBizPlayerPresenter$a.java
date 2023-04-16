package com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter$a;
import mq5.f;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import java.lang.Integer;
import lp3.e;
import lp3.c;
import lp3.b;
import mq5.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.a;

public final class LiveLiteBizPlayerPresenter$a implements f	// class@000a80
{
    public final LiveLiteBizPlayerPresenter b;

    public void LiveLiteBizPlayerPresenter$a(LiveLiteBizPlayerPresenter p0){
       this.b = p0;
       super();
    }
    public boolean H9(){
       boolean b;
       LiveLiteBizPlayerPresenter obj = PatchProxy.apply(null, this, LiveLiteBizPlayerPresenter$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.O;
       if (obj != null) {
          f uof = obj.V2();
          if (uof != null) {
             b = uof.H9();
          label_0026 :
             return b;
          }
       }
       b = false;
       goto label_0026 ;
    }
    public void Uk(int p0){
       LiveLiteBizPlayerPresenter$a uoa = LiveLiteBizPlayerPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       LiveLiteBizPlayerPresenter o = this.b.O;
       if (o != null) {
          f uof = o.V2();
          if (uof != null) {
             uof.Uk(p0);
          }
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void gf(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBizPlayerPresenter$a.class, "3")) {
          return;
       }
       LiveLiteBizPlayerPresenter o = this.b.O;
       if (o != null) {
          f uof = o.V2();
          if (uof != null) {
             uof.gf(p0);
          }
       }
       this.b.R.remove(p0);
       return;
    }
    public void h9(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBizPlayerPresenter$a.class, "2")) {
          return;
       }
       LiveLiteBizPlayerPresenter$a tb = this.b;
       LiveLiteBizPlayerPresenter o = tb.O;
       if (o != null) {
          a.m(o);
          o.V2().h9(p0);
       }else {
          tb.R.add(p0);
       }
       return;
    }
}
