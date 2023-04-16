package com.yxcorp.gifshow.album.widget.preview.g;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.f;
import ekd.b0;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import j79.l0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import u79.t;
import android.view.View$OnClickListener;
import java.lang.Math;
import o79.i;
import w69.k;
import r79.a;
import q79.d;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class g implements g	// class@001b3a
{
    public final b0 b;
    public final f c;

    public void g(f p0,b0 p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       int b1;
       Object obj = this;
       View obj1 = p0;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, g.class, "1")) {
       }else if(obj1 == null || (obj1.getFirst().booleanValue() && obj.b != null)){
          g c = obj.c;
          View second = obj1.getSecond();
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(second, c, uof, "8")) {
             Object tag = second.getTag();
             if (tag instanceof String) {
                c.C = tag;
             }
          }
          c = obj.c;
          g b = obj.b;
          obj1 = obj1.getSecond();
          Objects.requireNonNull(c);
          k obj2 = PatchProxy.applyTwoRefs(b, obj1, c, uof, "9");
          if (obj2 != PatchProxyResult.class) {
             b1 = obj2.booleanValue();
          }else {
             String str = "VideoSdkPlayerPreviewItem";
             Log.g(str, "prepareVideoPreviewBubble, index="+c.f);
             uof = c.j;
             if (!uof instanceof l0) {
                Log.g(str, "not show because view model is not MediaPreviewViewModel..");
             }else {
                f b2 = c.b;
                if (b2 == null) {
                   Log.g(str, "not show because viewBinder is null..");
                }else {
                   ViewGroup viewGroup = b2.q();
                   if (viewGroup == null) {
                      Log.g(str, "not show because bubbleContainer is null..");
                   }else {
                      ViewGroup viewGroup1 = c.b.r();
                      if (viewGroup1 == null) {
                         Log.g(str, "not show because bubbleParent is null..");
                      }else if(c.b.l() != null){
                         c.b.l().setOnClickListener(new t(c));
                      }
                      viewGroup.setVisibility(4);
                      int width = c.d.getWidth();
                      int height = c.d.getHeight();
                      if (width <= 0 || height <= 0) {
                         Log.g(str, "not show because previewW="+width+",previewH="+height);
                      }else {
                         Log.g(str, "previewW="+width+", previewH="+height);
                         b0 a = b.a;
                         b0 b3 = b.b;
                         if (a <= null || b3 <= null) {
                            Log.g(str, "not show because videoW="+a+",videoH="+b3);
                         }else {
                            Log.g(str, "videoW="+a+", videoH="+b3);
                            int i = (int)Math.round(((((double)b3 * 0x3ff0000000000000) / (double)a) * (double)width));
                            height = (height - i) / 2;
                            StringBuilder str1 = "imageHInPreview="+i;
                            Log.g(str, str1+", imageBottomToPreviewBottom="+height);
                            i = i.c(R.dimen.arg_RES_7f0704b3);
                            b1 = i.c(R.dimen.arg_RES_7f0704b1);
                            int i1 = uof.r0().s();
                            if (c.A.s0().m().d() && c.j.I0()) {
                               i1 = i.d(32.00f);
                            }
                            width = uof.J0();
                            obj2 = uof.r0();
                            int b4 = (obj2 != null && (obj2.w() || obj2.r()))? true: false;
                            Log.g(str, "stick="+b4+", share="+width);
                            if (width && b4) {
                               if (c.A.s0().m().d()) {
                                  b4 = height - i1;
                                  width = (b4 > 0 && b4 <= a1.e(94.00f))? Math.max(0, height): Math.max(0, i1);
                               }else {
                                  b1 = Math.max(i1, height);
                               label_020b :
                                  width = b1 + i;
                               label_020d :
                                  Log.g(str, "selectContainerBarH="+i1+",additionBottomMargin="+i);
                                  Log.g(str, "final bottomMargin="+width);
                                  FrameLayout$LayoutParams layoutParams = viewGroup.getLayoutParams();
                                  layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, width);
                                  viewGroup.setLayoutParams(layoutParams);
                                  viewGroup1.removeAllViews();
                                  viewGroup1.addView(obj1);
                                  c.t = true;
                                  b1 = true;
                               }
                            }else {
                               b4 = 0;
                               if (c.A.s0().m().d()) {
                                  width = Math.max(b4, height);
                               }else {
                                  b1 = Math.max(b4, height);
                                  goto label_020b ;
                               }
                            }
                            width = width + b1;
                            goto label_020d ;
                         }
                      }
                   }
                }
             }
             b1 = false;
          }
          if (b1) {
             obj.c.g(false);
          }
       }
       return;
    }
}
