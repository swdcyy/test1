package com.yxcorp.gifshow.detail.network.feedback.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment$a;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.detail.network.feedback.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.detail.network.feedback.b;
import com.yxcorp.gifshow.detail.network.feedback.c;
import java.lang.String;
import com.yxcorp.gifshow.detail.network.feedback.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.network.feedback.e;
import com.yxcorp.gifshow.detail.network.feedback.f;
import mm8.a;

public final class g implements b	// class@0015c1
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(DialogFragment.class, new a(this, p1));
       p0.h(c.class, new b(this, p1));
       p0.i("REASON_SELECT_STATUS_CHANGE_OBSERVABLE", new c(this, p1));
       p0.i("REASON_SELECT_STATUS_CHANGE_OBSERVER", new d(this, p1));
       QPhoto qPhoto = QPhoto.class;
       e uoe = new e(this, p1);
       try{
          p0.h(qPhoto, uoe);
          p0.h(NetworkFeedbackFragment$a.class, new f(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
