package com.kuaishou.merchant.transaction.detail.self.selfdetail.service.a;
import xf4.b;
import androidx.fragment.app.Fragment;
import rk0.b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import nh4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceWrapper;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin$DefaultInfo;
import java.util.List;
import java.lang.CharSequence;
import com.kuaishou.merchant.transaction.base.widget.bardcard.a$b;
import androidx.fragment.app.FragmentActivity;
import eg4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.service.DetailServiceContentView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import yh4.b;
import com.kuaishou.merchant.transaction.base.widget.bardcard.a$a;
import yh4.c;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin$b;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin$a;
import android.app.Activity;
import com.kuaishou.merchant.transaction.base.widget.bardcard.a;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionBorderWithPrefixCard;
import com.kuaishou.merchant.transaction.base.widget.bardcard.TransactionDefaultBorderPlugin;
import yh4.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceInfo;
import kg4.a;
import ei4.k;
import ekd.m1;

public class a extends b	// class@00075e
{
    public j x;
    public TransactionBorderWithPrefixCard y;
    public a z;

    public void a(Fragment p0){
       super(p0);
       this.x = ViewModelProviders.of(this.R8()).get(j.class);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       super.E8();
       b d = this.u.d;
       TransactionDefaultBorderPlugin$DefaultInfo uDefaultInfo = new TransactionDefaultBorderPlugin$DefaultInfo(objArray, objArray, "url", "");
       a tz = this.z;
       if (tz == null) {
          a$b uob = new a$b();
          uob.A(d.mDetailServiceModel.mLabelText);
          uob.z(new DetailServiceContentView(this.getContext()));
          uob.B(new b(d));
          uob.d(new c(this));
          this.z = this.y.M(this.P8(), uDefaultInfo, uob);
       }else {
          tz.b(d);
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.x.m.O(a.a.a(this.u.d.mDetailServiceModel.mRuleInfos));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.y = m1.f(p0, 0x7f0a0b25);
       return;
    }
}
