package b4d.f1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b4d.f1$a;
import nsd.u;
import com.yxcorp.plugin.emotion.append.AppendedWidget;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d4d.a;
import android.view.View;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import b4d.f1$b;
import erd.g;
import crd.b;
import b4d.f1$c;
import b4d.f1$d;
import b4d.f1$e;
import b4d.f1$f;
import java.lang.Runnable;
import kotlin.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Integer;
import android.app.Activity;
import uid.f;
import lnc.a1;
import java.lang.Math;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import java.lang.Number;
import android.view.ViewGroup;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import mrd.c;

public final class f1 extends PresenterV2	// class@00036b
{
    public EmotionFloatEditorFragment p;
    public c q;
    public c r;
    public BaseEditorFragment$Arguments s;
    public RecyclerView t;
    public View u;
    public final PublishSubject v;
    public final AppendedWidget w;
    public static long x;
    public static final f1$a y;

    static {
       f1.y = new f1$a(null);
       f1.x = 320;
    }
    public void f1(AppendedWidget p0){
       a.p(p0, "mQuickAtEditorEntryWidget");
       super();
       this.w = p0;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.v = publishSubje;
    }
    public void E8(){
       f1 tu;
       f1 tu1;
       z a;
       if (PatchProxy.applyVoid(null, this, f1.class, "3")) {
          return;
       }
       a g = a.g;
       float f = 0;
       if (g.d(this.w)) {
          tu = this.u;
          if (tu != null) {
             tu.setAlpha(f);
          }
          return;
       }else if(!g.c(this.w)){
          tu1 = this.u;
          if (tu1 != null) {
             tu1.setAlpha(f);
          }
       }
       tu1 = this.s;
       if (tu1 == null) {
          a.S("mArguments");
       }
       if (tu1.mShowAtFloatPanel != null) {
          tu1 = this.u;
          if (tu1 != null) {
             tu1.setAlpha(f);
          }
          g.f(this.w);
          return;
       }else {
          tu = this.r;
          if (tu == null) {
             a.S("mWidgetShowHideStateSubject");
          }
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          a = d.a;
          this.X7(tu.delay(32, mILLISECONDS).observeOn(a).subscribe(new f1$b(this)));
          tu = this.q;
          if (tu == null) {
             a.S("mFloatPanelShowHideSubject");
          }
          this.X7(tu.throttleLast(100, mILLISECONDS).observeOn(a).subscribe(new f1$c(this)));
          this.X7(this.v.observeOn(a).subscribe(new f1$d(this), f1$e.b));
          tu = this.u;
          if (tu != null) {
             tu.postDelayed(new f1$f(this), 32);
          }
          return;
       }
    }
    public final Pair P8(){
       Object obj = PatchProxy.apply(null, this, f1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u == null) {
          return new Pair(Float.valueOf(0), Integer.valueOf(0));
       }
       int i = a1.d(0x7f070465) + f.a(this.getActivity(), true);
       f1 tu = this.u;
       a.m(tu);
       int i1 = Math.max(2, ((int)(((float)((long)tu.getWidth() + (long)a1.d(R.dimen.arg_RES_7f070224)) * 0x3f800000) / (float)i) + true));
       Log.g("EmotionFloatPanelPresenter", " hideEmojiCount:"+i1);
       i = i * i1;
       Log.g("EmotionFloatPanelPresenter", " transX:"+i);
       return new Pair(Float.valueOf((float)i), Integer.valueOf((f.b(this.getActivity(), true) - i1)));
    }
    public final boolean R8(){
       f1 obj = PatchProxy.apply(null, this, f1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = false;
       int width = (obj != null)? obj.getWidth(): 0;
       if (width < a1.e(0x41f00000)) {
          b = true;
       }
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "8")) {
          return;
       }
       String str = "EmotionFloatPanelPresenter";
       Log.g(str, "noAnimate ...");
       if (this.R8()) {
          Log.g(str, "fpfs widgets layout width too small!");
          f1 tu = this.u;
          if (tu != null) {
             tu.setAlpha(0);
          }
          return;
       }else {
          Log.g(str, "noAnimate ...show widget!");
          Pair pair = this.P8();
          float f = pair.component1().floatValue();
          int i = pair.component2().intValue();
          f1 tu1 = this.u;
          if (tu1 != null) {
             tu1.setAlpha(0x3f800000);
          }
          tu1 = this.t;
          if (tu1 != null) {
             if (tu1.getChildCount() > i) {
                View childAt = tu1.getChildAt(i);
                if (childAt != null) {
                   childAt.setAlpha(0);
                }
             }
             tu1.setTranslationX(f);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0ce1);
       this.u = m1.f(p0, 0x7f0a0c64);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "1")) {
          return;
       }
       Object obj = this.r8("floateditor");
       a.o(obj, "inject\(EmotionFloatEdito¡­allerContext.FLOATEDITOR\)");
       this.p = obj;
       obj = this.r8("args");
       a.o(obj, "inject\(EmotionFloatEdito¡­orCallerContext.ARGUMNTS\)");
       this.s = obj;
       obj = this.r8("EMOTION_FLOAT_PANEL_SHOW_HIDE");
       a.o(obj, "inject\(EmotionFloatEdito¡­ON_FLOAT_PANEL_SHOW_HIDE\)");
       this.q = obj;
       obj = this.r8("EMOTION_WIDGETS_SHOW_HIDE");
       a.o(obj, "inject\(EmotionFloatEdito¡­MOTION_WIDGETS_SHOW_HIDE\)");
       this.r = obj;
       return;
    }
}
