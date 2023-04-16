package com.kuaishou.recruit.live.explain.anchor.c$a;
import mt4.b;
import com.kuaishou.recruit.live.explain.anchor.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import mt4.a;

public class c$a implements b	// class@000eb7
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.P8((p0 ^ 0x01));
       return;
    }
    public void b(LivePlusRecruitMessages$LiveRecruitPanelDisplay p0,boolean p1){
       a.a(this, p0, p1);
    }
}
