package com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2$a;
import nsd.u;
import java.util.ArrayList;
import java.util.HashMap;
import com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2$mSpanFullTextWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.commercial.photoreduce.a$a;
import java.lang.Integer;
import java.util.Map;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager$b;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ky.a0;
import android.app.Activity;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.popup.common.c;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import ekd.m1;
import java.lang.Boolean;

public final class AdReducePopupPresenterV2 extends PresenterV2	// class@00151c
{
    public RecyclerView p;
    public List q;
    public QPhoto r;
    public c s;
    public View$OnClickListener t;
    public boolean u;
    public final ArrayList v;
    public final HashMap w;
    public final p x;
    public final AdReducePopupPresenterV2$b y;
    public static final AdReducePopupPresenterV2$a z;

    static {
       AdReducePopupPresenterV2.z = new AdReducePopupPresenterV2$a(null);
    }
    public void AdReducePopupPresenterV2(){
       super();
       this.v = new ArrayList();
       this.w = new HashMap(16);
       this.x = s.c(new AdReducePopupPresenterV2$mSpanFullTextWidth$2(this));
       this.y = new AdReducePopupPresenterV2$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AdReducePopupPresenterV2.class, "4")) {
          return;
       }
       TextPaint textPaint = new TextPaint();
       textPaint.setTextSize((float)a1.d(R.dimen.arg_RES_7f07027a));
       AdReducePopupPresenterV2 tq = this.q;
       if (tq == null) {
          a.S("mReasons");
       }
       Iterator iterator = tq.iterator();
       while (iterator.hasNext()) {
          a$a uoa = iterator.next();
          this.v.add(uoa);
          this.w.put(uoa, Integer.valueOf((int)textPaint.measureText(uoa.b)));
          uoa = uoa.i;
          if (uoa != null) {
             Iterator iterator1 = uoa.iterator();
             while (iterator1.hasNext()) {
                a$a uoa1 = iterator1.next();
                this.v.add(uoa1);
                a.o(uoa1, "subReason");
                this.w.put(uoa1, Integer.valueOf((int)textPaint.measureText(uoa1.b)));
             }
          }
       }
       AdReducePopupPresenterV2 tp = this.p;
       if (tp == null) {
          a.S("mReduceRecyclerView");
       }
       GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), 2);
       gridLayoutMa.m1(this.y);
       tp.setLayoutManager(gridLayoutMa);
       AdReducePopupPresenterV2 tt = this.t;
       AdReducePopupPresenterV2 tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       AdReducePopupPresenterV2 ts = this.s;
       if (ts == null) {
          a.S("mPopup");
       }
       a0 uoa0 = new a0(tt, tr, ts, this.u, this.getActivity());
       gridLayoutMa.W0(this.v);
       tp.setAdapter(gridLayoutMa);
       tp = this.r;
       if (tp == null) {
          a.S("mPhoto");
       }
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, AdReducePopupPresenterV2.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.x.getValue();
       }
       return obj.intValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdReducePopupPresenterV2.class, "3")) {
          return;
       }
       p0 = m1.f(p0, R.id.reduce_recyclerview);
       a.o(p0, "bindWidget\(rootView, R.id.reduce_recyclerview\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdReducePopupPresenterV2.class, "2")) {
          return;
       }
       Object obj = this.r8("PHOTO_REDUCE_REASONS");
       a.o(obj, "inject\(AdPhotoReduceAcce¡­Ids.PHOTO_REDUCE_REASONS\)");
       this.q = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("PHOTO_REDUCE_POPUP");
       a.o(obj, "inject\(AdPhotoReduceAccessIds.PHOTO_REDUCE_POPUP\)");
       this.s = obj;
       this.t = this.s8(View$OnClickListener.class);
       obj = this.v8("PHOTO_REDUCE_LONG_CLICK", Boolean.TYPE);
       a.o(obj, "injectOptionalPrimitive\(¡­ICK, Boolean::class.java\)");
       this.u = obj.booleanValue();
       return;
    }
}
