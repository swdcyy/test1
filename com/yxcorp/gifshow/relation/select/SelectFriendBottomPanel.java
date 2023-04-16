package com.yxcorp.gifshow.relation.select.SelectFriendBottomPanel;
import com.kwai.feature.api.social.SelectUserView;
import android.content.Context;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import zu5.b;
import android.util.AttributeSet;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import vbc.z;
import vbc.s;
import rbc.f;

public class SelectFriendBottomPanel extends SelectUserView	// class@001980
{
    public b d;
    public SelectUsersBundle e;
    public PresenterV2 f;

    public void SelectFriendBottomPanel(Context p0,SelectUsersBundle p1,b p2){
       AttributeSet uAttributeSe = null;
       super(p0, uAttributeSe, 0);
       this.f = new PresenterV2();
       this.d = p2;
       this.e = p1;
       int i = 1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendBottomPanel.class, "1")) {
       }else {
          a.g(p0.getSystemService("layout_inflater"), R.layout.arg_RES_7f0d14ae, this, i);
          this.setLayoutParams(new ConstraintLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f07026a)));
       }
       if (!PatchProxy.applyVoid(uAttributeSe, this, SelectFriendBottomPanel.class, "2")) {
          SelectFriendBottomPanel tf = this.f;
          tf.U7(new z(this.e));
          tf.U7(new s(this.e));
          this.f.f(this.findViewById(R.id.root_view));
          f uof = new f();
          uof.d = this.d;
          Object[] objArray = new Object[i];
          objArray[0] = uof;
          this.f.i(objArray);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SelectFriendBottomPanel.class, "4")) {
          return;
       }
       this.f.destroy();
       return;
    }
}
