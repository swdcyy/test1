package com.kwai.library.push.display.PushDataBinder;
import java.lang.Object;
import android.view.View;
import com.kwai.library.push.model.InAppNotification;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.push.widget.InAppImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import ny6.a;
import java.util.List;
import java.util.Collection;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.AnimatorSet;
import androidx.core.content.ContextCompat;
import com.kwai.library.push.display.PushDataBinder$startAvatar1Animation$$inlined$let$lambda$1;
import com.kwai.library.push.display.PushDataBinder$startAvatar1Animation$$inlined$let$lambda$2;
import com.kwai.library.push.display.PushDataBinder$startAvatar1Animation$$inlined$let$lambda$3;
import msd.a;
import iy6.j;
import com.kwai.library.push.display.PushDataBinder$startAvatar2Animation$$inlined$let$lambda$1;
import com.kwai.library.push.display.PushDataBinder$startAvatar2Animation$$inlined$let$lambda$2;
import com.kwai.library.push.display.PushDataBinder$startAvatar2Animation$$inlined$let$lambda$3;
import com.kwai.library.push.display.PushDataBinder$startAvatarAnimation$$inlined$let$lambda$1;
import com.kwai.library.push.display.PushDataBinder$startAvatarAnimation$$inlined$let$lambda$2;
import com.kwai.library.push.display.PushDataBinder$startAvatarAnimation$$inlined$let$lambda$3;

public final class PushDataBinder	// class@0008bd
{
    public InAppImageView a;
    public InAppImageView b;
    public LottieAnimationView c;
    public InAppImageView d;
    public InAppImageView e;
    public InAppImageView f;
    public InAppImageView g;
    public LottieAnimationView h;
    public LottieAnimationView i;
    public View j;
    public TextView k;
    public TextView l;
    public TextView m;
    public View n;
    public AnimatorSet o;
    public AnimatorSet p;
    public AnimatorSet q;
    public boolean r;

    public void PushDataBinder(){
       super();
    }
    public final void a(View p0,InAppNotification p1){
       int i1;
       PushDataBinder tm;
       PushDataBinder tb;
       List livings;
       String str2;
       Drawable uDrawable;
       String str3;
       Drawable uDrawable1;
       PushDataBinder td;
       Object obj;
       a.p(p0, "contentView");
       a.p(p1, "data");
       if (this.r != null) {
       }else {
          this.r = true;
          this.a = this.e(p0, 0x7f0a034e);
          this.k = this.e(p0, 0x7f0a3f7b);
          this.l = this.e(p0, 0x7f0a0962);
          this.m = this.e(p0, 0x7f0a3cc3);
          this.j = this.e(p0, 0x7f0a0383);
          this.b = this.e(p0, 0x7f0a0341);
          this.c = this.e(p0, 0x7f0a0359);
          this.n = this.e(p0, 0x7f0a438a);
       }
       a.b("bindData title:"+p1.getTitle()+" content:"+p1.getContent()+" biz:"+p1.getBizType());
       PushDataBinder tk = this.k;
       if (tk != null) {
          tk.setText(p1.getTitle());
       }
       tk = this.l;
       if (tk != null) {
          tk.setText(p1.getContent());
       }
       tk = this.n;
       String str = "1";
       if (tk != null) {
          if (a.g(str, p1.getOnlineStatus())) {
             List leftIcon = p1.getLeftIcon();
             if (leftIcon != null && (leftIcon.isEmpty() ^ 1) == 1) {
                leftIcon = p1.getLeftIcon();
                if (leftIcon != null && leftIcon.size() == 1) {
                   leftIcon = p1.getLivings();
                   leftIcon = (leftIcon == null || leftIcon.isEmpty())? 1: null;
                   if (!leftIcon) {
                      leftIcon = p1.getLivings();
                      if (leftIcon != null && leftIcon.contains(str) == true) {
                      label_00f8 :
                         tm = 0;
                      label_00f9 :
                         int i = (leftIcon)? 0: 8;
                         tk.setVisibility(i);
                      }
                   }
                   leftIcon = 1;
                   goto label_00f9 ;
                }else {
                   goto label_00f8 ;
                }
             }else {
                goto label_00f8 ;
             }
          }else {
             goto label_00f8 ;
          }
       }
       String tagTxt = p1.getTagTxt();
       if (tagTxt != null) {
          tagTxt = (tagTxt.length() > 0)? 1: 0;
          if (tagTxt == 1) {
             i1 = 0;
          label_0117 :
             tm = this.m;
             if (tm != null) {
                tm.setText(p1.getTagTxt());
             }
             tm = this.m;
             if (tm != null) {
                tm.setVisibility(i1);
             }
             List leftIcon1 = p1.getLeftIcon();
             leftIcon1 = (leftIcon1 == null || leftIcon1.isEmpty())? 1: null;
             if (leftIcon1) {
                tb = this.b;
                if (tb != null) {
                   tb.setVisibility(8);
                }
                tb = this.j;
                if (tb != null) {
                   tb.setVisibility(8);
                }
                tb = this.a;
                if (tb != null) {
                   tb.setVisibility(0);
                   tb.setFailureImage(this.f(tb.getContext(), R.color.arg_RES_7f060af6));
                   tb.setPlaceHolderImage(this.f(tb.getContext(), R.color.arg_RES_7f060af6));
                }
                this.d();
             }else {
                leftIcon1 = p1.getLeftIcon();
                String str1 = null;
                if (leftIcon1 != null && leftIcon1.size() == 1) {
                   tb = this.a;
                   if (tb != null) {
                      tb.setVisibility(0);
                   }
                   tb = this.j;
                   if (tb != null) {
                      tb.setVisibility(8);
                   }
                   livings = p1.getLivings();
                   if (livings != null && (livings.isEmpty() ^ 1) == 1) {
                      livings = p1.getLivings();
                      str2 = (livings != null)? livings.get(0): str1;
                      if (a.g(str2, str)) {
                         tb = this.b;
                         if (tb != null) {
                            tb.setVisibility(0);
                         }
                         this.k();
                         uDrawable = str1;
                      label_01ce :
                         tk = this.a;
                         if (tk != null) {
                            tk.setVisibility(0);
                            tk.setFailureImage(uDrawable);
                            tk.setPlaceHolderImage(uDrawable);
                            livings = p1.getLeftIcon();
                            if (livings != null) {
                               str1 = livings.get(0);
                            }
                            tk.v(str1);
                         }
                      }
                   }
                label_01b6 :
                   tb = this.b;
                   if (tb != null) {
                      tb.setVisibility(8);
                   }
                   tb = this.a;
                   Context context = (tb != null)? tb.getContext(): str1;
                   uDrawable = this.f(context, R.color.arg_RES_7f060af6);
                   this.d();
                   goto label_01ce ;
                }else {
                   leftIcon1 = p1.getLivings();
                   List leftIcon2 = p1.getLeftIcon();
                   PushDataBinder ta = this.a;
                   if (ta != null) {
                      ta.setVisibility(8);
                   }
                   ta = this.b;
                   if (ta != null) {
                      ta.setVisibility(8);
                   }
                   this.d();
                   ta = this.j;
                   if (!ta instanceof ViewStub) {
                      str3 = str1;
                   }
                   if (str3 != null) {
                      this.j = str3.inflate();
                      this.d = this.e(p0, 0x7f0a034f);
                      this.e = this.e(p0, 0x7f0a0350);
                      this.f = this.e(p0, 0x7f0a033f);
                      this.g = this.e(p0, 0x7f0a0340);
                      this.h = this.e(p0, 0x7f0a035a);
                      this.i = this.e(p0, 0x7f0a035b);
                      if (!this.j instanceof ConstraintLayout) {
                         tb = this.f;
                         if (tb != null) {
                            tb.setVisibility(8);
                         }
                         tb = this.g;
                         if (tb != null) {
                            tb.setVisibility(8);
                         }
                         this.b();
                         this.c();
                      }
                   }
                   ta = this.j;
                   if (ta != null) {
                      ta.setVisibility(0);
                   }
                   int i2 = (leftIcon1 == null || leftIcon1.isEmpty())? 1: 0;
                   if (i2) {
                      tk = this.f;
                      if (tk != null) {
                         tk.setVisibility(8);
                      }
                      tk = this.g;
                      if (tk != null) {
                         tk.setVisibility(8);
                      }
                      uDrawable1 = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                      uDrawable = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                      this.g();
                   }else if(leftIcon1.size() == 1){
                      this.b();
                      this.c();
                      obj = leftIcon1.get(0);
                      a.o(obj, "livings[0]");
                      obj = (obj.length() > 0)? 1: 0;
                      if (obj && a.g(leftIcon1.get(0), str)) {
                         tk = this.f;
                         if (tk != null) {
                            tk.setVisibility(0);
                         }
                         tk = this.g;
                         if (tk != null) {
                            tk.setVisibility(8);
                         }
                         uDrawable = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                         this.k();
                      }else {
                         uDrawable1 = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                         uDrawable = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                         td = this.f;
                         if (td != null) {
                            td.setVisibility(8);
                         }
                         td = this.g;
                         if (td != null) {
                            td.setVisibility(8);
                         }
                         this.d();
                      }
                   }else {
                      this.d();
                      obj = leftIcon1.get(0);
                      a.o(obj, "livings[0]");
                      str3 = (obj.length() > 0)? 1: null;
                      if (str3 && a.g(leftIcon1.get(0), str)) {
                         obj = leftIcon1.get(1);
                         a.o(obj, "livings[1]");
                         str3 = (obj.length() > 0)? 1: null;
                         if (str3 && a.g(leftIcon1.get(1), str)) {
                            tb = this.f;
                            if (tb != null) {
                               tb.setVisibility(0);
                            }
                            tb = this.g;
                            if (tb != null) {
                               tb.setVisibility(0);
                            }
                            this.i();
                            this.j();
                            str2 = str1;
                            uDrawable1 = str2;
                         }
                      }
                   label_0376 :
                      obj = leftIcon1.get(0);
                      a.o(obj, "livings[0]");
                      str3 = (obj.length() > 0)? 1: null;
                      if (str3 && a.g(leftIcon1.get(0), str)) {
                         tk = this.f;
                         if (tk != null) {
                            tk.setVisibility(0);
                         }
                         tk = this.g;
                         if (tk != null) {
                            tk.setVisibility(8);
                         }
                         uDrawable = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                         this.i();
                         this.c();
                      }else {
                         obj = leftIcon1.get(1);
                         a.o(obj, "livings[1]");
                         obj = (obj.length() > 0)? 1: 0;
                         if (obj && a.g(leftIcon1.get(1), str)) {
                            tk = this.f;
                            if (tk != null) {
                               tk.setVisibility(8);
                            }
                            tk = this.g;
                            if (tk != null) {
                               tk.setVisibility(0);
                            }
                            uDrawable1 = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                            this.b();
                            this.j();
                            str2 = str1;
                         }else {
                            uDrawable1 = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                            uDrawable = this.f(p0.getContext(), R.color.arg_RES_7f060af6);
                            td = this.f;
                            if (td != null) {
                               td.setVisibility(8);
                            }
                            td = this.g;
                            if (td != null) {
                               td.setVisibility(8);
                            }
                            this.b();
                            this.c();
                         }
                      }
                   }
                   uDrawable1 = str1;
                   td = this.d;
                   if (td != null) {
                      td.setFailureImage(uDrawable1);
                   }
                   td = this.d;
                   if (td != null) {
                      td.setPlaceHolderImage(uDrawable1);
                   }
                   tk = this.e;
                   if (tk != null) {
                      tk.setFailureImage(uDrawable);
                   }
                   tk = this.e;
                   if (tk != null) {
                      tk.setPlaceHolderImage(uDrawable);
                   }
                   tb = this.d;
                   if (tb != null) {
                      tagTxt = (leftIcon2 != null)? leftIcon2.get(0): str1;
                      tb.v(tagTxt);
                   }
                   tb = this.e;
                   if (tb != null) {
                      if (leftIcon2 != null) {
                         str1 = leftIcon2.get(1);
                      }
                      tb.v(str1);
                   }
                }
             }
             return;
          }
       }
       i1 = 8;
       goto label_0117 ;
    }
    public final void b(){
       PushDataBinder th = this.h;
       if (th != null) {
          th.setVisibility(8);
       }
       th = this.p;
       if (th != null) {
          th.cancel();
       }
       return;
    }
    public final void c(){
       PushDataBinder ti = this.i;
       if (ti != null) {
          ti.setVisibility(8);
       }
       ti = this.q;
       if (ti != null) {
          ti.cancel();
       }
       return;
    }
    public final void d(){
       PushDataBinder tc = this.c;
       if (tc != null) {
          tc.setVisibility(8);
       }
       tc = this.o;
       if (tc != null) {
          tc.cancel();
       }
       return;
    }
    public final View e(View p0,int p1){
       p0 = p0.findViewById(p1);
       a.o(p0, "this.findViewById\(id\)");
       return p0;
    }
    public final Drawable f(Context p0,int p1){
       Drawable drawable = (p0 != null)? ContextCompat.getDrawable(p0, p1): null;
       return drawable;
    }
    public final void g(){
       this.d();
       this.b();
       this.c();
    }
    public final void h(LottieAnimationView p0){
       p0.setVisibility(0);
       p0.s();
    }
    public final void i(){
       this.b();
       PushDataBinder td = this.d;
       if (td != null) {
          this.p = j.c(td, new PushDataBinder$startAvatar1Animation$$inlined$let$lambda$1(this), new PushDataBinder$startAvatar1Animation$$inlined$let$lambda$2(this), new PushDataBinder$startAvatar1Animation$$inlined$let$lambda$3(this));
       }
       return;
    }
    public final void j(){
       this.c();
       PushDataBinder te = this.e;
       if (te != null) {
          this.q = j.c(te, new PushDataBinder$startAvatar2Animation$$inlined$let$lambda$1(this), new PushDataBinder$startAvatar2Animation$$inlined$let$lambda$2(this), new PushDataBinder$startAvatar2Animation$$inlined$let$lambda$3(this));
       }
       return;
    }
    public final void k(){
       this.d();
       PushDataBinder ta = this.a;
       if (ta != null) {
          this.o = j.c(ta, new PushDataBinder$startAvatarAnimation$$inlined$let$lambda$1(this), new PushDataBinder$startAvatarAnimation$$inlined$let$lambda$2(this), new PushDataBinder$startAvatarAnimation$$inlined$let$lambda$3(this));
       }
       return;
    }
    public final void l(LottieAnimationView p0){
       p0.setVisibility(8);
       p0.f();
    }
}
