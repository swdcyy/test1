package com.kuaishou.live.comments.richtext.LiveRichTextParser;
import com.kuaishou.live.comments.richtext.LiveRichTextParser$a;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.comments.richtext.LiveRichTextParser$textDecoder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.comments.richtext.LiveRichTextParser$iconDecoder$2;
import com.kuaishou.live.comments.richtext.LiveRichTextParser$giftDecoder$2;
import com.kuaishou.live.comments.richtext.LiveRichTextParser$imageDecoder$2;
import com.kuaishou.live.comments.richtext.LiveRichTextParser$badgeDecoder$2;
import android.graphics.drawable.Drawable;
import y51.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import java.lang.CharSequence;
import java.lang.Integer;
import bc.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.text.SpannableStringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentTextSegment;
import cp3.h;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentImageSegment;
import cp3.g;
import java.util.Objects;
import cp3.g$a;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import cc.a;
import yb.b;
import android.content.res.Resources;
import xb.t$b;
import yb.a;
import o56.a;
import ac.b;
import android.content.Context;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import java.util.Collection;
import s0d.f;
import s0d.a;
import s0d.e;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder;
import android.text.style.ImageSpan;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentBadgeSegment;
import cp3.b;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentGiftSegment;
import cp3.e;
import cp3.d;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import h81.b;
import h81.a;
import o81.b;
import h81.e;
import lnc.u9;
import android.text.style.ReplacementSpan;

public final class LiveRichTextParser	// class@000e46
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public e f;
    public int g;
    public int h;
    public d i;
    public a j;
    public static final int k;
    public static final int l;
    public static final LiveRichTextParser$a m;

    static {
       LiveRichTextParser.m = new LiveRichTextParser$a(null);
       LiveRichTextParser.k = a1.e(14.00f);
       LiveRichTextParser.l = a1.e(4.00f);
    }
    public void LiveRichTextParser(){
       super();
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.a = s.b(nONE, LiveRichTextParser$textDecoder$2.INSTANCE);
       this.b = s.b(nONE, new LiveRichTextParser$iconDecoder$2(this));
       this.c = s.b(nONE, new LiveRichTextParser$giftDecoder$2(this));
       this.d = s.b(nONE, LiveRichTextParser$imageDecoder$2.INSTANCE);
       this.e = s.b(nONE, new LiveRichTextParser$badgeDecoder$2(this));
       this.g = LiveRichTextParser.k;
       this.h = LiveRichTextParser.l;
    }
    public final a a(Drawable p0){
       LiveRichTextParser obj = PatchProxy.applyOneRefs(p0, this, LiveRichTextParser.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (p0.getIntrinsicWidth() <= 0 || p0.getIntrinsicHeight() <= 0)) {
          return null;
       }
       obj = this.g;
       a uoa = new a(p0, "");
       uoa.b((int)(((float)p0.getIntrinsicWidth() * (float)obj) / (float)p0.getIntrinsicHeight()), obj);
       return uoa;
    }
    public final CharSequence b(LiveCommentRichTextMessage$CommentRichTextSegment[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRichTextParser.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c(p0, this.h);
    }
    public final CharSequence c(LiveCommentRichTextMessage$CommentRichTextSegment[] p0,int p1){
       LiveCommentRichText$CommentTextSegment obj2;
       object oobject;
       b uob;
       LiveSpannable liveSpannabl;
       b uob1;
       int i5;
       int i6;
       LiveCommentRichText$CommentTextSegment tapAction;
       h this;
       LiveCommentRichText$CommentImageSegment uCommentImag;
       int i7;
       LiveSpannable liveSpannabl1;
       b this11;
       e this11;
       b this2;
       e a;
       float f;
       g$a a1;
       int i11;
       a obj3;
       a uoa1;
       Object obj = this;
       LiveSpannable obj1 = p0;
       if (PatchProxy.isSupport(LiveRichTextParser.class)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, LiveRichTextParser.class, "6");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }
       Object[] objArray = null;
       if (obj1 != null) {
          int len = obj1.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = obj1[i];
                if (oobject.hasImageSegment()) {
                label_0031 :
                   if (oobject != null) {
                      uob = new b();
                   label_003b :
                      liveSpannabl = new LiveSpannable(uob);
                      int i1 = (obj1 != null)? obj1.length: null;
                      if (obj1 != null) {
                         int len1 = obj1.length;
                         int i2 = 0;
                         int i3 = 0;
                         while (i2 < len1) {
                            object oobject1 = obj1[i2];
                            int i4 = i2;
                            if (PatchProxy.applyVoidThreeRefs(oobject1, liveSpannabl, uob, this, LiveRichTextParser.class, "12")) {
                               uob1 = uob;
                               i5 = len1;
                               i6 = i1;
                               obj1 = liveSpannabl;
                            }else {
                               i2 = liveSpannabl.m();
                               obj2 = oobject1.getTextSegment();
                               String str = "1";
                               if (obj2 != null) {
                                  tapAction = obj2.tapAction;
                                  this = PatchProxy.apply(objArray, obj, LiveRichTextParser.class, str);
                                  if (this == PatchProxyResult.class) {
                                     this = obj.a.getValue();
                                  }
                                  liveSpannabl.b(this.a(obj2));
                               }else {
                                  tapAction = objArray;
                               }
                               LiveCommentRichText$CommentImageSegment imageSegment = oobject1.getImageSegment();
                               String IconSegmentDecoder this1 = "2";
                               if (imageSegment != null) {
                                  LiveCommentRichText$CommentImageSegment tapAction1 = imageSegment.tapAction;
                                  if (uob != null) {
                                     g og = PatchProxy.apply(objArray, obj, LiveRichTextParser.class, "4");
                                     if (og == PatchProxyResult.class) {
                                        og = obj.d.getValue();
                                     }
                                     Objects.requireNonNull(og);
                                     g$a uoa = g$a.class;
                                     if (!PatchProxy.applyVoidTwoRefs(uob, imageSegment, og, g.class, str)) {
                                        a.p(uob, "strBuilder");
                                        a.p(imageSegment, "segment");
                                        LiveCommentRichText$CommentImageSegment height = imageSegment.height;
                                        if (height > null) {
                                           LiveCommentRichText$CommentImageSegment width = imageSegment.width;
                                           if (width > null) {
                                              uCommentImag = tapAction1;
                                              tapAction1 = imageSegment.url;
                                              if (tapAction1 != null) {
                                                 tapAction1 = (!tapAction1.length)? 1: 0;
                                                 if (!tapAction1) {
                                                    tapAction1 = null;
                                                 label_00e3 :
                                                    if (tapAction1) {
                                                    label_0207 :
                                                       i7 = i2;
                                                       i5 = len1;
                                                       i6 = i1;
                                                       liveSpannabl1 = liveSpannabl;
                                                    label_020d :
                                                       tapAction1 = uCommentImag;
                                                    }else if(width > 0.00f){
                                                       f = 100.00f / (float)width;
                                                       float f1 = (float)height * f;
                                                       height = (int)f1;
                                                       width = 100;
                                                    }
                                                    int i9 = a1.e((float)width);
                                                    int i10 = a1.e((float)height);
                                                    a1 = g.a;
                                                    imageSegment = imageSegment.url;
                                                    a.o(imageSegment, "segment.url");
                                                    Objects.requireNonNull(a1);
                                                    ArrayList uArrayList = PatchProxy.applyOneRefs(imageSegment, a1, uoa, this1);
                                                    if (uArrayList != PatchProxyResult.class) {
                                                       i7 = i2;
                                                       i11 = len1;
                                                    }else {
                                                       a.p(imageSegment, "picUrls");
                                                       uArrayList = new ArrayList();
                                                       i5 = imageSegment.length;
                                                       i11 = len1;
                                                       len1 = 0;
                                                       while (len1 < i5) {
                                                          object oobject2 = imageSegment[len1];
                                                          uArrayList.add(new CDNUrl(oobject2.cdn, oobject2.url, oobject2.ip, oobject2.urlPattern));
                                                          len1 = len1 + 1;
                                                          i5 = i5;
                                                          i1 = i1;
                                                          liveSpannabl = liveSpannabl;
                                                          i2 = i2;
                                                       }
                                                       i7 = i2;
                                                    }
                                                    int i12 = i1;
                                                    LiveSpannable liveSpannabl2 = liveSpannabl;
                                                    g$a a2 = g.a;
                                                    Objects.requireNonNull(a2);
                                                    if (PatchProxy.isSupport(uoa)) {
                                                       obj3 = PatchProxy.applyThreeRefs(uArrayList, Integer.valueOf(i9), Integer.valueOf(i10), a2, g$a.class, "1");
                                                       if (obj3 != PatchProxyResult.class) {
                                                          uoa1 = obj3;
                                                          i6 = 0;
                                                       label_01df :
                                                          uob.append("  ");
                                                          len = uob.length() - 1;
                                                          i5 = i11;
                                                          i6 = i12;
                                                          liveSpannabl1 = liveSpannabl2;
                                                          uob.c(uoa1, uob.length(), len, i9, i10, 0, 0);
                                                          goto label_020d ;
                                                       }
                                                    }
                                                    a.p(uArrayList, "cdnUrls");
                                                    b uob2 = new b(a1.m());
                                                    t$b a3 = t$b.a;
                                                    uob2.t(a3);
                                                    uob2.j(a3);
                                                    uob2.p(a3);
                                                    uob2.n(R.drawable.arg_RES_7f08117b);
                                                    uob2.r(R.drawable.arg_RES_7f08117b);
                                                    obj3 = uob2.a();
                                                    a.o(obj3, "GenericDraweeHierarchyBu¡­older\)\n          .build\(\)");
                                                    obj3 = a.d(obj3, a.B);
                                                    a.o(obj3, "DraweeHolder.create\(hierarchy, AppEnv.APP\)");
                                                    d uod = Fresco.newDraweeControllerBuilder();
                                                    i6 = uArrayList.isEmpty() ^ 0x01;
                                                    if (i6) {
                                                       uod.v(f.x().q(uArrayList).o(i9, i10).w(), false);
                                                    }else {
                                                       i6 = 0;
                                                    }
                                                    obj3.k(uod.e());
                                                    uoa1 = obj3;
                                                    goto label_01df ;
                                                 }
                                              }
                                              tapAction1 = 1;
                                              goto label_00e3 ;
                                           }
                                        }
                                     }
                                  }
                               label_0205 :
                                  uCommentImag = tapAction1;
                                  goto label_0207 ;
                               }else {
                                  i7 = i2;
                                  i5 = len1;
                                  i6 = i1;
                                  liveSpannabl1 = liveSpannabl;
                               }
                               LiveCommentRichText$CommentIconSegment iconSegment = oobject1.getIconSegment();
                               if (iconSegment != null) {
                                  tapAction = iconSegment.tapAction;
                                  this1 = PatchProxy.apply(null, obj, LiveRichTextParser.class, this1);
                                  if (this1 == PatchProxyResult.class) {
                                     this1 = obj.b.getValue();
                                  }
                                  obj1 = liveSpannabl1;
                                  obj1.g(obj.a(this1.a(iconSegment)));
                               }else {
                                  obj1 = liveSpannabl1;
                               }
                               LiveCommentRichText$CommentBadgeSegment badgeSegment = oobject1.getBadgeSegment();
                               if (badgeSegment != null) {
                                  tapAction = badgeSegment.tapAction;
                                  this11 = PatchProxy.apply(null, obj, LiveRichTextParser.class, "5");
                                  if (this11 == PatchProxyResult.class) {
                                     this11 = obj.e.getValue();
                                  }
                                  obj1.g(obj.a(this11.a(badgeSegment)));
                               }
                               LiveCommentRichText$CommentGiftSegment giftSegment = oobject1.getGiftSegment();
                               if (giftSegment != null) {
                                  tapAction = giftSegment.tapAction;
                                  Object[] objArray1 = null;
                                  this11 = PatchProxy.apply(objArray1, obj, LiveRichTextParser.class, "3");
                                  if (this11 == PatchProxyResult.class) {
                                     this11 = obj.c.getValue();
                                  }
                                  Objects.requireNonNull(this11);
                                  Drawable uDrawable = PatchProxy.applyOneRefs(giftSegment, this11, e.class, str);
                                  if (uDrawable != PatchProxyResult.class) {
                                  }else {
                                     a = this11.a;
                                     Drawable uDrawable1 = (a != null)? a.a(giftSegment.giftId): objArray1;
                                     uDrawable = uDrawable1;
                                  }
                                  obj1.g(obj.a(uDrawable));
                               }else {
                                  len1 = 0;
                               }
                               LiveCommentRichText$CommentTextSegment uCommentText = tapAction;
                               int i8 = obj1.m();
                               if (uCommentText != null) {
                                  i2 = i7;
                                  if (i8 > i2) {
                                     if (PatchProxy.isSupport(LiveRichTextParser.class)) {
                                        len1 = i2;
                                        uob1 = uob;
                                        if (!PatchProxy.applyVoidFourRefs(uCommentText, obj1, Integer.valueOf(i2), Integer.valueOf(i8), this, LiveRichTextParser.class, "11")) {
                                        }
                                     }else {
                                        len1 = i2;
                                        uob1 = uob;
                                     }
                                  }
                               }
                               uob1 = uob;
                            }
                         label_02ef :
                            len = i3 + 1;
                            if (len < i6 && p1 > 0) {
                               obj1.a(new u9(obj.h));
                            }
                            i2 = i4 + 1;
                            i3 = len;
                            liveSpannabl = obj1;
                            i1 = i6;
                            len1 = i5;
                            uob = uob1;
                            i6 = 0;
                            obj1 = p0;
                         }
                      }
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                oobject = objArray;
                goto label_0031 ;
             }
          }
          return liveSpannabl.k();
       }
       uob = objArray;
       goto label_003b ;
    }
    public final void d(e p0){
       this.f = p0;
    }
}
