package com.kuaishou.merchant.transaction.purchase.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import um4.b;
import android.view.View$OnClickListener;
import lnc.a1;

public class a extends PresenterV2	// class@000965
{

    public void a(){
       super();
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, a.class, "2");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, a.class, "4");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, a.class, "3");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       TextView textView = p0.findViewById(R.id.title_tv);
       p0.findViewById(R.id.left_btn).setOnClickListener(new b(this));
       textView.setText(R.string.arg_RES_7f1033f4);
       textView.setTextColor(a1.a(R.color.arg_RES_7f061d77));
       p0.findViewById(R.id.right_btn).setVisibility(4);
       return;
    }
    public void j8(){
    }
}
