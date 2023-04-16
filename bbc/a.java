package bbc.a;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.relation.intimate.helper.a;

public final class a implements g	// class@000427
{
    public final GifshowActivity b;
    public final IntimateRelationDialogParams c;
    public final PopupInterface$h d;

    public void a(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       a.a(this.b, this.c, this.d).x();
    }
}
