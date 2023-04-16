package d5b.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.FlexBoxLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import d5b.l;
import androidx.recyclerview.widget.RecyclerView$n;
import d5b.k$a;
import android.content.Context;
import a5b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import java.util.List;
import com.yxcorp.gifshow.magic.ui.widget.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import com.yxcorp.utility.n;
import d5b.k$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;

public final class k extends PresenterV2	// class@002448
{
    public PublishSubject p;
    public MagicEmojiFragment$Source q;
    public MagicSearchFragment r;
    public RecyclerView s;
    public k$a t;

    public void k(){
       super();
    }
    public static final RecyclerView P8(k p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("candidateWordList");
       }
       return p0;
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "10")) {
          ok = this.s;
          String str = "candidateWordList";
          if (ok == null) {
             a.S(str);
          }
          ok.setLayoutManager(new FlexBoxLayoutManager());
          ok = this.s;
          if (ok == null) {
             a.S(str);
          }
          ok.addItemDecoration(new l());
          Context context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          k$a uoa = new k$a(this, context);
          this.t = uoa;
          e b = e.b;
          k tq = this.q;
          if (tq == null) {
             a.S("magicSource");
          }
          MagicBusinessId magicBusines = l.d(tq);
          a.o(magicBusines, "MagicFaceController.getE¡­iKeyBySource\(magicSource\)");
          uoa.L0(b.a(magicBusines));
          ok = this.s;
          if (ok == null) {
             a.S(str);
          }
          k tt = this.t;
          if (tt == null) {
             a.S("candidateAdapter");
          }
          ok.setAdapter(tt);
          ok = this.s;
          if (ok == null) {
             a.S(str);
          }
          n.Y(ok, 0, 0);
       }
       ok = this.p;
       if (ok == null) {
          a.S("searchResultChangedSubject");
       }
       this.X7(ok.subscribe(new k$b(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "8")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.candidate_word_list);
       a.o(p0, "rootView.findViewById\(R.id.candidate_word_list\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       Object obj = this.r8("magic_panel_search_result_changed_subject");
       a.o(obj, "inject\(MagicSearchAccess¡­H_RESULT_CHANGED_SUBJECT\)");
       this.p = obj;
       obj = this.r8("magic_source");
       a.o(obj, "inject\(MagicSearchAccessIds.MAGIC_SOURCE\)");
       this.q = obj;
       obj = this.r8("magic_search_panel_fragment");
       a.o(obj, "inject\(MagicSearchAccess¡­IC_SEARCH_PANEL_FRAGMENT\)");
       this.r = obj;
       return;
    }
}
