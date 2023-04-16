package ngd.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ngd.c$a;
import nsd.u;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import java.util.ArrayList;
import android.util.SparseIntArray;
import com.yxcorp.plugin.setting.widget.SlideSelector;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import ekd.d0;
import android.text.TextPaint;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import ngd.c$b;
import com.yxcorp.plugin.setting.widget.SlideSelector$d;
import ngd.c$c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Float;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.lang.Iterable;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class c extends PresenterV2	// class@001e37
{
    public PublishSubject A;
    public float B;
    public final ArrayList C;
    public final SparseIntArray D;
    public float p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public SlideSelector x;
    public PublishSubject y;
    public PublishSubject z;
    public static final c$a E;

    static {
       c.E = new c$a(null);
    }
    public void c(){
       super();
       float f = (FontScaleHelper.e())? FontScaleHelper.a(): FontScaleHelper.c();
       this.B = f;
       this.C = new ArrayList();
       this.D = new SparseIntArray();
       return;
    }
    public static final SlideSelector P8(c p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("fontLevel");
       }
       return p0;
    }
    public void E8(){
       Context context;
       int i;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       String str = "fontLevel";
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          String str1 = "fontLevel.context";
          if (this.p - 0x3fe38e39 > 0) {
             uoc = this.x;
             if (uoc == null) {
                a.S(str);
             }
             context = uoc.getContext();
             a.o(context, str1);
             i = c.b(context.getResources(), R.dimen.arg_RES_7f07028e);
          }else {
             uoc = this.x;
             if (uoc == null) {
                a.S(str);
             }
             context = uoc.getContext();
             a.o(context, str1);
             i = c.b(context.getResources(), R.dimen.arg_RES_7f070273);
          }
          c tx = this.x;
          if (tx == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = tx.getLayoutParams();
          layoutParams.height = i;
          uoc = this.x;
          if (uoc == null) {
             a.S(str);
          }
          uoc.setLayoutParams(layoutParams);
          uoc = this.q;
          if (uoc == null) {
             a.S("detailImage");
          }
          uoc.A(Uri.parse("https://static.yximgs.com/udata/pkg/kwai-client-image/thanos/font_size_setting_preview.webp"), 0, 0);
          uoc = this.t;
          StringBuilder str2 = "likeText";
          if (uoc == null) {
             a.S(str2);
          }
          c tt = this.t;
          if (tt == null) {
             a.S(str2);
          }
          str1 = "alte-din.ttf";
          uoc.setTypeface(d0.a(str1, tt.getContext()));
          uoc = this.s;
          str2 = "commentText";
          if (uoc == null) {
             a.S(str2);
          }
          c ts = this.s;
          if (ts == null) {
             a.S(str2);
          }
          uoc.setTypeface(d0.a(str1, ts.getContext()));
          uoc = this.r;
          if (uoc == null) {
             a.S("shareText");
          }
          TextPaint paint = uoc.getPaint();
          a.o(paint, "shareText.paint");
          boolean b = true;
          paint.setFakeBoldText(b);
          uoc = this.w;
          str1 = "nameText";
          if (uoc == null) {
             a.S(str1);
          }
          paint = uoc.getPaint();
          a.o(paint, "nameText.paint");
          paint.setFakeBoldText(b);
          uoc = this.w;
          if (uoc == null) {
             a.S(str1);
          }
          str2 = "@";
          ts = this.w;
          if (ts == null) {
             a.S(str1);
          }
          Context context1 = ts.getContext();
          a.o(context1, "nameText.context");
          uoc.setText(str2+context1.getResources().getString(R.string.arg_RES_7f104d07));
          uoc = this.u;
          if (uoc == null) {
             a.S("musicText");
          }
          str2 = "";
          ts = this.w;
          if (ts == null) {
             a.S(str1);
          }
          context1 = ts.getContext();
          a.o(context1, "nameText.context");
          str2 = str2+context1.getResources().getString(0x7f104d07);
          ts = this.w;
          if (ts == null) {
             a.S(str1);
          }
          Context context2 = ts.getContext();
          a.o(context2, "nameText.context");
          uoc.setText(str2+context2.getResources().getString(R.string.arg_RES_7f103727));
       }
       this.R8(this.B);
       uoc = this.x;
       if (uoc == null) {
          a.S(str);
       }
       uoc.setCurrentLevel(FontScaleHelper.b(this.B));
       uoc = this.x;
       if (uoc == null) {
          a.S(str);
       }
       uoc.setOnLevelChangeListener(new c$b(this));
       uoc = this.y;
       if (uoc == null) {
          a.S("followSystemSubject");
       }
       this.X7(uoc.subscribe(new c$c(this), Functions.e));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          this.p = ((float)n.k(activity) * 0x3f800000) / (float)n.j(activity);
       }
       return;
    }
    public final void R8(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "5")) {
          return;
       }
       if (p0 - (float)0 <= 0) {
          return;
       }
       if (this.B - p0) {
          c tz = this.z;
          if (tz == null) {
             a.S("fontScaleSubject");
          }
          tz.onNext(Float.valueOf(p0));
       }
       this.B = p0;
       Iterator iterator = this.C.iterator();
       while (iterator.hasNext()) {
          TextView textView = iterator.next();
          float f = (float)this.D.get(textView.getId(), 0) * p0;
          textView.setTextSize(0, f);
       }
       return;
    }
    public void doBindView(View p0){
       int id;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.image);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.image\)");
       this.q = view;
       view = m1.f(p0, R.id.text_share);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.text_share\)");
       this.r = view;
       view = m1.f(p0, R.id.text_comment);
       a.o(view, "ViewBindUtils.bindWidget¡­tView, R.id.text_comment\)");
       this.s = view;
       view = m1.f(p0, R.id.text_like);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.text_like\)");
       this.t = view;
       view = m1.f(p0, R.id.text_music);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.text_music\)");
       this.u = view;
       view = m1.f(p0, R.id.text_desc);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.text_desc\)");
       this.v = view;
       view = m1.f(p0, R.id.text_name);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.text_name\)");
       this.w = view;
       p0 = m1.f(p0, R.id.font_level);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.font_level\)");
       this.x = p0;
       c tC = this.C;
       c tu = this.u;
       String str = "musicText";
       if (tu == null) {
          a.S(str);
       }
       tC.add(tu);
       tu = this.v;
       if (tu == null) {
          a.S("descText");
       }
       tC.add(tu);
       tu = this.w;
       if (tu == null) {
          a.S("nameText");
       }
       tC.add(tu);
       tC = this.D;
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       id = tu.getId();
       c tu1 = this.u;
       if (tu1 == null) {
          a.S(str);
       }
       tC.put(id, (int)tu1.getTextSize());
       tu = this.v;
       if (tu == null) {
          a.S("descText");
       }
       id = tu.getId();
       c tv = this.v;
       if (tv == null) {
          a.S("descText");
       }
       tC.put(id, (int)tv.getTextSize());
       tu = this.w;
       if (tu == null) {
          a.S("nameText");
       }
       id = tu.getId();
       tv = this.w;
       if (tv == null) {
          a.S("nameText");
       }
       tC.put(id, (int)tv.getTextSize());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       Object obj = this.r8("FONT_SCALE_SETTINGS_FOLLOW_SYSTEM_SUBJECT");
       a.o(obj, "inject\(FONT_SCALE_SETTINGS_FOLLOW_SYSTEM_SUBJECT\)");
       this.y = obj;
       obj = this.r8("FONT_SCALE_SETTINGS_FONT_SCALE_SUBJECT");
       a.o(obj, "inject\(FONT_SCALE_SETTINGS_FONT_SCALE_SUBJECT\)");
       this.z = obj;
       obj = this.r8("FONT_SCALE_SETTINGS_FONT_SCALE_SELECT_SUBJECT");
       a.o(obj, "inject\(FONT_SCALE_SETTIN¡­ONT_SCALE_SELECT_SUBJECT\)");
       this.A = obj;
       return;
    }
}
