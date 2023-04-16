package com.yxcorp.gifshow.comment.common.CommonCommentsFragment$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.app.Activity;
import il9.b;

public class CommonCommentsFragment$a implements Runnable	// class@00109d
{
    public final CommonCommentsFragment b;

    public void CommonCommentsFragment$a(CommonCommentsFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CommonCommentsFragment$a.class, "1")) {
          return;
       }
       if (this.b.getActivity() != null && this.b.getActivity().getWindow() != null) {
          b.d(this.b.getActivity().getWindow());
       }
       return;
    }
}
