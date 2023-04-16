package fx8.n0;
import y8c.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fx8.t;
import nl8.p;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import fx8.n0$a;
import android.view.View$OnClickListener;
import com.kuaishou.android.post.topic.model.TopicItem;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import io.reactivex.subjects.PublishSubject;

public class n0 extends r	// class@00238c
{
    public PublishSubject i;
    public PublishSubject j;
    public TopicItem k;
    public TextView l;
    public ImageView m;
    public View n;

    public void n0(){
       super();
    }
    public void i(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "1")) {
          return;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject instanceof t) {
             this.i = oobject.b;
             this.j = oobject.c;
          }
          i = i + 1;
       }
       super.i(p0);
       return;
    }
    public void z(){
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "2")) {
          return;
       }
       this.n = this.b;
       this.l = this.q(0x7f0a4026);
       this.m = this.q(0x7f0a348b);
       this.n.setOnClickListener(new n0$a(this));
       this.k = this.t();
       Object[] objArray1 = new Object[0];
       a.b().s("TopicItemPresenter", "bind key: "+this.k.getKeyWorld(), objArray1);
       if (!PatchProxy.applyVoid(objArray, this, on0, "3")) {
          this.n.setTranslationX(0);
          float f = 0x3f800000;
          this.n.setAlpha(f);
          this.n.setScaleX(f);
          this.n.setScaleY(f);
       }
       if (!TextUtils.x(this.k.getMKsOrderId())) {
          this.m.setImageResource(R.drawable.arg_RES_7f082474);
          this.m.setVisibility(0);
       }else if(this.k.getType() == TopicItemType.HISTORY){
          this.m.setImageDrawable(j.n(this.C(), R.drawable.arg_RES_7f08200c, 0x7f0616aa));
          this.m.setVisibility(0);
       }else {
          this.m.setVisibility(8);
       }
       this.l.setText(this.k.getKeyWorld());
       this.j.onNext(this.k);
       return;
    }
}
