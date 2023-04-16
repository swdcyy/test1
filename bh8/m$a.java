package bh8.m$a;
import android.text.InputFilter;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.TextUtils;
import java.lang.Character;
import android.text.Spanned;
import java.lang.Integer;
import bh8.l;
import java.lang.Runnable;
import zi8.d1;

public class m$a implements InputFilter	// class@00036b
{

    public void m$a(){
       super();
    }
    public final int a(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          return i;
       }
       int i1 = 0;
       while (i < p0.length()) {
          int i2 = Character.codePointAt(p0, i);
          i1 = (i2 >= 0 && i2 <= 255)? i1 + 1: i1 + 2;
          i = i + 1;
       }
       return i1;
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       if (PatchProxy.isSupport(m$a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, m$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (((this.a(p3) - (p5 - p4)) - 40) >= this.a(p0)) {
          return null;
       }else {
          d1.f(l.b);
          return "";
       }
    }
}
