package c7d.e;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.plugin.search.utils.j0;
import jp.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import wb5.h;
import ekd.m1;
import c7d.d;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class e extends n	// class@0004f0
{
    public QPhoto p;
    public SearchItem q;
    public SearchResultFragment r;
    public KwaiImageView s;
    public TextView t;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.m8().setTag(R.id.photo_id, this.p.getBizId());
       PhotoMeta photoMeta = this.p.getPhotoMeta();
       String str = (photoMeta == null)? "": TextUtils.N((long)photoMeta.getLikeCount());
       this.t.setText(str);
       if (TextUtils.n(str, "0")) {
          j0.H(this.t, 8);
       }else {
          j0.H(this.t, 0);
       }
       h.d(this.s, this.p.mEntity, a.d, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1788);
       this.s = m1.f(p0, 0x7f0a134d);
       this.S8(new d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_PHOTO");
       this.q = this.r8("SEARCH_ITEM");
       this.r = this.q8(SearchResultFragment.class);
       return;
    }
}
