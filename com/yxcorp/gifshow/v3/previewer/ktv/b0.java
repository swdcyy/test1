package com.yxcorp.gifshow.v3.previewer.ktv.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.previewer.ktv.a0;
import crd.b;
import ok.h;
import lnc.b9;
import voc.o;
import io.reactivex.subjects.PublishSubject;
import hba.a;
import eba.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public class b0 extends PresenterV2	// class@0015b4
{
    public o p;
    public PublishSubject q;
    public a r;
    public a s;
    public EditorDelegate t;
    public b u;

    public void b0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       this.u = b9.c(this.u, new a0(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       b9.a(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_CONTEXT");
       this.q = this.r8("KTV_SONG_REMOVE_DECORATION_EVENT");
       this.r = this.r8("TEXT");
       this.s = this.r8("STICKER");
       this.t = this.r8("KTV_SONG_EDITOR_DELEGATE");
       return;
    }
}
