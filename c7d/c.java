package c7d.c;
import ucd.n;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import oed.a;
import com.yxcorp.plugin.search.entity.result.SearchCollectionBase;
import q7d.b;
import com.yxcorp.plugin.search.entity.result.SearchCollectionItem;
import f7d.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.widget.TextView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import lu7.f;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.plugin.search.utils.j0;
import c7d.b;
import android.view.View$OnClickListener;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import c7d.a;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class c extends n	// class@0004ee
{
    public User p;
    public SearchResultFragment q;
    public SearchItem r;
    public ImageView s;
    public TextView t;
    public KwaiImageView u;
    public TextView v;
    public TextView w;
    public SearchCollectionBase x;

    public void c(){
       super();
    }
    public static void V8(c p0,View p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, c.class, "5")) {
       }else {
          a.d(p0.p, p0.getActivity(), p0.r.mPhoto);
       }
       return;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       SearchCollectionBase searchCollec = b.a(this.r);
       this.x = searchCollec;
       String str = PatchProxy.applyOneRefs(searchCollec, objArray, i.class, "33");
       String str1 = "";
       if (str != PatchProxyResult.class) {
       }else if(!TextUtils.x(searchCollec.mTypeName) && !TextUtils.x(searchCollec.mCollectionName)){
          str = searchCollec.mTypeName+"¡¤"+searchCollec.mCollectionName;
       }else {
          str = str1;
       }
       this.t.setText(str);
       this.w.setText(this.x.mLastUpdateTime);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          List list = b.b(this.r);
          if (this.x.mIsSingleAuthor != null && !q.f(list)) {
             User user = list.get(0);
             this.p = user;
             str1 = f.e(user);
          }
          this.v.setText(str1);
          j0.a(this.u, this.p, HeadImageSize.SMALL);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          uoc = this.s;
          if (uoc != null) {
             this.P8(uoc, new b(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3351);
       this.t = m1.f(p0, 0x7f0a07d3);
       this.u = m1.f(p0, 0x7f0a07db);
       this.v = m1.f(p0, 0x7f0a0833);
       this.w = m1.f(p0, 0x7f0a4339);
       this.P8(this.v, new a(this));
       this.P8(this.u, new a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("FRAGMENT");
       this.r = this.q8(SearchItem.class);
       return;
    }
}
