package com.yxcorp.gifshow.detail.common.rightactionbar.more.c;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import qz9.t;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import whc.k0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import whc.b;
import whc.a;
import brd.t;
import whc.q;
import sfc.a;
import erd.g;
import crd.b;

public final class c implements SlipSwitchButton$a	// class@0014b4
{
    public final t b;

    public void c(t p0){
       this.b = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, c.class, "1")) {
          return;
       }
       if (!p2) {
          return;
       }
       t r = this.b.r;
       if (r != null) {
          k0 ok0 = k0.class;
          if (!PatchProxy.isSupport(ok0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), r, ok0, "32")) {
             long l = Long.parseLong(r.a.getPhotoId());
             a.a().b(l, p1).subscribe(new q(r, p1), new a());
          }
       }
       return;
    }
}
