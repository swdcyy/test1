package il9.b;
import android.graphics.Rect;
import java.lang.Object;
import android.view.View;
import android.view.Window;
import il9.b$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import il9.e;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import il9.b$a;
import android.view.TouchDelegate;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.yxcorp.gifshow.util.cdnresource.a;
import il9.e$a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.util.SparseArray;
import il9.e$b;
import lnc.a1;
import kl9.a$b;
import jl9.c;
import jl9.d$a;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Enum;
import k2b.u1;

public class b	// class@002868
{
    public static boolean a;
    public static final Rect b;

    static {
       b.b = new Rect();
    }
    public void b(){
       super();
    }
    public static void a(View p0,View p1,Window p2,boolean p3,boolean p4,b$b p5,ClientContent$ContentPackage p6,e p7,String p8,QPhoto p9){
       object oobject = p0;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, uob, "4")) {
             return;
          }
       }
       b$a uoa = new b$a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       if (p0.getTouchDelegate() instanceof b$a) {
          v12.g = p0.getTouchDelegate().g;
       }
       p0.setTouchDelegate(v12);
       return;
    }
    public static e b(Context p0,String p1,QPhoto p2){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = "COMMENT_LIKE_ANIMATION";
       String str1 = b.a(-1568263472).c(str, p2);
       b = a.a(str, str1);
       if (b) {
          p1 = str1;
       }
       e$a uoa = e$a.b(p0, p1);
       uoa.x = b;
       uoa.d(new int[10]{R.drawable.arg_RES_7f0804b0,0x7f0804b1,R.drawable.arg_RES_7f0804b2,0x7f0804b3,R.drawable.arg_RES_7f0804b4,0x7f0804b5,R.drawable.arg_RES_7f0804b6,0x7f0804b7,R.drawable.arg_RES_7f0804b8,0x7f0804b9});
       uoa = uoa.i(CdnResource$ResourceKey.combo_particle, new int[11]{R.drawable.arg_RES_7f0804ba,0x7f0804bd,R.drawable.arg_RES_7f0804be,0x7f0804bf,R.drawable.arg_RES_7f0804c0,0x7f0804c1,R.drawable.arg_RES_7f0804c2,0x7f0804c3,R.drawable.arg_RES_7f0804c4,0x7f0804bb,R.drawable.arg_RES_7f0804bc});
       SparseArray sparseArray = PatchProxy.apply(null, null, b.class, "12");
       b = 0x7f0804c7;
       int i = 0x7f0804c5;
       int i1 = 0x7f0804c6;
       if (sparseArray != patchProxyRe) {
       }else {
          sparseArray = new SparseArray();
          sparseArray.put(R.drawable.arg_RES_7f0804b0, CdnResource$ResourceKey.combo_number_0);
          sparseArray.put(R.drawable.arg_RES_7f0804b1, CdnResource$ResourceKey.combo_number_1);
          sparseArray.put(R.drawable.arg_RES_7f0804b2, CdnResource$ResourceKey.combo_number_2);
          sparseArray.put(R.drawable.arg_RES_7f0804b3, CdnResource$ResourceKey.combo_number_3);
          sparseArray.put(R.drawable.arg_RES_7f0804b4, CdnResource$ResourceKey.combo_number_4);
          sparseArray.put(R.drawable.arg_RES_7f0804b5, CdnResource$ResourceKey.combo_number_5);
          sparseArray.put(R.drawable.arg_RES_7f0804b6, CdnResource$ResourceKey.combo_number_6);
          sparseArray.put(R.drawable.arg_RES_7f0804b7, CdnResource$ResourceKey.combo_number_7);
          sparseArray.put(R.drawable.arg_RES_7f0804b8, CdnResource$ResourceKey.combo_number_8);
          sparseArray.put(R.drawable.arg_RES_7f0804b9, CdnResource$ResourceKey.combo_number_9);
          sparseArray.put(i1, CdnResource$ResourceKey.combo_text_0);
          sparseArray.put(i, CdnResource$ResourceKey.combo_text_1);
          sparseArray.put(b, CdnResource$ResourceKey.combo_text_2);
       }
       uoa.f(sparseArray);
       e$b[] uobArray = new e$b[]{e$b.a(i1, 0),e$b.a(i, 20),e$b.a(b, 60)};
       uoa.e(uobArray);
       uoa.c(160, 290);
       uoa.g(a1.e(38.00f));
       uoa.j(c.a(0x3fb33333, 2.00f));
       uoa.h(((float)n.z(p0) * 0x3f47ae14));
       uoa.m(((float)n.z(p0) * 0x3f5c28f6));
       uoa.l(700);
       return uoa.a();
    }
    public static void c(Window p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "10")) {
          return;
       }
       ViewGroup viewGroup = p0.getDecorView().findViewById(0x1020002);
       if (viewGroup == null) {
          return;
       }
       viewGroup = viewGroup.getTag(R.id.like_comment_anim_view);
       if (viewGroup instanceof ComboAnimView) {
          viewGroup.setClickable(p1);
       }
       return;
    }
    public static void d(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "6")) {
          return;
       }
       ViewGroup viewGroup = p0.findViewById(0x1020002);
       Object tag = viewGroup.getTag(R.id.like_comment_anim_view);
       if (tag instanceof ComboAnimView) {
          tag.a();
          viewGroup.removeView(tag);
          viewGroup.setTag(R.id.like_comment_anim_view, null);
       }
       b.c(p0, false);
       b.a = false;
       return;
    }
    public static void e(String p0,ClientContent$ContentPackage p1,boolean p2,CdnResource$ResourceKey p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, b.class, "8")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p1.ksOrderInfoPackage = l0.a(p0);
       p0 = (p2)? "TRUE": "FALSE";
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIKE_SPECIAL";
       uElementPack.name = "comment_like";
       i3 oi3 = i3.f();
       oi3.d("category", "COMMENT");
       oi3.d("is_like", p0);
       oi3.d("resource_key", p3.name());
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, p1);
       return;
    }
}
