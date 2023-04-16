package lw8.a$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lw8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vw8.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.ContactTargetItem;
import y8c.d;
import k2b.v1$d;
import k2b.v1$f;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import java.lang.Boolean;
import android.widget.ImageView;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import ekd.n0;
import kotlin.text.StringsKt__StringsKt;
import android.text.style.ForegroundColorSpan;
import android.content.Context;
import androidx.core.content.ContextCompat;
import ekd.f0;
import java.util.ArrayList;
import java.util.Iterator;
import ekd.f0$a;
import java.lang.StringBuilder;
import zsd.u;
import lw8.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.online.OnlineDotView;
import lw8.a$a$a;
import android.view.View$OnClickListener;

public final class a$a extends PresenterV2	// class@002dc1
{
    public ContactTargetItem p;
    public d q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public View u;
    public OnlineDotView v;
    public ImageView w;
    public final a x;

    public void a$a(a p0){
       this.x = p0;
       super();
    }
    public void E8(){
       User mName;
       int i2;
       String str2;
       String str4;
       int i5;
       Object obj = this;
       a$a uoa = a$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
          return;
       }
       b a = b.a;
       a$a p = obj.p;
       if (p == null) {
          a.S("item");
       }
       ContactTargetItem mId = p.mId;
       a.o(mId, "item.mId");
       a$a q = obj.q;
       if (q == null) {
          a.S("position");
       }
       a.a(mId, q.get()).show();
       a$a r = obj.r;
       if (r == null) {
          a.S("avatar");
       }
       p = obj.p;
       if (p == null) {
          a.S("item");
       }
       g.b(r, p.mUser, HeadImageSize.MIDDLE);
       p = 2;
       int i = 8;
       int i1 = 1;
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "6")) {
          r = obj.p;
          if (r == null) {
             a.S("item");
          }
          ContactTargetItem mUser1 = r.mUser;
          User mIsOnline = mUser1.mIsOnline;
          a.o(mIsOnline, "user.mIsOnline");
          String str5 = "onlineDotView";
          String str6 = "vipBadge";
          if (mIsOnline.booleanValue()) {
             r = obj.v;
             if (r == null) {
                a.S(str5);
             }
             r.setVisibility(0);
             r = obj.w;
             if (r == null) {
                a.S(str6);
             }
             r.setVisibility(i);
          }else {
             a$a v = obj.v;
             if (v == null) {
                a.S(str5);
             }
             v.setVisibility(i);
             a$a uoa2 = 0x7f080581;
             str2 = 0x7f08059f;
             if (mUser1.mVerifiedDetail != null) {
                v = obj.w;
                if (v == null) {
                   a.S(str6);
                }
                v.setVisibility(0);
                UserVerifiedDetail mIconType = mUser1.mVerifiedDetail.mIconType;
                if (mIconType != i1) {
                   if (mIconType != p) {
                      if (mIconType == 3) {
                         r = obj.w;
                         if (r == null) {
                            a.S(str6);
                         }
                         r.setImageResource(R.drawable.arg_RES_7f080594);
                      }
                   }else {
                      r = obj.w;
                      if (r == null) {
                         a.S(str6);
                      }
                      r.setImageResource(uoa2);
                   }
                }else {
                   r = obj.w;
                   if (r == null) {
                      a.S(str6);
                   }
                   r.setImageResource(str2);
                }
             }else {
                a.o(mUser1, "user");
                if (mUser1.isVerified()) {
                   v = obj.w;
                   if (v == null) {
                      a.S(str6);
                   }
                   v.setVisibility(0);
                   v = obj.w;
                   if (v == null) {
                      a.S(str6);
                   }
                   if (!mUser1.isBlueVerifiedType()) {
                      uoa2 = 0x7f08059f;
                   }
                   v.setImageResource(uoa2);
                }else {
                   r = obj.w;
                   if (r == null) {
                      a.S(str6);
                   }
                   r.setVisibility(i);
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "7")) {
          if (TextUtils.x(obj.x.z)) {
             r = obj.p;
             if (r == null) {
                a.S("item");
             }
             if (!TextUtils.x(r.mAliasName)) {
                r = obj.p;
                if (r == null) {
                   a.S("item");
                }
                mName = r.mUser.mName;
                p = obj.p;
                if (p == null) {
                   a.S("item");
                }
                if (a.g(mName, p.mAliasName) ^ i1) {
                   r = obj.s;
                   if (r == null) {
                      a.S("name");
                   }
                   p = obj.p;
                   if (p == null) {
                      a.S("item");
                   }
                   r.setText(p.mAliasName);
                }
             }
             r = obj.s;
             if (r == null) {
                a.S("name");
             }
             p = obj.p;
             if (p == null) {
                a.S("item");
             }
             r.setText(p.mUser.mName);
          }else {
             r = obj.p;
             if (r == null) {
                a.S("item");
             }
             mName = r.mUser.mName;
             a z = obj.x.z;
             a.o(mName, "nickName");
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             SpannableString spannableStr = PatchProxy.applyTwoRefs(z, mName, obj, uoa, "9");
             if (spannableStr != patchProxyRe) {
             }else if(!TextUtils.x(z) && !TextUtils.x(mName)){
                String str = n0.d(mName);
                String str1 = n0.d(z);
                a.o(str, "sourceLower");
                a.o(str1, "keyWordLower");
                i = 0x7f061e92;
                if (StringsKt__StringsKt.O2(str, str1, 0, p, objArray)) {
                   spannableStr = new SpannableString(mName);
                   i2 = StringsKt__StringsKt.i3(str, str1, 0, false, 6, null);
                   Context context = this.getContext();
                   a.m(context);
                   spannableStr.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i)), i2, (z.length() + i2), 33);
                }else {
                   str2 = f0.d(mName);
                   a.o(str2, "HanziToPinyin.getPinYin\(sourceString\)");
                   if (StringsKt__StringsKt.O2(str2, str1, 0, p, objArray)) {
                      spannableStr = PatchProxy.applyTwoRefs(mName, str1, obj, uoa, "10");
                      if (spannableStr != patchProxyRe) {
                      }else {
                         SpannableString spannableStr1 = new SpannableString(mName);
                         ArrayList uArrayList = new ArrayList();
                         Iterator iterator = f0.c().b(mName).iterator();
                         while (iterator.hasNext()) {
                            f0$a uoa1 = iterator.next();
                            if (uoa1.a == p) {
                               uArrayList.add(n0.d(uoa1.c));
                            }else {
                               uArrayList.add(n0.d(uoa1.b));
                            }
                         }
                         i2 = uArrayList.size();
                         int i3 = 0;
                         while (true) {
                            if (i3 < i2) {
                               StringBuilder str3 = "";
                               int i4 = i3;
                               while (i4 < i2) {
                                  str3 = str3+uArrayList.get(i4);
                                  i4 = i4 + 1;
                                  str4 = 0x7f061e92;
                               }
                               str4 = str3;
                               a.o(str4, "builder.toString\(\)");
                               if (u.q2(str4, str1, 0, p, objArray)) {
                                  i5 = i3;
                                  i = 0;
                                  while (true) {
                                     if (i5 < i2) {
                                        i = i + (uArrayList.get(i5)).length();
                                        if (i >= str1.length()) {
                                           i5 = i5 + i1;
                                        label_029c :
                                           Context context1 = this.getContext();
                                           a.m(context1);
                                           spannableStr1.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context1, R.color.arg_RES_7f061e92)), i3, i5, 33);
                                           spannableStr = spannableStr1;
                                        }else {
                                           i5 = i5 + 1;
                                        }
                                     }else {
                                        i5 = 0;
                                        goto label_029c ;
                                     }
                                  }
                               }else {
                                  i3 = i3 + 1;
                                  i4 = 33;
                               }
                            }else {
                               i5 = 0;
                               i3 = 0;
                               goto label_029c ;
                            }
                         }
                      }
                   }
                }
             }
             spannableStr = objArray;
             r = obj.s;
             if (r == null) {
                a.S("name");
             }
             if (spannableStr == null) {
                p = obj.p;
                if (p == null) {
                   a.S("item");
                }
                spannableStr = p.mUser.mName;
             }
             r.setText(spannableStr);
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "8")) {
          uoa = obj.p;
          if (uoa == null) {
             a.S("item");
          }
          ContactTargetItem mUser = uoa.mUser;
          if (obj.x.A != null && !TextUtils.x(mUser.mIntimateRelationName)) {
             a$a t = obj.t;
             if (t == null) {
                a.S("intimateTag");
             }
             t.setVisibility(0);
             t = obj.t;
             if (t == null) {
                a.S("intimateTag");
             }
             t.setText(mUser.mIntimateRelationName);
          }else {
             uoa = obj.t;
             if (uoa == null) {
                a.S("intimateTag");
             }
             uoa.setVisibility(8);
          }
       }
       this.P8();
       return;
    }
    public final void P8(){
       int i1;
       if (PatchProxy.applyVoid(null, this, a$a.class, "4")) {
          return;
       }
       b uob = this.x.s1();
       int i = 0;
       if (uob != null) {
          a b = this.x.B;
          a$a tp = this.p;
          if (tp == null) {
             a.S("item");
          }
          if (uob.b(b, tp) == true) {
             i1 = 0;
          label_002d :
             a$a tu = this.u;
             if (tu == null) {
                a.S("selected");
             }
             if (i1) {
                i = 4;
             }
             tu.setVisibility(i);
             a$a tp1 = this.p;
             if (tp1 == null) {
                a.S("item");
             }
             tp1.mSelected = i1 ^ 1;
             return;
          }
       }
       i1 = 1;
       goto label_002d ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.publish_at_friend_avatar);
       a.o(view, "ViewBindUtils.bindWidget¡­publish_at_friend_avatar\)");
       this.r = view;
       view = m1.f(p0, R.id.publish_at_friend_name);
       a.o(view, "ViewBindUtils.bindWidget¡­d.publish_at_friend_name\)");
       this.s = view;
       view = m1.f(p0, R.id.publish_at_friend_selected);
       a.o(view, "ViewBindUtils.bindWidget¡­blish_at_friend_selected\)");
       this.u = view;
       view = m1.f(p0, R.id.publish_at_friend_intimate_tag);
       a.o(view, "ViewBindUtils.bindWidget¡­h_at_friend_intimate_tag\)");
       this.t = view;
       view = m1.f(p0, R.id.online_badge);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.online_badge\)");
       this.v = view;
       view = m1.f(p0, R.id.vip_badge);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.vip_badge\)");
       this.w = view;
       p0.setOnClickListener(new a$a$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       Object obj = this.q8(ContactTargetItem.class);
       a.o(obj, "inject\(ContactTargetItem::class.java\)");
       this.p = obj;
       obj = this.r8("ADAPTER_POSITION_GETTER");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION_GETTER\)");
       this.q = obj;
       return;
    }
}
