package androidx.appcompat.app.AlertController$d;
import android.widget.AbsListView$OnScrollListener;
import androidx.appcompat.app.AlertController;
import android.view.View;
import java.lang.Object;
import android.widget.AbsListView;

public class AlertController$d implements AbsListView$OnScrollListener	// class@00055e
{
    public final View a;
    public final View b;
    public final AlertController c;

    public void AlertController$d(AlertController p0,View p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onScroll(AbsListView p0,int p1,int p2,int p3){
       AlertController.f(p0, this.a, this.b);
    }
    public void onScrollStateChanged(AbsListView p0,int p1){
    }
}
