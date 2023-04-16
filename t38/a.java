package t38.a;
import java.lang.Object;
import t38.a$b;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.middleware.security.wrapper.IKSecurityBase;
import t38.a$a;
import v38.a;
import com.middleware.security.MXSec;
import u38.c;
import u38.b;
import android.app.Application;
import android.content.Context;
import w38.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a	// class@00245f
{
    public IKSecurityBase a;
    public a b;

    public void a(){
       super();
    }
    public static a c(){
       return a$b.a;
    }
    public byte[] a(String p0,String p1,int p2,byte[] p3){
       int i = 2;
       this.g(i);
       if (!TextUtils.isEmpty(p0) && (TextUtils.isEmpty(p1) || p3 == null)) {
          this.f(i, 3);
       }
       if (this.e(i)) {
          return this.d().atlasEncrypt(p0, p1, p2, p3);
       }else {
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }
    }
    public String b(String p0,String p1,int p2,String p3){
       return this.d().atlasSign(p0, p1, p2, p3);
    }
    public final IKSecurityBase d(){
       a ta = this.a;
       if (ta == null) {
          ta = new a$a(this);
       }
       return ta;
    }
    public final boolean e(int p0){
       a tb = this.b;
       boolean b = true;
       if (tb == null) {
          return b;
       }
       switch (p0){
           case 1:
             b = tb.isAs();
             break;
           case 2:
             b = tb.isAe();
             break;
           case 3:
             b = tb.isAd();
             break;
           case 4:
             b = tb.isUe();
             break;
           case 5:
             b = tb.isUd();
             break;
           case 6:
             b = tb.isEv();
             break;
           case 7:
             b = tb.isGsv();
             break;
           default:
       }
       return b;
    }
    public final void f(int p0,int p1){
       a tb = this.b;
       if (tb == null) {
          return;
       }
       if (!tb.isMnt()) {
          return;
       }
       this.b.mntData(p0, p1);
       return;
    }
    public final void g(int p0){
       int i = 6;
       if (this.a == null) {
          this.f(202, i);
       }
       if (MXSec.get().getInitParams() != null && (MXSec.get().getInitParams().getCommonParams() == null || MXSec.get().getInitParams().getCommonParams().getContext() == null)) {
          this.f(201, i);
       }
       int i1 = 100;
       if (p0 == i1 || (p0 == i1 && this.b == null)) {
          a uoa = a.a(MXSec.get().getInitParams().getCommonParams().getContext().getApplicationContext());
          uoa.b.putInt("w_s_p_r", 1);
          g.a(uoa.b);
          return;
       }else {
          a tb = this.b;
          if (tb != null && tb.isCnt()) {
             this.b.cntData(p0);
          }
          return;
       }
    }
    public void h(String p0,String p1,String p2,String p3,String p4){
       this.g(100);
       a tb = this.b;
       if (tb != null) {
          tb.recordScene(p0, p1, p2, p3, null);
       }
       return;
    }
}
