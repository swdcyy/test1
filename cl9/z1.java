package cl9.z1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.text.TextUtils;
import cl9.y1;
import lnc.c3$b;
import lnc.c3;
import cl9.x1;
import android.view.View;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.Integer;
import com.kuaishou.android.model.mix.QComment$LabelExtra;
import com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup;
import android.graphics.drawable.GradientDrawable;
import jl5.c;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import cl9.w1;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import java.lang.StringBuilder;
import e95.e;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import yk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class z1 extends PresenterV2	// class@00068a
{
    public View p;
    public ViewStubInflater2 q;
    public TextView r;
    public TextView s;
    public QPhoto t;
    public QComment u;
    public d v;
    public CommentsFragment w;
    public String x;
    public int y;
    public boolean z;

    public void z1(){
       super();
       this.x = null;
       this.y = 0;
       this.z = false;
    }
    public void E8(){
       boolean b1;
       z1 oz11;
       e a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z1 oz1 = z1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz1, "3")) {
          return;
       }
       QComment$Label obj = PatchProxy.apply(objArray, this, oz1, "5");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.u.getUser() != null && this.t.getUser() != null){
          b1 = TextUtils.equals(this.u.getUser().getId(), this.t.getUser().getId());
       }else {
          b1 = false;
       }
       int i = 8;
       if (!b1) {
          obj = PatchProxy.apply(objArray, this, oz1, "6");
          boolean b2 = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.equals(c3.a(c3.a(this.u.mParent, y1.a), x1.a), this.u.mReplyToUserId) ^ true;
          if (!b2) {
             this.p.setVisibility(i);
             this.z = b;
             this.y = b;
             if (!q.f(this.u.mLabels)) {
                Iterator iterator = this.u.mLabels.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (obj.mLabelType.intValue() == 13) {
                         QComment$Label mLabelName = obj.mLabelName;
                         if (mLabelName != null) {
                            this.x = mLabelName;
                         }
                         mLabelName = obj.mExtra;
                         if (mLabelName != null) {
                            QComment$LabelExtra mFansGroup = mLabelName.mFansGroup;
                            if (mFansGroup != null) {
                               this.y = mFansGroup.mFansGroupUserLevel;
                            }
                         }
                         oz11 = 1;
                      label_00c3 :
                         if (oz11 && this.y > null) {
                            GradientDrawable gradientDraw = new GradientDrawable();
                            gradientDraw.setCornerRadius((float)c.c(R.dimen.arg_RES_7f070428));
                            gradientDraw.setColor(ContextCompat.getColor(this.p.getContext(), R.color.arg_RES_7f06074b));
                            this.p.setBackground(gradientDraw);
                            this.p.setVisibility(b);
                            oz11 = this.y;
                            if (oz11 > null) {
                               z1 tx = this.x;
                               if (!PatchProxy.isSupport(oz1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(oz11), tx, this, oz1, "4")) {
                                  this.r.setText(String.valueOf(oz11));
                                  this.s.setText(tx);
                                  this.s.getPaint().setFakeBoldText(true);
                               }
                               this.X7(c.a(this.p, new w1(this)));
                               if (this.z == null) {
                                  this.z = true;
                                  String str = this.y+"";
                                  User mId = this.u.getUser().mId;
                                  QComment mId1 = this.u.mId;
                                  User mId2 = this.t.getUser().mId;
                                  String photoId = this.t.getPhotoId();
                                  if (PatchProxy.isSupport(e.class)) {
                                     Object[] objArray1 = new Object[]{str,mId,mId1,mId2,photoId};
                                     if (!PatchProxy.applyVoid(objArray1, objArray, e.class, "1")) {
                                     }
                                  }else {
                                  }
                               }
                            }
                         }
                         break ;
                      }
                   }
                }
                return;
             }
             oz11 = null;
             goto label_00c3 ;
          }
       }
       this.p.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z1.class, "2")) {
          return;
       }
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0868, 0x7f0a0869);
       this.q = viewStubInfl;
       viewStubInfl.d(this.m8());
       this.p = this.q.b(0x7f0a0869);
       this.r = this.q.b(0x7f0a0866);
       this.s = this.q.b(0x7f0a0867);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z1.class, "1")) {
          return;
       }
       this.t = this.q8(QPhoto.class);
       this.u = this.q8(QComment.class);
       this.v = this.q8(d.class);
       this.w = this.r8("FRAGMENT");
       return;
    }
}
