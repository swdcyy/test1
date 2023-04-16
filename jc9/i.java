package jc9.i;
import erd.g;
import jc9.j;
import java.lang.Object;
import ee9.c;
import java.util.Objects;
import jc9.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hc9.f;
import hc9.e;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ad9.i;
import j8c.a;
import q87.c;
import ee9.m;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import java.util.Map;
import fe9.h;

public final class i implements g	// class@002941
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String str1;
       m om;
       j q = this.b.q;
       Objects.requireNonNull(q);
       if (PatchProxy.applyVoidOneRefs(p0, q, b0.class, "6")) {
       }else {
          String str = 7;
          int i = 0;
          if (!q.e.a().h() instanceof MagicEmoji$MagicFace && (p0.a() && (q.d.l != null && (q.e.g() != str && q.e.g())))) {
             q.e.c(null, 2);
             str1 = 1;
          }else {
             str1 = null;
          }
          if (q.e.g() && q.e.g() != str) {
             Object[] objArray = new Object[i];
             a.D().s("AutoDownloadBarHandler", "other magic is downloading, return this", objArray);
          }else if(q.e.a() instanceof m){
             om = q.e.a();
          }else {
             om = new m();
          }
          if (p0.a != null) {
             om.u(true);
          }
          if (p0.b() != null) {
             om.y(7000);
          }
          om.z(str1);
          om.a(p0.c);
          om.w(p0.b, i);
          om.t(i);
          c uoc = q.f.f().V7();
          if (p0.a() && (uoc != null && (uoc.h() != null && uoc.h().d() == RecordBubbleItem.AUTO_DOWNLOAD_PANEL))) {
             q.f.f().V7().c();
          }
       label_00da :
          q.e.l(om);
          if (p0.b() != null) {
             om.t(true);
             q.b.clear();
             q.b.put("magicface", new h(p0.b()));
          }
          q.e.k(true);
       }
       return;
    }
}
