package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.p1;
import o07.n;

public final class FollowFilterGuidePresenter$d implements PopupInterface$f	// class@001235
{
    public static final FollowFilterGuidePresenter$d b;

    static {
       FollowFilterGuidePresenter$d.b = new FollowFilterGuidePresenter$d();
    }
    public void FollowFilterGuidePresenter$d(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FollowFilterGuidePresenter$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return p1.h(p2, 0x7f0d0143);
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
