package b4d.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oca.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import k17.b;
import android.app.Activity;
import uid.f;
import lnc.a1;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.plugin.emotion.widget.EmojiQuickSendRecycleView;
import b4d.r;
import com.yxcorp.plugin.emotion.widget.EmojiQuickSendRecycleView$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import x3d.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import wkd.b;
import x3d.f;
import brd.t;
import b4d.t;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import b4d.u;
import b4d.s;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;

public class w extends PresenterV2	// class@00039d
{
    public EmotionFloatEditorFragment p;
    public PublishSubject q;
    public BaseEditorFragment$Arguments r;
    public int s;
    public RecyclerView t;
    public View u;
    public b v;
    public final PublishSubject w;
    public boolean x;

    public void w(boolean p0){
       super();
       this.s = a.a();
       this.w = PublishSubject.g();
       this.x = p0;
    }
    public void E8(){
       b uob;
       float f;
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "3")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       w ts = this.s;
       if (ts != null) {
          int i = 0x7f0702ab;
          int i1 = 0;
          if (ts != 2) {
             uob = (this.r.mForceNewEditorStyle != null)? new b(i1, i1, f.a(this.getActivity(), true)): new b(i1, a1.d(i), f.a(this.getActivity(), i1));
          }else {
             f = 11.50f;
             uob = (this.r.mForceNewEditorStyle != null)? new b(i1, i1, n.c(this.getContext(), f)): new b(i1, a1.d(i), n.c(this.getContext(), f));
          }
       label_006a :
          w tt = this.t;
          if (tt instanceof EmojiQuickSendRecycleView) {
             tt.setOnVisibilityChangListener(new r(this));
          }
          this.t.setVisibility(i1);
          this.t.addItemDecoration(uob);
          this.t.setLayoutManager(new LinearLayoutManager(this.getContext(), i1, i1));
          uob = new b(this.w, this.P8(), this.r.mForceNewEditorStyle);
          this.v = uob;
          this.t.setAdapter(uob);
          this.X7(b.a(-602662273).a(f.b(this.getActivity(), this.r.mForceNewEditorStyle)).subscribe(new t(this), Functions.e));
          this.X7(this.w.subscribe(new u(this)));
          if (!PatchProxy.applyVoid(objArray, this, ow, "6") && this.r.mForceNewEditorStyle == null) {
             this.X7(this.q.subscribe(new s(this)));
          }
       }
    label_00fb :
       return;
    }
    public final String P8(){
       Object obj = PatchProxy.apply(null, this, w.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((this.r.mCommentOpenType).equals("QUICK_COMMENT")) {
          return "QUICK_RESPONSE";
       }
       if ((this.r.mCommentOpenType).equals("BOTTOM_EDITOR")) {
          return "BOTTOM_COMMENT_BOX";
       }
       if ((this.r.mCommentOpenType).equals("DETAIL_COMMENT_AREA")) {
          return "DETAIL_COMMENT_AREA";
       }
       return "COMMENT_PANCE";
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0ce1);
       this.u = m1.f(p0, 0x7f0a0ce3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.p = this.r8("floateditor");
       this.q = this.r8("EMOTION_SHOW_LISTEN");
       this.r = this.r8("args");
       return;
    }
}
