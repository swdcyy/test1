package com.yxcorp.gifshow.record.album.utils.g;
import erd.g;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kq.b;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.record.album.utils.k;
import p8c.h;
import com.yxcorp.gifshow.record.album.utils.r;
import crd.b;

public final class g implements g	// class@00176a
{
    public final BubbleEnterPostParam b;
    public final RxFragmentActivity c;
    public final int d;
    public final b e;

    public void g(BubbleEnterPostParam p0,RxFragmentActivity p1,int p2,b p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       a.D().w("DraftRecoverUtil", "bubble source, Edit recovered workspace "+p0.a1().name(), objArray);
       DraftFileManager.E().m0(p0).observeOn(d.a).doOnNext(k.b).subscribe(new h(this.b, this.c, this.d, this.e), r.b);
    }
}
