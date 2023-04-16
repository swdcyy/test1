package a0c.c;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import jd.c;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import a0c.c$a;
import io.reactivex.g;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import android.graphics.drawable.BitmapDrawable;
import bn6.a;
import java.lang.CharSequence;
import android.net.Uri;
import ekd.w0;
import ekd.a0;
import android.graphics.drawable.GradientDrawable$Orientation;
import wkd.b;
import j80.c;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import android.graphics.Bitmap;
import java.lang.Number;
import android.graphics.Color;
import java.lang.Throwable;
import o56.a;
import xf6.d;
import xf6.l;
import a0c.c$b;
import java.lang.Runnable;
import ekd.k1;

public final class c	// class@00000b
{
    public static final String a;
    public static final c b;

    static {
       c.b = new c();
       String separator = File.separator;
       c.a = separator+"post_bubble_res"+separator;
    }
    public void c(){
       super();
    }
    public final String a(String p0){
       return p0;
    }
    public final t b(File p0,int p1,int p2,c p3){
       t ot;
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, c.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (!p0.exists() || p0.isDirectory())) {
          g og = g.C();
          StringBuilder str = "fetchImage error, image file not exist or isDirectory ";
          String absolutePath = (p0 != null)? p0.getAbsolutePath(): null;
          Object[] objArray = new Object[0];
          og.w("home_entrance_bubble", str+absolutePath, objArray);
          ot = t.just(new BitmapDrawable());
          a.o(ot, "Observable.just\(BitmapDrawable\(\)\)");
          return ot;
       }else {
          ot = t.create(new c$a(p0, p3, p1, p2));
          a.o(ot, "Observable.create { emit¡­\n        }\n      }\)\n    }");
          return ot;
       }
    }
    public final t c(File p0,c p1){
       p1 = PatchProxy.applyTwoRefs(p0, null, this, c.class, "13");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return this.b(p0, 0, 0, null);
    }
    public final int d(int p0){
       switch (p0){
           case 16:
             p0 = a.d;
             break;
           case 17:
           case 19:
           case 20:
           case 18:
             p0 = a.a;
             break;
           default:
             p0 = a.h;
       }
       return p0;
    }
    public final int e(int p0){
       switch (p0){
           case 14:
             p0 = a.f;
             break;
           case 16:
             p0 = a.d;
             break;
           case 17:
           case 19:
           case 20:
           case 18:
             p0 = a.a;
             break;
           default:
          label_0003 :
             p0 = a.g;
       }
       return p0;
    }
    public final String f(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 == null || !p0.length())? 1: null;
       if (obj) {
          p0 = null;
       }else {
          Uri uri = w0.f(p0);
          a.o(uri, "SafetyUriCalls.parseUriFromString\(url\)");
          uri = a0.c(uri.getPath());
       }
       return p0;
    }
    public final GradientDrawable$Orientation g(int p0,boolean p1){
       GradientDrawable$Orientation lEFT_RIGHT;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                lEFT_RIGHT = GradientDrawable$Orientation.LEFT_RIGHT;
             }else if(p1){
                lEFT_RIGHT = GradientDrawable$Orientation.TL_BR;
             }else {
                lEFT_RIGHT = GradientDrawable$Orientation.BL_TR;
             }
          }else if(p1){
             lEFT_RIGHT = GradientDrawable$Orientation.BL_TR;
          }else {
             lEFT_RIGHT = GradientDrawable$Orientation.TL_BR;
          }
       }else {
          lEFT_RIGHT = GradientDrawable$Orientation.TOP_BOTTOM;
       }
       return lEFT_RIGHT;
    }
    public final File h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subCachePath");
       return new File(b.a(-1504323719).a().getAbsolutePath()+c.a, p0);
    }
    public final File i(String p0,String p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subCachePath");
       obj = (p1 != null)? new File(c.b.h(p0), p1): null;
       return obj;
    }
    public final String j(PublishGuideInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bubbleInfo");
       return p0.mId+p0.mExpireTime;
    }
    public final boolean k(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!p0 instanceof BitmapDrawable || p0.getBitmap() != null))? true: false;
       return b;
    }
    public final int l(String p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          i = Color.parseColor(p0);
       }catch(java.lang.Exception e4){
          g.C().e("HomeBubbleHelper", "failed_show_bubble: parseColorSafely error", e4);
          i = -1;
       }
       return i;
    }
    public final void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "18")) {
          return;
       }
       a.p(p0, "message");
       if (a.d() && l.c("key_post_entrance_enable_bubble_toast", false)) {
          k1.o(new c$b(p0));
       }
       return;
    }
}
