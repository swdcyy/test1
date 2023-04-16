package com.yxcorp.gifshow.relation.black.f;
import ml8.d;
import y8c.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import android.widget.Button;
import zf6.j;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import x9c.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.black.a;
import com.yxcorp.gifshow.model.BlockUser;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class f extends r implements d	// class@0017e4
{
    public KwaiImageView i;
    public TextView j;
    public ImageView k;
    public Button l;
    public TextView m;
    public BlockUser n;

    public void f(){
       super();
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public final void H(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.l.setText(R.string.arg_RES_7f1003b7);
       f tl = this.l;
       tl.setTextColor(j.d(tl, R.color.arg_RES_7f061e52));
       this.l.setBackgroundResource(R.drawable.arg_RES_7f0803ce);
       return;
    }
    public final void I(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.l.setText(R.string.arg_RES_7f1003bb);
       f tl = this.l;
       tl.setTextColor(j.d(tl, R.color.arg_RES_7f061674));
       b uob = new b();
       uob.v(j.d(this.l, R.color.arg_RES_7f0617b3));
       uob.x(0x3f800000);
       uob.w(j.d(this.l, R.color.arg_RES_7f0616ee));
       uob.s(DrawableCreator$Shape.Rectangle);
       uob.g(KwaiRadiusStyles.FULL);
       this.l.setBackground(uob.a());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a4479);
       this.l = m1.f(p0, 0x7f0a0647);
       this.i = m1.f(p0, 0x7f0a0333);
       this.j = m1.f(p0, 0x7f0a2d10);
       this.m = m1.f(p0, 0x7f0a43a4);
       m1.a(p0, new b(this), R.id.item_root);
       m1.a(p0, new a(this), R.id.cancel_blockuser);
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       BlockUser uBlockUser = this.t();
       this.n = uBlockUser;
       if (uBlockUser.mBlockedUser.mBlacked != null) {
          this.I();
       }else {
          this.H();
       }
       g.b(this.i, this.n.mBlockedUser, HeadImageSize.MIDDLE);
       this.j.setText(this.n.mBlockedUser.mName);
       int i = 0;
       if (this.n.mBlockedUser.isVerified()) {
          this.k.setVisibility(i);
          if (this.n.mBlockedUser.isBlueVerifiedType()) {
             this.k.setImageResource(R.drawable.arg_RES_7f0824a3);
          }else {
             this.k.setImageResource(R.drawable.arg_RES_7f0824a4);
          }
       }else {
          this.k.setVisibility(8);
       }
       uBlockUser = this.n.mBlockedUser;
       if (uBlockUser != null && !TextUtils.x(uBlockUser.mText)) {
          this.m.setVisibility(i);
          this.m.setText(this.n.mBlockedUser.mText);
       }else {
          this.m.setVisibility(8);
       }
       this.y().setBackgroundResource(R.drawable.arg_RES_7f08035c);
       return;
    }
}
