package com.kuaishou.live.preview.item.feedback.a$a;
import d6a.a;
import com.kuaishou.live.preview.item.feedback.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import com.kuaishou.live.feedback.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;

public class a$a extends a	// class@000de0
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       if (g.h(this.b.getActivity())) {
          return;
       }
       a p = this.b.p;
       if (p != null) {
          p.c();
       }
       this.b.getActivity().l3(this.b.w);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       if (g.h(this.b.getActivity())) {
          return;
       }
       a p = this.b.p;
       if (p != null) {
          p.c();
       }
       this.b.getActivity().F2(this.b.w);
       return;
    }
}
