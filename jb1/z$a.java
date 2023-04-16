package jb1.z$a;
import ml8.d;
import y8c.r;
import jb1.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.admin.model.KickUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.Context;
import ync.a;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

public class z$a extends r implements d	// class@002b2a
{
    public KwaiImageView i;
    public TextView j;
    public ImageView k;
    public TextView l;
    public final z m;
    public static String n = "LiveKickUserListAdapter$LiveKickUserPresenter";

    public void z$a(z p0){
       this.m = p0;
       super();
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, z$a.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a4479);
       this.j = m1.f(p0, 0x7f0a2d10);
       this.l = m1.f(p0, 0x7f0a01a1);
       this.i = m1.f(p0, 0x7f0a0333);
       return;
    }
    public void z(){
       z$a uoa = z$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       KickUser kickUser = this.t();
       g.b(this.i, kickUser.mKickedUser, HeadImageSize.MIDDLE);
       this.j.setText(kickUser.mKickedUser.mName);
       int i = 0;
       int i1 = 8;
       if (kickUser.mKickedUser.isVerified()) {
          this.k.setVisibility(i);
          if (kickUser.mKickedUser.isBlueVerifiedType()) {
             this.k.setImageResource(R.drawable.arg_RES_7f0824a3);
          }else {
             this.k.setImageResource(R.drawable.arg_RES_7f0814c4);
          }
       }else {
          this.k.setVisibility(i1);
       }
       if (kickUser.mAdmin == null) {
          this.l.setVisibility(i1);
          this.l.setText("");
       }else {
          this.l.setVisibility(i);
          z$a tl = this.l;
          String name = kickUser.mAdmin.getName();
          SpannableString spannableStr = PatchProxy.applyOneRefs(name, this, uoa, "4");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             String str = this.C().getString(R.string.arg_RES_7f102522);
             String str1 = str.replace("%1$s", name);
             int i2 = str.indexOf("%1$s");
             SpannableString spannableStr1 = new SpannableString(str1);
             spannableStr1.setSpan(new ForegroundColorSpan(a.c(this.C())), i2, (name.length() + i2), 33);
             spannableStr = spannableStr1;
          }
          tl.setText(spannableStr);
       }
       return;
    }
}
