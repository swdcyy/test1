package com.yxcorp.plugin.search.result.hashtag.presenters.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ced.a;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Boolean;
import mrd.a;
import vdd.c;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class a extends PresenterV2	// class@001f74
{
    public SearchResultExtParams p;
    public boolean q;
    public a r;
    public c s;
    public BaseFragment t;
    public b u;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.u == null) {
          this.u = this.r.subscribe(new a(this));
       }
       this.X7(this.u);
       return;
    }
    public void P8(boolean p0){
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("tag_detail_has_head_pic").booleanValue();
       this.r = this.r8("tag_detail_theme");
       this.s = this.q8(c.class);
       this.p = this.r8("TagInfoExtParams");
       this.t = this.r8("PageFragment");
       return;
    }
}
