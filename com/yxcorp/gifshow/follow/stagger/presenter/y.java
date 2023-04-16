package com.yxcorp.gifshow.follow.stagger.presenter.y;
import cb5.g;
import android.view.View;
import com.yxcorp.gifshow.follow.stagger.presenter.y$a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.a;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class y extends g	// class@001226
{
    public RecyclerFragment t;
    public final RecyclerView$i u;

    public void y(View p0){
       super(p0);
       this.u = new y$a(this);
    }
    public void y(Fragment p0){
       super(p0);
       this.u = new y$a(this);
    }
    public void y(Fragment p0,int p1){
       super(p0.getView(), p1);
       this.u = new y$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "2")) {
          return;
       }
       super.E8();
       this.t.ia().F0(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       super.J8();
       this.t.ia().I0(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.r8("FRAGMENT");
       return;
    }
}
