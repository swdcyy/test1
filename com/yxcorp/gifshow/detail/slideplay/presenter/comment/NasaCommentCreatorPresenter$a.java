package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter$a;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.e$f;
import com.yxcorp.gifshow.comment.e$g;
import tkd.b;
import tkd.d;
import jyb.a;
import java.lang.Throwable;

public class NasaCommentCreatorPresenter$a implements e$b	// class@001846
{
    public final NasaCommentCreatorPresenter b;

    public void NasaCommentCreatorPresenter$a(NasaCommentCreatorPresenter p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       c1.e(this, p0, p1);
    }
    public void N1(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NasaCommentCreatorPresenter$a.class, "1")) {
          return;
       }
       e a = this.b.y.a;
       if (a != null) {
          a.b(p1);
       }
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NasaCommentCreatorPresenter$a.class, "2")) {
          return;
       }
       if (d.a(-1079301847).AM()) {
          p2.a();
       }
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
