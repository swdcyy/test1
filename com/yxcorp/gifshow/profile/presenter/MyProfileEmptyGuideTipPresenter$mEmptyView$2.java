package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mEmptyView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;

public final class MyProfileEmptyGuideTipPresenter$mEmptyView$2 extends Lambda implements a	// class@001411
{
    public final MyProfileEmptyGuideTipPresenter this$0;

    public void MyProfileEmptyGuideTipPresenter$mEmptyView$2(MyProfileEmptyGuideTipPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter$mEmptyView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.G(this.this$0.getContext(), R.layout.arg_RES_7f0d11f1);
       this.this$0.y = obj.findViewById(0x7f0a3f2c);
       this.this$0.z = obj.findViewById(0x7f0a0782);
       this.this$0.A = obj.findViewById(0x7f0a34d2);
       obj.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
