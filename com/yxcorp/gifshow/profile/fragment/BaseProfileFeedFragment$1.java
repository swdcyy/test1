package com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment$1;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.GridLayoutManager;

public class BaseProfileFeedFragment$1 extends NpaGridLayoutManager	// class@001302
{
    public final BaseProfileFeedFragment A;

    public void BaseProfileFeedFragment$1(BaseProfileFeedFragment p0,Context p1,int p2){
       this.A = p0;
       super(p1, p2);
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFeedFragment$1.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       this.A.Ih();
       return;
    }
}
