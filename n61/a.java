package n61.a;
import java.lang.Object;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;
import android.view.View;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge$Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.l;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import z61.a;
import com.kwai.robust.PatchProxyResult;
import z61.a$a;
import z61.b;

public class a	// class@0032b0
{

    public void a(){
       super();
    }
    public static void a(boolean p0,LiveBottomBarItemBadge p1,View p2,TextView p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, null, a.class, "1")) {
          return;
       }
       if (p1 == null) {
          p2.setVisibility(8);
          p3.setVisibility(8);
          return;
       }else {
          LiveBottomBarItemBadge b = p1.b;
          int i = 0;
          if (b == LiveBottomBarItemBadge$Type.RED_DOT) {
             if (p0) {
                i = 8;
             }
             p2.setVisibility(i);
             p3.setVisibility(8);
          }else if(b == LiveBottomBarItemBadge$Type.TEXT && !TextUtils.x(p1.a)){
             p2.setVisibility(8);
             p3.setVisibility(i);
             p3.setText(p1.a);
          }
          return;
       }
    }
    public static void b(boolean p0,KwaiImageView p1,LiveNormalBottomBarItem p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, a.class, "2")) {
          return;
       }
       int i = 0;
       if (p0 && p2.mIsSelected != null) {
          if (!j.h(p2.mSelectedIconUrl)) {
             p1.U(p2.mSelectedIconUrl);
             i = 1;
          }else {
             p1.L(null);
          }
          l mSelectedIco = p2.mSelectedIconRes;
          if (mSelectedIco != -1) {
             p1.setPlaceHolderImage(mSelectedIco);
             i = 1;
          }else {
             p1.setPlaceHolderImage(null);
          }
       }
       if (!i) {
          if (!j.h(p2.mIconUrl)) {
             p1.U(p2.mIconUrl);
          }else {
             p1.L(null);
          }
          LiveNormalBottomBarItem mIconRes = p2.mIconRes;
          if (mIconRes != -1) {
             p1.setPlaceHolderImage(mIconRes);
          }else {
             p1.setPlaceHolderImage(null);
          }
       }
       return;
    }
    public static void c(boolean p0,KwaiImageView p1,LiveNormalBottomBarItem p2){
       a a;
       boolean b;
       a$a f;
       a$a e;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, a.class, "3")) {
          return;
       }
       if (p2 instanceof a) {
          a = p2.a;
          l mIsSelected = p2.mIsSelected;
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Boolean.valueOf(mIsSelected), p1, a, null, a.class, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_0049 :
                b = false;
                if (a != null) {
                   if (p0 && mIsSelected != null) {
                      f = a.f;
                      e = a.e;
                   }else {
                      f = null;
                      e = -1;
                   }
                   if (j.h(f) && e == -1) {
                      f = a.d;
                      e = a.c;
                   }
                   if (!j.h(f) || e != -1) {
                      if (!j.h(f)) {
                         p1.U(a.d);
                      }else {
                         p1.L(null);
                      }
                      if (e != -1) {
                         p1.setPlaceHolderImage(a.c);
                      }
                      b = true;
                   }
                }
             }
          }else {
             goto label_0049 ;
          }
          if (b) {
             return;
          }
       }
       a.b(p0, p1, p2);
       return;
    }
    public static void d(TextView p0,b p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       p0.setAlpha(p1.mTextAlpha);
       if (p1 instanceof a) {
          a = p1.a;
          if (a != null && !TextUtils.x(a.b)) {
             p0.setText(a.b);
             return;
          }
       }
       a.e(p0, p1);
       return;
    }
    public static void e(TextView p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       if (!TextUtils.x(p1.mText)) {
          p0.setText(p1.mText);
       }else {
          b mTextRes = p1.mTextRes;
          if (mTextRes != -1) {
             p0.setText(mTextRes);
          }else {
             p0.setText("");
          }
       }
       p0.setAlpha(p1.mTextAlpha);
       return;
    }
}
