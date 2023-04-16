package com.yxcorp.gifshow.comment.presenter.global.h;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.i;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import el9.i0;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class h implements g	// class@0010f9
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "12")) {
       }else {
          FragmentActivity activity = tb.p.getActivity();
          if (activity != null && (!activity.isFinishing() && !p0.isSub())) {
             RecyclerView recyclerView = tb.p.h0();
             recyclerView.postDelayed(new i0(tb, recyclerView, p0), 160);
          }
       }
       return;
    }
}
