package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$e;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;

public class MilanoProfileSidePresenter$e extends RecyclerView$r	// class@00153a
{
    public final MilanoProfileSidePresenter a;

    public void MilanoProfileSidePresenter$e(MilanoProfileSidePresenter p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(MilanoProfileSidePresenter$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MilanoProfileSidePresenter$e.class, "1")) {
          return;
       }
       InvalidGestureChecker.a(this.a.getContext(), AnswerType.SLIDE_PROFILE_FEED);
       return;
    }
}
