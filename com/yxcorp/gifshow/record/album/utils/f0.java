package com.yxcorp.gifshow.record.album.utils.f0;
import u07.u;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kq.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.gifshow.record.album.utils.g0;
import java.lang.String;
import p8c.v;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.u;
import android.app.Activity;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import wba.p0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import brd.z;
import io.reactivex.android.schedulers.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import p8c.g;
import p8c.d;
import erd.a;
import crd.b;

public final class f0 implements u	// class@001766
{
    public final AtomicBoolean b;
    public final c c;
    public final b d;
    public final RxFragmentActivity e;
    public final boolean f;

    public void f0(AtomicBoolean p0,c p1,b p2,RxFragmentActivity p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(t p0,View p1){
       f0 tb = this.b;
       f0 tc = this.c;
       f0 td = this.d;
       f0 te = this.e;
       f0 tf = this.f;
       if (tb.get()) {
       }else {
          tb.set(true);
          String str = "pop_up_32_89_1";
          if (g0.e()) {
             v.e("edit", "cancel", str, tc.V0());
          }else {
             v.f("continue_edit_cancel", 1091, str, tc.V0());
          }
          if (td != null) {
             td.e(tc);
          }
          int i = 0;
          if (tc.a1() != Workspace$Type.KTV_SONG || (p.k(tc) && (PatchProxy.applyVoidTwoRefs(tc, te, null, p.class, "29") || (tc.o0() != null && te != null)))) {
             KtvInfo ktvInfo = u.N(tc);
             if (ktvInfo == null || ktvInfo.mMusic != null) {
                p.o(tc, te, ktvInfo, i);
             }
          }
       label_006c :
          Object[] objArray = new Object[i];
          a.D().w("DraftRecoverUtil", "Save recovered workspace "+tc.D0()+", type "+tc.a1().name(), objArray);
          p0.d(tc);
          tb.s0 = i;
          Object[] objArray1 = new Object[i];
          a.D().w("DraftRecoverUtil", "isActiveSaveLocalAlbum = "+tc.d1().F().b.s0, objArray1);
          b.q(tc.d1().F(), 4);
          DraftFileManager.E().b(tc).compose(te.E2(ActivityEvent.PAUSE)).observeOn(a.c()).subscribe(Functions.d(), new g(td, tc, tf), new d(tc, td, tf));
       }
       return;
    }
}
