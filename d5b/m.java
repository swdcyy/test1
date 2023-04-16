package d5b.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.utility.n;
import d5b.m$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import q5b.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;

public final class m extends PresenterV2	// class@00244b
{
    public RecyclerView p;
    public TextView q;
    public View r;
    public String s;
    public PublishSubject t;
    public MagicSearchFragment u;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "13")) {
          return;
       }
       m tr = this.r;
       if (tr == null) {
          a.S("magicFaceListContainer");
       }
       n.Y(tr, 4, false);
       tr = this.t;
       if (tr == null) {
          a.S("searchResultChangedSubject");
       }
       this.X7(tr.subscribe(new m$a(this), Functions.d()));
       return;
    }
    public final View P8(){
       m obj = PatchProxy.apply(null, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("magicFaceListContainer");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "12")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.recycler_view);
       a.o(view, "rootView.findViewById\(R.id.recycler_view\)");
       this.p = view;
       view = p0.findViewById(R.id.tv_empty_magic_hint);
       a.o(view, "rootView.findViewById\(R.id.tv_empty_magic_hint\)");
       this.q = view;
       if (f.a()) {
          m tq = this.q;
          String str = "tvEmptyHintView";
          if (tq == null) {
             a.S(str);
          }
          if (!TextUtils.x(tq.getText())) {
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             tq.setText(R.string.arg_RES_7f103176);
          }
       }
       p0 = p0.findViewById(R.id.magic_face_list_container);
       a.o(p0, "rootView.findViewById\(R.¡­agic_face_list_container\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       Object obj = this.r8("magic_panel_search_result_changed_subject");
       a.o(obj, "inject\(MagicSearchAccess¡­H_RESULT_CHANGED_SUBJECT\)");
       this.t = obj;
       obj = this.r8("magic_search_panel_fragment");
       a.o(obj, "inject\(MagicSearchAccess¡­IC_SEARCH_PANEL_FRAGMENT\)");
       this.u = obj;
       return;
    }
}
