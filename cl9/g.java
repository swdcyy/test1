package cl9.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.model.CDNUrl;
import wb5.i;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import cl9.g$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.entity.QPhoto;
import yk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class g extends PresenterV2	// class@000627
{
    public QPhoto p;
    public QComment q;
    public d r;
    public CommentsFragment s;
    public KwaiImageView t;
    public String u;
    public CommentParams v;

    public void g(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "3")) {
          return;
       }
       if (this.q.getUser() == null) {
          User user = new User("", "", "", "", null);
       }else {
          User user2 = this.q.getUser();
       }
       User user1 = v0;
       user1.getSex();
       this.t.setPlaceHolderImage(R.drawable.detail_avatar_secret);
       g tv = this.v;
       if (tv != null) {
          this.u = tv.mADCallback;
       }
       a$a uoa = a.d();
       uoa.b(":ks-components:comment");
       uoa.d(ImageSource.COMMENT_AVATAR);
       d uod = this.t.g0(objArray, uoa.a(), d.i(user1, HeadImageSize.MIDDLE));
       g tt = this.t;
       if (uod != null) {
          objArray = uod.e();
       }
       tt.setController(objArray);
       g$a uoa1 = new g$a(this, false, 500, user1);
       this.t.setOnClickListener(objArray);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.t.setOnClickListener(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0333);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(QComment.class);
       this.r = this.q8(d.class);
       this.s = this.r8("FRAGMENT");
       this.v = this.q8(CommentParams.class);
       return;
    }
}
