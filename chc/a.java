package chc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ehc.b;
import java.lang.CharSequence;
import android.widget.TextView;
import ehc.a;
import android.text.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import ekd.m1;
import chc.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@0005a0
{
    public KwaiImageView p;
    public TextView q;
    public BaseFragment r;
    public a s;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          a tq = this.q;
          if (tq == null) {
             a.S("title");
          }
          tq.setText(ts.getTitle());
          tq = this.p;
          if (tq == null) {
             a.S("icon");
          }
          int i = (!ts.c() && TextUtils.isEmpty(ts.getIconUrl()))? 8: 0;
          tq.setVisibility(i);
          if (!TextUtils.isEmpty(ts.getIconUrl())) {
             if (ts.c()) {
                tq = this.p;
                if (tq == null) {
                   a.S("icon");
                }
                tq.setPlaceHolderImage(ts.c());
                tq = this.p;
                if (tq == null) {
                   a.S("icon");
                }
                tq.setFailureImage(ts.c());
             }
             tq = this.p;
             if (tq == null) {
                a.S("icon");
             }
             tq.L(ts.getIconUrl());
          }else if(ts.c()){
             tq = this.p;
             if (tq == null) {
                a.S("icon");
             }
             tq.setImageResource(ts.c());
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.item_icon);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.item_icon\)");
       this.p = view;
       view = m1.f(p0, R.id.item_title);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.item_title\)");
       this.q = view;
       p0.setOnClickListener(new a$a(this));
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.m8().getTag(R.id.item_view_bind_data);
       if (obj instanceof a) {
          objArray = obj;
       }
       this.s = objArray;
       return;
    }
}
