package com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.comment.e;
import java.lang.Object;
import crd.a;
import com.yxcorp.gifshow.comment.utils.b;
import java.lang.String;
import com.yxcorp.gifshow.comment.e$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import e8a.s0;
import msd.l;
import ek9.a;
import crd.b;

public class j	// class@0019a6
{
    public a a;
    public final Activity b;
    public final QPhoto c;
    public final PhotoDetailParam d;
    public final PublishSubject e;
    public final PublishSubject f;
    public final e g;
    public EmotionInfo h;
    public QMedia i;
    public String j;
    public boolean k;
    public boolean l;
    public b m;

    public void j(Activity p0,QPhoto p1,PhotoDetailParam p2,PublishSubject p3,PublishSubject p4,e p5){
       super();
       this.a = new a();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.m = new b(p0);
    }
    public boolean a(){
       return this.l;
    }
    public void b(QPhoto p0,String p1,boolean p2,e$c p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, j.class, "4")) {
          return;
       }
       this.l = true;
       b uob = this.g.i(this.b, a.d(p0, new s0(this, p2, p1, p3)));
       if (!PatchProxy.applyVoidOneRefs(uob, this, j.class, "5")) {
          this.a.c(uob);
       }
       return;
    }
}
