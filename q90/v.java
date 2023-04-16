package q90.v;
import q90.v$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import q90.v$b;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Integer;
import android.net.Uri;
import android.widget.ImageView;
import usd.q;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class v	// class@0029a4
{
    public KwaiImageView a;
    public KwaiImageView b;
    public KwaiImageView c;
    public View d;
    public View e;
    public TextView f;
    public View g;
    public static final v$a h;

    static {
       v.h = new v$a(null);
    }
    public void v(){
       super();
    }
    public final void a(KSTemplateDetailInfo p0,GifshowActivity p1,boolean p2){
       int i4;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, v.class, "2")) {
          return;
       }
       a.p(p1, "activity");
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSFriendTagBinder", "bind\(\) called with: templateInfo = "+p0+", activity = "+p1.o()+", clickAble ="+p2, objArray);
       int i1 = 1;
       if (p0 != null) {
          int i2 = (p0.mFriendUseCount > 0)? 1: 0;
          KSTemplateDetailInfo kSTemplateDe = (i2)? p0: null;
          if (kSTemplateDe) {
             KSTemplateDetailInfo mHeadUrls = kSTemplateDe.mHeadUrls;
             if (!PatchProxy.applyVoidOneRefs(mHeadUrls, this, ov, "4")) {
                if (mHeadUrls == null) {
                   mHeadUrls = CollectionsKt__CollectionsKt.E();
                }
                ov = this.a;
                if (ov != null) {
                   this.c(ov, i, mHeadUrls);
                }
                ov = this.b;
                if (ov != null) {
                   this.c(ov, i1, mHeadUrls);
                }
                ov = this.c;
                if (ov != null) {
                   this.c(ov, 2, mHeadUrls);
                }
             }
             ov = this.f;
             if (ov != null) {
                ov.setText(a1.r(R.string.arg_RES_7f101bb1, String.valueOf(kSTemplateDe.mFriendUseCount)));
             }
             if (p2) {
                ov = this.d;
                if (ov != null) {
                   ov.setOnClickListener(new v$b(kSTemplateDe, this, p2, p1));
                }
             }
          }
       }
    label_00af :
       p0 = (p0 != null)? p0.mFriendUseCount: 0;
       if (p0 <= 0) {
          i1 = 0;
       }
       v td = this.d;
       if (td != null) {
          int i3 = (i1)? 0: 8;
          td.setVisibility(i3);
       }
       td = this.e;
       if (td != null) {
          if (i1) {
             i = 8;
          }
          td.setVisibility(i);
       }
       return;
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.g = p0;
       View view = null;
       KwaiImageView kwaiImageVie = (p0 != null)? p0.findViewById(R.id.kuaishan_friend_avatar1): view;
       this.a = kwaiImageVie;
       v tg = this.g;
       kwaiImageVie = (tg != null)? tg.findViewById(R.id.kuaishan_friend_avatar2): view;
       this.b = kwaiImageVie;
       tg = this.g;
       kwaiImageVie = (tg != null)? tg.findViewById(R.id.kuaishan_friend_avatar3): view;
       this.c = kwaiImageVie;
       tg = this.g;
       tg = (tg != null)? tg.findViewById(R.id.ks_template_use_count): view;
       this.e = tg;
       tg = this.g;
       TextView textView = (tg != null)? tg.findViewById(R.id.kuaishan_friend_txt): view;
       this.f = textView;
       tg = this.g;
       if (tg != null) {
          view = tg.findViewById(R.id.ks_template_friend_tag);
       }
       this.d = view;
       return;
    }
    public final void c(KwaiImageView p0,int p1,List p2){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, v.class, "5")) {
          return;
       }
       int i = 0;
       if (p2.size() > p1) {
          p0.A(Uri.parse(p2.get(p1)), q.n(i, p0.getWidth()), q.n(i, p0.getHeight()));
       }else {
          i = 8;
       }
       p0.setVisibility(i);
       return;
    }
}
