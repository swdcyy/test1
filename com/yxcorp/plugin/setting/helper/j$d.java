package com.yxcorp.plugin.setting.helper.j$d;
import sfc.a;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oe6.e;
import ok.h;
import com.kwai.framework.model.user.QCurrentUser;

public class j$d extends a	// class@0008c0
{
    public final SlipSwitchButton c;
    public final j d;

    public void j$d(j p0,SlipSwitchButton p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$d.class, "1")) {
          return;
       }
       if (!this.d.i()) {
          super.b(p0);
          this.d.j(this.c);
       }else {
          e.q0(System.currentTimeMillis());
          j c = this.d.c;
          if (c != null) {
             c.apply(null);
          }else {
             QCurrentUser.ME.setNotRecommendToContacts(true).commitChanges();
          }
       }
       return;
    }
}
