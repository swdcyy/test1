package com.yxcorp.gifshow.record.album.utils.h;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kq.b;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.List;
import java.util.Arrays;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import hn5.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import laa.m0;
import laa.d0;
import java.util.concurrent.Callable;
import brd.z;
import p8c.j;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.record.album.utils.j;
import com.yxcorp.gifshow.record.album.utils.n;
import crd.b;
import k8c.a;
import q87.c;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.record.album.utils.m;
import com.yxcorp.gifshow.record.album.utils.g0;

public final class h implements g	// class@00176b
{
    public final RxFragmentActivity b;
    public final int c;
    public final b d;

    public void h(RxFragmentActivity p0,int p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       p0.l1(Phase.POST);
       int i = 0;
       if (!p0.E() && !DraftUtils.Y(p0)) {
          Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.PHOTO_MOVIE,Workspace$Type.LONG_PICTURE};
          if (!Arrays.asList(typeArray).contains(p0.a1()) || DraftFileManager.E().H(p0).exists()) {
             if (tb instanceof c) {
                RxBus.f.b(new c());
             }
             DraftFileManager uDraftFileMa = DraftFileManager.E();
             Objects.requireNonNull(uDraftFileMa);
             t ot = PatchProxy.applyOneRefs(p0, uDraftFileMa, DraftFileManager.class, "78");
             if (ot != PatchProxyResult.class) {
             }else if(!p0.D()){
                ot = t.error(new DraftEditException("getOpenFlag: draft "+p0.D0()+" is not editing"));
             }else {
                ot = t.fromCallable(new d0(uDraftFileMa, new File(p0.f0(), "flag.txt"))).subscribeOn(uDraftFileMa.c);
             }
             ot.doOnNext(new j(p0)).observeOn(a.c()).subscribe(new j(tb, tc, td, p0), n.b);
          label_00ee :
             return;
          }
       }
       Object[] objArray = new Object[i];
       a.D().w("DraftRecoverUtil", "Found new created ATLAS/PHOTO_MOVIE/LONG_PICTURE/INTOWN/OPEN_PLATFORM_MAGIC_MODE workspace, drop.", objArray);
       DraftFileManager.E().p(p0).subscribe(Functions.d(), m.b);
       g0.g(tb, tc, td);
       goto label_00ee ;
    }
}
