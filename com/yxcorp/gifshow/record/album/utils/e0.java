package com.yxcorp.gifshow.record.album.utils.e0;
import u07.u;
import java.util.concurrent.atomic.AtomicBoolean;
import kq.b;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.String;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.record.album.utils.g;
import erd.g;
import crd.b;

public final class e0 implements u	// class@001764
{
    public final AtomicBoolean b;
    public final b c;
    public final BubbleEnterPostParam d;
    public final RxFragmentActivity e;
    public final int f;

    public void e0(AtomicBoolean p0,b p1,BubbleEnterPostParam p2,RxFragmentActivity p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(t p0,View p1){
       e0 tb = this.b;
       e0 tc = this.c;
       e0 td = this.d;
       e0 te = this.e;
       e0 tf = this.f;
       if (tb.get()) {
       }else {
          tb.set(true);
          if (tc != null) {
             tc.b();
          }
          DraftFileManager.E().X(new File(DraftFileManager.E().O(), td.getWorkspaceId())).observeOn(d.a).subscribe(new g(td, te, tf, tc));
       }
       return;
    }
}
