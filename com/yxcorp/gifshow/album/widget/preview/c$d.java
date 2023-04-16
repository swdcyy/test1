package com.yxcorp.gifshow.album.widget.preview.c$d;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.c;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import android.view.View;
import java.util.Objects;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import j79.l0;
import android.view.ViewGroup;
import u79.i;
import android.view.View$OnClickListener;
import ekd.b0;
import java.lang.Math;
import lnc.a1;
import w69.k;
import r79.a;
import q79.d;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class c$d implements g	// class@001b2f
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
       }else {
          String str = "ImagePreviewItem";
          Log.g(str, "getView, res="+p0);
          if (p0 == null || (p0.getFirst().booleanValue() && this.b.f.u() != null)) {
             c$d tb = this.b;
             View second = p0.getSecond();
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(second, tb, uoc, "4")) {
                Object tag = second.getTag();
                if (tag instanceof String) {
                   tb.s = tag;
                }
             }
             tb = this.b;
             float scale = tb.f.u().getScale();
             p0 = p0.getSecond();
             boolean b = true;
             if (PatchProxy.isSupport(uoc)) {
                k obj = PatchProxy.applyTwoRefs(Float.valueOf(scale), p0, tb, uoc, "5");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                label_0090 :
                   uoc = tb.j;
                   if (!uoc instanceof l0) {
                      Log.g(str, "not show because view model is not MediaPreviewViewModel..");
                   }else {
                      Log.g(str, "preparePreviewBubble, index="+tb.b+", scale="+scale);
                      c f = tb.f;
                      if (f == null) {
                         Log.g(str, "not show because viewBinder is null..");
                      }else {
                         ViewGroup viewGroup = f.q();
                         if (viewGroup == null) {
                            Log.g(str, "not show because bubbleContainer is null..");
                         }else {
                            ViewGroup viewGroup1 = tb.f.r();
                            if (viewGroup1 == null) {
                               Log.g(str, "not show because bubbleParent is null..");
                            }else if(tb.f.l() != null){
                               tb.f.l().setOnClickListener(new i(tb));
                            }
                            viewGroup.setVisibility(4);
                            int width = tb.e.getWidth();
                            int height = tb.e.getHeight();
                            if (width <= 0 || height <= 0) {
                               Log.g(str, "not show because previewW="+width+",previewH="+height);
                            }else {
                               Log.g(str, "previewW="+width+", previewH="+height);
                               c h = tb.h;
                               b0 a = h.a;
                               b0 b1 = h.b;
                               if (a <= null || b1 <= null) {
                                  Log.g(str, "not show because imageW="+a+",imageH="+b1);
                               }else {
                                  Log.g(str, "imageW="+a+", imageH="+b1);
                                  int i = Math.round(((float)b1 * scale));
                                  height = (height - i) / 2;
                                  StringBuilder str1 = "imageHInPreview="+i;
                                  Log.g(str, str1+", imageBottomToPreviewBottom="+height);
                                  i = a1.d(R.dimen.arg_RES_7f0704b3);
                                  width = a1.d(R.dimen.arg_RES_7f0704b1);
                                  int i1 = uoc.r0().s();
                                  boolean b2 = uoc.J0();
                                  obj = uoc.r0();
                                  int b3 = (obj != null && (obj.w() || obj.r()))? true: false;
                                  Log.g(str, "stick="+b3+", share="+b2);
                                  if (b2 && b3) {
                                     if (tb.k.s0().m().d()) {
                                        b3 = height - i1;
                                        b3 = (b3 > 0 && b3 <= a1.e(94.00f))? Math.max(false, height): Math.max(false, i1);
                                     }else {
                                        b3 = Math.max(i1, height);
                                     label_0210 :
                                        b3 = b3 + i;
                                     label_0211 :
                                        Log.g(str, "selectContainerBarH="+i1+",additionBottomMargin="+i);
                                        Log.g(str, "final bottomMargin="+b3);
                                        FrameLayout$LayoutParams layoutParams = viewGroup.getLayoutParams();
                                        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, b3);
                                        viewGroup.setLayoutParams(layoutParams);
                                        viewGroup1.removeAllViews();
                                        viewGroup1.addView(p0);
                                        tb.l = b;
                                     }
                                  }else if(tb.k.s0().m().d()){
                                     b3 = Math.max(false, height);
                                  }else {
                                     b3 = Math.max(false, height);
                                     goto label_0210 ;
                                  }
                                  b3 = b3 + width;
                                  goto label_0211 ;
                               }
                            }
                         }
                      }
                   }
                   b = false;
                }
             }else {
                goto label_0090 ;
             }
             if (b) {
                this.b.g(false);
             }
          }
       }
       return;
    }
}
