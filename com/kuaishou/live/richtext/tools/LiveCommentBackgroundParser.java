package com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser$cache$2;
import msd.a;
import qrd.p;
import qrd.s;
import e61.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.richtext.tools.a;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import android.util.LruCache;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.BitmapFactory;
import android.graphics.drawable.NinePatchDrawable;
import com.kuaishou.live.richtext.tools.a$a;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.Rect;

public final class LiveCommentBackgroundParser	// class@000f76
{
    public final p a;
    public static SoftReference b;
    public static final LiveCommentBackgroundParser$a c;

    static {
       LiveCommentBackgroundParser.c = new LiveCommentBackgroundParser$a(null);
    }
    public void LiveCommentBackgroundParser(){
       super();
       this.a = s.c(LiveCommentBackgroundParser$cache$2.INSTANCE);
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, LiveCommentBackgroundParser.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final Drawable b(String p0,String p1,int p2,boolean p3){
       String obj;
       Bitmap uBitmap;
       Drawable uDrawable1;
       byte[] this;
       a$a uoa;
       a$a uoa1;
       NinePatchDrawable ninePatchDra;
       Drawable uDrawable2;
       Drawable this1;
       Bitmap uBitmap2;
       if (PatchProxy.isSupport(LiveCommentBackgroundParser.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, LiveCommentBackgroundParser.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "resId");
       a.p(p1, "path");
       Drawable uDrawable = null;
       if (!a.d(p1)) {
          return uDrawable;
       }else {
          obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveCommentBackgroundParser.class, "3");
          if (obj != PatchProxyResult.class) {
             uBitmap = obj;
          }else {
             obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveCommentBackgroundParser.class, "6");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = p0+p1;
             }
             Bitmap uBitmap1 = this.a().get(obj);
             if (uBitmap1 != null) {
                uBitmap = uBitmap1;
             }else {
                p0 = LiveMaterialResourceManager.h.b(p0, p1);
                if (p0 != null) {
                   b.Z(LiveLogTag.COMMENT, "createBackgroundBitmap "+p0);
                   uBitmap2 = BitmapFactory.decodeFile(p0);
                }else {
                   uBitmap2 = uDrawable;
                }
                if (uBitmap2 != null) {
                   this.a().put(obj, uBitmap2);
                }
                uBitmap = uBitmap2;
             }
          }
          if (p3) {
             if (PatchProxy.isSupport(LiveCommentBackgroundParser.class)) {
                uDrawable1 = PatchProxy.applyTwoRefs(uBitmap, Integer.valueOf(p2), this, LiveCommentBackgroundParser.class, "5");
                if (uDrawable1 != PatchProxyResult.class) {
                label_012a :
                   return uDrawable1;
                }
             }
             this = (uBitmap != null)? uBitmap.getNinePatchChunk(): uDrawable;
             if (this != null) {
                uoa = a.c(this);
                uoa1 = (uoa != null)? uoa.a: uDrawable;
                if (uoa1 != null) {
                   ninePatchDra = new NinePatchDrawable(a1.m(), uBitmap, this, uoa1, "");
                }
             }
          }else if(PatchProxy.isSupport(LiveCommentBackgroundParser.class)){
             p0 = PatchProxy.applyTwoRefs(uBitmap, Integer.valueOf(p2), this, LiveCommentBackgroundParser.class, "4");
             if (p0 != PatchProxyResult.class) {
                uDrawable = p0;
             }
          }
          this = (uBitmap != null)? uBitmap.getNinePatchChunk(): uDrawable;
          if (this != null) {
             uoa = a.c(this);
             uoa1 = (uoa != null)? uoa.a: uDrawable;
             if (uoa1 != null) {
                int i = a1.e(((float)uBitmap.getHeight() / 3.00f));
                if (p2 < (i - (uoa1.top + uoa1.bottom))) {
                   i = (i - p2) / 2;
                   uoa1.top = i;
                   uoa1.bottom = i;
                }
                ninePatchDra = new NinePatchDrawable(a1.m(), uBitmap, this, uoa1, "");
             }
          }
       label_0129 :
          uDrawable1 = uDrawable;
          goto label_012a ;
       }
    }
}
