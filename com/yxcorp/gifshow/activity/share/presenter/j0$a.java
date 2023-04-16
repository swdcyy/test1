package com.yxcorp.gifshow.activity.share.presenter.j0$a;
import tyc.u4;
import com.yxcorp.gifshow.activity.share.presenter.j0;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.ArrayList;
import fx8.s;
import java.lang.StringBuilder;
import e17.i;
import java.lang.CharSequence;
import android.widget.EditText;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Integer;

public class j0$a extends u4	// class@0013f1
{
    public String b;
    public final j0 c;

    public void j0$a(j0 p0){
       this.c = p0;
       super();
       this.b = "";
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$a.class, "2")) {
          return;
       }
       j0$a tc = this.c;
       j0 m = tc.M;
       if (m != null) {
          tc.S8((m.v()).trim());
       }else {
          tc.S8((p0.toString()).trim());
       }
       try{
          if (this.c.p.getKSTextDisplayHandler().e().size() > s.d()) {
             Object[] objArray = new Object[]{s.d()+""};
             i.b(R.style.arg_RES_7f110668, 0x7f103df7, objArray);
             this.c.p.setText(this.b);
             this.c.W8();
          }
       }catch(java.lang.Exception e6){
          PostUtils.D("ShareEditorInputPresenter", "afterTextChanged", e6);
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(j0$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, j0$a.class, "1")) {
          return;
       }
       this.b = p0.toString();
       return;
    }
}
