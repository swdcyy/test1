package l31.a$b;
import ml8.d;
import y8c.r;
import l31.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import nl8.p;
import com.kwai.framework.model.user.UserInfo;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.content.Context;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import jp3.a;
import android.content.SharedPreferences;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;

public class a$b extends r implements d	// class@002e6b
{
    public KwaiImageView i;
    public final a j;

    public void a$b(a p0){
       this.j = p0;
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.i = m1.f(p0, 0x7f0a1a65);
       return;
    }
    public void z(){
       int i1;
       a$b uob = a$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       this.doBindView(this.b);
       UserInfo userInfo = this.t();
       if (userInfo == null) {
          return;
       }
       b uob1 = new b();
       uob1.p(a.a().a().getResources().getColor(R.color.arg_RES_7f060759), this.s().getResources().getColor(0x106000d));
       uob1.s(DrawableCreator$Shape.Oval);
       this.i.setForegroundDrawable(uob1.a());
       if (this.F() < 3) {
          UserInfo mExtraInfo = userInfo.mExtraInfo;
          if (mExtraInfo != null && mExtraInfo.isTopPayingUser()) {
             a$b ti = this.i;
             boolean b = true;
             boolean b1 = (a.a.getBoolean("enable_live_watching_user_offline_display_for_audience", false) && userInfo.mExtraInfo.mOffline != null)? true: false;
             ti.setBorderWidth(false);
             int i = this.F();
             if (PatchProxy.isSupport(uob)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uob, "3");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.intValue();
                }else {
                label_009e :
                   i1 = this.j.getItemCount();
                   if (i == (i1 - 1)) {
                      i1 = 0x7f081533;
                   }else if(i == (i1 - 2)){
                      i1 = 0x7f081534;
                   }else {
                      i1 = 0x7f081532;
                   }
                }
             }else {
                goto label_009e ;
             }
             ti.setBackgroundResource(i1);
             if (b1) {
                ti.setAnimationEnabled(false);
             }else {
                ti.setAnimationEnabled(b);
                if (!PatchProxy.applyVoid(objArray, ti, LiveUserView.class, "1")) {
                   ti.x = 0;
                   ti.invalidate();
                }
             }
             ti.p0(userInfo, HeadImageSize.SMALL, b1);
          label_00e2 :
             return;
          }
       }
       g.d(this.i, userInfo, HeadImageSize.SMALL);
       goto label_00e2 ;
    }
}
