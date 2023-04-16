package com.kuaishou.live.core.basic.bulletin.BulletinUtils;
import java.lang.Object;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import i81.f$a$a;
import i81.f$a;
import i81.g;
import kotlin.jvm.internal.a;
import lp3.e;
import lp3.c;

public final class BulletinUtils	// class@00081c
{
    public static final BulletinUtils a;

    static {
       BulletinUtils.a = new BulletinUtils();
    }
    public void BulletinUtils(){
       super();
    }
    public static final void a(f p0,LiveBulletinLayoutManager p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, BulletinUtils.class, "3")) {
          return;
       }
       if (p1 != null) {
          p1.i(LiveBulletinStageType.Show, null);
       }
       if (p0 != null) {
          p0.b(f$a$a.a);
       }
       return;
    }
    public static final void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BulletinUtils.class, "1")) {
          return;
       }
       a.p(p0, "layoutManagerService");
       if (p0.R6()) {
          BulletinUtils.a(p0.nc(), p0.i7());
       }
       return;
    }
    public static final void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BulletinUtils.class, "2")) {
          return;
       }
       a.p(p0, "serviceManager");
       c uoc = p0.a(g.class);
       a.o(uoc, "serviceManager.getServic¡­nagerService::class.java\)");
       BulletinUtils.b(uoc);
       return;
    }
}
