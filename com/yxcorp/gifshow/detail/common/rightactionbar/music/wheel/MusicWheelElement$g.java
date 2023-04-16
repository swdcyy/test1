package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import ss7.r;
import k2b.e0;
import py9.w;
import lnc.i3;
import p1a.a$a;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.a;
import tl8.g;
import p1a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class MusicWheelElement$g implements g	// class@0014bb
{
    public final MusicWheelElement b;

    public void MusicWheelElement$g(MusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, MusicWheelElement$g.class, "1")) {
       }else {
          p0 = this.b;
          MusicWheelElement e = p0.E;
          if (e != null) {
             MusicWheelElement u = p0.u;
             if (u == null) {
                a.S("mFragment");
             }
             e.b(obj, u, "TURNTABLE", true, this.b.E().h());
          }
          p0 = i3.f();
          p0.d("button_type", this.b.t0("button_type"));
          p0.d("is_turn", this.b.t0("is_turn"));
          p0.d("is_unfold", this.b.t0("is_unfold"));
          p0.d("music_id", this.b.t0("music_id"));
          if (a.g(this.b.t0("is_turn"), "FALSE")) {
             obj = "static_reason";
             p0.d(obj, this.b.t0(obj));
          }
          a$a uoa = a$a.c("MUSIC_TURNTABLE_BUTTON", "");
          uoa.h(new a(this));
          uoa.m(p0.e());
          uoa.r(true);
          MusicWheelElement.o0(this.b).a(uoa);
       }
       return;
    }
}
