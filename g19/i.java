package g19.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import java.lang.Object;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class i implements Runnable	// class@0023bd
{
    public final MilanoItemProfileSidePresenter b;

    public void i(MilanoItemProfileSidePresenter p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       View view = tb.m8();
       if (PatchProxy.applyVoidTwoRefs(view, "detail root view", tb, MilanoItemProfileSidePresenter.class, "14")) {
       }else if(view == null){
          Object[] objArray = new Object[0];
          j0.f("MilanoItemProfileSideP", "logViewSize "+"detail root view"+": "+view+", h "+view.getMeasuredHeight()+", w "+view.getMeasuredWidth()+", paddingLeft "+view.getPaddingLeft()+", paddingRight "+view.getPaddingRight()+", paddingTop "+view.getPaddingTop()+", paddingBottom "+view.getPaddingBottom(), objArray);
       }
       return;
    }
}
