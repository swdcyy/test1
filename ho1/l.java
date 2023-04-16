package ho1.l;
import java.lang.Object;
import android.widget.TextView;
import java.lang.String;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import lnc.b3;
import android.content.Context;
import com.yxcorp.utility.n;
import ho1.l$b;
import java.lang.Long;
import java.lang.Boolean;
import android.text.TextUtils;
import ekd.t0;
import com.yxcorp.utility.TextUtils;
import ho1.l$a;
import ekd.f$h;
import android.animation.Animator;
import ekd.f;

public class l	// class@002760
{

    public void l(){
       super();
    }
    public static Spannable a(TextView p0,String p1,int p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, l.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p2) {
          p0.setTag(0xc094f5e, p1);
          return new SpannableString(p1);
       }else {
          b3 uob3 = new b3(p0.getContext(), p2);
          uob3.g(n.c(p0.getContext(), 2.00f));
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(uob3.a());
          p0.setTag(0xc094f5e, p1);
          spannableStr.append(p1);
          return spannableStr;
       }
    }
    public static String b(TextView p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getTag(0xc094f5e);
    }
    public static void c(TextView p0,long p1,String p2,boolean p3,int p4,long p5,l$b p6){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,Boolean.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, null, ol, "1")) {
             return;
          }
       }
       l.d(p0, p1, p2, p3, p4, p5, true, p6);
       return;
    }
    public static void d(TextView p0,long p1,String p2,boolean p3,int p4,long p5,boolean p6,l$b p7){
       Object[] objArray;
       object oobject = p0;
       object oobject1 = p2;
       l ol = l.class;
       int i = 6;
       int i1 = 5;
       if (PatchProxy.isSupport(ol)) {
          objArray = new Object[]{oobject,Long.valueOf(p1),oobject1,Boolean.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),Boolean.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, null, ol, "2")) {
             return;
          }
       }
       if (p3) {
          l.e(p0, p1, p5, p4, p7);
       }else if(!TextUtils.isEmpty(p2)){
          if (PatchProxy.isSupport(ol)) {
             objArray = new Object[i];
             objArray[0] = oobject;
             objArray[1] = oobject1;
             objArray[2] = Integer.valueOf(p4);
             objArray[3] = Long.valueOf(p5);
             objArray[4] = p7;
             objArray[i1] = Boolean.valueOf(p6);
             if (!PatchProxy.applyVoid(objArray, null, ol, "3")) {
             }
          }else if(t0.a(p2) && p6){
             l.e(p0, Long.parseLong(p2), p5, p4, p7);
          }else {
             p0.clearAnimation();
             Spannable spannable = l.a(p0, oobject1, p4);
             if (!TextUtils.n(spannable, p0.getText())) {
                p0.setText(spannable);
             }
          }
       }else {
          l.e(p0, p1, p5, p4, p7);
       }
       return;
    }
    public static void e(TextView p0,long p1,long p2,int p3,l$b p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, ol, "4")) {
             return;
          }
       }
       if (!p4.a() - p1 && !TextUtils.x(p0.getText())) {
          return;
       }else {
          l$a uoa = new l$a(p4, p0, p3, p2);
          f.p(p0, p4.a(), p1, v2);
          return;
       }
    }
}
