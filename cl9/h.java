package cl9.h;
import cl9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.view.View;
import ekd.m1;

public final class h extends g	// class@00062b
{
    public ImageView w;
    public ImageView x;

    public void h(){
       super();
    }
    public void E8(){
       Context context;
       Drawable uDrawable;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, oh, "3")) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             oh = this.x;
             if (oh == null) {
                a.S("mAvatarIcon");
             }
             oh.setContentDescription(a1.p(R.string.arg_RES_7f10031d));
          }
       }
       g tq = this.q;
       a.o(tq, "mComment");
       User user = tq.getUser();
       if (user != null) {
          user = user.mVerifiedDetail;
          if (user != null) {
             UserVerifiedDetail mIconType = user.mIconType;
             if (mIconType != 1) {
                if (mIconType != 2) {
                   if (mIconType == 3) {
                      context = this.getContext();
                      a.m(context);
                      uDrawable = j.k(context, R.drawable.arg_RES_7f080c28);
                   }
                }else {
                   context = this.getContext();
                   a.m(context);
                   uDrawable = j.k(context, R.drawable.arg_RES_7f080c18);
                }
             }else {
                context = this.getContext();
                a.m(context);
                uDrawable = j.k(context, R.drawable.arg_RES_7f080c19);
             }
             objArray = uDrawable;
          }
          String str = "mAuthorVerifiedIcon";
          if (objArray != null) {
             h tw = this.w;
             if (tw == null) {
                a.S(str);
             }
             tw.setVisibility(0);
             tw = this.w;
             if (tw == null) {
                a.S(str);
             }
             tw.setImageDrawable(objArray);
          }else {
             h tw1 = this.w;
             if (tw1 == null) {
                a.S(str);
             }
             tw1.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.doBindView(p0);
       View view = m1.f(p0, R.id.detail_comment_author_verified_icon);
       a.o(view, "bindWidget\(view, R.id.de¡­ent_author_verified_icon\)");
       this.w = view;
       p0 = m1.f(p0, R.id.avatar);
       a.o(p0, "bindWidget\(view, R.id.avatar\)");
       this.x = p0;
       return;
    }
}
