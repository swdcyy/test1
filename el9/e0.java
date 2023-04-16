package el9.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import el9.e0$a;
import el9.e0$b;
import el9.e0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.kuaishou.android.model.mix.QComment;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import y8c.g;
import fk9.b;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.comment.CommentParams;
import im8.f;
import com.yxcorp.gifshow.comment.CommentConfig;

public class e0 extends PresenterV2	// class@0021e5
{
    public final RecyclerView$r A;
    public CommentParams p;
    public RecyclerFragment q;
    public Set r;
    public f s;
    public e t;
    public CommentConfig u;
    public boolean v;
    public int w;
    public final boolean x;
    public final g y;
    public final e$b z;
    public static final int B;
    public static final int C;
    public static final int D;

    static {
       e0.B = a1.e(300.00f);
       e0.C = a1.e(6.00f);
       e0.D = a1.e(4.00f);
    }
    public void e0(boolean p0){
       super();
       this.w = -1;
       this.y = new e0$a(this);
       this.z = new e0$b(this);
       this.A = new e0$c(this);
       this.x = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "6")) {
          return;
       }
       this.r.add(this.y);
       this.t.b(this.z);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "7")) {
          return;
       }
       this.r.remove(this.y);
       this.t.j(this.z);
       this.q.h0().removeOnScrollListener(this.A);
       return;
    }
    public void P8(boolean p0){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe0, "5")) {
          return;
       }
       if (this.x != null) {
          RecyclerView recyclerView = this.q.h0();
          int b = (p0)? e0.B: this.w;
          recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), b);
       }
       return;
    }
    public View R8(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.q.g7().t1(p0);
       if (i < 0) {
          return null;
       }
       i = i + this.q.ia().b1();
       int i1 = this.q.h0().getLayoutManager().i0();
       if (i1 < 0) {
          return null;
       }
       int i2 = this.q.h0().getLayoutManager().c();
       if (i < i1 || i > i2) {
          return null;
       }
       RecyclerView$ViewHolder viewHolder = this.q.h0().findViewHolderForLayoutPosition(i);
       if (viewHolder == null) {
          return null;
       }
       return viewHolder.itemView;
    }
    public View S8(View p0){
       View obj = PatchProxy.applyOneRefs(p0, this, e0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.findViewById(R.id.comment);
       if (obj != null && !obj.getVisibility()) {
          return obj;
       }
       obj = p0.findViewById(R.id.layout_emotion_image);
       if (obj != null && !obj.getVisibility()) {
          return obj;
       }
       return p0;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.p = this.q8(CommentParams.class);
       this.r = this.r8("COMMENT_ON_REPLY_LISTENERS");
       this.s = this.x8("COMMENT_EDITOR_LISTENERS");
       this.t = this.r8("COMMENT_HELPER");
       this.u = this.q8(CommentConfig.class);
       return;
    }
}
