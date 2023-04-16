package nfd.n0;
import java.lang.Object;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.n0$m;
import nfd.n0$h;
import nfd.n0$l;
import nfd.n0$d;
import nfd.n0$b;
import nfd.n0$j;
import nfd.n0$i;
import nfd.n0$k;
import nfd.n0$f;
import nfd.n0$g;
import nfd.n0$c;
import ufd.l;
import med.a;
import java.lang.Integer;
import java.lang.CharSequence;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import android.graphics.Typeface;
import k06.a;
import lnc.a1;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.User$FollowStatus;
import nfd.n0$a;
import java.lang.Enum;

public class n0	// class@001de1
{

    public void n0(){
       super();
    }
    public static void a(View p0,ImageView p1,TextView p2,m0 p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, n0.class, "2")) {
          return;
       }
       if (p3 != null) {
          n0$g og = null;
          switch (p3.a){
              case 1:
              case 5:
              case 6:
                og = new n0$g(p0, p1, p2, p3);
                break;
              case 2:
                og = new n0$f(p0, p1, p2, p3);
                break;
              case 3:
                og = new n0$k(p0, p1, p2, p3);
                break;
              case 4:
                og = new n0$i(p0, p1, p2, p3);
                break;
              case 7:
                og = new n0$j(p0, p1, p2, p3);
                break;
              case 8:
                og = new n0$b(p0, p1, p2, p3);
                break;
              case 9:
                og = new n0$d(p0, p1, p2, p3);
                break;
              case 10:
                og = new n0$l(p0, p1, p2, p3);
                break;
              case 11:
                og = new n0$h(p0, p1, p2, p3);
                break;
              case 12:
                og = new n0$m(p0, p1, p2, p3);
                break;
              default:
          }
          if (og != null) {
             og.b(p3.b);
             og.e = p3.d;
             og.c();
          }
       }
       return;
    }
    public static void b(l p0,m0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n0.class, "1")) {
          return;
       }
       if (p0 != null && p0 instanceof a) {
          n0.a(p0.a, p0.b, p0.c, p1);
       }
       return;
    }
    public static void c(ImageView p0,int p1){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, on0, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1 > 0) {
          p0.setImageResource(p1);
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public static void d(TextView p0,CharSequence p1,int p2,boolean p3){
       if (PatchProxy.isSupport(n0.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), null, n0.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setTextColor(p2);
       if (!TextUtils.x(p1)) {
          p0.setText(p1);
          p0.setVisibility(0);
       }
       p0.setTypeface(Typeface.defaultFromStyle(1));
       return;
    }
    public static void e(View p0,int p1,boolean p2){
       if (PatchProxy.isSupport(n0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, n0.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setBackgroundResource(p1);
       p0.setEnabled(p2);
       return;
    }
    public static void f(View p0,int p1,boolean p2){
       if (PatchProxy.isSupport(n0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, n0.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a uoa = new a();
       uoa.f((float)a1.d(R.dimen.arg_RES_7f0702e5));
       uoa.i(p1);
       p0.setBackground(uoa.a());
       p0.setEnabled(p2);
       return;
    }
    public static int g(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || p0.getFollowStatus() == null) {
          return 0;
       }
       int i = n0$a.a[p0.getFollowStatus().ordinal()];
       int i1 = 2;
       if (i == i1) {
          return i1;
       }
       if (i != 3) {
          return 0;
       }
       return 1;
    }
    public static int h(boolean p0){
       if (p0) {
          return 1;
       }
       return 0;
    }
}
