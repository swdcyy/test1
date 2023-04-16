package com.yxcorp.gifshow.detail.fragments.milano.presenter.d$c;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import v0a.t;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import v0a.y;
import v0a.z;
import v0a.a0;
import android.view.View;
import v0a.c0;
import v0a.b0;
import java.lang.CharSequence;
import v0a.x;
import java.lang.Runnable;
import crd.b;
import m9a.r;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import v0a.u;
import erd.g;
import brd.t;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.OverallEmotionsData;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.comment.model.CommentGuide;
import zk9.a;
import java.util.List;
import com.yxcorp.gifshow.comment.model.CommentGuide$EmojiBean;
import nx9.c;
import java.util.Random;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import f6a.c;
import android.content.Context;
import com.yxcorp.utility.n;

public class d$c implements b	// class@001522
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       d e;
       OverallEmotionsData overallEmoti;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       d$c ta = this.a;
       ta.y = p0;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       int i = 8;
       if (!PatchProxy.applyVoid(objArray, ta, uod, "4")) {
          d f1 = ta.F;
          if (f1 != null) {
             f1.setVisibility(i);
          }
          ta.z.setOnClickListener(new t(ta));
          ta.D.setOnClickListener(new y(ta));
          f1 = ta.A;
          if (f1 != null) {
             f1.setOnClickListener(new z(ta));
          }
          ta.t.setOnClickListener(new a0(ta));
          ta.B.setOnClickListener(new c0(ta));
          ta.C.setOnClickListener(new b0(ta));
          f1 = ta.y;
          if (!PatchProxy.applyVoidOneRefs(f1, ta, uod, "5")) {
             ta.E.setText(objArray);
             ta.b9(f1);
             ta.E.post(new x(ta));
          }
       }
       this.a.B.setVisibility(i);
       boolean b = false;
       this.a.W8(b);
       this.a.z.setAlpha(0x3f800000);
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uod, "7")) {
          ta.Y8();
          d q = ta.Q;
          if (q != null && !q.isDisposed()) {
             ta.Q.dispose();
          }
          if (!r.a(ta.I, ta.J, ta.y)) {
             ta.Q = ta.s.v.subscribe(new u(ta));
             q = ta.J;
             d y = ta.y;
             r or = r.class;
             if (PatchProxy.isSupport(or)) {
                overallEmoti = PatchProxy.applyTwoRefs(Boolean.valueOf(q), y, objArray, or, "2");
                if (overallEmoti != PatchProxyResult.class) {
                }else if(q != null){
                   if (y != null && (y.getPhotoMeta() != null && a.a(y.getPhotoMeta()) != null)) {
                      CommentGuide mEmojiResour = a.a(y.getPhotoMeta()).mEmojiResources;
                      if (mEmojiResour != null && !mEmojiResour.isEmpty()) {
                         overallEmoti = OverallEmotionsData.from(mEmojiResour.get(b));
                      }
                   }
                label_0125 :
                   overallEmoti = objArray;
                }else {
                   List list = c.g();
                   overallEmoti = list.get(new Random().nextInt(list.size()));
                }
             }else {
                goto label_00f3 ;
             }
             ta.O = overallEmoti;
             if (overallEmoti != null && !TextUtils.x(overallEmoti.mEmojiUrl)) {
                d0.a(ta.C, ta.O.mEmojiUrl, true);
             }
          }
       }
    label_0156 :
       ta = this.a;
       ta.X8(3, c.f(ta.y, ta.L));
       ta = this.a;
       ta.X8(4, c.j(ta.y, ta.K));
       ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(objArray, ta, uod, "17") || (ta.y == null || (ta.R != null && ta.A != null))) {
          float f = 40.00f;
          if (ta.S8() && ta.A.getVisibility() == i) {
             ta.A.setVisibility(b);
             e = ta.E;
             e.setPadding(e.getPaddingLeft(), ta.E.getPaddingTop(), (ta.E.getPaddingRight() + n.c(ta.E.getContext(), f)), ta.E.getPaddingBottom());
          }else if(!ta.S8() && !ta.A.getVisibility()){
             ta.A.setVisibility(i);
             e = ta.E;
             e.setPadding(e.getPaddingLeft(), ta.E.getPaddingTop(), (ta.E.getPaddingRight() - n.c(ta.E.getContext(), f)), ta.E.getPaddingBottom());
          }
       }
       this.a.P8();
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "2")) {
          return;
       }
       this.a.Y8();
       return;
    }
}
