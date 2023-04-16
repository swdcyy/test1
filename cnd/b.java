package cnd.b;
import and.a;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hnd.f;
import gnd.b;
import android.widget.FrameLayout;
import android.widget.TextView;
import lnc.a1;
import android.animation.ValueAnimator;
import cnd.b$a;
import android.view.View$OnClickListener;
import cnd.b$b;
import cnd.b$c;
import cnd.b$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zmd.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import cnd.c;
import java.lang.Enum;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import cnd.d;
import java.lang.Runnable;
import ekd.k1;
import e17.i;
import com.yxcorp.utility.n;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import cnd.f;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import cnd.g;
import java.lang.Boolean;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xld.a;
import cnd.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class b extends a implements a	// class@000348
{
    public final f c;
    public final FrameLayout d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final TextView i;
    public FrameLayout j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;
    public final TextView o;
    public final String p;
    public final String q;
    public final String r;
    public final ValueAnimator s;
    public final Fragment t;

    public void b(Fragment p0,View p1){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.t = p0;
       this.c = b.a(p0);
       View view = p1.findViewById(R.id.status_layout);
       a.o(view, "rootView.findViewById\(R.id.status_layout\)");
       this.d = view;
       view = p1.findViewById(R.id.content);
       a.o(view, "rootView.findViewById\(R.id.content\)");
       this.e = view;
       view = p1.findViewById(R.id.recognize_fail_root);
       a.o(view, "rootView.findViewById\(R.id.recognize_fail_root\)");
       this.f = view;
       view = p1.findViewById(R.id.recognize_no_result_root);
       a.o(view, "rootView.findViewById\(R.¡­recognize_no_result_root\)");
       this.g = view;
       view = p1.findViewById(R.id.recognize_loading_root);
       a.o(view, "rootView.findViewById\(R.id.recognize_loading_root\)");
       this.h = view;
       view = p1.findViewById(R.id.subtitle_loading_sec_tip);
       a.o(view, "rootView.findViewById\(R.¡­subtitle_loading_sec_tip\)");
       this.i = view;
       view = p1.findViewById(R.id.recognize_no_result_retry);
       a.o(view, "rootView.findViewById\(R.¡­ecognize_no_result_retry\)");
       this.k = view;
       View view1 = p1.findViewById(R.id.recognize_fail_retry);
       a.o(view1, "rootView.findViewById\(R.id.recognize_fail_retry\)");
       this.l = view1;
       View view2 = p1.findViewById(R.id.recognize_fail_cancel);
       a.o(view2, "rootView.findViewById\(R.id.recognize_fail_cancel\)");
       this.m = view2;
       View view3 = p1.findViewById(R.id.recognize_loading_cancel);
       a.o(view3, "rootView.findViewById\(R.¡­recognize_loading_cancel\)");
       this.n = view3;
       p1 = p1.findViewById(R.id.subtitle_new_loading_tips);
       a.o(p1, "rootView.findViewById\(R.¡­ubtitle_new_loading_tips\)");
       this.o = p1;
       this.p = a1.p(0x7f104b29);
       this.q = a1.p(0x7f104b32);
       this.r = a1.p(0x7f104b23);
       this.s = ValueAnimator.ofInt(new int[2]{0,'_'});
       view.setOnClickListener(new b$a(this));
       view1.setOnClickListener(new b$b(this));
       view2.setOnClickListener(new b$c(this));
       view3.setOnClickListener(new b$d(this));
    }
    public void B(){
       PatchProxy.applyVoid(null, this, b.class, "1");
    }
    public void C(){
       PatchProxy.applyVoid(null, this, b.class, "2");
    }
    public final Fragment D(){
       return this.t;
    }
    public void O7(a p0,a p1){
       View[] viewArray;
       b q;
       Object[] objArray1;
       View[] viewArray1;
       FrameLayout uFrameLayout = this;
       View[] obj = p0;
       a obj1 = p1;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, uFrameLayout, uob, "3")) {
          return;
       }
       a.p(obj, "newState");
       a.p(obj1, "lastState");
       if (p0.A() != p1.A() || p0.A() == SubtitleStatus.IDLE) {
          String str = "showNoNetWork";
          String str1 = null;
          String str2 = "SubtitlePanelStatusVB";
          switch (c.a[p0.A().ordinal()]){
              case 1:
                obj1 = obj.G;
                if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(obj1), uFrameLayout, uob, "4") && uFrameLayout.h.getVisibility())) {
                   Object[] objArray = new Object[0];
                   a.D().s(str2, "showLoading", objArray);
                   viewArray = new View[]{uFrameLayout.h};
                   n.Z(0, viewArray);
                   viewArray = new View[]{uFrameLayout.e,uFrameLayout.g,uFrameLayout.f,uFrameLayout.j};
                   n.Z(8, viewArray);
                   b s = uFrameLayout.s;
                   a.o(s, "mLoadingAnimator");
                   s.setDuration((long)((double)7000 * (uFrameLayout.c.o0().n() / 50.00f)));
                   uob = uFrameLayout.i;
                   q = (obj1 != null)? uFrameLayout.q: uFrameLayout.r;
                   uob.setText(q);
                   uFrameLayout.s.addUpdateListener(new e(uFrameLayout));
                   uFrameLayout.s.start();
                }
                break;
              case 2:
                if (!PatchProxy.applyVoid(str1, uFrameLayout, uob, "5")) {
                   objArray1 = new Object[0];
                   a.D().s(str2, str, objArray1);
                   viewArray1 = new View[]{uFrameLayout.f};
                   n.Z(0, viewArray1);
                   viewArray1 = new View[]{uFrameLayout.e,uFrameLayout.g,uFrameLayout.h,uFrameLayout.j};
                   n.Z(8, viewArray1);
                }
                break;
              case 3:
                if (!PatchProxy.applyVoid(str1, uFrameLayout, uob, "6")) {
                   objArray1 = new Object[0];
                   a.D().s(str2, str, objArray1);
                   viewArray1 = new View[]{uFrameLayout.e,uFrameLayout.f,uFrameLayout.h,uFrameLayout.g};
                   n.Z(8, viewArray1);
                   q = uFrameLayout.j;
                   if (q != null) {
                      viewArray = new View[]{q};
                      n.Z(0, viewArray);
                   }else {
                      uFrameLayout.j = new FrameLayout(this.A().getContext());
                      ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-1, -1);
                      uob = uFrameLayout.j;
                      a.m(uob);
                      uob.setLayoutParams(layoutParams);
                      KwaiEmptyStateView kwaiEmptySta = new KwaiEmptyStateView(this.A().getContext());
                      KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
                      uoa.p(new f(uFrameLayout));
                      uoa.k(R.drawable.arg_RES_7f0805f4);
                      uoa.h(R.string.arg_RES_7f100d25);
                      uoa.j(1);
                      uoa.b();
                      uoa.a(kwaiEmptySta);
                      kwaiEmptySta.setLayoutParams(layoutParams);
                      KwaiImageView kwaiImageVie = new KwaiImageView(this.A().getContext());
                      kwaiImageVie.setBackground(a1.f(R.drawable.arg_RES_7f081d06));
                      FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(a1.e(40.00f), a1.e(40.00f));
                      layoutParams1.gravity = 53;
                      layoutParams1.rightMargin = a1.e(8.00f);
                      layoutParams1.topMargin = a1.e(8.00f);
                      kwaiImageVie.setLayoutParams(layoutParams1);
                      kwaiImageVie.setOnClickListener(new g(uFrameLayout));
                      b j = uFrameLayout.j;
                      a.m(j);
                      j.addView(kwaiImageVie);
                      q = uFrameLayout.j;
                      a.m(q);
                      q.addView(kwaiEmptySta);
                      uFrameLayout.d.addView(uFrameLayout.j);
                   }
                }
                break;
              case 4:
              case 5:
                SubtitleStatus subtitleStat = p0.A();
                if (!PatchProxy.applyVoidOneRefs(subtitleStat, uFrameLayout, uob, "7")) {
                   if (subtitleStat == SubtitleStatus.NO_RESULT_MUTE) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f100c52);
                   }
                   objArray1 = new Object[0];
                   a.D().s(str2, "showNoResult", objArray1);
                   viewArray1 = new View[]{uFrameLayout.g};
                   n.Z(0, viewArray1);
                   viewArray1 = new View[]{uFrameLayout.e,uFrameLayout.f,uFrameLayout.h,uFrameLayout.j};
                   n.Z(8, viewArray1);
                }
                break;
              case 6:
                if (!PatchProxy.applyVoid(str1, uFrameLayout, uob, "8")) {
                   objArray1 = new Object[0];
                   a.D().s(str2, "showContent", objArray1);
                   uFrameLayout.o.setText(uFrameLayout.p+"100%");
                   k1.r(new d(uFrameLayout), 200);
                }
                break;
              default:
          }
       label_025c :
          if (p0.A() == SubtitleStatus.IDLE && !p0.E()) {
             obj = new View[]{uFrameLayout.h};
             n.Z(8, obj);
             obj = new View[]{uFrameLayout.e,uFrameLayout.g,uFrameLayout.f,uFrameLayout.j};
             n.Z(8, obj);
          }
       }
       return;
    }
}
