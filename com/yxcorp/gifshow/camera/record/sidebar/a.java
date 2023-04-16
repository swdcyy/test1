package com.yxcorp.gifshow.camera.record.sidebar.a;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Paint;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewTreeObserver;
import zg9.d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.widget.textview.StrokedTextView;
import com.kwai.library.widget.textview.KwaiStrokeTextView;
import java.lang.Float;
import ra6.a;
import lnc.n6;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import lnc.i1;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import qxc.b;
import android.view.ViewStub;
import lnc.s6;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.graphics.drawable.Drawable;
import pi9.i;
import tg9.b;
import java.lang.ClassCastException;

public final class a	// class@000f10
{
    public static final String a;
    public static final int b;

    static {
       a.a = a1.p(0x7f1041f0);
       a.b = a1.d(0x7f070bd8);
    }
    public void a(){
       super();
    }
    public static void a(View p0,TextView p1,ImageView p2,Music p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "5")) {
             return;
          }
       }
       if (p3 == null || TextUtils.isEmpty(p3.getDisplayName())) {
          p1.setText("");
          if (p0 != null) {
             p0.setVisibility(8);
          }else {
             p1.setVisibility(8);
          }
          return;
       }else if(p4){
          if (p0 != null) {
             p0.setVisibility(0);
          }else {
             p1.setVisibility(0);
          }
       }
       String displayName = p3.getDisplayName();
       if (!PatchProxy.applyVoidThreeRefs(p1, displayName, p2, null, a.class, "6")) {
          Paint paint = new Paint();
          paint.setTextSize(p1.getTextSize());
          float f = paint.measureText(displayName);
          int maxWidth = p1.getMaxWidth();
          if (maxWidth > 0 && maxWidth < Integer.MAX_VALUE) {
             p1.setText(a.c(paint, displayName, f, maxWidth));
          }else {
             maxWidth = n.k(n.d(p1));
             int[] ointArray = new int[]{0};
             if (p2 != null && !p2.getVisibility()) {
                ViewGroup$LayoutParams layoutParams = p2.getLayoutParams();
                ointArray[0] = layoutParams.width + layoutParams.rightMargin;
             }
             if (maxWidth > 0) {
                p1.setText(a.c(paint, displayName, f, a.b(((maxWidth - (a.b * 2)) - ointArray[0]), p1)));
             }else {
                d uod = new d(p1, ointArray, paint, displayName, f);
                p1.getViewTreeObserver().addOnGlobalLayoutListener(maxWidth);
             }
          }
       }
       return;
    }
    public static int b(int p0,TextView p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 instanceof StrokedTextView) {
          return (p0 - (p1.getStrokeSize() * 4));
       }else if(p1 instanceof KwaiStrokeTextView){
          p0 = p0 - (p1.getStrokeSize() * 4);
       }
       return p0;
    }
    public static String c(Paint p0,String p1,float p2,int p3){
       String obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Integer.valueOf(p3), null, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = (float)p3;
       if (p2 - f < 0) {
          return p1;
       }else {
          f = f - p0.measureText("...");
          float f1 = 0x3f000000;
          if (a.d() == 1) {
             obj = a.a;
             if (p1.endsWith(obj)) {
                f = f - p0.measureText(obj);
                Object[] objArray = new Object[]{n6.a(p0, p1, 0, (int)((((float)p1.length() * f) / p2) + f1), f),obj};
                return String.format("%s...%s", objArray);
             }
          }
          Object[] objArray1 = new Object[]{n6.a(p0, p1, 0, (int)((((float)p1.length() * f) / p2) + f1), f)};
          return String.format("%s...", objArray1);
       }
    }
    public static View d(b p0){
       AbsRecordSideBarViewBinder uAbsRecordSi;
       View view = null;
       View obj = PatchProxy.applyOneRefs(p0, view, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.f().getView();
       if (obj == null) {
          i1.c(new IllegalArgumentException("LyricsHelper null view of Fragment"));
          return view;
       }else if(p0.f() instanceof c){
          j oj = p0.f().E6();
          if (oj.r2() instanceof AbsRecordSideBarViewBinder) {
             uAbsRecordSi = oj.r2();
          label_0047 :
             if (uAbsRecordSi != null) {
                view = uAbsRecordSi.M();
             }
             view = b.a(view, obj, R.id.lyrics_visibility_btn_combinant);
             if (view == null) {
                ViewStub viewStub = obj.findViewById(R.id.lyrics_visibility_layout_stub);
                if (viewStub != null) {
                   view = viewStub.inflate();
                }
             }
             if (s6.m() && view instanceof TextImageView) {
                obj = view;
                obj.b(a1.f(R.drawable.arg_RES_7f080436), a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d));
                i.b(obj);
             }
             if (view != null) {
                p0.j().addView(view);
             }
             if (view != null) {
                return view;
             }else {
                throw new ClassCastException("find null LyricsSwitchBtn");
             }
          }
       }
       uAbsRecordSi = view;
       goto label_0047 ;
    }
    public static void e(View p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setSelected(p1);
       return;
    }
}
