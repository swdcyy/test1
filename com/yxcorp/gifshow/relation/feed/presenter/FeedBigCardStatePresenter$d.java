package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d;
import pac.a;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.widget.TextView;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d$b;

public class FeedBigCardStatePresenter$d extends a	// class@00189d
{
    public final FeedBigCardStatePresenter d;

    public void FeedBigCardStatePresenter$d(FeedBigCardStatePresenter p0){
       this.d = p0;
       super();
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FeedBigCardStatePresenter$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.l(p2, R.layout.arg_RES_7f0d0430, false, 1);
       TextView textView = view.findViewById(R.id.reduce_user);
       if (TextUtils.n("F", this.d.T.mUser.mSex)) {
          textView.setText(R.string.arg_RES_7f1003a1);
       }
       textView.setOnClickListener(new FeedBigCardStatePresenter$d$a(this));
       view.findViewById(R.id.reduce_card).setOnClickListener(new FeedBigCardStatePresenter$d$b(this));
       return view;
    }
}
