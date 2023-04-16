package cl9.g0;
import com.yxcorp.gifshow.widget.m;
import cl9.y;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.comment.utils.e;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.CharSequence;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import hl9.c;
import com.yxcorp.utility.TextUtils;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import e17.i$b;
import e17.i;
import cl9.g0$a;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.comment.utils.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cl9.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import msd.l;
import ek9.a;
import crd.b;
import com.yxcorp.gifshow.comment.e;
import com.kwai.framework.model.user.User;
import ok.x;
import java.lang.Long;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import yk9.c;
import k2b.e0;
import yk9.d;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public class g0 extends m	// class@000623
{
    public final y c;

    public void g0(y p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       g0 tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       if (QCurrentUser.ME.isLogined()) {
          if (c.b(this.c.F.k(), this.c.y.mEditorConfig)) {
             return;
          }else if(TextUtils.x((this.c.F.k()).trim()) && (this.c.F.f() == null && this.c.F.i() == null)){
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f104252);
             uob.l(true);
             i.c(R.style.arg_RES_7f11066a, uob);
             return;
          }else {
             tc = this.c;
             if (!tc.p.i("commentKeywordActionConfiguration", tc.F.k(), null, new g0$a(this), "HUMANISTIC_CARE")) {
                tc = this.c;
                tc.v.i(tc.getActivity(), a.d(this.c.q, new e0(this)));
             }
          }
       }else {
          tc = this.c;
          if (tc.x != null && tc.q != null) {
             y f = tc.F;
             String str = "";
             String str1 = (f != null)? f.k(): str;
             QComment qComment = this.c.q.newComment(str1, str, str, null);
             tc = this.c;
             y x = tc.x;
             boolean b = false;
             String str2 = null;
             c uoc = null;
             f = tc.z;
             long l = (f != null)? f.get().longValue(): 0;
             x.G(qComment, b, str2, uoc, l, this.c.getActivity().N2());
          }
          d.a(-1712118428).ne(this.c.getActivity(), this.c.q.getFullSource(), "photo_comment", 8, this.c.n8(R.string.arg_RES_7f103076), this.c.q.mEntity, null, null, null).h();
       }
       return;
    }
}
