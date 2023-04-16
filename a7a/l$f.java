package a7a.l$f;
import joc.z;
import a7a.l;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import rf5.u;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import uw9.o;
import q87.c;
import java.lang.Math;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.view.ViewGroup;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;

public final class l$f extends z	// class@000062
{
    public boolean e;
    public final l f;

    public void l$f(l p0){
       this.f = p0;
       super();
    }
    public boolean d(View p0,MotionEvent p1){
       Object[] objArray;
       Object[] objArray2;
       Object[] objArray3;
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, l$f.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "ev");
       boolean b = false;
       if (!this.f.b9().w()) {
          l$f tf = this.f;
          if (tf.s1 != null || (tf.i1 == null && tf.t1 == null)) {
             if (tf.q9(p1)) {
                objArray = new Object[b];
                o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: isDownInTargetArea not intercept", objArray);
                PatchProxy.onMethodExit(l$f.class, "1");
                return b;
             }else {
                boolean actionMasked = p1.getActionMasked();
                char c = ' ';
                Object[] objArray1 = 2;
                int i = 1;
                if (actionMasked) {
                   if (actionMasked == objArray1) {
                      float f = p1.getX() - this.f.n1;
                      int i1 = (int)Math.abs(f);
                      int i2 = (int)Math.abs((p1.getY() - this.f.o1));
                      l$f tf1 = this.f;
                      l m1 = tf1.m1;
                      if (i1 > m1 && (i2 > m1 && i1 < i2)) {
                         objArray = new Object[b];
                         o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 上下滑不拦截", objArray);
                         PatchProxy.onMethodExit(l$f.class, "1");
                         return b;
                      }else if(tf1.b9().w()){
                         objArray = new Object[b];
                         o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 侧滑小窗开启时不拦截", objArray);
                         PatchProxy.onMethodExit(l$f.class, "1");
                         return b;
                      }else if(f - (float)b > 0){
                         if (this.f.X8().D()) {
                            objArray = new Object[b];
                            o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 外层通滑处理", objArray);
                            this.f.X8().setEnableScroll(b);
                            PatchProxy.onMethodExit(l$f.class, "1");
                            return b;
                         }
                      }else if(this.j()){
                         objArray = new Object[b];
                         o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 滑动热区，不拦截", objArray);
                         PatchProxy.onMethodExit(l$f.class, "1");
                         return b;
                      }else if(this.f.X8().F() && !this.f.s9()){
                         objArray = new Object[b];
                         o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 最后一张 && 左滑，不支持侧滑小窗和P页不拦截", objArray);
                         PatchProxy.onMethodExit(l$f.class, "1");
                         return b;
                      }else if(this.f.X8().getEnableScroll() && (!this.f.X8().getScrollState() && (i1 > objArray1 && (i1 < this.f.m1 && i1 > i2)))){
                         objArray3 = new Object[b];
                         o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 应该提前拦截  "+i1+c+this.f.m1, objArray3);
                         PatchProxy.onMethodExit(l$f.class, "1");
                         return i;
                      }
                   }
                }else {
                   this.f.X8().setEnableScroll(i);
                   actionMasked.n1 = p1.getX();
                   actionMasked.o1 = p1.getY();
                   if (this.f.X8().F()) {
                      if (this.j()) {
                         this.f.m9();
                      }else {
                         this.f.l9();
                      }
                   }
                   objArray2 = new Object[b];
                   o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: down", objArray2);
                }
             label_0194 :
                if (NasaExperimentUtils.a() && (!p1.getActionMasked() && this.f.X8().getScrollState() == objArray1)) {
                   objArray1 = new Object[b];
                   o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: SCROLL_STATE_SETTLING and Down", objArray1);
                   actionMasked = false;
                }else {
                   actionMasked = this.f.X8().onInterceptTouchEvent(p1);
                }
                objArray2 = new Object[b];
                o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 默认拦截逻辑 "+actionMasked+" RecyclerView 滚动状态："+this.f.X8().getScrollState()+c+MotionEvent.actionToString(p1.getActionMasked()), objArray2);
                if (!actionMasked) {
                   objArray1 = new Object[b];
                   o.C().s("SlideAtlasTouch", "x 距离："+Math.abs((p1.getX() - this.f.n1))+" y 距离："+Math.abs((p1.getY() - this.f.o1)), objArray1);
                   if (!this.j() && (this.f.b9().q() - (float)b > 0 && this.f.b9().q() - (float)i < 0)) {
                      objArray = new Object[b];
                      o.C().s("SlideAtlasTouch", "小窗滑动过程中 强制拦截", objArray);
                   label_026c :
                      if (i) {
                         InvalidGestureChecker.h.b(this.f.getContext(), AnswerType.ATLAS);
                      }
                      objArray3 = new Object[b];
                      o.C().s("SlideAtlasTouch", "onInterceptTouchEventImpl: 最终为"+i, objArray3);
                      PatchProxy.onMethodExit(l$f.class, "1");
                      return i;
                   }
                }
                i = actionMasked;
                goto label_026c ;
             }
          }
       }
       PatchProxy.onMethodExit(l$f.class, "1");
       return b;
    }
    public boolean f(View p0,MotionEvent p1){
       Object[] objArray;
       Object[] objArray3;
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, l$f.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "ev");
       boolean actionMasked = p1.getActionMasked();
       StringBuilder str = 2;
       boolean b = true;
       if (actionMasked) {
          if (actionMasked != b) {
             if (actionMasked == str) {
                l$f tf = this.f;
                if ((p1.getX() - tf.n1) - (float)0 <= 0 && (tf.t9() && (this.j() || this.f.X8().F()))) {
                   objArray3 = new Object[0];
                   o.C().w("SlideAtlasTouch", "onTouchEventImpl: 应该左滑进P页", objArray3);
                   this.e = b;
                   PatchProxy.onMethodExit(l$f.class, "2");
                   return 0;
                }
             }
          }else if(this.e != null){
             l$f tf1 = this.f;
             tf1.n1 = 0;
             tf1.o1 = 0;
             this.e = false;
             objArray3 = new Object[0];
             o.C().t("SlideAtlasTouch", "onTouchEventImpl: Up 响应进P页", objArray3);
             PatchProxy.onMethodExit(l$f.class, "2");
             return 0;
          }
       }else {
          actionMasked.n1 = p1.getX();
          actionMasked.o1 = p1.getY();
          objArray = new Object[0];
          o.C().s("SlideAtlasTouch", "onTouchEventImpl: down 事件", objArray);
       }
       if (!this.f.b9().w()) {
          if (p1.getActionMasked() == str) {
             l y0 = this.f.Y0;
             if (y0 == null || y0.f(6) != b) {
             label_00f8 :
                Object[] objArray2 = new Object[0];
                o.C().t("SlideAtlasTouch", "onTouchEventImpl: 滑动被禁用 "+MotionEvent.actionToString(p1.getActionMasked()), objArray2);
             label_011a :
                b = false;
             label_011b :
                Object[] objArray1 = new Object[0];
                o.C().w("SlideAtlasTouch", "onTouchEventImpl: 触发默认 onTouch "+b+' '+MotionEvent.actionToString(p1.getActionMasked()), objArray1);
                PatchProxy.onMethodExit(l$f.class, "2");
                return b;
             }
          }
          actionMasked = (this.f.X8().F() && !this.j())? this.f.X8().dispatchTouchEvent(p1): this.f.X8().onTouchEvent(p1);
          if (!actionMasked) {
             objArray = new Object[0];
             o.C().t("SlideAtlasTouch", "onTouchEventImpl: 不响应", objArray);
          }
          if (actionMasked || this.f.Z8().onTouchEvent(p1)) {
             goto label_011b ;
          }else {
             goto label_011a ;
          }
       }else {
          goto label_00f8 ;
       }
    }
    public final boolean j(){
       boolean b;
       l$f uof = l$f.class;
       l$f obj = PatchProxy.applyWithListener(null, this, uof, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj.n1 - (float)obj.n9() > 0) {
          obj = this.f;
          if (obj.n1 - (float)obj.o9() <= 0) {
             b = true;
          label_0031 :
             PatchProxy.onMethodExit(uof, "3");
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
}
