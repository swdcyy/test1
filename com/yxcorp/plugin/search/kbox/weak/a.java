package com.yxcorp.plugin.search.kbox.weak.a;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.kbox.weak.ReduceView;
import android.view.View;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.ExtInfo;
import cbd.e;
import android.view.View$OnLongClickListener;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends n	// class@001e8b
{
    public BaseFragment p;
    public SearchItem q;
    public View r;
    public View s;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       a tr = this.r;
       if (tr != null && tr instanceof ReduceView) {
          tr.setDisPatchView(this.s);
          if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             uoa = this.r;
             if (uoa != null) {
                SearchItem mExtInfo = this.q.mExtInfo;
                if (mExtInfo != null && mExtInfo.mSearchFeedBackEntity != null) {
                   uoa.setOnLongClickListener(new e(this));
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3531);
       this.s = m1.f(p0, 0x7f0a0f93);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(SearchItem.class);
       return;
    }
}
