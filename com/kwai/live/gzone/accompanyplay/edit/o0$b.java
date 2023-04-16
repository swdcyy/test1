package com.kwai.live.gzone.accompanyplay.edit.o0$b;
import android.text.InputFilter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import android.text.Spanned;
import java.lang.StringBuilder;

public class o0$b implements InputFilter	// class@000c10
{
    public int a;
    public int b;

    public void o0$b(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(o0$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, o0$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p2 < p0) {
          i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f10239f, p0));
          return false;
       }else if(p2 > p1){
          i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f10239e, p1));
          return false;
       }else {
          return true;
       }
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       if (PatchProxy.isSupport(o0$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, o0$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (this.a(this.a, this.b, Integer.parseInt(p3.toString()+p0.toString()))) {
             return null;
          }else {
             return "";
          }
       }catch(java.lang.NumberFormatException e0){
       }
    }
}
