package com.kwai.feature.component.searchhistory.a$e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.searchhistory.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.lang.CharSequence;
import android.widget.TextView;
import g06.b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kwai.feature.component.searchhistory.a$a;
import android.view.View;
import ekd.m1;
import g06.c;
import qvb.i;
import y8c.a;
import im8.f;

public class a$e extends PresenterV2	// class@00129a
{
    public TextView p;
    public ImageView q;
    public ImageView r;
    public SearchHistoryData s;
    public i t;
    public a u;
    public f v;
    public final a w;

    public void a$e(a p0){
       this.w = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "4")) {
          return;
       }
       this.p.setText(this.s.mSearchWord);
       a$e tr = this.r;
       if (tr != null) {
          tr.setOnClickListener(new b(this));
       }
       a a = this.w.A;
       if (a != null) {
          a.a = this.s;
          a.b();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a12a0);
       this.r = m1.f(p0, 0x7f0a0782);
       m1.a(p0, new c(this), R.id.item_root);
       a a = this.w.A;
       if (a != null) {
          a.a(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       this.s = this.q8(SearchHistoryData.class);
       this.t = this.r8("DETAIL_PAGE_LIST");
       this.u = this.r8("FRAGMENT");
       this.v = this.x8("ADAPTER_POSITION");
       return;
    }
}
