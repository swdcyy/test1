package com.yxcorp.gifshow.detail.slideplay.presenter.a;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Object;
import ln6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.graphics.RectF;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.Rect;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e7a.j;
import brd.t;
import ln6.c;
import mn6.a;
import uw9.o;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import xx9.a;
import nn6.a;

public final class a implements g	// class@00183b
{
    public final b b;
    public final int c;

    public void a(b p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Rect rect;
       boolean b;
       a tb = this.b;
       a tc = this.c;
       b uob = p0;
       if (tb.x.isSinglePhoto() && tb.v != null) {
          p0 = null;
       }else if(r1.D3(tb.x.mEntity) && (tb.u.getMeasuredHeight() && tb.u.getLayoutParams().height < tb.q.getLayoutParams().height)){
          p0 = tb.u;
       }else {
          p0 = tb.q;
       }
       if (p0 == null) {
          RectF rectF = new RectF();
          tb.v.getHierarchy().k(rectF);
          rect = new Rect((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
       }else {
          rect = null;
       }
       a uoa = uob.RB(tb.getActivity(), tb.x.mEntity, tb.p, p0, rect, tb.y, tb.m8(), new j(tb), tc);
       tb.E = uoa;
       uoa.f();
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("SlidePlayInteractStickerStickerPresenter", "请求成功展示投票贴纸", objArray);
       uob = tb.E;
       b obj = PatchProxy.apply(null, tb, b.class, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = tb.C;
          b = (obj != null && obj.r())? true: false;
       }
       if (!b && !tb.B.c()) {
          i = true;
       }
       uob.b(i);
       tb.E.d(new a(p0, tb.t, tb.s));
       return;
    }
}
