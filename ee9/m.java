package ee9.m;
import hc9.f;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import lnc.n4;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Integer;

public class m extends f	// class@00212e
{
    public boolean s;

    public void m(){
       super();
       this.s = true;
    }
    public static boolean D(int p0){
       int i = 1;
       if (p0 == i || (p0 && p0 != 2)) {
          i = false;
       }
    label_000a :
       return i;
    }
    public static m E(Intent p0){
       Object obj = null;
       m obj1 = PatchProxy.applyOneRefs(p0, obj, m.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new m();
       int i = -1;
       int i1 = j0.b(p0, "magic_download_bar_mode", i);
       if (m.D(i1)) {
          i = i1;
       }
       obj1.a(i);
       MagicEmoji$MagicFace magicFace = n4.i(p0);
       if (magicFace != null) {
          obj1.w(magicFace, j0.a(p0, "magic_face_data_complete", false));
          return obj1;
       }else {
          String str = n4.j(p0);
          String str1 = n4.h(p0);
          if (!TextUtils.isEmpty(str)) {
             obj1.G(str, str1);
             return obj1;
          }else {
             return obj;
          }
       }
    }
    public static m F(Intent p0){
       m obj = PatchProxy.applyOneRefs(p0, null, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new m();
       String str = n4.g(p0);
       String str1 = n4.f(p0);
       if (TextUtils.isEmpty(str)) {
          return null;
       }
       obj.G(str, str1);
       obj.a(0);
       return obj;
    }
    public boolean C(){
       return this.s;
    }
    public void G(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          MagicEmoji$MagicFace magicFace = new MagicEmoji$MagicFace(p0);
          if (!TextUtils.isEmpty(p1)) {
             magicFace.mChildId = p1;
          }
          this.b = p0;
          this.c = p1;
          this.d = magicFace;
       }
       return;
    }
    public void H(boolean p0){
       this.s = p0;
    }
    public void a(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "2")) {
          return;
       }
       if (m.D(p0)) {
          super.a(p0);
          this.H(false);
       }else {
          this.H(true);
       }
       return;
    }
}
