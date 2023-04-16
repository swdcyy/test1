package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import com.yxcorp.gifshow.profile.http.l;
import qvb.a;
import android.view.ViewParent;
import android.view.View;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import s1c.q;
import q87.c;
import android.os.MessageQueue$IdleHandler;
import z5c.n2;

public final class MyProfilePostRecoTipsPresenter$mPageListObserver$2$a implements q	// class@001432
{
    public final MyProfilePostRecoTipsPresenter$mPageListObserver$2 b;

    public void MyProfilePostRecoTipsPresenter$mPageListObserver$2$a(MyProfilePostRecoTipsPresenter$mPageListObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       MyProfilePostRecoTipsPresenter$mPageListObserver$2 this$0;
       MyProfilePostRecoTipsPresenter$mPageListObserver$2$a omPageListOb = MyProfilePostRecoTipsPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omPageListOb, "2")) {
          return;
       }
       p.c(this, p0);
       String str = "MyProfilePostRecoTipsPresenter";
       int i = 0;
       if (MyProfilePostRecoTipsPresenter.R8(this.b.this$0).isEmpty()) {
          MyProfilePostRecoTipsPresenter w = this.b.this$0.w;
          ViewParent parent = (w != null)? w.getParent(): null;
          if (parent != null && ProfilePostEmptyCardUtils.e.d()) {
             Object[] objArray = new Object[i];
             q.C().w(str, "remove tips view by post card", objArray);
             this$0 = this.b.this$0;
             MyProfilePostRecoTipsPresenter w1 = this$0.w;
             if (w1 != null) {
                this$0.c9(w1);
             }
             this$0.D = true;
          }
       }else if(this.b.this$0.D != null){
          Object[] objArray1 = new Object[i];
          q.C().w(str, "try show reco tips view by post card", objArray1);
          this$0 = this.b.this$0;
          this$0.D = i;
          this$0.W8();
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(MyProfilePostRecoTipsPresenter$mPageListObserver$2$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, MyProfilePostRecoTipsPresenter$mPageListObserver$2$a.class, "1")) {
          return;
       }
       if (p0) {
          if (!MyProfilePostRecoTipsPresenter.R8(this.b.this$0).isEmpty()) {
             n2.b(this.b.this$0.X8());
          }else {
             this.b.this$0.W8();
          }
       }
       return;
    }
}
