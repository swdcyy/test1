package com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$b;
import erd.g;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import java.lang.Object;
import gi9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.PostStartUpResponse;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$PostStartUpData;
import com.kuaishou.android.model.music.Music;
import kotlin.jvm.internal.a;
import java.util.Objects;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import com.yxcorp.gifshow.camera.record.base.d;
import k2b.e0;
import k2b.u1;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.music.g;
import t16.a;
import com.yxcorp.gifshow.camera.record.music.g$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.music.data.MusicSource;
import brd.t;
import t45.d;
import brd.z;
import ag9.a;
import erd.o;
import ag9.b;
import erd.a;
import bp6.a;
import ag9.c;
import crd.b;
import java.util.ArrayList;

public final class BaseRecoCollectMusicController$b implements g	// class@000e8d
{
    public final BaseRecoCollectMusicController b;

    public void BaseRecoCollectMusicController$b(BaseRecoCollectMusicController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       BaseRecoCollectMusicController uBaseRecoCol = BaseRecoCollectMusicController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController$b.class, "1")) {
       }else {
          p0 = p0.a().a();
          if (p0 != null) {
             int i = 0;
             String str = "RecoCollectMusicController";
             if (p0.c() != null) {
                BaseRecoCollectMusicController$b tb = this.b;
                Music music = p0.c();
                a.m(music);
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(music, tb, uBaseRecoCol, "15")) {
                   a.p(music, "music");
                   h$b uob = h$b.e(1, "RECO_MUSIC_DATA");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "RECO_MUSIC_DATA";
                   i3 oi3 = i3.f();
                   oi3.d("music_id", music.getId());
                   uElementPack.params = oi3.e();
                   uob.k(uElementPack);
                   u1.p0("", tb.e, uob);
                }
                music = p0.c();
                a.m(music);
                this.b.v = music;
                tb = this.b;
                p0 = p0.c();
                a.m(p0);
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, uBaseRecoCol, "6")) {
                   Object[] objArray = new Object[i];
                   a.D().w(str, "start download music : "+p0.getId(), objArray);
                   d e = tb.e;
                   a.o(e, "mActivity");
                   tb.r.add(g$a.e(g.e, new a("record", "inner_resource"), e, p0, false, null, 16, null).observeOn(d.a).map(new a(tb)).doOnComplete(new b(tb, p0)).subscribe(new a(), c.b));
                }
             }else {
                Object[] objArray1 = new Object[i];
                a.D().w(str, "no recordRecoCollectMusic", objArray1);
             }
          }
       }
       return;
    }
}
