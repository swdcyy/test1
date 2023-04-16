package i8a.j;
import vw6.e;
import android.app.Activity;
import java.lang.Object;
import androidx.collection.LruCache;
import i8a.h;
import android.content.res.Resources;
import wh5.c;
import com.kwai.slide.play.detail.information.caption.CaptionView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;
import android.content.Context;
import com.kwai.slide.play.detail.information.caption.CaptionView$a;
import android.view.Window;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.entity.QPhoto;
import vw6.d;
import i8a.g;
import java.lang.Boolean;
import java.lang.StringBuilder;
import i8a.a;
import com.yxcorp.utility.n;
import rkd.b;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import java.lang.Math;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import lnc.a1;
import e0a.j;

public class j implements e	// class@0027cb
{
    public final LruCache a;
    public final CaptionTextView b;
    public final Activity c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public final ViewTreeObserver$OnGlobalLayoutListener j;

    public void j(Activity p0){
       super();
       this.a = new LruCache(20);
       h oh = new h(this);
       this.j = oh;
       this.c = p0;
       int color = p0.getResources().getColor(R.color.arg_RES_7f061c32);
       this.d = color;
       this.f = color;
       this.e = p0.getResources().getColor(0x7f061bf1);
       color = (!c.b())? 2: 3;
       this.g = color;
       CaptionTextView uCaptionText = PatchProxy.applyOneRefs(p0, null, CaptionView.class, "15");
       if (uCaptionText != PatchProxyResult.class) {
       }else {
          uCaptionText = CaptionView.n.a(p0);
       }
       this.b = uCaptionText;
       this.e();
       if (p0.getWindow() != null && p0.getWindow().getDecorView() != null) {
          p0.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(oh);
       }
       return;
    }
    public d a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f(p0);
    }
    public boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isVideoType() || p0.isImageType())? true: false;
       return b;
    }
    public boolean c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       g og = this.a.get(p0.getPhotoId());
       boolean b = (og != null && og.r())? true: false;
       return b;
    }
    public void d(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "7")) {
          return;
       }
       a.c("SlideCaptionTaskAssignee", p0, "skipRun:support="+this.b(p0)+",isExecuted="+this.c(p0));
       return;
    }
    public final boolean e(){
       boolean i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object obj = PatchProxy.apply(null, this, oj, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = n.k(this.c);
       if (b.g()) {
          Point obj1 = PatchProxy.apply(null, this, oj, "3");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else if(this.h == null){
             obj1 = new Point();
             a.b().getSystemService("window").getDefaultDisplay().getRealSize(obj1);
             this.h = Math.min(obj1.x, obj1.y);
          }
          i1 = this.h;
          i = i1;
       }
       float f = 99.00f;
       float f1 = (NasaSlidePlayExperimentUtil.f())? 15.00f: 0;
       i = i - a1.e((f1 + f));
       i1 = (this.i != i)? true: false;
       this.i = i;
       return i1;
    }
    public synchronized g f(QPhoto p0){
       g obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(p0.getPhotoId());
       if (obj == null) {
          g og = new g(p0, this.d, this.e, this.f, Boolean.FALSE, j.g(), this.b, this.i, this.g);
          this.a.put(p0.getPhotoId(), obj);
          a.c("SlideCaptionTaskAssignee", p0, "instance");
       }
       return obj;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, j.class, "9")) {
          return;
       }
       this.a.evictAll();
       if (this.c.getWindow() != null && this.c.getWindow().getDecorView() != null) {
          this.c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.j);
       }
       return;
    }
}
