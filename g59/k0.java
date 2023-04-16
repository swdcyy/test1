package g59.k0;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import java.lang.Integer;
import android.view.ViewStub;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class k0	// class@002409
{

    public void k0(){
       super();
    }
    public static int a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return n.u(a.b());
       }
       int i = n.j(p0);
       if (i <= 0) {
          i = n.u(a.b());
       }
       return i;
    }
    public static int b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return n.y(a.b());
       }
       int i = n.k(p0);
       if (i <= 0) {
          i = n.y(a.b());
       }
       return i;
    }
    public static void c(View p0,int p1,int p2){
       if (PatchProxy.isSupport(k0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, k0.class, "11")) {
          return;
       }
       p0 = p0.findViewById(p1);
       if (p0 instanceof ViewStub) {
          p0.setLayoutResource(p2);
          p0.inflate();
       }
       return;
    }
    public static boolean d(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, null, k0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new int[2];
       p0.getLocationOnScreen(obj);
       int i = 0;
       if (obj[i] >= 0 && obj[1] > 0) {
          i = true;
       }
       return i;
    }
    public static void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, k0.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       return;
    }
    public static void f(View p0,int p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ok0, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$LayoutParams layoutParams1 = layoutParams;
          if (layoutParams1.bottomMargin != p1) {
             layoutParams1.bottomMargin = p1;
             p0.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public static void g(TextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, k0.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setVisibility(8);
       }else {
          p0.setText(p1);
          p0.setVisibility(0);
       }
       return;
    }
}
