package com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class CommentStayTimeLogPresenter$2 implements LifecycleObserver	// class@0010de
{
    public final CommentStayTimeLogPresenter b;

    public void CommentStayTimeLogPresenter$2(CommentStayTimeLogPresenter p0){
       this.b = p0;
       super();
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter$2.class, "3")) {
          return;
       }
       this.b.R8();
       this.b.p.h0().removeOnScrollListener(this.b.s);
       this.b.p.getLifecycle().removeObserver(this);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter$2.class, "2")) {
          return;
       }
       if (!this.b.getActivity().isFinishing()) {
          this.b.R8();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter$2.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
}
