package com.yxcorp.gifshow.widget.LibraryLoadingView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.view.ViewGroup;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kwai.library.widget.specific.misc.LoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public class LibraryLoadingView extends ConstraintLayout	// class@001872
{

    public void LibraryLoadingView(Context p0){
       super(p0);
    }
    public void LibraryLoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LibraryLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void L(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LibraryLoadingView.class, "3")) {
          return;
       }
       this.reset();
       KwaiEmptyStateView kwaiEmptySta = new KwaiEmptyStateView(this.getContext());
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.p(p0);
       uoa.k(R.drawable.arg_RES_7f0805f4);
       uoa.h(R.string.arg_RES_7f100d25);
       uoa.j(1);
       uoa.b();
       uoa.a(kwaiEmptySta);
       kwaiEmptySta.setLayoutParams(new ConstraintLayout$LayoutParams(-1, -1));
       this.addView(kwaiEmptySta);
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, LibraryLoadingView.class, "2")) {
          return;
       }
       this.reset();
       LoadingView loadingView = new LoadingView(this.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       layoutParams.k = 0;
       layoutParams.d = 0;
       layoutParams.g = 0;
       layoutParams.h = 0;
       loadingView.setLayoutParams(layoutParams);
       loadingView.setLoadingStyle(LoadingStyle.GRAY_DARK);
       this.addView(loadingView);
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, LibraryLoadingView.class, "1")) {
          return;
       }
       this.removeAllViews();
       return;
    }
}
