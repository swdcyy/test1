package com.yxcorp.gifshow.helper.editor.RequestFollowFloatEditorFragment$b;
import android.text.InputFilter;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.Spanned;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.a1;
import e17.i;
import java.lang.Character;

public final class RequestFollowFloatEditorFragment$b implements InputFilter	// class@001633
{
    public final int a;

    public void RequestFollowFloatEditorFragment$b(int p0){
       super();
       this.a = p0;
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       if (PatchProxy.isSupport(RequestFollowFloatEditorFragment$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, RequestFollowFloatEditorFragment$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "source");
       a.p(p3, "dest");
       int i = this.a - (p3.length() - (p5 - p4));
       String str = "";
       if (i <= 0) {
          i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1031c4), 1);
       }else if(i >= (p2 - p1)){
          str = null;
       }else {
          i = i + p1;
          if (Character.isHighSurrogate(p0.charAt((i - 1)))) {
             i = i - 1;
             if (i == p1) {
                return str;
             }
          }
          str = p0.subSequence(p1, i);
       }
       return str;
    }
}
