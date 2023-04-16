package d5b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d5b.a$a;
import nsd.u;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.EditText;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import d5b.b;
import android.view.View$OnClickListener;
import d5b.a$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import d5b.a$c;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import q5b.f;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;

public final class a extends PresenterV2	// class@00243c
{
    public PublishSubject p;
    public MagicSearchFragment q;
    public PublishSubject r;
    public EditText s;
    public View t;
    public static final a$a u;

    static {
       a.u = new a$a(null);
    }
    public void a(){
       super();
    }
    public static final View P8(a p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("magicSearchClearBtn");
       }
       return p0;
    }
    public static final EditText R8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("searchEditText");
       }
       return p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "9")) {
          return;
       }
       String str = "magicSearchClearBtn";
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          uoa = this.s;
          String str1 = "searchEditText";
          if (uoa == null) {
             a.S(str1);
          }
          uoa.setFocusable(false);
          uoa = this.s;
          if (uoa == null) {
             a.S(str1);
          }
          uoa.setFocusableInTouchMode(false);
          uoa = this.s;
          if (uoa == null) {
             a.S(str1);
          }
          uoa.setCursorVisible(false);
          uoa = this.t;
          if (uoa == null) {
             a.S(str);
          }
          n.Y(uoa, 4, false);
          uoa = this.s;
          if (uoa == null) {
             a.S(str1);
          }
          uoa.setOnClickListener(new b(this, false, 300));
       }
       uoa = this.p;
       if (uoa == null) {
          a.S("searchResultChangedSubject");
       }
       this.X7(uoa.subscribe(new a$b(this), Functions.d()));
       uoa = this.t;
       if (uoa == null) {
          a.S(str);
       }
       uoa.setOnClickListener(new a$c(this, false, 300));
       return;
    }
    public final PublishSubject S8(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("magicSearchBarSwitchSubject");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.magic_search_bar_et);
       a.o(view, "rootView.findViewById\(R.id.magic_search_bar_et\)");
       this.s = view;
       if (f.a()) {
          a ts = this.s;
          String str = "searchEditText";
          if (ts == null) {
             a.S(str);
          }
          if (ts != null) {
             ts = this.s;
             if (ts == null) {
                a.S(str);
             }
             a.m(ts);
             ts.setHint(R.string.arg_RES_7f103164);
          }
       }
       p0 = p0.findViewById(R.id.magic_search_clear_btn);
       a.o(p0, "rootView.findViewById\(R.id.magic_search_clear_btn\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("magic_panel_search_result_changed_subject");
       a.o(obj, "inject\(MagicSearchAccess¡­H_RESULT_CHANGED_SUBJECT\)");
       this.p = obj;
       obj = this.r8("magic_search_panel_fragment");
       a.o(obj, "inject\(MagicSearchAccess¡­IC_SEARCH_PANEL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("magic_search_bar_subject");
       a.o(obj, "inject\(MagicSearchAccess¡­EARCH_BAR_SWITCH_SUBJECT\)");
       this.r = obj;
       return;
    }
}
