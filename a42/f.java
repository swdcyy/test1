package a42.f;
import k51.c;
import a42.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.entity.QPhoto;
import jp.a;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import jd.c;
import wb5.g;
import android.view.View;
import a42.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import a42.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;

public class f extends c	// class@000038
{
    public b p;
    public KwaiImageView q;
    public View r;
    public TextView s;
    public TextView t;
    public ImageView u;
    public QPhoto v;
    public List w;
    public static String sLivePresenterClassName = "LiveChainSideBarRecyclerViewAdapterPresenterV2";

    public void f(b p0){
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (q.f(this.w)) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live");
          uoa.d(ImageSource.DETAIL_COVER_VIDEO);
          a uoa1 = uoa.a();
          g.m(this.q, this.v.mEntity, a.d, null, null, uoa1, a1.a(R.color.arg_RES_7f060c9a));
       }
       this.r.setSelected(this.v.equals(this.p.x));
       this.q.setOnClickListener(new e(this));
       QPhoto mEntity = this.v.mEntity;
       if (mEntity instanceof VideoFeed) {
          this.s.setText(mEntity.mVideoModel.mMusicFeedName);
          this.u.setVisibility(8);
       }else if(mEntity instanceof LiveStreamFeed){
          LiveStreamModel mChainDispla = mEntity.mLiveStreamModel.mChainDisplayName;
          String str = "@";
          if (!TextUtils.x(mChainDispla)) {
             this.s.setText(str+mChainDispla);
          }else {
             this.s.setText(str+this.v.mEntity.mUser.mName);
          }
          if (!TextUtils.x(mEntity.mLiveStreamModel.mCaption)) {
             this.t.setText(mEntity.mLiveStreamModel.mCaption);
             this.t.setVisibility(0);
          }else {
             this.t.setVisibility(8);
          }
          this.u.setVisibility(0);
       }
       b y = this.p.y;
       if (y != null) {
          y.b(this.v);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1af4);
       this.t = m1.f(p0, 0x7f0a1af2);
       this.u = m1.f(p0, 0x7f0a1af7);
       this.q = m1.f(p0, 0x7f0a1af1);
       this.r = m1.f(p0, 0x7f0a1af5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.v = this.q8(QPhoto.class);
       this.w = this.t8("PHOTO_FEED_SIDE_BAR_PAY_LOADS");
       return;
    }
}
