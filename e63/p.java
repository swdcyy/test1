package e63.p;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f37.o0;

public final class p implements View$OnClickListener	// class@00266a
{
    public final e b;
    public final String c;

    public void p(e p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       o0.m(this.b.getActivity(), this.c);
    }
}
