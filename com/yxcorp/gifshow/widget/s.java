package com.yxcorp.gifshow.widget.s;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputConnection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.s$a;

public class s extends InputConnectionWrapper	// class@0019c3
{
    public s$a a;

    public void s(InputConnection p0,boolean p1){
       super(null, p1);
    }
    public boolean deleteSurroundingText(int p0,int p1){
       s obj;
       if (PatchProxy.isSupport(s.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, s.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       if (obj != null && obj.k7(p0, p1)) {
          return true;
       }else {
          return super.deleteSurroundingText(p0, p1);
       }
    }
}
