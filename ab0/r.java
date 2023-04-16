package ab0.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ab0.r$b;
import ab0.r$c;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ImageButton;
import android.view.View;
import android.text.TextPaint;
import android.widget.TextView;
import android.widget.FrameLayout;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import ab0.r$a;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;

public final class r extends PresenterV2	// class@00004c
{
    public b A;
    public LinearLayout p;
    public RecyclerView q;
    public KwaiSizeAdjustableTextView r;
    public ImageButton s;
    public PublishSubject t;
    public boolean u;
    public PublishSubject v;
    public KwaiSizeAdjustableTextView w;
    public View x;
    public KwaiEmptyStateView y;
    public View z;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       r tt = this.t;
       if (tt == null) {
          a.S("mFinishSettingPublisher");
       }
       this.X7(tt.subscribe(new r$b(this), r$c.b));
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isEnableLocalIntelligenceAlbum()) {
          this.P8();
       }else {
          this.R8();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       r tq = this.q;
       if (tq == null) {
          a.S("mRecyclerView");
       }
       tq.setVisibility(0);
       tq = this.p;
       if (tq == null) {
          a.S("mRestartView");
       }
       tq.setVisibility(8);
       tq = this.s;
       if (tq == null) {
          a.S("mSettingBtn");
       }
       tq.setVisibility(0);
       tq = this.x;
       if (tq == null) {
          a.S("mSplitView");
       }
       tq.setVisibility(0);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       r tw = this.w;
       if (tw == null) {
          a.S("mRestartDesc");
       }
       TextPaint paint = tw.getPaint();
       a.o(paint, "mRestartDesc.paint");
       paint.setFakeBoldText(true);
       tw = this.q;
       if (tw == null) {
          a.S("mRecyclerView");
       }
       tw.setVisibility(8);
       tw = this.p;
       if (tw == null) {
          a.S("mRestartView");
       }
       tw.setVisibility(0);
       tw = this.s;
       if (tw == null) {
          a.S("mSettingBtn");
       }
       tw.setVisibility(8);
       tw = this.x;
       if (tw == null) {
          a.S("mSplitView");
       }
       tw.setVisibility(8);
       tw = this.y;
       if (tw == null) {
          a.S("mKwaiEmptyStateView");
       }
       tw.setVisibility(8);
       tw = this.z;
       if (tw == null) {
          a.S("mNoImage");
       }
       tw.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       if (p0 != null) {
          View view = m1.f(p0, R.id.restart_smart_album_layout);
          a.o(view, "bindWidget\(it, R.id.restart_smart_album_layout\)");
          this.p = view;
          view = m1.f(p0, R.id.album_list_recyclerview);
          a.o(view, "bindWidget\(it, R.id.album_list_recyclerview\)");
          this.q = view;
          view = m1.f(p0, R.id.empty_album_list);
          a.o(view, "bindWidget\(rootView, R.id.empty_album_list\)");
          this.y = view;
          view = m1.f(p0, R.id.no_image);
          a.o(view, "bindWidget\(rootView, R.id.no_image\)");
          this.z = view;
          view = m1.f(p0, R.id.restart_smart_album_button);
          a.o(view, "bindWidget\(it, R.id.restart_smart_album_button\)");
          this.r = view;
          view = m1.f(p0, R.id.setting_btn);
          a.o(view, "bindWidget\(it, R.id.setting_btn\)");
          this.s = view;
          view = m1.f(p0, R.id.restart_desc);
          a.o(view, "bindWidget\(it, R.id.restart_desc\)");
          this.w = view;
          view = m1.f(p0, R.id.split_line);
          a.o(view, "bindWidget\(it, R.id.split_line\)");
          this.x = view;
          r tr = this.r;
          if (tr == null) {
             a.S("mRestartBtn");
          }
          tr.setOnClickListener(new r$a(this, p0));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       Object obj = this.r8("smartalbum_finish_setting");
       a.o(obj, "inject\(AccessIds.SMARTALBUM_FINISH_SETTING\)");
       this.t = obj;
       obj = this.r8("smartalbum_is_from_tag");
       a.o(obj, "inject\(AccessIds.SMARTALBUM_IS_FROM_TAG\)");
       this.u = obj.booleanValue();
       obj = this.r8("smartalbum_click_restart_button");
       a.o(obj, "inject\(AccessIds.SMARTALBUM_CLICK_RESTART_BUTTON\)");
       this.v = obj;
       return;
    }
}
