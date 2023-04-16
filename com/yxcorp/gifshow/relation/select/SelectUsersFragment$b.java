package com.yxcorp.gifshow.relation.select.SelectUsersFragment$b;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.relation.select.SelectUsersFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import java.util.Objects;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.relation.select.model.SelectUsersTabData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.refresh.RefreshLayout;

public class SelectUsersFragment$b extends f	// class@001986
{
    public final SelectUsersFragment l;

    public void SelectUsersFragment$b(SelectUsersFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public void d(boolean p0){
       SelectUsersFragment$b uob = SelectUsersFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (this.l.F.isHalfScreen()) {
          SelectUsersFragment$b tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(null, tl, SelectUsersFragment.class, "8")) {
             KwaiLoadingView kwaiLoadingV = tl.getView().findViewById(R.id.half_loading_view);
             kwaiLoadingV.setVisibility(0);
             kwaiLoadingV.h();
          }
       }else {
          super.d(p0);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, SelectUsersFragment$b.class, "1")) {
          return;
       }
       this.x();
       String str = (TextUtils.x(this.l.G.emptyMsg))? this.l.getString(R.string.arg_RES_7f100d2c): this.l.G.emptyMsg;
       View view = this.J0();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.i(str);
       uoa.a(view);
       this.a.K(view);
       return;
    }
    public void x(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SelectUsersFragment$b.class, "3")) {
          return;
       }
       if (this.l.F.isHalfScreen()) {
          SelectUsersFragment$b tl = this.l;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(objArray, tl, SelectUsersFragment.class, "9")) {
             KwaiLoadingView kwaiLoadingV = tl.getView().findViewById(R.id.half_loading_view);
             kwaiLoadingV.i();
             kwaiLoadingV.setVisibility(8);
          }
       }else {
          super.x();
       }
       return;
    }
}
