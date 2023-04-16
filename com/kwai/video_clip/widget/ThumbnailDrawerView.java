package com.kwai.video_clip.widget.ThumbnailDrawerView;
import android.view.View;
import o79.i;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Paint;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.util.Objects;
import uw7.c;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.utility.Log;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.Map;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import ekd.k1;
import java.util.Iterator;
import java.util.List;
import tw7.b;
import uw7.a;
import uw7.d;
import android.util.LruCache;
import java.lang.Throwable;
import java.lang.Number;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Math;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Path$Direction;

public class ThumbnailDrawerView extends View	// class@00110b
{
    public double b;
    public double c;
    public RectF d;
    public Path e;
    public Rect f;
    public Rect g;
    public Rect h;
    public Rect i;
    public Paint j;
    public Bitmap k;
    public float l;
    public int m;
    public int n;
    public int o;
    public c p;
    public int[] q;
    public Map r;
    public QMedia s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;

    static {
       ThumbnailDrawerView.t = i.c(0x7f0704bb);
       ThumbnailDrawerView.u = i.c(0x7f0704c1);
       ThumbnailDrawerView.v = i.c(0x7f0704bf);
       ThumbnailDrawerView.w = i.c(0x7f0704ba);
    }
    public void ThumbnailDrawerView(Context p0){
       super(p0, null);
    }
    public void ThumbnailDrawerView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void ThumbnailDrawerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new RectF();
       this.e = new Path();
       int t = ThumbnailDrawerView.t;
       this.f = new Rect(0, t, 0, (ThumbnailDrawerView.v + t));
       this.g = new Rect();
       this.h = new Rect();
       this.i = new Rect();
       this.j = new Paint();
       this.l = (float)i.d(4.00f);
       this.m = -1;
       this.n = -1;
       int[] ointArray = new int[2];
       this.q = ointArray;
       this.r = new HashMap();
       if (PatchProxy.applyVoid(null, this, ThumbnailDrawerView.class, "1")) {
       }else {
          this.j.setColor(i.a(R.color.arg_RES_7f060b95));
          this.j.setStyle(Paint$Style.FILL);
       }
       return;
    }
    public Bitmap a(double p0){
       ThumbnailDrawerView obj1;
       Object[] obj2;
       String str2;
       d uod1;
       c s;
       b obj4;
       Object obj5;
       d c;
       d uod3;
       Object[] obj = this;
       double d = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "11";
       if (PatchProxy.isSupport(ThumbnailDrawerView.class)) {
          obj1 = PatchProxy.applyOneRefs(Double.valueOf(p0), obj, ThumbnailDrawerView.class, str);
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = obj.p;
       int w = ThumbnailDrawerView.w;
       int v = ThumbnailDrawerView.v;
       Objects.requireNonNull(obj1);
       if (PatchProxy.isSupport(c.class)) {
          obj2 = PatchProxy.applyFourRefs(Double.valueOf(p0), Integer.valueOf(w), Integer.valueOf(v), null, obj1, c.class, "8");
          if (obj2 != patchProxyRe) {
          }else {
          label_004c :
             int i = 4;
             boolean i1 = 0;
             object oobject = null;
             if (PatchProxy.isSupport(c.class)) {
                obj2 = new Object[]{Double.valueOf(p0),Integer.valueOf(w),Integer.valueOf(v),oobject,Boolean.FALSE};
                obj2 = PatchProxy.apply(obj2, obj1, c.class, "9");
                if (obj2 != patchProxyRe) {
                }
             }
             c o = obj1.o;
             String str1 = "TimeLineGenerator";
             if (o == null) {
                Log.n(str1, "fetchByRenderTime: mProject is null");
             }else if(!o.trackAssetsSize()){
                Log.d(str1, "fetchByRenderTime: wrong project trackAssets "+obj1.o);
             }else if(w <= 0 || v <= 0){
                Log.d(str1, "fetchByRenderTime: wrong arg width="+w+" height"+v);
             }else {
                long l = System.currentTimeMillis();
                RenderPosDetail renderPosDet = obj1.t.get(Double.valueOf(p0));
                if (renderPosDet == null) {
                   renderPosDet = EditorSdk2UtilsV2.renderPosDetailOfRenderPos(obj1.o, d);
                   obj1.t.put(Double.valueOf(p0), renderPosDet);
                }
                i1 = renderPosDet.getTrackAssetIndex();
                try{
                   str2 = str1;
                   double trackAssetOr = renderPosDet.getTrackAssetOriginalPtsSec();
                   if (i1 >= obj1.o.trackAssetsSize()) {
                      String str3 = "fetchByRenderTime: "+"trackIndex bigger than mProject.trackAssets.length "+obj1.o;
                      i = str2;
                      Log.d(i, str3);
                   }else {
                      String str4 = str2;
                      if (trackAssetOr < 0) {
                         Log.d(str4, "fetchByRenderTime: wrong arg "+"trackTime < 0,renderTime="+d+",detail.getTrackAssetIndex="+renderPosDet.getTrackAssetIndex()+",detail.getTrackAssetOriginalPtsSec="+renderPosDet.getTrackAssetOriginalPtsSec()+",detail.getRenderPositionSec="+renderPosDet.getRenderPositionSec()+",detail.getPlaybackPositionSec="+renderPosDet.getPlaybackPositionSec()+", videoEditProject="+obj1.o);
                      }else {
                         String str5 = obj1.o.trackAssets(i1).assetPath();
                         PatchProxyResult patchProxyRe1 = patchProxyRe;
                         int i2 = obj1.o.trackAssets(i1).rotationDeg();
                         Log.l(str4, "fetchByRenderTime: fetchTime="+d+" trackIndex="+i1+" trackTime="+trackAssetOr);
                         Log.b(str4, "fetchByRenderTime: renderPosDetailOfRenderPos time line cost "+k1.t(l));
                         if (obj1.i != v || obj1.h != w) {
                            obj1.h = w;
                            obj1.i = v;
                            obj = null;
                            if (!PatchProxy.applyVoid(obj, obj1, c.class, str)) {
                               Iterator iterator1 = obj1.p.iterator();
                               while (iterator1.hasNext()) {
                                  if (!iterator1.next().d()) {
                                     iterator1.remove();
                                  }
                               }
                            }
                            Log.b(str4, "fetchByRenderTime: using new width="+w+" height="+v);
                         }else {
                            uod3 = null;
                         }
                         str = str4;
                         b uob = new b(i1, str5, trackAssetOr, 1, w, v, null);
                         patchProxyRe.m = obj;
                         patchProxyRe.k = false;
                         if (obj1.n != null) {
                            patchProxyRe.l = i2;
                         }
                         a uoa = a.class;
                         obj2 = PatchProxy.applyOneRefs(patchProxyRe, obj1, c.class, "13");
                         PatchProxyResult patchProxyRe2 = patchProxyRe1;
                         if (obj2 != patchProxyRe2) {
                         }else {
                            o = obj1.r;
                            b b = patchProxyRe.b;
                            b d1 = patchProxyRe.d;
                            Objects.requireNonNull(o);
                            d uod = d.class;
                            if (PatchProxy.isSupport(uod)) {
                               Object obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(b), Double.valueOf(d1), o, uod, "1");
                               if (obj3 != patchProxyRe2) {
                                  uod1 = obj3;
                               }else {
                               label_026c :
                                  uod = o.a;
                                  d uod2 = -1;
                                  if (uod == uod2) {
                                     o.a = b;
                                     o.b = d1;
                                  }else {
                                     c = o.c;
                                     if (c == uod2) {
                                        o.c = b;
                                        o.d = d1;
                                     }else if(b < c || (b == c && d1 - o.d < 0)){
                                        uod3 = 1;
                                     }else {
                                        uod3 = null;
                                     }
                                     if (uod3) {
                                        uod3 = new d();
                                        uod3.a = uod;
                                        uod3.b = o.b;
                                        uod3.c = c;
                                        uod3.d = o.d;
                                        o.a();
                                        o.a = b;
                                        o.b = d1;
                                        Log.g("TimeLineVisibleWindow", "calculateWindow: update start="+o.a+" "+o.b);
                                        uod1 = uod3;
                                     }else {
                                        o.c = b;
                                        o.d = d1;
                                     }
                                  }
                                  uod1 = null;
                               }
                            }else {
                               goto label_026c ;
                            }
                            if (uod1 != null) {
                               s = obj1.s;
                               i1 = (uod1.a == s.a && (!uod1.b - s.b && (uod1.c != s.c || uod1.d - s.d)))? true: false;
                               if (i1) {
                                  obj1.s = uod1;
                                  Log.g(str, "fetchByTrackTime: update window="+obj1.s);
                               }
                            }
                            s = obj1.b;
                            Objects.requireNonNull(s);
                            Bitmap uBitmap = PatchProxy.applyOneRefs(patchProxyRe, s, uoa, "3");
                            String str6 = "TimeLineCache";
                            if (uBitmap != patchProxyRe2) {
                            }else {
                               String str8 = s.a(patchProxyRe, patchProxyRe.l);
                               Log.b(str6, "get, key="+str8);
                               Bitmap uBitmap1 = s.c.get(str8);
                               if (uBitmap1 != null) {
                                  Log.b(str6, "refresh cache key, key="+str8);
                                  patchProxyRe.e = str8;
                               }
                               uBitmap = uBitmap1;
                            }
                            if (uBitmap == null) {
                               s = obj1.q;
                               if (s == null || !(s.a()).equals(patchProxyRe.a())) {
                                  String str7 = patchProxyRe.a();
                                  obj4 = PatchProxy.applyOneRefs(str7, obj1, c.class, "18");
                                  if (obj4 != patchProxyRe2) {
                                     i1 = obj4.booleanValue();
                                  }else {
                                     Iterator iterator = obj1.p.iterator();
                                     while (true) {
                                        if (iterator.hasNext()) {
                                           if (str7.equals(iterator.next().e)) {
                                              i1 = true;
                                           }
                                        }else {
                                           i1 = false;
                                        }
                                     }
                                  }
                                  if (!i1) {
                                     obj1.p.add(patchProxyRe);
                                     if (patchProxyRe.d()) {
                                        Log.g(str, "fetchByRequest: a mustDone request");
                                     }
                                     Log.g(str, "fetchByTrackTime: add pending request "+patchProxyRe);
                                  }
                               }
                               obj1.b();
                               s = obj1.b;
                               Objects.requireNonNull(s);
                               obj4 = PatchProxy.applyOneRefs(patchProxyRe, s, uoa, "5");
                               if (obj4 != patchProxyRe2) {
                                  obj5 = obj4;
                               }else {
                                  obj4 = patchProxyRe.l;
                                  Log.g(str6, "get backup bitmap of rotationDeg"+obj4);
                                  str = 4;
                                  i1 = 0;
                                  while (true) {
                                     if (i1 < str) {
                                        obj5 = s.c.get(s.a(patchProxyRe, obj4)+"_b");
                                        if (obj5 != null) {
                                           Log.g(str6, "found backup bitmap of rotationDeg"+obj4);
                                        }else {
                                           int i3 = obj4 + 90;
                                           i3 = i3 % 360;
                                           i1 = i1 + 1;
                                        }
                                     }else {
                                        obj5 = null;
                                     }
                                  }
                               }
                               if (obj5 != null) {
                                  obj2 = obj5;
                               }else {
                                  s = obj1.b;
                                  Objects.requireNonNull(s);
                                  if (PatchProxy.isSupport(uoa)) {
                                     uBitmap = PatchProxy.applyTwoRefs(patchProxyRe, Boolean.TRUE, s, uoa, "4");
                                     if (uBitmap != patchProxyRe2) {
                                     }
                                  }
                                  uBitmap = s.a.get(patchProxyRe.b());
                                  if (uBitmap != null) {
                                     s.b.put(patchProxyRe.c, uBitmap);
                                  }else {
                                     uBitmap = s.b.get(patchProxyRe.c);
                                  }
                               }
                            }
                            obj2 = uBitmap;
                         }
                      }
                   }
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                   str = str2;
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                   str = i;
                }
             }
          }
       }else {
          goto label_004c ;
       }
       return obj2;
    }
    public final double b(int p0){
       if (PatchProxy.isSupport(ThumbnailDrawerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ThumbnailDrawerView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       double d = (double)p0 * this.b;
       ThumbnailDrawerView ts = this.s;
       QMedia duration = ts.duration;
       QMedia mClipDuratio = ts.mClipDuration;
       if (duration - mClipDuratio <= 0) {
          duration = mClipDuratio;
       }
       d = Math.min(d, (((double)duration / 0x408f400000000000) - 0x3fa999999999999a));
       String str = null;
       if (d - str < 0) {
          d = str;
       }
       Log.b("KSThumbnailDrawerView", "getFetchTime: time="+d);
       return d;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, ThumbnailDrawerView.class, "13")) {
          return;
       }
       ThumbnailDrawerView to = this.o;
       int t = ThumbnailDrawerView.t;
       int v = ThumbnailDrawerView.v;
       this.g.set(0, t, (to + t), (v + t));
       int i = (i.k() - (ThumbnailDrawerView.u * 2)) + to;
       this.h.set(to, 0, i, this.getHeight());
       this.i.set((i - t), t, this.getWidth(), (v + t));
       Drawable uDrawable = i.e(R.drawable.arg_RES_7f08081f);
       i = i - to;
       this.k = Bitmap.createBitmap(i, this.getHeight(), Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(this.k);
       uDrawable.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
       uDrawable.draw(uCanvas);
       return;
    }
    public void dispatchDraw(Canvas p0){
       int w;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThumbnailDrawerView.class, "5")) {
          return;
       }
       super.dispatchDraw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ThumbnailDrawerView.class, "9")) {
          String str = "KSThumbnailDrawerView";
          Log.b(str, "drawBitmap\(\) called with: canvas = ["+p0+"]");
          ThumbnailDrawerView thumbnailDra = -1;
          if (!PatchProxy.applyVoid(null, this, ThumbnailDrawerView.class, "8")) {
             this.m = thumbnailDra;
             this.n = thumbnailDra;
             if (this.s != null) {
                this.getLocationInWindow(this.q);
                w = 0;
                int i2 = this.q[w];
                i = ThumbnailDrawerView.w;
                this.m = (i2 >= (- i))? w: (int)Math.ceil((double)((float)(- i2) / (float)i)) + thumbnailDra;
                this.n = this.m + (int)Math.ceil((double)((float)i.k() / (float)i));
                Log.l(str, "atScreenX="+i2+" mStartFrame="+this.m+" mEndFrame="+this.n+" viewWidth="+this.getWidth());
             }
          }
          if (this.m != thumbnailDra || this.n != thumbnailDra) {
             p0.save();
             p0.clipPath(this.e);
             ThumbnailDrawerView tf = this.f;
             thumbnailDra = this.m;
             w = ThumbnailDrawerView.w;
             i = thumbnailDra * w;
             tf.left = i;
             tf.right = i + w;
             while (thumbnailDra <= this.n) {
                double d = this.b(thumbnailDra);
                Bitmap uBitmap = this.a(d);
                if (uBitmap == null) {
                   uBitmap = this.r.get(Double.valueOf(d));
                   if (uBitmap == null) {
                      Log.d(str, "drawBitmap: null");
                   label_010d :
                      int i1 = thumbnailDra + 1;
                   }
                }else {
                   this.r.put(Double.valueOf(d), uBitmap);
                }
                p0.drawBitmap(uBitmap, null, this.f, null);
                tf = this.f;
                i = ThumbnailDrawerView.w;
                w = tf.left + i;
                tf.left = w;
                w = tf.right + i;
                tf.right = w;
                goto label_010d ;
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, ThumbnailDrawerView.class, "15")) {
                p0.drawRect(this.g, this.j);
                p0.drawRect(this.i, this.j);
             }
             p0.restore();
             if (!PatchProxy.applyVoidOneRefs(p0, this, ThumbnailDrawerView.class, "14")) {
                tf = this.k;
                if (tf != null) {
                   p0.drawBitmap(tf, null, this.h, null);
                }
             }
          }
       }
    label_0140 :
       return;
    }
    public int getInitScrollX(){
       return (int)(((double)this.s.mClipStart * this.c) / 0x408f400000000000);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ThumbnailDrawerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ThumbnailDrawerView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!PatchProxy.applyVoid(null, this, ThumbnailDrawerView.class, "12")) {
          p2 = ThumbnailDrawerView.t;
          float f = (float)p2;
          this.d.set(0, f, (float)this.getWidth(), (float)(this.getHeight() - p2));
          this.e.reset();
          this.e.addRoundRect(this.d, this.l, this.l, Path$Direction.CCW);
          this.c();
       }
       return;
    }
}
