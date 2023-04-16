package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements;
import ho2.e;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ho2.g;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$visit$4;
import csd.b;
import java.io.FileInputStream;
import java.io.File;
import kotlin.jvm.internal.Ref$IntRef;
import com.airbnb.lottie.LottieAnimationView;
import qrd.j0;
import java.lang.IllegalStateException;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.background.multiimage.LottieConfig;
import com.kuaishou.live.core.voiceparty.background.multiimage.Url;
import java.util.Objects;
import ho2.p;
import android.net.Uri;
import ho2.l;
import v1.b;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$a;
import w4.j;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$b;
import w4.c;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageView$a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import qrd.l1;
import ho2.b;
import ho2.f;
import android.graphics.drawable.Drawable;
import ho2.n;
import com.kuaishou.live.core.voiceparty.background.multiimage.Image;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.a;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ho2.h;
import ab.e;
import zc.a;
import com.facebook.common.internal.ImmutableList;
import com.kuaishou.live.core.voiceparty.background.multiimage.a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.voiceparty.background.multiimage.Image$Style;
import yb.b;
import android.content.res.Resources;
import com.facebook.drawee.generic.RoundingParams;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$prepareLottieResource$1;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$a;
import ekd.a0;
import kotlin.Pair;
import qrd.r0;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$concurrentDownload$2;
import msd.p;
import ftd.l0;
import ho2.o;

public final class Inflater$InitElements implements e	// class@001354
{
    public final Map a;
    public final Inflater b;

    public void Inflater$InitElements(Inflater p0,Map p1){
       a.p(p1, "resolvedVariable");
       this.b = p0;
       super();
       this.a = p1;
    }
    public Object a(g p0,c p1){
       Inflater$InitElements$visit$4 initElements;
       Inflater$InitElements$visit$4 obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$InitElements.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof Inflater$InitElements$visit$4) {
          obj = p1;
          Inflater$InitElements$visit$4 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             Inflater$InitElements$visit$4 result = obj.result;
             Inflater$InitElements obj1 = b.h();
             Inflater$InitElements$visit$4 label1 = obj.label;
             g og = 1;
             if (label1 != null) {
                if (label1 == og) {
                   j0.n(result);
                   result = obj.L$2;
                   initElements = obj.L$1;
                   label = obj.L$0;
                   obj = result;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                LottieAnimationView lottieAnimat = new LottieAnimationView(this.b.c);
                Ref$IntRef intRef = new Ref$IntRef();
                intRef.element = og;
                Ref$IntRef intRef1 = new Ref$IntRef();
                int i1 = -1;
                intRef1.element = i1;
                g config = p0.config;
                if (config != null) {
                   if (a.g(config.repeatMode, "REVERSE")) {
                      intRef.element = 2;
                   }
                   if (config.a() != i1 && config.a() >= 0) {
                      intRef1.element = config.a();
                   }
                }
             label_00a2 :
                Url url = p0.c();
                Objects.requireNonNull(url, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.background.multiimage.UrlString");
                Uri uri = Uri.parse(url.a());
                a.o(uri, "Uri.parse\(\(lottie.src as UrlString\).string\)");
                File uFile = b.a(l.a(uri, this.b.d));
                FileInputStream uFileInputSt = new FileInputStream(uFile);
                a.d(uFileInputSt, uFile.getAbsolutePath()).addListener(new Inflater$InitElements$a(this, lottieAnimat, intRef, intRef1));
                Map map = p0.b();
                if (map != null) {
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = lottieAnimat;
                   obj.L$3 = intRef;
                   obj.L$4 = intRef1;
                   obj.L$5 = uFile;
                   obj.L$6 = uFileInputSt;
                   obj.L$7 = map;
                   obj.label = og;
                   obj = this.e(map, obj);
                   if (obj == obj1) {
                      return obj1;
                   }else {
                      obj1 = this;
                   }
                }else {
                   Map map1 = null;
                   obj1 = this;
                label_0100 :
                   result.setImageAssetDelegate(new Inflater$InitElements$b(label, obj));
                   label.b.b.addView(result, new MultiImageView$a(initElements.x, initElements.y, initElements.width, initElements.height));
                   return l1.a;
                }
             }
             goto label_0100 ;
          }
       }
       obj = new Inflater$InitElements$visit$4(this, p1);
       goto label_0025 ;
    }
    public Object b(b p0,c p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$InitElements.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       this.b.b.setBackground(new f(p0));
       return l1.a;
    }
    public Object c(n p0,c p1){
       return l1.a;
    }
    public Object d(Image p0,c p1){
       Inflater$InitElements initElements = Inflater$InitElements.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, initElements, str);
       if (p1 != patchProxyRe) {
          return p1;
       }
       KwaiImageView kwaiImageVie = new KwaiImageView(this.b.c);
       AbstractDraweeController uAbstractDra = PatchProxy.applyOneRefs(p0, this, initElements, "3");
       if (uAbstractDra != patchProxyRe) {
       }else {
          Uri uri = Uri.parse(this.f(p0.c()));
          a.o(uri, "Uri.parse\(resolveUrl\(image.src\)\)");
          d uod = Fresco.newDraweeControllerBuilder().D(l.a(uri, this.b.d));
          h oh = new h();
          e.d(oh);
          a[] uoaArray = new a[]{oh};
          uod.w = ImmutableList.of(uoaArray);
          uod.s(new a(this));
          uAbstractDra = uod.e();
          a.o(uAbstractDra, "Fresco.newDraweeControll¡­      }\)\n        .build\(\)");
       }
       kwaiImageVie.setController(uAbstractDra);
       MultiImageView$a uoa = new MultiImageView$a(p0.x, p0.y, p0.width, p0.height);
       Image$Style style = PatchProxy.apply(null, p0, Image.class, str);
       if (style != patchProxyRe) {
       }else {
          Image _style = p0._style;
          Image$Style nONE = (_style == null || (_style.hashCode() == -1360216880 && _style.equals("circle")))? Image$Style.CIRCLE: Image$Style.NONE;
          style = nONE;
       }
       if (style == Image$Style.CIRCLE) {
          b uob = new b(this.b.c.getResources());
          uob.z(RoundingParams.a());
          kwaiImageVie.setHierarchy(uob.a());
       }
       float f = p0.b();
       if (f >= 0 && f - 0x3f800000 <= 0) {
          kwaiImageVie.setImageAlpha((int)((float)255 * p0.b()));
       }
       this.b.b.addView(kwaiImageVie, uoa);
       return l1.a;
    }
    public final Object e(Map p0,c p1){
       Inflater$InitElements$prepareLottieResource$1 initElements;
       Inflater$InitElements$prepareLottieResource$1 l$4;
       File uFile1;
       if (p1 instanceof Inflater$InitElements$prepareLottieResource$1) {
          initElements = p1;
          Inflater$InitElements$prepareLottieResource$1 label = initElements.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             initElements.label = label - i;
          label_0018 :
             Inflater$InitElements$prepareLottieResource$1 result = initElements.result;
             Object obj = b.h();
             Inflater$InitElements$prepareLottieResource$1 label1 = initElements.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$4 = initElements.L$4;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                File uFile = new File(this.b.d, ".cache");
                uFile.mkdir();
                ArrayList uArrayList = new ArrayList();
                LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(p0.size()));
                Iterator iterator = p0.entrySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      Object key = uEntry.getKey();
                      String key1 = uEntry.getKey();
                      Url value = uEntry.getValue();
                      String str = this.f(value);
                      Uri uri = Uri.parse(str);
                      a.o(uri, "uri");
                      if (l.b(uri)) {
                         str = uri.getPath();
                         if (str != null) {
                            a.o(str, "uri.path ?: throw Illega\x20\x02given for variable $key\"\)\x00");
                            uFile1 = new File(this.b.d, str);
                            if (!uFile1.exists()) {
                               throw new IllegalStateException("resource not found in package, variable "+key1+" url "+value.toString());
                            }
                         }else {
                            throw new IllegalArgumentException("invalid file scheme, no path given for variable "+key1);
                         }
                      }else {
                         Inflater$a g = Inflater.g;
                         Objects.requireNonNull(g);
                         String str1 = PatchProxy.applyOneRefs(str, g, Inflater$a.class, "3");
                         if (str1 != PatchProxyResult.class) {
                         }else {
                            str1 = a0.c(str);
                            if (str1 == null) {
                               throw new IllegalArgumentException("can\'t digest md5 for ["+str+']');
                            }
                         }
                         uFile1 = new File(uFile, str1);
                         uArrayList.add(r0.a(str, uFile1));
                      }
                      linkedHashMa.put(key, uFile1);
                   }else {
                      initElements.L$0 = this;
                      initElements.L$1 = p0;
                      initElements.L$2 = uFile;
                      initElements.L$3 = uArrayList;
                      initElements.L$4 = linkedHashMa;
                      initElements.label = 1;
                      Objects.requireNonNull(this.b);
                      l1 ol1 = l0.g(new Inflater$concurrentDownload$2(uArrayList, null), initElements);
                      if (ol1 != b.h()) {
                         ol1 = l1.a;
                      }
                      if (ol1 == obj) {
                         return obj;
                      }else {
                         l$4 = linkedHashMa;
                         break ;
                      }
                   }
                }
             }
             return l$4;
          }
       }
       initElements = new Inflater$InitElements$prepareLottieResource$1(this, p1);
       goto label_0018 ;
    }
    public final String f(Url p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, Inflater$InitElements.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof p) {
          str = p0.a();
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.background.multiimage.UrlParam");
          str = this.a.get(p0.a());
          a.m(str);
       }
       return str;
    }
}
