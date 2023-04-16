package com.yxcorp.plugin.search.utils.g0;
import com.yxcorp.plugin.search.utils.f0$c;
import com.yxcorp.plugin.search.utils.f0;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.Object;
import nfd.a3;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import android.view.View;
import lyb.h;

public class g0 implements f0$c	// class@00079b
{
    public final QRecoTag a;
    public final f0 b;

    public void g0(f0 p0,QRecoTag p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(boolean p0){
       a3.a(this, p0);
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "2")) {
          return;
       }
       this.b.d(this.a, 1, "CLICK_BACK_SUBCARD", p0, null);
       g0 tb = this.b;
       if (tb.d != null) {
          tb.i(tb.a, tb.b, tb.e, tb.f);
       }else {
          tb.g(tb.a, tb.b, tb.g, tb.h, tb.f);
       }
       return;
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g0.class, "1")) {
          return;
       }
       this.b.d(this.a, 1, "SUBMIT_FEEDBACK_BUTTON_SUBCARD", p1, p0);
       if (!this.b.b.isKboxType() && !this.b.b.isCollectionPuzzleType()) {
          g0 tb = this.b;
          tb.a.ef(tb.b);
       }
       return;
    }
    public void e(QRecoTag p0){
       a3.c(this, p0);
    }
    public void onShow(){
       a3.d(this);
    }
}
