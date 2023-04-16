package com.yxcorp.gifshow.relation.explore.presenter.gallery.p$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.RecoUser;
import fac.b;
import org.json.JSONObject;
import a7c.h;
import com.kwai.framework.model.user.User;
import g7c.i;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class p$a extends m	// class@00184d
{
    public final p c;

    public void p$a(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       if (p0.getId() == 0x7f0a0415) {
          str = "background";
       }else if(p0.getId() == 0x7f0a0333 || p0.getId() == 0x7f0a2d10){
          str = "head";
       }else if(p0.getId() == 0x7f0a3cf6){
          str = "tag";
       }else if(p0.getId() == 0x7f0a3556 || p0.getId() == 0x7f0a355d){
          str = "reason_value";
       }else {
          str = "";
       }
       p$a tc = this.c;
       p v = tc.v;
       i.b(tc.p.mUser, v.b, v.j.k(), str);
       this.c.r.onNext(Integer.valueOf(3));
       return;
    }
}
